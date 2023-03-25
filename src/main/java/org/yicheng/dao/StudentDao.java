package org.yicheng.dao;

import org.yicheng.database.Student;
import org.yicheng.database.Database;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StudentDao implements Dao<Student> {
    @Override
    public Optional<Student> get(Integer id) {
        return Optional.ofNullable(Database.students.get(id));
    }

    @Override
    public Set<Student> getAll() {
        return new HashSet<>(Database.students.values());
    }

    @Override
    public void create(Student student) {
        Database.students.put(student.getId(), student);
    }


    @Override
    public void update(Integer id, Student student) {
        Database.students.replace(id, student);
    }

    @Override
    public void delete(Integer id) {
        Database.students.remove(id);
    }
}
