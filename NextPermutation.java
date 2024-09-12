class NextPermutation
{
	public static void main(String ar[])
	{
		int x[]={1,2,3};
		//3 ,2,1
          show(x);
	System.out.print("Next Permutation is :-");
for(int i:x)
{
	System.out.print(" "+i);
}	
	}
	public static void show(int x[])
	{
		int ind=-1;
		int idx2=-1;
		int n=x.length;
		
		 for(int i=n-2;i>=0;i--)
		 {
			 if(x[i]<x[i+1])
			 {
				 ind=i;
				 break;
			 }
		 }
		 if(ind==-1) rev(x,0);
		 
		 else
		 {for(int i=n-1;i>=ind;i++)
		 {
			 if(x[i]>x[ind])
			 {
				 idx2=i;
				 break;
			 }	 
		 }}
				 swap(x,ind,idx2);
	 rev(x,ind+1);
	}
	public static void swap(int x[],int i,int j)
	{
		int temp=x[i];
		x[i]=x[j];
		x[j]=temp;
		
	}
	public static void rev(int x[],int i)
	{
		int j=x.length-1;
		while(i<j)
		{
			swap(x,i,j);
			i++;
			j--;
		}
	}
}