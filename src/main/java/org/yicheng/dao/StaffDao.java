package org.yicheng.dao;

import org.yicheng.database.Staff;
import org.yicheng.database.Database;


public class StaffDao extends BaseDao<Staff> {
    public StaffDao(){
        super.map = Database.staves;
    }
}
