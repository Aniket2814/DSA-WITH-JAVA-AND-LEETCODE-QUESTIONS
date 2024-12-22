import java.util.*;
class SubArray
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("Enter Elements of Array");
		
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
	     
		 System.out.println("Subarray Are :");
		 
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(x[k]+ " ");
				}
				System.out.println("  ");
			}
				System.out.println("  ");
		}
                	
		
		}
}