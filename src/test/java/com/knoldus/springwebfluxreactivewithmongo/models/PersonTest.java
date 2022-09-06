package com.knoldus.springwebfluxreactivewithmongo.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonTest {
    /**
     * Method under test: {@link Person#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Person()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Person#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Person person = new Person();

        Person person1 = new Person();
        person1.setAge(3);
        person1.setId("42");
        person1.setName("Name");
        assertTrue(person.canEqual(person1));
    }

    @Test
    void testConstructor() {
        Person actualPerson = new Person();
        actualPerson.setAge(1);
        actualPerson.setId("42");
        actualPerson.setName("Name");
        String actualToStringResult = actualPerson.toString();
        assertEquals(1, actualPerson.getAge());
        assertEquals("42", actualPerson.getId());
        assertEquals("Name", actualPerson.getName());
        assertEquals("Person(name=Name, age=1, id=42)", actualToStringResult);
    }

    /**
     */
    @Test
    void testConstructor2() {
        Person actualPerson = new Person("Name", 1, "42");
        actualPerson.setAge(1);
        actualPerson.setId("42");
        actualPerson.setName("Name");
        String actualToStringResult = actualPerson.toString();
        assertEquals(1, actualPerson.getAge());
        assertEquals("42", actualPerson.getId());
        assertEquals("Name", actualPerson.getName());
        assertEquals("Person(name=Name, age=1, id=42)", actualToStringResult);
    }

    /**
     * Method under test: {@link Person#equals(Object)}
     */
    @Test
    void testEquals() {
        Person person = new Person();
        person.setAge(1);
        person.setId("42");
        person.setName("Name");
        assertNotEquals(person, null);
    }

    /**
     * Method under test: {@link Person#equals(Object)}
     */
    @Test
    void testEquals2() {
        Person person = new Person();
        person.setAge(1);
        person.setId("42");
        person.setName("Name");
        assertNotEquals(person, "Different type to Person");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#equals(Object)}
     *   <li>{@link Person#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Person person = new Person();
        person.setAge(1);
        person.setId("42");
        person.setName("Name");
        assertEquals(person, person);
        int expectedHashCodeResult = person.hashCode();
        assertEquals(expectedHashCodeResult, person.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#equals(Object)}
     *   <li>{@link Person#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Person person = new Person();
        person.setAge(1);
        person.setId("42");
        person.setName("Name");

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId("42");
        person1.setName("Name");
        assertEquals(person, person1);
        int expectedHashCodeResult = person.hashCode();
        assertEquals(expectedHashCodeResult, person1.hashCode());
    }

    /**
     * Method under test: {@link Person#equals(Object)}
     */
    @Test
    void testEquals5() {
        Person person = new Person();
        person.setAge(3);
        person.setId("42");
        person.setName("Name");

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId("42");
        person1.setName("Name");
        assertNotEquals(person, person1);
    }

    /**
     * Method under test: {@link Person#equals(Object)}
     */
    @Test
    void testEquals6() {
        Person person = new Person();
        person.setAge(1);
        person.setId("Name");
        person.setName("Name");

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId("42");
        person1.setName("Name");
        assertNotEquals(person, person1);
    }

    /**
     * Method under test: {@link Person#equals(Object)}
     */
    @Test
    void testEquals7() {
        Person person = new Person();
        person.setAge(1);
        person.setId(null);
        person.setName("Name");

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId("42");
        person1.setName("Name");
        assertNotEquals(person, person1);
    }

    /**
     * Method under test: {@link Person#equals(Object)}
     */
    @Test
    void testEquals8() {
        Person person = new Person();
        person.setAge(1);
        person.setId("42");
        person.setName("42");

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId("42");
        person1.setName("Name");
        assertNotEquals(person, person1);
    }

    /**
     * Method under test: {@link Person#equals(Object)}
     */
    @Test
    void testEquals9() {
        Person person = new Person();
        person.setAge(1);
        person.setId("42");
        person.setName(null);

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId("42");
        person1.setName("Name");
        assertNotEquals(person, person1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#equals(Object)}
     *   <li>{@link Person#hashCode()}
     * </ul>
     */
    @Test
    void testEquals10() {
        Person person = new Person();
        person.setAge(1);
        person.setId(null);
        person.setName("Name");

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId(null);
        person1.setName("Name");
        assertEquals(person, person1);
        int expectedHashCodeResult = person.hashCode();
        assertEquals(expectedHashCodeResult, person1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#equals(Object)}
     *   <li>{@link Person#hashCode()}
     * </ul>
     */
    @Test
    void testEquals11() {
        Person person = new Person();
        person.setAge(1);
        person.setId("42");
        person.setName(null);

        Person person1 = new Person();
        person1.setAge(1);
        person1.setId("42");
        person1.setName(null);
        assertEquals(person, person1);
        int expectedHashCodeResult = person.hashCode();
        assertEquals(expectedHashCodeResult, person1.hashCode());
    }
}

