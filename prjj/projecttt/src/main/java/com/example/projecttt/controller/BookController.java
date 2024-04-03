package com.example.projecttt.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.projecttt.model.Book;
import com.example.projecttt.service.BookService;

@RestController
public class BookController {
    @Autowired
    BookService bs;
    @PostMapping("/post")
    public ResponseEntity<Book> add(@RequestBody Book b)
    {
        Book newbook=bs.create(b);
        return new ResponseEntity<>(newbook,HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Book>>showinfo()
    {
        List<Book>obj=bs.getdetails();
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @PutMapping("/api/book/{id}")
    public ResponseEntity<Book>putMethodName(@PathVariable("id")int id, @RequestBody Book bok)
    {
        if(bs.updateDetails(id, bok)==true)
        {
            return new ResponseEntity<>(bok,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/api/book/{id}")
    public ResponseEntity<Boolean>delete(@PathVariable("id")int isbn)
    {
        if(bs.deleteBook(isbn)==true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}