package pl.sda;

import lombok.Data;

@Data
public class Book {

    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }
}
