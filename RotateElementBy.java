 class RotateElementBy
 {
 public static void main(String ar[])
 {
	 int x[]={1,2,3,4,5,6,7};
	 int k=3;
	 //output should be like this 
	 //4 5 6 7 1 2 3
	 rotate(x,k);
 for(int i:x)
	 System.out.print(i+" \t");
 }
 public static void rotate(int x[],int k)
 {
	 reverse(x,0,k-1);
	 reverse(x,k,x.length-1);
	 reverse(x,0,x.length-1);
 }
 public static void reverse(int x[],int st,int ed)
 {
	 while(st<=ed)
	 {
		 int temp=x[st];
		 x[st]=x[ed];
		 x[ed]=temp;
	 st++;ed--;
	 }
	 
 }
 }