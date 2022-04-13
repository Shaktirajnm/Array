public class MissNumber 
{
	public int findNumber(int[] arr) 
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for (int i = 0; i < arr.length; i++)
		{
			sum=sum-arr[i];
		}
		return sum;
	}
	
	public int findNumber1(int[] arr) 
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for (int num : arr) {
			sum=sum-num;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		MissNumber mn=new MissNumber();
		int[] arr= {1,2,4,3,5,7,8,9,10};
		int[] arr1= {1,2,4,3,6,7,8,9,10};
		int num=mn.findNumber(arr);
		System.out.println(num);
		System.out.println(mn.findNumber1(arr1));
	}
}
