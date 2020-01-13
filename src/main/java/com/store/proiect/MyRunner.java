package com.store.proiect;

import com.store.proiect.entity.Product;
import com.store.proiect.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyRunner implements CommandLineRunner {

        @Autowired
        private ProductRepository repository;

        @Override
        public void run(String... args) throws Exception {
            repository.deleteAll();

            repository.save(new Product (1,"Rochie Rain","product1", 25.99));
            repository.save(new Product (2,"Rochie Moonlight","product2", 26.99));
            repository.save(new Product (3,"Rochie Infused","product3", 27.99));
            repository.save(new Product (4,"Rochie Charm","product4", 30.99));
            repository.save(new Product (5,"Rochie Peach","product5", 59.99));
            repository.save(new Product (6,"Rochie Fire Spirit","product6", 79.99));
            repository.save(new Product (7,"Rochie Ayana","product7", 40.99));
            repository.save(new Product (8,"Jacheta Blue Jeans","product8", 59.99));

        }

}
