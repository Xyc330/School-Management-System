package org.yicheng.dao;

import org.yicheng.entity.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BaseDao<T extends Person> {
    HashMap<Integer, T> map;

    public Optional<T> get(Integer id) {
        return Optional.ofNullable(map.get(id));
    }

    public Set<T> getAll() {
        return new HashSet<>(map.values());
    }

    public void create(T obj) {
        map.put(obj.getId(), obj);
    }

    public void update(Integer id, T obj) {
        map.replace(id, obj);
    }

    public void delete(Integer id) {
        map.remove(id);
    }
}
