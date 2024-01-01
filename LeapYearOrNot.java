import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args){
        //  Write a Java program that takes a year from the user and print whether that year is a leap year or not

        System.out.println("Enter Any Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // A leap year is divisible by 4
        // If it is also divisible by 100, it must be divisible by 400 to be a leap year
        if(year%4==0 && (year%400==0 || year%100!=0)){
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is not a Leap Year");
        }


    }
}
