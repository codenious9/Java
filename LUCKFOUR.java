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
		int t = Integer.parseInt(br.readLine());
		for(int i = 0;i<t;i++){
		    int count=0;
		    int num = Integer.parseInt(br.readLine());
		    while(num>0){
		    int rem = num%10;
		    num /=10;
		    if (rem==4) count++;
		    }
		    System.out.println(count);
		}
	}
}
