package exercises.ch4;

import java.util.ArrayList;

public class Course {

    private String name;
    private int credits;
    private ArrayList<Student> roster;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
        this.roster = new ArrayList<>(); //empty arraylist
    }
}
