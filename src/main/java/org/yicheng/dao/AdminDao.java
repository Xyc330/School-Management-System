package org.yicheng.dao;

import org.yicheng.database.Database;
import org.yicheng.database.Admin;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class AdminDao implements Dao<Admin> {
    @Override
    public Optional<Admin> get(Integer id) {
        return Optional.ofNullable(Database.admins.get(id));
    }

    @Override
    public Set<Admin> getAll() {
        return new HashSet<>(Database.admins.values());
    }

    @Override
    public void create(Admin admin) {
        Database.admins.put(admin.getId(), admin);
    }


    @Override
    public void update(Integer id, Admin admin) {
        Database.admins.replace(id, admin);
    }

    @Override
    public void delete(Integer id) {
        Database.admins.remove(id);
    }
}
