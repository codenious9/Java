/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		Double TransAmount = sc.nextDouble();
		Double CurrentBalance = sc.nextDouble();
		 if(TransAmount%5==0 && CurrentBalance>=TransAmount+0.5){
              System.out.printf("%.2f",CurrentBalance-(TransAmount+0.5));
        }
        else {
            System.out.printf("%.2f",CurrentBalance);
        }
	}
}
