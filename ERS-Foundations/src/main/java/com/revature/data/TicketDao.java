package com.revature.data;

import com.revature.entity.Ticket;

import java.util.List;

public interface TicketDao {

    //CRUD
    //create
    public Ticket insert(Ticket ticket);

    //read one
    public Ticket getById(int id);

    //read all
    public List<Ticket> getAllTickets();

    //update
    public Ticket update(Ticket ticket);

    //delete
    public boolean delete(int id);

}
