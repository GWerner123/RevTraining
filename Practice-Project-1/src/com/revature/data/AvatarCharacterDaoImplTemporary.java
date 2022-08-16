package com.revature.data;

import com.revature.entity.AvatarCharacter;

import java.util.ArrayList;
import java.util.List;

//this is a temporary implementation of the AvatarCharacter DAO before we get our database set up
//a lot of these methods are going to give out dummy data
//ctrl-i to generate implemented methods
public class AvatarCharacterDaoImplTemporary implements AvatarCharacterDao {

    @Override
    public AvatarCharacter insert(AvatarCharacter avatarCharacter) {
        //print out a dummy message
        System.out.println("Inserting character: " + avatarCharacter.toString());
        //arbitrarily set the id and return the avatarCharacter
        avatarCharacter.setId(1);
        return avatarCharacter;
    }

    @Override
    public AvatarCharacter getById(int id) {
        //create a dummy avatarCharacter object that we can use it's data to practice calling this method
        AvatarCharacter dummyCharacter = new AvatarCharacter(id, "Aang", "Air Nomad",true);
        return dummyCharacter;
    }

    @Override
    public List<AvatarCharacter> getAllAvatarCharacters() {
        //create more dummy characters to practice calling this method with
        AvatarCharacter dummyCharacter1 = new AvatarCharacter(1, "Toph","Earth Kingdom",true);
        AvatarCharacter dummyCharacter2 = new AvatarCharacter(2,"Sokka","Water Tribe",false);
        //in java, list is an interface so we can't instantiate it
        //because ArrayList implements List we are able to do this:
        List<AvatarCharacter> avatarCharacters = new ArrayList<>();
        avatarCharacters.add(dummyCharacter1);
        avatarCharacters.add(dummyCharacter2);
        return avatarCharacters;
    }

    @Override
    public AvatarCharacter update(AvatarCharacter avatarCharacter) {
        /*
        say we pass in all new data for the character...
        in the real implementation we will actually update the database along with the the code below
         */
        System.out.println("Updated character: " + avatarCharacter.toString());
        return avatarCharacter;
    }

    @Override
    public boolean delete(int id) {
        //in the real implementation we will write code here that will also delete the data from the database
        System.out.println("Delete character with id: " + id);
        return true;
    }
}
