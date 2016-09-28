/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
        int var=num;
        int sum=0;
        while(temp>0){
            var=var*(temp%10);
            sum=sum+(temp%10);
            temp=temp/10;

        }
        num=num*sum;
        if (num==var)
        {
            System.out.println(num/sum+"  the number is a seed number ");
        }
        else
            System.out.println(num/sum +" is not a seed number");
    }
}
    }

