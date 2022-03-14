package com.codegym.model.dao.product;

import com.codegym.model.Product;
import com.codegym.model.dao.IGeneralDAO;

import java.util.List;

public interface IProductDAO extends IGeneralDAO<Product> {
    boolean insertProductUsingProcedure(Product product);

    List<Product> findAllProductByName(String name);
}
