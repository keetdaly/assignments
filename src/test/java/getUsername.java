import org.junit.Test;

import static org.junit.Assert.*;
public class getUsername {

    @Test
    public void getUsernameTest() {
        Student student = new Student();
        student.setName("John Smyth");
        student.setAge(21);

        assertEquals("JohnSmyth21", student.getUsername());
    }
}
