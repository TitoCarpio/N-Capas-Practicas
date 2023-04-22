package com.erickcg.Taller1.contollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erickcg.Taller1.models.dtos.EmployeeSearchDTO;
import com.erickcg.Taller1.models.entities.Employee;


@Controller
@RequestMapping("/login")
public class PersonController {
	
private static List<Employee> employees = new ArrayList<>();
    
    static {
        employees.add(new Employee("AA252525", "Erick","Carpio","2023-03-15", "ACTIVO", "ADMIN", "123456"));
        employees.add(new Employee("BB303030", "Tito","Guerra","2023-04-01", "INACTIVO", "USER", "123456"));
        employees.add(new Employee("CC515151", "Carlos","Lopez","2023-01-15", "ACTIVO", "USER", "123456"));
    }
	
	

		//retornando la pantalla principal del login
	@GetMapping("/")
	public String getLoging() {
		return "login";
		
	}
	
//	@GetMapping("/failLog")
//	public String getFailLog() {
//		return "errorLog";
//	}
	
	@GetMapping("/sesion")
	public String requestEmployee(@ModelAttribute EmployeeSearchDTO search) {
		String code = search.getCode();
		String pass = search.getPassword();
		
		System.out.println(code + " " + pass);
		
		Employee foundEmployee = employees.stream()
				.filter(employee -> employee.getCode().equals(code))
				.findAny()
				.orElse(new Employee("","","","","","",""));
		
		System.out.println(foundEmployee.getCode());
		System.out.println(foundEmployee.getPassword());
		
		String Fpass = foundEmployee.getPassword();
		String rol =  foundEmployee.getRol();		
		
		
		
		if (Fpass.equals(pass) ) {
			if (rol.equals("USER")) {
				return "user";
			}else {
				return "mainAdmin";
			}
			
			
			
		}
		else {
			return "erroLog";
		}
		
		
		
		//return "redirect:/login/";
	}
	
	
}
