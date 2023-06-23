//class Person {
//    public String firstName;
//    public String lastName;
//
//    public Person() {
//        System.out.println("A Person is created!");
//    }
//    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }
//    public String sayGoodbye() {
//        return String.format("Goodbye from %s %s!", firstName, lastName);
//    }
//
//    public static void main(String[] args) {
//        Person rick = new Person();
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
//        System.out.println();
//        System.out.println(rick.sayHello());
//        System.out.println(rick.sayGoodbye());
//        System.out.println();
//
//        Person jeremy = new Person();
//        jeremy.firstName = "Jeremy";
//        jeremy.lastName = "Wood";
//        System.out.println(jeremy.sayHello());
//        System.out.println(jeremy.sayGoodbye());
//        // prints "Hello from Rick Sanchez!"
//    }
//}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }
}
