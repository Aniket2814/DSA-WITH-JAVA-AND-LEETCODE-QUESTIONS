class SecondLargestandSmallest
{
	public static void main(String ar[])
	{
		int x[]={10,2,3,55,64,2};
		int res[]={secondlargest(x,6),secondSmallest(x,6)};
		for(int i:res)
		{
			System.out.println(i);
		}
	}
	static int secondlargest(int arr[],int n)
{
	 int largest=arr[0];
        int sec=-1;
        for(int i=1;i<arr.length;i++)
{
    if(arr[i]>largest)
    {
        sec=largest;
        largest=arr[i];
        
    }
    else if(arr[i]<largest && arr[i]>sec)
    {
        sec=arr[i];
    }
}
        return sec;
}
static int secondSmallest(int arr[],int n)
{
	int smallest=arr[0];
	int sec=2147483647;
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<smallest)
		{
			sec=smallest;
			smallest=arr[i];
			
		}
		else if(arr[i]>smallest && arr[i]<sec){
			sec=arr[i];
		}
	}
	return sec;
}
}