import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionSort 
{
	public void isColectionSort(int[] arr) 
	{
		TreeSet<Integer> ls=new TreeSet<Integer>();
		for (int i=0;i<arr.length;i++) 
		{
			ls.add(arr[i]);
		}
		System.out.println("TreeSet oreder: "+ls);
	}
	
	public void isColectionSort1(int[] arr) 
	{
		List<Integer> ls=new ArrayList<Integer>();
		for (int num:arr) 
		{
			ls.add(num);
		}
		Collections.sort(ls, Collections.reverseOrder());
		System.out.println("List Order: "+ls);
	}
	
	public static void main(String[] args) 
	{
		CollectionSort cs=new CollectionSort();
		int[] arr= {12,10,6,8,15,20,16,3,14,26,21,15,0};
		cs.isColectionSort(arr);
		cs.isColectionSort1(arr);
	}
}
