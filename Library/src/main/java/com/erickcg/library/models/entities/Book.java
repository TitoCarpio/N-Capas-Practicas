package com.erickcg.library.models.entities;

public class Book {
	
	private String isbn;
	private String title;
	//private String owner;
	
	//constructor
	public Book(String isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
		//this.owner = owner;
	}
	
	//genrando los setters y getters

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	public String getOwner() {
//		return owner;
//	}
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
	
	
	
	
}
