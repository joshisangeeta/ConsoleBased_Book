package com.sj.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sj.model.Book;

public class BookJDBCDAO implements IDAOBook {

	
	
	@Override
	public List<Book> viewAllBooks()  {
		// TODO Auto-generated method stub
   
		  
	      List<Book> books = new ArrayList<>();
	    try {
	      Connection con = DBConnector.getInstance().getConnection();
		  Statement st = con.createStatement();	 
		  ResultSet rs = st.executeQuery("select * from capg.book");
		  while(rs.next()) {
			  
	books.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
			  
		    } 
		  
		
  
          } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }		
		return books;
	}

	@Override
	public Book searchBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBookById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBook(int id, double price) {
		// TODO Auto-generated method stub
		return 0;
	}

}
