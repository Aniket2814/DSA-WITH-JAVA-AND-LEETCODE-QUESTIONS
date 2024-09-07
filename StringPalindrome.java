class StringPalindrome
{
	public static void main(String ar[])
	{
		// String s1="ram";
		String s1="aba";
		int i=0;
		int j=s1.length()-1;
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))

			{
				System.out.println("Not an palimdromic String");
				return;
			}	
			i++;
			j--;
		}
			System.out.println("it is an Palimdromic");
	}
}