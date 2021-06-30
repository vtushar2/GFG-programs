import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    char[] arr=s.toCharArray();
		    Arrays.sort(arr);
		    System.out.println(String.valueOf(arr));
		}
	}
}
