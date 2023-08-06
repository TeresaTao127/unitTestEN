package L4Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person1 = new Person("John", 28, "Male", "Ireland");
    Person person2 = new Person("Selina", 25, "Female", "UK");
    @Test
    void isEquals() {

        boolean expectedResult= false;
        boolean result = person1.equals(person2);
        assertEquals(expectedResult, result);

    }

    @Test
    void testHashCode() {

        int hash1 = person1.hashCode();
        int hash2 = person2.hashCode();
        System.out.println("hashcode1: " + hash1);
        System.out.println("hashcode2: " + hash2);
    }
}