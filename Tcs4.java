import java.util.*;
 class Tcs4
 {
  public static void main(String ar[])
 {
	 
	 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String []s=new String[n];
for(int i=0;i<n;i++)
{
	s[i]=sc.next();
	
}
Arrays.sort(s);
System.out.println(show(s));
 }
 public static String show(String s[])
 {
	 StringBuilder st=new StringBuilder();
	 char []first=s[0].toCharArray();
	 char []last=s[s.length-1].toCharArray();
	 for(int i=0;i<first.length;i++)
	 {
		 if(first[i]!=last[i])
		 {
			 break;
		 }
		 st.append(first[i]);
	 }
	 return  st.toString();
 }
 }