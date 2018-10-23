import org.junit.Test;

import static org.junit.Assert.*;
public class getUsername {

    @Test
    public void getUsernameTest() {
        Student student = new Student("John Smyth", 21, "11/12/1997", "1234567", new Course());

        assertEquals("JohnSmyth21", student.getUsername());
    }
}
