package org.scu.db.demo.service;


import org.scu.db.demo.model.Book;
import org.scu.db.demo.model.Title;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BookService {
    List<Book> find_all_books();
    List<Map> query_call_and_count();
    List<Integer> find_all_borrowed_booksId();
    Integer count_call_123book();
    List<String> find_count_not_exceed_2_callnumber();
}
