package com.devcarlos.apicep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devcarlos.apicep.controller.ControladorCepBean;


@SpringBootApplication
public class ConsumerAPiCepGsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerAPiCepGsonApplication.class, args);
		
		ControladorCepBean bean = new ControladorCepBean();
		
		System.out.println(bean.carregarEndereco());
		
	}

}
