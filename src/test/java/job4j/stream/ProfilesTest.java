package job4j.stream;

import org.junit.Test;
import ru.job4j.stream.Address;
import ru.job4j.stream.Profile;
import ru.job4j.stream.Profiles;

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

    @Test
    public void whenPutAddressClient() {
        List<Address> expected = new ArrayList<>();
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(new Address("Saratov","Shelkovichnaya",6,34)));
        profiles.add(new Profile(new Address("St.Petersburg","Chernogorskaya",23,146)));
        expected.add(new Address("Saratov","Shelkovichnaya",6,34));
        expected.add(new Address("St.Petersburg","Chernogorskaya",23,146));
        List<Address> result = new Profiles().collect(profiles);
        assertThat(expected, is(result));
    }
}