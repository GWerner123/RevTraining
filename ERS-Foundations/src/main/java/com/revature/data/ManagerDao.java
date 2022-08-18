package com.revature.data;

import com.revature.entity.Manager;

import java.util.List;

public interface ManagerDao {

    //CRUD

    //create
    public Manager insert(Manager manager);

    //read one
    public Manager getById(int id);

    //read all
    public List<Manager> getAllManagers();

    //update
    public Manager update(Manager manager);

    //delete
    public boolean delete(int id);
}
