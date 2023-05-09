package com.example.library.util;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

import jakarta.annotation.PostConstruct;

@Component
public class BookFiller {
    private final BookService bookService;
   
    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init()
    {
        Book book1 = new Book("Petalos al viento", "Segunda entrega de la Saga Dollanganger", "V.C Andrews");
        bookService.addBook(book1);
        try {Thread.sleep(1000);}catch (InterruptedException e){}
        Book book2 = new Book("Mein Kampf Mi lucha", "Modelo a seguir para la estabilidad de una nacion sin basarse en el comunismo", "Adolf Hitler");
        bookService.addBook(book2);
        try {Thread.sleep(1000);}catch (InterruptedException e){}
        Book book3 = new Book("Atraccion Mortal", "Joven se entera que posee un hechizo mientras que sus compañeros mas odiados buscan ponerle cura", "Kendymadness");
        bookService.addBook(book3);
    }
}
