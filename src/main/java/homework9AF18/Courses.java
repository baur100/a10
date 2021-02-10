package homework9AF18;

import java.util.Arrays;

public class Courses {
    private String name;
    private int students;
    private int room;
    private String[] teachers;

    public Courses(){}

    public Courses(String name, int students, int room, String[] teachers) {
        this.name = name;
        this.students = students;
        this.room = room;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String[] getTeachers() {
        return teachers;
    }

    public void setTeachers(String[] teachers) {
        this.teachers = teachers;
    }

    public void printClass() {
        System.out.println("Course: " + name +
                ".\n Students= " + students +
                ". Room is " + room +
                ".\n Teachers=" + Arrays.toString(teachers));
    }

}
