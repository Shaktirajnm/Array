import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Removeing Dublicet element in the list
public class RemoveDublicet 
{
	public void removedublicet(int[] arr) 
	{
		Set<Integer> st=new HashSet<Integer>();
		for (int num:arr)
		{
			if (st.add(num)==true)
			{
				System.out.print(num+" ");
			}
		}
	}
	
//	Dublicet element are in the list
	public void isdublicet(int[]arr) {
		Set<Integer> st=new HashSet<Integer>();
		int count=0;
		for (int num : arr)
		{
			if (st.add(num)==false)
			{
				System.out.print(num+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Dublicet element int the list: "+count);
	}
	
	public static void main(String[] args) 
	{
		RemoveDublicet rd=new RemoveDublicet();
		int[] arr= {12,15,9,32,12,15,18,20,25,34,20};
		rd.removedublicet(arr);
		System.out.println();
		rd.isdublicet(arr);
	}
}
