package org.yicheng.dao;

import org.yicheng.database.Database;
import org.yicheng.database.Teacher;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class TeacherDao implements Dao<Teacher> {
    @Override
    public Optional<Teacher> get(Integer id) {
        return Optional.ofNullable(Database.teachers.get(id));
    }

    @Override
    public Set<Teacher> getAll() {
        return new HashSet<>(Database.teachers.values());
    }

    @Override
    public void create(Teacher teacher) {
        Database.teachers.put(teacher.getId(), teacher);
    }


    @Override
    public void update(Integer id, Teacher teacher) {
        Database.teachers.replace(id, teacher);
    }

    @Override
    public void delete(Integer id) {
        Database.teachers.remove(id);
    }
}
