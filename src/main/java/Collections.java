import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);

        System.out.println(numbers); // [21, 20, 22]
        System.out.println(numbers.size()); //3
        System.out.println(numbers.get(2)); //22

        numbers.indexOf(20);    // 1
        numbers.indexOf("cat"); // -1


        // We'll start by defining an array list and adding some items to it
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts); // [light, medium, medium, dark]

// using .contains
        System.out.println(roasts.contains("dark")); //true
        System.out.println(roasts.contains("espresso")); //false

// using .lastIndexOf
        roasts.lastIndexOf("medium"); // 2

// using .isEmpty
        roasts.isEmpty(); // false
        ArrayList<String> emptyList = new ArrayList<>();
        emptyList.isEmpty(); // true

// .remove has two variants
        roasts.remove("espresso"); // false
        roasts.remove("medium"); // true
        System.out.println(roasts); // [light, medium, dark]

        roasts.remove(2); // "dark"
        System.out.println(roasts); // [light, medium]

    }
}
