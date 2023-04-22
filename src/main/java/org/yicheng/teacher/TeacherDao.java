package org.yicheng.teacher;

import org.yicheng.BaseDao;
import org.yicheng.database.Database;

public class TeacherDao extends BaseDao<Teacher> {
    public TeacherDao(){
        super.map = Database.teachers;
    }
}
