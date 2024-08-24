 class PrintSubarray
 {
	 public static void main(String ar[])
	 {
		 int x[]={1,2,3,4,5};
		 for(int i=0;i<x.length;i++)
		 
		 {
			 for(int j=i;j<x.length;j++)
			 {
				 for(int k=i;k<=j;k++)
				 {
				 System.out.print(x[k]+ "\t");
			 }
		 System.out.println();
			 }
		 System.out.println();
		 }
	 }
	 
 }