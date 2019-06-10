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
import java.util.Scanner;
public class DivideIt {
    public static void main(String args[])
    {
        int q;
        Scanner sc= new Scanner(System.in);
        q= sc.nextInt();
        long input[]= new long[q];
        for(int i=0;i<q;i++)
        {
            input[i]= sc.nextLong();
        }
        int count[]= new int[q];
        for(int i=0;i<q;i++)
        {
            while(input[i]!=1)
            {
//                System.out.println("loop start input:"+input[i]);
  //              System.out.println("loop start count:"+count[i]);
                if(input[i]%2==0)
                {
                    input[i]=input[i]/2;
    //                System.out.println("2input:"+input[i]);
                    count[i]++;
      //              System.out.println("2count:"+count[i]);
                    continue;
                }
                else if(input[i]%3==0)
                {
                    input[i]=(2*input[i])/3;
        //            System.out.println("3input:"+input[i]);
                    count[i]++;
          //          System.out.println("3:"+count[i]);
                    continue;
                }
                else if(input[i]%5==0)
                {
                    input[i]=(4*input[i])/5;
            //        System.out.println("5input:"+input[i]);
                    count[i]++;
              //      System.out.println("5:"+count[i]);
                    continue;
                }
                else
                {
                    break;
                }
              //  System.out.println("loop end:"+count[i]);
            }
         
        }
        for(int i=0;i<q;i++)
        {
            if(input[i]==1)
            {
                System.out.println(count[i]);
            }
            else
            {
                System.out.println(-1);
            }
        }
        
    }
    
}
