class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 82.4);

        System.out.println(student.name); // "John Doe"
        // DON'T DO THIS - private properties can't be accessed outside the class
//        System.out.println(student.grade);
        System.out.println(student.shareGrade()); // Do this instead

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

    }
}
