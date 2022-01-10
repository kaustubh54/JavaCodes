import java .util.*;
public class Palindrome {
public static void main(String[] args) {
	String str;
	int i,n;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string;");
	str =scan.nextLine();
	n= str.word.length();
	char c[]= new char[n];
	char rev[] = new char [n];
	 c=str.toCharArray();
	 for (i=0;i<=n;i++) {
		 rev[n-i-1]=c[i];
	 }
	  for (i=0;i<=n-1;i++) {
		  if (rev[i]!=c[i]) 
			  break;
	  }
	   if (n==i)
	   System.out.println("Palindrome");
	   else 
		   System.out.println("Not palindrome");
	 
	
}
}
