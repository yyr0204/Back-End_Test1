package myspring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myspring.book.service.BookService;
import myspring.book.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	private BookService service;
	@RequestMapping("/bookList.do")
	public String bookList(Model model) {
		List<BookVO> bookList = service.getBookList();
		model.addAttribute("bookList",bookList);
		return "bookList";
	}
	
	@RequestMapping("/getBook.do")
	public String getBook(@RequestParam String isbn, Model model) {
		BookVO book = service.getBook(isbn);
		model.addAttribute("book", book);
		return "bookInfo";
	}
}
