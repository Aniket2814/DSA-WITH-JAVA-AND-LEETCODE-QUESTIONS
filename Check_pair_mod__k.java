class Check_pair_mod__k
{
public static void main(String ar[])
{
	int x[]={20,25,10,15,3,27};
	System.out.println(canmakepairs(x,10));
}
public static boolean canmakepairs(int x[],int k )

{
	int []freq=new int [k];
	//key->index
	//value->element at thhat array 
	for(int num:x)
	{
		num=num%k;
		if(num<0) num+=k;//for negatve
		freq[num]++;
	}
		if(x.length%2!=0) return false;
for(int i=1;i<=k/2;i++)
{
	if(freq[i]!=freq[k-i])
	{
		return false;
	}
}
return true;
}
}