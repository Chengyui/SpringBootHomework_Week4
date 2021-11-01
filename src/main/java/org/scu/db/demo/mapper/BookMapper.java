package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.model.Title;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> queryBook();
    List<Map> query_call_and_count();
    List<Integer> find_all_borrowed_books_id();
    Integer count_call_123book();
    List<String> find_count_not_exceed_2_callnumber();
}
