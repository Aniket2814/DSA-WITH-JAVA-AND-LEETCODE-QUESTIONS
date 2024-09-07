import java.util.regex.*;
class RemoveCharacter
{
static String show(String s)
{
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++)
	{
		int c=s.charAt(i);
		if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
		{
			sb.append(s.charAt(i));
		}
	}

	// Approach 2
	// Pattern p=Pattern.compile("([a-z A-Z])");
	// Matcher m=p.matcher(s);
	// while(m.find())
	// {
	 // sb.append(m.group());	
	// }
	return sb.toString();
}
public static void main(String ar[])
{
String s1="take12%*& ^$#ABC";
//take
System.out.println("Modified String is ="+show(s1));
}

}