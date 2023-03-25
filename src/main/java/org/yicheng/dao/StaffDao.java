package org.yicheng.dao;

import org.yicheng.database.Staff;
import org.yicheng.database.Database;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StaffDao implements Dao<Staff> {
    @Override
    public Optional<Staff> get(Integer id) {
        return Optional.ofNullable(Database.staves.get(id));
    }

    @Override
    public Set<Staff> getAll() {
        return new HashSet<>(Database.staves.values());
    }

    @Override
    public void create(Staff staff) {
        Database.staves.put(staff.getId(), staff);
    }


    @Override
    public void update(Integer id, Staff staff) {
        Database.staves.replace(id, staff);
    }

    @Override
    public void delete(Integer id) {
        Database.staves.remove(id);
    }
}
