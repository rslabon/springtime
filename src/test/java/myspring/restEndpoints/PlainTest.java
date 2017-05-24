package myspring.restEndpoints;

import javaslang.collection.List;
import myspring.testing.UnitTest;
import org.junit.Test;

import java.util.Optional;


public class PlainTest extends UnitTest {

    @Test
    public void map() throws Exception {
        List<Integer> doubleIt = List.of(1, 2, 3).map(i -> i * 2);

        System.out.println(doubleIt);
    }

    @Test
    public void findFirst() throws Exception {
        Optional<Integer> i = List.of(1, 2, 3, 4, 5, 6, 7).find(e -> e % 2 == 0).toJavaOptional();

        System.out.println(i);
    }

    @Test
    public void foldLeft() throws Exception {
        Integer i = List.of(1, 2, 3, 4, 5, 6, 7).foldLeft(0, (acc, e) -> acc + e);

        System.out.println(i);
    }
}
