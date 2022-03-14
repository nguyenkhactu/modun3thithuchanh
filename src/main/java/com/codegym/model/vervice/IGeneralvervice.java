package com.codegym.model.vervice;

import java.util.List;

public interface IGeneralvervice <T>{
    List<T> findAll();

    T findById(int id);

    boolean create(T t);

    boolean updateById(int id, T t);

    boolean deleteById(int id);
}
