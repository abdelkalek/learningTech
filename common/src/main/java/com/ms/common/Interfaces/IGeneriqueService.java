package com.ms.common.Interfaces;

import java.util.List;

/**
 * @author Abdelkhalek Guedri
 * @since 20/06/2023
 */
public interface IGeneriqueService<T> {
    List<T> findAll();
    T findById(Long id);
    void create(T object);
    void update(T object);
    void delete(Long id);

}
