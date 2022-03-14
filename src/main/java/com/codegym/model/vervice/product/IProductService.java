package com.codegym.model.vervice.product;

import com.codegym.model.vervice.IGeneralvervice;
import com.codegym.model.Product;

import java.util.List;

public interface IProductService extends IGeneralvervice<Product> {
    boolean insertProductUsingProcedure(Product product);

    List<Product> findAllProductByName(String name);

    List<Product> findAllProductByCategoryId(int categoryId);
}
