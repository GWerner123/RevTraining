package com.revature.data;

public class DaoFactory {

    private static AvatarCharacterDao avatarCharacterDao = null;

    private DaoFactory() {

    }

    public static AvatarCharacterDao getAvatarCharacterDao() {
        if(avatarCharacterDao == null) {
            System.out.println("This should only be called once (Avatar Character Dao Creation");

            avatarCharacterDao = new AvatarCharacterDaoImpl();
        }
        return avatarCharacterDao;
    }
}
