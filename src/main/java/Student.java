class Student {
    public String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String shareGrade() {
        return "Grade: " + grade;
    }
}
