class Person {
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }
    public String sayGoodbye() {
        return String.format("Goodbye from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        System.out.println(rick.sayGoodbye());
        // prints "Hello from Rick Sanchez!"
    }
}
