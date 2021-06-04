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
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int max=a[0];
		    int min=a[0];
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]>max)
		        {
		            max=a[j];
		        }
		        if(a[j]<min)
		        {
		            min=a[j];
		        }
		    }
		    System.out.println(max+" "+min);
		}
	}
}
