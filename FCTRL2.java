/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int factorial(int n){
        if(n==0) return 1;
        else return(n*factorial(n-1));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(factorial(n));
            
        }
        
	}
}
