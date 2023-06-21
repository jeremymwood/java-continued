import java.util.Scanner;

import static java.lang.Math.round;

public class Practice {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        double pi = 3.14159;
//        int almostPi = (int) pi;
//
//        System.out.printf("pi: %s", pi);
////        System.out.println("");
////        System.out.printf("almost pi: %s", almostPi);
//        System.out.println("");
//        System.out.printf("rounded pi: %.2f", pi);

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [Yes/No] ");
        String userInput = sc.next();
//
//// Do this instead
        boolean confirmation = userInput.equalsIgnoreCase("yes");

        if (confirmation) {
            System.out.println("okay, here's more...");
            // executes if someCondition is true
        } else {
            System.out.println("goodbye");
            // executes if none of the conditions checked in this block were true
        }


    }

}
