import java.util.Scanner;

public class SringPalindrom 
{
	public boolean isPolindrom(String word) 
	{
		char[] charArray=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		while(start<end) {
			if (charArray[start]!=charArray[end])
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public String  isRevWord(String word) {
		char[] charArray=word.toCharArray();
		String temp = "";
		for (int i =charArray.length-1; i>=0; i--)
		 {
			temp=temp+charArray[i];
		}
		return temp;
	}
	
	public String wordRev(String word) {
		char[] charArray=word.toCharArray();
		String temp="";
		int j=word.length()-1;
		while(j>=0) {
			temp=temp+charArray[j];
			j--;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		SringPalindrom sp=new SringPalindrom();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter thge word: ");
		String word=sc.next();
		if (sp.isPolindrom(word)) {
			System.out.println("is Palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
		System.out.println("The revers word is: "+sp.isRevWord(word));
		System.out.println("Revers Word id: "+sp.wordRev(word));
	}
}
