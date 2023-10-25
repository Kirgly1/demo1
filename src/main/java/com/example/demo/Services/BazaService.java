package com.example.demo.Services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface BazaService<T, ID> {
    T create(T t);//создает новую сущность.

    void destroy(T t);//Удаляет данный объект.

    void destroyById(ID id);//Удаляет объект по его идентификатору.

    Optional<T> find(ID id);// извлекает объект по его идентификатору

    List<T> getAll();//извлекает список всех объектов.
}
