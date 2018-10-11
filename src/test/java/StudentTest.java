import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestTest {

    @Test
    public void setUsernameTest() {

        Student student = new Student();
        student.setName("John Smyth");
        student.setAge(21);
        String username = student.getUsername();

        assertEquals("JohnSmyth21", username);
    }

}