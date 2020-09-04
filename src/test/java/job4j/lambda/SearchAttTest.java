package job4j.lambda;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SearchAttTest {
    @Test
    public void whenFilterList() {
        List<Attachment> list = new ArrayList<>();
        list.add(new Attachment("Test1", 100));
        list.add(new Attachment("Test3",70));
        list.add(new Attachment("Test2", 150));
        List<Attachment> filterlist = SearchAtt.filter(list);
        List<Attachment> expected = new ArrayList<>();
        expected.add(new Attachment("Test2", 150));
        assertThat(filterlist, is(expected));
    }

}