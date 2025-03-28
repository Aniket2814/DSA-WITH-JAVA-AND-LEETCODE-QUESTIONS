import java.util.*;
 class Tcs1
 {
  public static void main(String ar[])
 {
	 Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println(show(s));	 
 }
 public static int show(String s)
 {
	 int hash=0;
	 int star=0;
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)=='#')
		 {
			 hash++;
		 }
		 else
			 star++;
	 }

	return	star-hash;
	
 }
 
 }