import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str, rev ="";
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		
		int length= str.length();
		System.out.println();
		for(int i=length -1;i>=0;i--)
			rev = rev + str.charAt(i);
		if(str.equals(rev)) {
			System.out.print(str+" is paldrome");
		}
		
	}
}
