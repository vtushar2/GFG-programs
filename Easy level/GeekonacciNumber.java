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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int n=sc.nextInt();
		    System.out.println(geek(a,b,c,n));
		}
	}
	public static int geek(int a,int b,int c,int n)
	{
	    if(n==1)
	    {
	        return a;
	    }
	    if(n==2)
	    {
	        return b;
	    }
	    if(n==3)
	    {
	        return c;
	    }
	    return geek(a,b,c,n-1)+geek(a,b,c,n-2)+geek(a,b,c,n-3);
	}
}
