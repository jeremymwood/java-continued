class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 82.4);

        System.out.println(student.name); // "John Doe"
        // DON'T DO THIS - private properties can't be accessed outside the class
//        System.out.println(student.grade);
        System.out.println(student.shareGrade()); // Do this instead
    }
}
