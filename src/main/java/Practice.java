import static java.lang.Math.round;

public class Practice {

    // version 1
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    // version 2
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//    // version 3
//    public static void sayHello(String name) {
//        sayHello("Hello", name);
//    }
//    // version 4
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static void main(String[] args) {

        count(5);
//        sayHello(3);
//        sayHello();
//        sayHello("Jeremy");
//        sayHello("Good morning", "Jeremy");


////        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
////        String userInput = scanner.nextLine();
////        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
////        double pi = 3.14159;
////        int almostPi = (int) pi;
////
////        System.out.printf("pi: %s", pi);
//////        System.out.println("");
//////        System.out.printf("almost pi: %s", almostPi);
////        System.out.println("");
////        System.out.printf("rounded pi: %.2f", pi);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [Yes/No] ");
//        String userInput = sc.next();
////
////// Do this instead
//        boolean confirmation = userInput.equalsIgnoreCase("yes");
//
//        if (confirmation) {
//            System.out.println("okay, here's more...");
//            // executes if someCondition is true
//        } else {
//            System.out.println("goodbye");
//            // executes if none of the conditions checked in this block were true
//        }
    }
}

