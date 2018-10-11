import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String dateOfBirth;
    private String id;
    private String username;
    private String course;
    private ArrayList<Module> modules;

    public Student() {

    }

    public Student(String name, int age, String dateOfBirth, String id, String course, ArrayList<Module> modules) {
        this.setName(name);
        this.setAge(age);
        this.setDateOfBirth(dateOfBirth);
        this.setId(id);
        this.username = getUsername();
        this.setCourse(course);
        this.setModules(modules);
    }

    public String getUsername() {
        String name = getName();
        return name.replace(" ", "_") + getAge();
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
