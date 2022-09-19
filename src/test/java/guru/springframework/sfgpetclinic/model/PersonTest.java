package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l,"Joe","Buck");
        //then
        assertAll("test props set",
                () -> assertEquals(person.getFirstName(),"Joe"),
                () -> assertEquals(person.getLastName(),"Buck"));
    }

    @Test
    void groupedAssertions2() {
        //given
        Person person = new Person(1l,"Joe","Buck");
        //then
        assertAll("test props set",
                () -> assertEquals(person.getFirstName(),"Joe", "First name failed"),
                () -> assertEquals(person.getLastName(),"Buck", "Last Name failed"));
    }
}