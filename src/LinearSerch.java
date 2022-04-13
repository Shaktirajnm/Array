import java.util.Scanner;

public class LinearSerch 
{
	public int serch(int[] arr,int n, int x) 
	{
		for (int i = 0; i < n; i++) 
		{
			if (arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinearSerch ls=new LinearSerch();
		int[] arr= {5,9,2,10,15,20,17};
		System.out.println("Enter the serch element: ");
		int n=sc.nextInt();
		int num=ls.serch(arr, arr.length, n);
		System.out.println(num);
	}
}
