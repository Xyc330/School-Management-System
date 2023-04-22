package org.yicheng.staff;

import org.yicheng.BaseDao;
import org.yicheng.staff.Staff;
import org.yicheng.database.Database;


public class StaffDao extends BaseDao<Staff> {
    public StaffDao(){
        super.map = Database.staves;
    }
}
