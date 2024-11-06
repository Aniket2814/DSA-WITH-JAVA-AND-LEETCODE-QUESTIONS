import java.util.LinkedList;
class HashMap
{
	class HMNode
	{
		String key;
		Integer value;
		 public HMNode(String key,Integer value)
		 {
			 this.key=key;
			 this.value=value;
		 }
		 
		 public String toString()
		 {
			 return this.key+ " @ "+this.value;
		 }
	}
	LinkedList <HMNode> []bucketArray;
	int size;//noo oof key vvalue pair in array 
	public HashMap()
	{
		this(5);
	}
	public HashMap(int cap)
	{
		this.bucketArray=new LinkedList[cap];
		this.size=0;
		for(int i=0;i<bucketArray.length;i++)
		{
			bucketArray[i]=new LinkedList<HMNode>();
		}
	}
	
	public void put(String key,Integer value)
	{
		///key- hashfunction->index
		int bi=hashfunction(key);
		//index->LL
		LinkedList<HMNode> bucket=bucketArray[bi];
		//check if the key allready exist in the ll or not
		int fi=findInBucket(bucket,key);
		//if notif
		if(fi==-1)
		{
			HMNode nn=new HMNode(key,value);
			this.size++;
			bucket.addLast(nn);
		}
		//if yes update the valuee

         else
		 {
			 HMNode  n=bucket.get(fi);
			 n.value=value;
			 
		 }
		 //calculate load facot/ threshold
		 double threshold=(double)this.size/this.bucketArray.length;
		 if(threshold>0.5)
			 {
				 rehash();
			 }
}
public int hashfunction(String key)
{
	int hc=key.hashCode();
	int bi=Math.abs(hc)%bucketArray.length;
	return bi;
}
public int findInBucket(LinkedList<HMNode> bucket,String key)
{
	for(int i=0;i<bucket.size();i++)
	{
		HMNode node=bucket.get(i);
		if(node.key.equals(key))
		{
			return i;
		}
		
		
	}
	return -1;
	
}
public void rehash()
{
	LinkedList<HMNode> []oldBucketArray=this.bucketArray;
	this.bucketArray=new LinkedList[2*oldBucketArray.length];
	this.size=0;
	for(int i=0;i<bucketArray.length;i++)
	{
		bucketArray[i]=new LinkedList<HMNode>();
		
	}
	for(int i=0;i<oldBucketArray.length;i++)
	{
	   LinkedList<HMNode> bucket=oldBucketArray[i];
	   for(int j=0;j<bucket.size();j++)
	   {
		   HMNode node=bucket.get(j);
		   put(node.key,node.value);
	   }
	}
}
public Integer get(String key)
{
	int bi=hashfunction(key);
	LinkedList<HMNode> bucket=bucketArray[bi];
	int fi=findInBucket(bucket,key);
	if(fi==-1)
	{
		return null;
	}
else{
	return bucket.get(fi).value;
}
}
public boolean containsKey(String key)
{
	int bi=hashfunction(key);
	LinkedList<HMNode> bucket=bucketArray[bi];
	int fi=findInBucket(bucket,key);
	return fi!=-1;
}
	public Integer remove(String key)
	{
		int bi=hashfunction(key);
		LinkedList<HMNode> bucket=bucketArray[bi];
		int fi=findInBucket(bucket,key);
		if(fi==-1)
		{
			return null;
		}
		else
		{
			HMNode node=bucket.remove(fi);
			this.size--;
			return node.value;
		}
	}
	public void display()
	{
		System.out.println("..........................");
		for(int i=0;i<bucketArray.length;i++)
		{
			LinkedList<HMNode> bucket=bucketArray[i];
			System.out.print("B" +i+ " => ");
		for(int j=0;j<bucket.size();j++)
		{
			HMNode node=bucket.get(j);
			System.out.print(node+ " ");
		}
		System.out.println(".");
		}
		System.out.println("..........................");
		
		
	}
	
}