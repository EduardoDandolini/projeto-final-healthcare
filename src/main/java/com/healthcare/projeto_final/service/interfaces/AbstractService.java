package com.healthcare.projeto_final.service.interfaces;

import java.util.List;

public interface AbstractService<T, DTO> {

    T save(DTO entity);
    T findById(Long id);
    List<T> findAll();
    T update(Long id, DTO entity);
    void deleteById(Long id);

}
