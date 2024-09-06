class ReverseArray
{
	public static void main(String ar[])
	{
		int x[]={1,2,3,4,5};
		int start=0;
		int end=x.length-1;
		while(start<end)
		{
			int temp=x[start];
			x[start]=x[end];
			x[end]=temp;
			start++;
			end--;
		}
		for(int i :x)
		{
			System.out.print(" "+i);
		}
		}
}
