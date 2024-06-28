package com.healthcare.projeto_final.service;

import java.util.List;

public interface AbstractService<T, DTO> {

    T save(DTO entity);
    T findById(Long id);
    List<T> findAll();
    T update(DTO entity);
    void deleteById(Long id);

}
