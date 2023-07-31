package L4Person;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 28, "Male", "Ireland");
        Person person2 = new Person("Selina", 25, "Female", "UK");

        boolean isEqual = person1.equals(person2);
        System.out.println("Are persons equal? " + isEqual);

        int hash1 = person1.hashCode();
        int hash2 = person2.hashCode();
        System.out.println("hashcode1: " + hash1);
        System.out.println("hashcode2: " + hash2);

        String string1 = person1.toString();
        String string2 = person2.toString();
        System.out.println("person1 information: " + string1);
        System.out.println("person2 information: " + string2);
    }


}
