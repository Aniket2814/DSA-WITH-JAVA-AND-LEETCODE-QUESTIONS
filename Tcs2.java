import java.util.*;
 class Tcs2
 {
  public static void main(String ar[])
 {
	 
	 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x[]=new int[n];
for(int i=0;i<n;i++)
{
	x[i]=sc.nextInt();
}
int prior=x[0];
int c=1;
for(int i=1;i<x.length;i++)
{
	if(x[i]>prior)
	{
		c++;
	}
}
System.out.println(c);
 }
 
 }