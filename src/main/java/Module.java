import java.util.ArrayList;

public class Module {

    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> associatedCourses;

    public Module(){

    }

    public Module(String name, String id) {
        this.setName(name);
        this.setId(id);
        this.setStudents(students);
        this.setAssociatedCourses(associatedCourses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<Course> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }
}
