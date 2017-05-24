package myspring.domain;

import myspring.testing.IntegrationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class BookRepoIT extends IntegrationTest {

    @Autowired
    private BookRepo bookRepo;

    @Test
    public void test() throws Exception {
        bookRepo.save(new Book("my title"));

        assertThat(bookRepo.findByTitle("my title")).isNotEmpty();
    }
}