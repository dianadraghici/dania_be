package com.store.proiect.service;

import com.store.proiect.dto.ProductDTO;
import com.store.proiect.mapper.ProductMapper;
import com.store.proiect.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductDTO> getAllProducts() {
        return productMapper.convertProductToProductDTOList (productRepository.findAll ());
    }

    public ProductDTO getProduct(Integer productId) {

        return productMapper.convertProductToProductDTO (productRepository.findByProductId (productId));
    }

    public ProductDTO updateProduct(ProductDTO productDTO) {
        return productMapper.convertProductToProductDTO (productRepository.saveAndFlush (productMapper
                .convertProductDTOToProduct (productDTO)));
    }
}
