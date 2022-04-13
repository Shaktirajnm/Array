public class BinarySearch 
{
	public int binerySerch(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		for (int i = 0; i < arr.length; i++) 
		{
			while(low<=high) 
			{
				int mid=(high+low)/2;
				if (arr[mid]==key)
				{
					return mid;
				}
				if (key<arr[mid])
				{
					high=mid-1;
				}
				else 
				{
					low=mid+1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		BinarySearch bs=new BinarySearch();
		int[] arr= {1,10,15,20,45,50,65,75,88};
		System.out.println(bs.binerySerch(arr, 55));
	}
}
