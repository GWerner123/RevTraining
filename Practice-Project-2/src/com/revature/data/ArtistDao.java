package com.revature.data;

import com.revature.entity.Artist;

import java.util.List;

public interface ArtistDao {

    //CRUD - create read update delete
    //create or "insert" (because sql uses the keyword "insert" to put new instances into a table
    public Artist insert(Artist artist);

    //Read one object based on the id
    public Artist getById(int id);

    //Read all objects
    public List<Artist> getAllArtists();

    //update an artist
    public Artist update(Artist artist);

    //delete an artist
    public boolean delete(int id);
}
