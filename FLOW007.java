/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0;i<T;i++){
		    int rev=0;
		    int N = Integer.parseInt(br.readLine());
		    while(N>0){
		        int rem = N%10;
		            rev = rev*10 + rem;
		            N = N/10;
		    }
		    System.out.println(rev);
		}
	}
}
