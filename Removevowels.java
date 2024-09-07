 class Removevowels
 {
	 public static void main(String ar[])
	 {
		 String s="take you forward";
		 for(int i=0;i<s.length()-1;i++)
		 {
			 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			 {
				 s=s.substring(0,i)+s.substring(i+1);
				 i--;
			 }
		 }
		 System.out.println("New String is =" +s);
		 
	 }
 }