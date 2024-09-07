import java.util.regex.*;
class SumofNumber
{
static int show(String s)
{
	int sum=0;
	String temp="0";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(Character.isDigit(c))
		{
			temp+=c;
		}
	else
	{
		sum+=Integer.parseInt(temp);
		temp="0";
	}
	}
	

	// Approach 2
	// Pattern p=Pattern.compile("\\d+");
	// Matcher m=p.matcher(s);
	// while(m.find())
	// {
	 // sum+=Integer.parseInt(m.group());
	// }
	return sum;
}
public static void main(String ar[])
{
String s1="11take12%*&23^$#ABC";
//11+12+23=46
System.out.println("Sum is ="+show(s1));
}

}