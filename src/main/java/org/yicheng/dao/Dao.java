package org.yicheng.dao;

import java.util.Optional;
import java.util.Set;

public interface Dao<T> {
    Optional<T> get(Integer id);

    Set<T> getAll();

    void create(T t);

    void update(Integer id, T t);

    void delete(Integer id);
}
