package org.scu.db.demo.service.impl;

import org.scu.db.demo.mapper.BookMapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> find_all_books()
    {
        return bookMapper.queryBook();
    }

    public List<Map> query_call_and_count(){
        return bookMapper.query_call_and_count();
    }

    public List<Integer> find_all_borrowed_booksId(){return bookMapper.find_all_borrowed_books_id();}

    public Integer count_call_123book() { return bookMapper.count_call_123book(); }
    public List<String> find_count_not_exceed_2_callnumber(){
        return bookMapper.find_count_not_exceed_2_callnumber();
    }
}
