class Equilibriumindex
{
	public static void main(String ar[])
	{
		int x[]={2,3,-1,8,4};
		int leftsum=0;
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum+=x[i];
		}
	int rightSum=sum;//16
	for(int i=0;i<x.length;i++)
	{
		rightSum-=x[i];//14 2 //11 5 //11 4 // 4 
		if(leftsum==rightSum)
		{
			System.out.println(" " +i);
		}	
		leftsum+=x[i];
}
// System.out.println("")
	}
}