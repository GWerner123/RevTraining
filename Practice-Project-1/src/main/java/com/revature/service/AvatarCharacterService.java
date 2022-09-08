package com.revature.service;

import com.revature.data.AvatarCharacterDaoImpl;
import com.revature.data.DaoFactory;
import com.revature.entity.AvatarCharacter;
import com.revature.data.AvatarCharacterDao;

import java.util.List;

//for this class, a lot of our methods will be
//a matter of creating a dao and then calling the method
public class AvatarCharacterService {

    //note: classes that are not connected by inheritance can have the same method names without ever needing to override
    public AvatarCharacter insert(AvatarCharacter avatarCharacter) {
        //create new DAO
        AvatarCharacterDao avatarCharacterDao = DaoFactory.getAvatarCharacterDao();
        //call the insert() method from the DAO interface as the return value of this current method
        return avatarCharacterDao.insert(avatarCharacter);
    }

    public AvatarCharacter getById(int id) {
        AvatarCharacterDao avatarCharacterDao = DaoFactory.getAvatarCharacterDao();
        return avatarCharacterDao.getById(id);
    }

    public List<AvatarCharacter> getAllAvatarCharacters() {
        AvatarCharacterDao avatarCharacterDao = DaoFactory.getAvatarCharacterDao();
        return avatarCharacterDao.getAllAvatarCharacters();
    }

    public AvatarCharacter update(AvatarCharacter avatarCharacter) {
        AvatarCharacterDao avatarCharacterDao = DaoFactory.getAvatarCharacterDao();
        return avatarCharacterDao.update(avatarCharacter);
    }

    public boolean delete(int id) {
        AvatarCharacterDao avatarCharacterDao = DaoFactory.getAvatarCharacterDao();
        return avatarCharacterDao.delete(id);
    }

}
