package myspring;

import myspring.domain.Book;
import myspring.domain.BookRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        BookRepo bookRepo = SpringApplication.run(Application.class, args).getBean(BookRepo.class);
        bookRepo.save(new Book("b1"));
    }
}
