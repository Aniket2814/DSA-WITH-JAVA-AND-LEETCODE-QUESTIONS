class RemoveDuplicates
{
	public static void main(String ar[])
	{
	//Rermove dupliccates from sorted Array BY IN PLACE

//aPPROACH 1;-use HashSet
//approach 2:-use two pointer	
		int x[]={1,1,2,2,3,4};
		int j=0;
		for(int i=1;i<x.length;i++)
		{
			if(x[i]!=x[j])
			{
				j++;
				x[j]=x[i];
			}
			
		}
		j++;
		for(int i=0 ;i<j;i++)
		{
			System.out.print(" "+x[i]);
		}
	}
}