package org.yicheng.dao;

import org.yicheng.database.Database;
import org.yicheng.database.Admin;


public class AdminDao extends BaseDao<Admin> {
    public AdminDao(){
        super.map = Database.admins;
    }
}
