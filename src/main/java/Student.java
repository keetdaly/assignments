import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String dateOfBirth;
    private String id;
    private String username;
    private Course course;
    private ArrayList<Module> modules;

    public Student() {

    }

    public Student(String name, int age, String dateOfBirth, String id, Course course) {
        this.setName(name);
        this.setAge(age);
        this.setDateOfBirth(dateOfBirth);
        this.setId(id);
        this.username = getUsername();
        this.setCourse(course);
    }

    public String getUsername() {
        String name = getName();
        this.username = name.replace(" ", "") + getAge();
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
