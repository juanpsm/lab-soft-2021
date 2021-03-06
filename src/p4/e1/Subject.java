package p4.e1;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class Subject {
    private String name;
    private SortedSet<Student> students = new TreeSet<>(Student.ComparadorPorLegajo.INSTANCE);

    public Subject(String name, Collection<Student> col) {
        this.name = name;
        this.students.addAll(col);
    }

    public SortedSet<Student> getStudents() {
        return students;
    }

    public void addStudent (Student s){
        this.students.add(s);
    }
}