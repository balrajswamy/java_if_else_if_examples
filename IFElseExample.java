package ex_19122024.ConditionalStatements;
import java.util.Scanner;

public class IFElseExample {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:\t");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:\t");
        int b = sc.nextInt();
        System.out.println("\nusing if else\n");
        if (a > b){
            System.out.println("a is greater than b:\t"+a);
        }
        else if(a==b) {
            System.out.println("b is  equal to b a:\t"+a+"=="+b);
        }
        else{
            System.out.println("b is greater than a:\t"+b);
        }

        System.out.println("\n------------------------------\n");
        System.out.println("\n using else if\n");

        if (a==b){
            System.out.println("a is equal to b:\t"+a+"=="+b);
        }
        else if(a !=b){
            System.out.println("a is not equal to b:\t"+a+"!="+b);
        }
        else{
            System.out.println("Try with some other values!");
        }
        sc.close();
    }
}
