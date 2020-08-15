package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenElementsUnique() {
        List<Address> expected = new ArrayList<>();
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(new Address("Moscow","Arbatskaya",6,34)));
        profiles.add(new Profile(new Address("St.Petersburg","Novaya",10,31)));
        profiles.add(new Profile(new Address("Moscow","Arbatskaya",6,34)));
        expected.add(new Address("Moscow","Arbatskaya",6,34));
        expected.add(new Address("St.Petersburg","Novaya",10,31));
        List<Address> result = new Profiles().collect(profiles);
        assertThat(expected, is(result));
    }
}