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
		for(int i =0;i<T;i++){
		    String num = br.readLine();
		    char sFirst = num.charAt(0);
		    char sLast = num.charAt(num.length()-1);
		    int intFirst = Character.getNumericValue(sFirst);
		    int intLast = Character.getNumericValue(sLast);
		    System.out.println(intFirst+intLast);
		}
	}
}
