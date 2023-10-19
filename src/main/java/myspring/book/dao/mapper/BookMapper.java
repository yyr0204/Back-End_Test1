package myspring.book.dao.mapper;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookMapper {
	BookVO selectBookByIsbn(String isbn);
	List<BookVO> selectBookList();
}
