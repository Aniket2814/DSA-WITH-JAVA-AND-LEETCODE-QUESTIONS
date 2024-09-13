class Prime
{
public static void main(String ar[])
{

int n=17;
boolean b=show(n);

if(b)
System.out.println("No.is prime");
else
System.out.println("No.is not Prime");

}
public static boolean show(int n)
{
	// int n1=n;
	int c=0;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			c=1;
		}
	}
	if(c==0)
		return true;
	else 
		return false;
}

}