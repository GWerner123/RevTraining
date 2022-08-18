package com.revature.service;

import com.revature.entity.Manager;
import com.revature.data.ManagerDao;
import com.revature.data.ManagerDaoTempImpl;

import java.util.List;

public class ManagerService {

    //insert
    public Manager insert(Manager manager) {
        ManagerDao managerDao = new ManagerDaoTempImpl();
        return managerDao.insert(manager);
    }

    //getById
    public Manager getById(int id) {
        ManagerDao managerDao = new ManagerDaoTempImpl();
        return managerDao.getById(id);
    }

    //getAllManagers
    public List<Manager> getAllManagers() {
        ManagerDao managerDao = new ManagerDaoTempImpl();
        return managerDao.getAllManagers();
    }

    //update
    public Manager update(Manager manager) {
        ManagerDao managerDao = new ManagerDaoTempImpl();
        return managerDao.update(manager);
    }

    //delete
    public boolean delete(int id) {
        ManagerDao managerDao = new ManagerDaoTempImpl();
        return managerDao.delete(id);
    }
}
