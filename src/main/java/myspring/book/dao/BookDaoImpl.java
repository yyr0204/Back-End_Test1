package myspring.book.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.book.dao.mapper.BookMapper;
import myspring.book.vo.BookVO;

@Repository("bookDao")
public class BookDaoImpl implements BookDao{
	@Autowired
	private BookMapper bm;

	@Override
	public List<BookVO> selectAll() {
		List<BookVO> bookList = bm.selectBookList();
		return bookList;
	}

	@Override
	public BookVO selectOne(String isbn) {
		BookVO book = bm.selectBookByIsbn(isbn);
		return book;
	}
}
