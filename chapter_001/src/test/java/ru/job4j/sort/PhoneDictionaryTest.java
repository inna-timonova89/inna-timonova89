package ru.job4j.sort;

import org.junit.Test;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Arsentev");
        assertThat(persons.get(0).getName(), is("Petr"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Ivan", "Pupkin", "991882", "Moskva"));
        ArrayList<Person> persons = phones.find("991882");
        assertThat(persons.get(0).getSurname(), is("Pupkin"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Stepan", "Romanov", "773664", "Orel"));
        ArrayList<Person> persons = phones.find("Orel");
        assertThat(persons.get(0).getPhone(), is("773664"));
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Inna", "Timonova", "79992213989", "Saint-Petersburg"));
        ArrayList<Person> persons = phones.find("Inna");
        assertThat(persons.get(0).getAddress(), is("Saint-Petersburg"));
    }
}