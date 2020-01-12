package com.store.proiect.mapper;

import com.store.proiect.dto.ProductDTO;
import com.store.proiect.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product convertProductDTOToProduct(ProductDTO productDTO);
    ProductDTO convertProductToProductDTO(Product product);
    List<Product> convertProductDTOToProductList(List<ProductDTO> productDTOList);
    List<ProductDTO> convertProductToProductDTOList(List<Product> productList);

}
