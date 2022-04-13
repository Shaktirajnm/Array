
public class InsertPosiction 
{
	public int isSerchInsert(int[] arr,int target)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high) 
		{
			int mid=low+(high-low)/2;
			if (arr[mid]==target)
			{
				return mid;
			}
			if (target<arr[mid])
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return low;
	}
	
	public static void main(String[] args) 
	{
		InsertPosiction ip=new InsertPosiction();
		int[] arr= {1,10,20,25,30,45,65,78,88};
		System.out.println(ip.isSerchInsert(arr, 66));
	}
}
