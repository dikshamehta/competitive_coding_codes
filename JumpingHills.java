/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set1;

/**
 *
 * @author HP
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class JumpingHills
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
                int sol[]= new int[T];
		
		for(int i=0;i<T;i++)
		{
		    int hill_number=1;
		    int count=0;
		    int N= sc.nextInt();
                    //System.out.print(N);
		    int U= sc.nextInt();
                    //System.out.print(U);
		    int D= sc.nextInt();
                    //System.out.print(D);
		    
		    int h[]= new int[N];
		    
		    for(int j=0;j<N;j++)
		    {
		        h[j]= sc.nextInt();
		    }
		    
		    for(int j=0; j<N-1;j++)
		    {
		        if(h[j]==h[j+1])
		            hill_number=hill_number+1;
		            
		        else if(h[j+1]>h[j] && h[j+1]<=h[j]+U)
		            hill_number=hill_number+1;
		        
		         else if(h[j+1]<h[j] && h[j+1]>=h[j]-D)
		            hill_number=hill_number+1;
		            
		        else if(h[j+1]<h[j] && count==0)
		        {
		            count=count+1;
		            hill_number=hill_number+1;
		        }
                        else
                        {
                            break;
                        }
		        
		    }
		    //System.out.print(hill_number);
                    sol[i]=hill_number;  
		}
                for(int i=0;i<T;i++)
                {
                System.out.println(sol[i]);
                }
		
	}
}

