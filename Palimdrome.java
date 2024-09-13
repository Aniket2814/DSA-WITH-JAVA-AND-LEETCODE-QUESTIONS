class Palimdrome
{
public static void main(String ar[])
{

int n=121;
boolean b=show(n);

if(b)
System.out.println("No.is palimdrome");
else
System.out.println("No.is Not palimdrome");

}
public static boolean show(int n)
{
	int n1=n;
	int sum=0;
	while(n!=0)
	{
		int a=n%10;
		sum=sum*10+a;
		n/=10;
		
	}
	if(n1==sum)
		return true;
	else 
		return false;
}

}