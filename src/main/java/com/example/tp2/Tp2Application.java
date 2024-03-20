package com.example.tp2;

import com.example.tp2.dao.entities.Product;
import com.example.tp2.dao.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class Tp2Application implements CommandLineRunner {
    ProductRepository productrepo;
	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product produit=new Product();
		Product produit1=new Product();
		Product produit2=new Product();
		produit.setDescription("hp");
		produit.setPrice(15000.00);
		produit.setQuantity(20.00);
		productrepo.save(produit);
		produit1.setDescription("dell");
		produit1.setPrice(12000.00);
		produit1.setQuantity(40.00);
		productrepo.save(produit1);
		produit2.setDescription("mac");
		produit2.setPrice(14000.00);
		produit2.setQuantity(40.00);
		productrepo.save(produit2);
		produit.setQuantity(45.00);
		productrepo.save(produit);
		productrepo.delete(produit);
		productrepo.deleteById(2);
		
		productrepo.findByQuantity(40.00).forEach(System.out::println);

	}
}
