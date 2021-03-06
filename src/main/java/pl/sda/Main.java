package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.countAllBooks());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
