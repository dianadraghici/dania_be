package com.store.proiect.controller;

import com.store.proiect.dto.ProductDTO;
import com.store.proiect.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

    private final ProductService productService;

    @CrossOrigin(origins = "http://evening-oasis-23829.herokuapp.com/")
    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts ();
    }

    @GetMapping("/product")
    public ProductDTO getProduct(@RequestParam Integer productId) {
        return productService.getProduct (productId);
    }

    @PostMapping
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) {
        return productService.updateProduct (productDTO);
    }
}
