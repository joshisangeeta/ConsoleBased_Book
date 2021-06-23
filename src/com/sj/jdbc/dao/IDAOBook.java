package com.sj.jdbc.dao;

import java.util.List;

import com.sj.model.Book;

public interface IDAOBook {
	
	public List<Book> viewAllBooks();
	public  Book searchBookByTitle(String title);
	public int insertBook(Book book);
	public int deleteBookById(int id);
	public int updateBook(int id,double price);
	

}
