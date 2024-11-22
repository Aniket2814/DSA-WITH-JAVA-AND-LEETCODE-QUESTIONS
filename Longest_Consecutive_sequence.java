import java.util.HashMap; 
import java.util.ArrayList; 
class Longest_Consecutive_sequence
{
public static void main(String ar[])
{
	int nums[]={2,12,9,16,10,5,3,20,25,11,1,8,6};
	
	 HashMap<Integer,Boolean> h=new HashMap<>();
 for(int i:nums)
 {  
h.put(i,true);
 }
 for(int i: nums)
 {
	 if(h.containsKey(i-1))
	 {
		 h.put(i,false);
	 }
 }
 ArrayList <Integer> al=new ArrayList<>(h.keySet());
 int maxlength=Integer.MIN_VALUE;
 int maxno=0;
 int count =0;
 for(int i :al)
 {
	 count=0;
	 if(h.get(i)==true)
	 {
		 while(h.containsKey(i+count))
		 {
			 count++;
		 }
	 }
	 maxlength=Math.max(maxlength,count);
 }
 System.out.println(h);
 System.out.println(maxlength);
}
}