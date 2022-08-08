package com.mabio.boookstoremanager.service;


import com.mabio.boookstoremanager.dto.MessageResponseDTO;
import com.mabio.boookstoremanager.entity.Book;
import com.mabio.boookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Book Created with ID " + savedBook.getId()).build();
    }
}