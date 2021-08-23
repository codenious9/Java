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
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numArray[] = new int[size];
		for(int i =0;i<numArray.length;i++){
		    int num = sc.nextInt();
		    numArray[i]=num;
		}
		Arrays.sort(numArray);
		for(int i =0;i<numArray.length;i++){
		    System.out.println(numArray[i]);
		}
		
	}
}
