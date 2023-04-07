package org.yicheng.dao;

import org.yicheng.database.Database;
import org.yicheng.entity.Teacher;

public class TeacherDao extends BaseDao<Teacher> {
    public TeacherDao(){
        super.map = Database.teachers;
    }
}
