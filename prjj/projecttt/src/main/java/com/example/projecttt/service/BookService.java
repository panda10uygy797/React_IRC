package com.example.projecttt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projecttt.model.Book;
import com.example.projecttt.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo br;
    public Book create(Book bk)
    {
        return br.save(bk);
    }
    public List<Book>getdetails()
    {
        return br.findAll();
    }
    public Book getBookById(int id)
    {
        return br.findById(id).orElse(null);
    }

    public boolean updateDetails(int id,Book b)
    {
        if(this.getBookById(id)==null)
        {
            return false;
        }
        try{
            br.save(b);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public boolean deleteBook(int id)
    {
        if(this.getBookById(id)==null)
        {
            return false;
        }
        br.deleteById(id);
        return true;
    }
}