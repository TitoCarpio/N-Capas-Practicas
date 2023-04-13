package com.erickcg.library.contollers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

//import com.erickcg.library.models.dtos.BookSearchDTO;
import com.erickcg.library.models.dtos.SaveBookDTO;
import com.erickcg.library.models.entities.Book;



@Controller  //Esto identifica mi clase como un controlador
@RequestMapping("/library")
public class LibraryController {
	
	private static List<Book> library = new ArrayList<>();
    
    static {
        library.add(new Book("0261102303", "Lord of the Rings"));
        library.add(new Book("0007441428", "Game of Thrones"));
        library.add(new Book("0747581088", "Harry Potter and the Half-Blood Prince"));
        library.add(new Book("1401248195", "Watchmen"));
        library.add(new Book("030788743X", "Ready player one"));
        library.add(new Book("843760494X", "Cien Años de Soledad"));
        library.add(new Book("0553804367", "A Briefer History of Time"));
    }

	@GetMapping("/") //esta es la opcion 1 de como hacerlo
	//@RequestMapping(value = "/", method = RequestMethod.GET) //esta es la opcion 2
	public String getMainPage(Model model) {
		//obteniendo la hora del sistema
		String tiempo = Calendar.getInstance().getTime().toString();
		model.addAttribute("time", tiempo);
		
		return "main";
	}
	
//	@PostMapping("/book")
//	//@RequestMapping(value = "/book", method =  RequestMethod.POST)
//	private String requestBookPage (@ModelAttribute BookSearchDTO search, Model model) {
//		
////		System.out.println("ISBN: "+ search.getIsbn());
////		System.out.println("Titulo: "+ search.getTitle());
////		System.out.println("Escritor: "+ search.getOwner());
//		
//		//esto busca un elemento en la lista y lo muestra en el HTML
//		String isbn = search.getIsbn();
//		//inserte proceso de servicio para filtrar la infi
//		Book foundBook = library.stream()
//				.filter(book -> book.getIsbn().equals(isbn))
//				.findAny()
//				.orElse(new Book("","")); //esta linea es por si no encuentro ningun libro.
//		
//		model.addAttribute("isbn", foundBook.getIsbn());
//		model.addAttribute("title", foundBook.getTitle());
//		
//		//la busqueda llega hasta aca.
//		
//		
//		
//		return "book";
//	}
	
	//mostrando la coleccion de libros
		@PostMapping("/save")
	    public String saveBook(@ModelAttribute SaveBookDTO bookInfo) {
	    	System.out.println(bookInfo.getIsbn());
	    	System.out.println(bookInfo.getTitle());
	    	System.out.println(bookInfo.getOwner());
	    	
	    	Book newBook = new Book(bookInfo.getIsbn(), bookInfo.getTitle());
	    	library.add(newBook);
	    	
	    	
	    	return "redirect:/library/";
	    }
		
		//Mostrando todos los libros.
		@GetMapping("/all")
		//@RequestMapping(value = "/all", method = RequestMethod.GET)
	    public String getBookList(Model model) {
			model.addAttribute("books", library);
			return "book";
	    }
	
}
