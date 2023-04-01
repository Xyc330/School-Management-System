package org.yicheng.dao;

import org.yicheng.database.Student;
import org.yicheng.database.Database;

public class StudentDao extends BaseDao<Student> {
    public StudentDao(){
        super.map = Database.students;
    }
}
