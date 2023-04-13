package com.erickcg.library.models.dtos;

public class SaveBookDTO {
	private String isbn;
	private String title;
	private String owner;
	public SaveBookDTO(String isbn, String title, String owner) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.owner = owner;
	}
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
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}
