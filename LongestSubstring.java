// Longest Substring without repeating character
import java.util.*;
class LongestSubstring
{
	public static void main(String ar[])
	{
		/*
       //Brute force Approach =   t.c=>o(n2), s.c=o(256)		
		String s="abcdza";
		int maxlen=0;
		String ans="";
		StringBuilder sb=new StringBuilder();
		int x[]=new int[256];
		Arrays.fill(x,0);
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i;j<s.length();j++)
			{
				if(x[s.charAt(j)]==1) break;
				 sb.append(s.charAt(j));
                x[s.charAt(j)] = 1; 
                
                int len = j - i + 1;
                if (len > maxlen) {
                    maxlen = len;
                    ans = sb.toString();
			}
			}
		}
		System.out.println("Maximum Length is "+maxlen);
		System.out.println("Longest Substring is " +ans);
	*/
	//optimal approach tc=>o(n)
	String s="abwcdaxbaz";
	int n=s.length();
	int l=0;
	int r=0;
	int maxlen=0;
	int hash[]=new int[256];
	Arrays.fill(hash,-1);
	while(r<n)
	{
		if(hash[s.charAt(r)]!=-1)
		{
			if(hash[s.charAt(r)]>=l)
			{
				l=hash[s.charAt(r)] +1;
			}
		}
		int len=r-l+1;
		maxlen=Math.max(len,maxlen);
		hash[s.charAt(r)]=r;
		r++;
	}
	System.out.println(maxlen);
	}
	
	
}