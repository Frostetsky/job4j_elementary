package job4j.collection;

import org.junit.Test;
import ru.job4j.collection.Account;
import ru.job4j.collection.NotifyAccount;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        Set<Account> expect = Set.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")

        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void haveDuplicates() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001"),
                new Account("155", "John MacTavish", "032451"),
                new Account("155", "John MacTavish", "032451")
        );
        Set<Account> expect = Set.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001"),
                        new Account("155", "John MacTavish", "032451")
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}