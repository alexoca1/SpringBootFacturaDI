package com.alexocampo.proyecto.factura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@ComponentScan(basePackages ="com.alexocampo.proyecto.factura.controllers")
//@ComponentScan(basePackages ="com.alexocampo.proyecto.factura.models")
//@ComponentScan(basePackages ="ccom.alexocampo.proyecto.factura.models.domain")
//@ComponentScan(basePackages ="com.alexocampo.proyecto.factura")
public class ProyectoFacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFacturaApplication.class, args);
	}

}
