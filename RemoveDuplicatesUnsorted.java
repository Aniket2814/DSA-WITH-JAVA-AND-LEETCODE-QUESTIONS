import java.util.*;
class RemoveDuplicatesUnsorted
{
	public static void main(String ar[])
	{
	//Rermove dupliccates from Unsorted Array BY IN PLACE
//approach 2:-use two pointer	
		int x[]={1,1,2,2,3,4};
		int j=0;
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<x.length;i++)
		{
			if(!h.containsKey(x[i]))
			{
				System.out.println(x[i]+ " ");
				h.put(x[i],1);
			}
		}
		//Array me convert krne k lia arraylist banalo fr usme object to array se convert krlo 
		
	}
}