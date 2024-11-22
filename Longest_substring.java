import java.util.HashMap;
class Longest_substring
{
	public static void main(String ar[])
	{
		String s="abcdea";
         // for(int i =0;i<s.length();i++)
		 // {
			 // for(int j=i;j<s.length();j++)
			 // {
				 // for(int k=i;k<=j;k++)
				 // {
					 // System.out.print(s.charAt(k));
				 // }
				 // System.out.println();
			 // }
			 
				 // System.out.println();
		 // }
		int maxlength=0;
		
		HashMap<Character,Integer> h=new HashMap<>();
		int left=0;
		for(int r=0;r<s.length();r++)
		{
			if(h.containsKey(s.charAt(r)) && h.get(s.charAt(r))>=left)
			{
				left=h.get(s.charAt(r))+1;
			}
			maxlength=Math.max(maxlength,r-left+1);
			h.put(s.charAt(r),r);
		}
		System.out.println(maxlength);
		}
	
}