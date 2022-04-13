public class MoveZero 
{
	public static void moveZero(int[] arr) 
	{
		int j=0;
		int n=arr.length;
		for (int i = 0; i < n; i++) 
		{
			if (arr[i]!=0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if (arr[j]!=0)
			{
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		MoveZero mz=new MoveZero();
		int[] arr= {8,0,2,3,0,6,0,7,4};
		moveZero(arr);
	}
}
