package ru.itprogram.service;

import java.util.List;

public interface Service<T> {
    List<T> getThinkers();
    void addThinker(T t);
    void deleteThinker(T t);
}
