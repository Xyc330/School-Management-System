package org.yicheng.dao;

import org.yicheng.database.Database;
import org.yicheng.entity.Admin;


public class AdminDao extends BaseDao<Admin> {
    public AdminDao(){
        super.map = Database.admins;
    }
}
