import java.util.Scanner;

public class FeverCheck {

    public static void main(String[] args){

        // Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
        System.out.println("Enter Your Body Temperature");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        if(temp>100){
            System.out.println("You have fever !!!");
        }
        else {
            System.out.println("You don't have a fever");
        }



    }
}
