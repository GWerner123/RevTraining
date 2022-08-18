package com.revature.data;

import com.revature.entity.Manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerDaoTempImpl implements ManagerDao {
    @Override
    public Manager insert(Manager manager) {
        System.out.println("Inserting manager: " + manager.toString());
        return manager;
    }

    @Override
    public Manager getById(int id) {
        Manager dummyManager = new Manager(1,"bossman","irule123");
        return dummyManager;
    }

    @Override
    public List<Manager> getAllManagers() {
        List<Manager> managers = new ArrayList();
        return managers;
    }

    @Override
    public Manager update(Manager manager) {
        System.out.println("Updating manager: " + manager.toString());
        return manager;
    }

    @Override
    public boolean delete(int id) {
        System.out.println("Delete manager with id: " + id);
        return true;
    }
}
