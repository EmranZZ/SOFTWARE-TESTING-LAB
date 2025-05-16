package JUnit.Basics;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student s1= new Student("Ahmad", 23);
    Student s2= new Student("Abdullah", 15);

    @Test
    public void getName() {
        assertEquals("Ahmad", s1.getName());
        assertEquals("Abdullah", s2.getName());
    }

    @Test
    public void isAdult() {
        assertEquals(true, s1.isAdult());
        assertEquals(true, s2.isAdult()); //should be failed as actual result is 'false'
    }
}