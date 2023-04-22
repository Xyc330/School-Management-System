package org.yicheng.admin;

import org.yicheng.BaseDao;
import org.yicheng.database.Database;


public class AdminDao extends BaseDao<Admin> {
    public AdminDao(){
        super.map = Database.admins;
    }
}
