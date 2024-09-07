import java.util.regex.*;
class RemoveSpaces
{
static String show(String s)
{
	StringBuilder sb=new StringBuilder();
	/*for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			sb.append(s.charAt(i));
		}
	}
	*/
	// Approach 2
	Pattern p=Pattern.compile("\\S");
	Matcher m=p.matcher(s);
	while(m.find())
	{
	 sb.append(m.group());	
	}
	return sb.toString();
}
public static void main(String ar[])
{
String s1="my name is   ram";

System.out.println("Modified String is ="+show(s1));
}

}