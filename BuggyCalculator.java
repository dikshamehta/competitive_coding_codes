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
public class BuggyCalculator {
    public static void main(String args[])
    {
        int t,n1,n2;
        Scanner sc= new Scanner(System.in);
        t= sc.nextInt();
        for(int i=0;i<t;i++)
        {
            n1= sc.nextInt();
            n2= sc.nextInt();
            int r;
            String s="";
            do
            {
                r = (n1%10)+(n2%10);
                s= Integer.toString(r%10)+s;
                n1=n1/10;
                n2=n2/10;
            }while(n1!=0||n2!=0);
            System.out.println(Integer.parseInt(s));  
        }
        
    }
    
}
