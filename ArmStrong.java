class ArmStrong
{
public static void main(String ar[])
{

int n=153;
boolean b=show(n);

if(b)
System.out.println("No.is Armstrong");
else
System.out.println("No.is Not ArmStrong");

}
public static boolean show(int n)
{
	int n1=n;
	int sum=0;
	while(n!=0)
	{
		int a=n%10;
		//Math.pow(a,no of length)
		sum=sum+a*a*a;
		n/=10;
		
	}
	if(n1==sum)
		return true;
	else 
		return false;
}

}