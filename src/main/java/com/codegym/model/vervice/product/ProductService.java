package com.codegym.model.vervice.product;

import com.codegym.model.Product;
import com.codegym.model.dao.product.IProductDAO;
import com.codegym.model.dao.product.ProductDAO;

import java.util.List;

public class ProductService implements IProductService{
    private IProductDAO productDao;

    public ProductService(IProductDAO productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }

    @Override
    public boolean create(Product product) {
        return productDao.create(product);
    }

    @Override
    public boolean updateById(int id, Product product) {
        return productDao.updateById(id,product);
    }

    @Override
    public boolean deleteById(int id) {
        return productDao.deleteById(id);
    }

    @Override
    public boolean insertProductUsingProcedure(Product product) {
        return false;
    }

    @Override
    public List<Product> findAllProductByName(String name) {

        name = "%" + name + "%";
        return productDao.findAllProductByName(name);
    }

    @Override
    public List<Product> findAllProductByCategoryId(int categoryId) {
        return null;
    }
}
