/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumation;

/**
 *
 * @author sandra kamili
 */
import java.util.Scanner;
/**
 * @author sandra kamili
 */
public class Sumation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter the first number:");
        num1=input.nextInt();
        System.out.print("Enter the second number:");
        num2=input.nextInt();
        System.out.println();
        System.out.println(num1+"+"+num2+"="+(num1+num2));        
        System.out.println(num1+"-"+num2+"="+(num1-num2));        
        System.out.println(num1+"*"+num2+"="+(num1*num2));
      
        
        
    }
}
