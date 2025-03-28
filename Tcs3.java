import java.util.HashMap;
import java.util.Scanner ;
 import java.io.*;
 class Tcs3
 {
  public static void main(String ar[])throws Exception
 {
Scanner sc=new Scanner(System.in);
char ans='\0';
int n=sc.nextInt();
char b[]=new char[n];
for(int i=0;i<n;i++)
{
	b[i]=sc.next().charAt(0);
}
HashMap  <Character,Integer> h=new HashMap<>();
for(char i:b)
{
	h.put(i,h.getOrDefault(i,0)+1);
}

for(char i: b)
{
	if(h.get(i)%2==1)
	{
		ans=i;
		break;
	}

}
System.out.println(ans);

 }
 
 }