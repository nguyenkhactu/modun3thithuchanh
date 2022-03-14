package com.codegym.model.dao.category;

import com.codegym.model.Category;
import com.codegym.model.dao.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO implements ICategoryDAO{
    private Connection connection = DBconnection.getConnection();
    @Override
    public List<Category> findAll() {
        List<Category>categories = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from category");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int  id = rs.getInt("id");
                String name = rs.getString("name");
                Category category = new Category (id,name);
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public boolean create(Category category) {
        return false;
    }

    @Override
    public boolean updateById(int id, Category category) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
