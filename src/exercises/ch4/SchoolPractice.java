package exercises.ch4;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student oliver = new Student("Oliver", 12345, 1, 4.0);
        Student maurice = new Student("Maurice", 456789);

        System.out.println("Oliver's gpa: "+ oliver.getGpa());
        System.out.println("Maurice's gpa: "+ maurice.getGpa());
    }

}
