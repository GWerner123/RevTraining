package com.revature.data;

import com.revature.entity.AvatarCharacter;

import java.util.List;

//DAO - data access object
//we can have a DAO that is specific to the AvatarCharacter entity
public interface AvatarCharacterDao {
    //CRUD - create read update delete
    //Create - inserting an AvatarCharacter into the database
    //the reason we return the AvatarCharacter is so we can keep track of the id
    public AvatarCharacter insert(AvatarCharacter avatarCharacter);

    //Read - getting/reading data from the database
    //we pass in the id because we can always be certain that it is unique so the method will return the correct AvatarCharacter
    public AvatarCharacter getById(int id);
    //getting all AvatarCharacters requires no parameters because we aren't specifying a specific one
    public List<AvatarCharacter> getAllAvatarCharacters();

    //Update - update some data that is already in the database
    //take an id to identify what pet we're updating
    public AvatarCharacter update(AvatarCharacter avatarCharacter);

    //Delete - delete an item from the database
    //return whether the deletion was successful
    //pass in an id to identify which AvatarCharacter is going to be deleted
    public boolean delete(int id);


}
