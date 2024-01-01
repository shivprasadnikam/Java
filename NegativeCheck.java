import java.util.Scanner;

public class NegativeCheck {

    public static void  main(String[] args){

        //  Write a Java program to get a number from the user and print whether it is positive or negative

        System.out.println("Enter Any Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number>0){
            System.out.println("Given Number Is Positive");;
        }
        else if(number<0){
            System.out.println("Given Number Is Negative");
        }
        else {
            System.out.println("Given Number Is Zero");
        }




    }
}
