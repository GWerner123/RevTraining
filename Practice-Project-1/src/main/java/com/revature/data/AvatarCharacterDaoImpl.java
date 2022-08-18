package com.revature.data;

import com.revature.entity.AvatarCharacter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//here we are going to implement methods that will interact with the database
public class AvatarCharacterDaoImpl implements AvatarCharacterDao{

Connection connection;

public AvatarCharacterDaoImpl() {
    connection = ConnectionFactory.getConnection();
}

    //take in character object and return the character
    @Override
    public AvatarCharacter insert(AvatarCharacter avatarCharacter) {

        String sql = "insert into avatarcharacter (id,name,nation,bender) values (default,?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,avatarCharacter.getName());
            preparedStatement.setString(2, avatarCharacter.getNation());
            preparedStatement.setBoolean(3, avatarCharacter.getBender());

            //we've set up the string but haven't executed the statement
            preparedStatement.executeUpdate();
            int count = preparedStatement.executeUpdate();
            if(count == 1){
                System.out.println("Character added successfully!");
                //now we have to get the generated id
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                resultSet.next();
                int generatedId = resultSet.getInt(1);
                avatarCharacter.setId(generatedId);

            } else{
                System.out.println("Something went wrong with the insert...");
            }
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }
        return avatarCharacter;
    }

    @Override
    public AvatarCharacter getById(int id) {
    String sql = "select * from avatarcharacter where id = ?;";
    try{
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        System.out.println(preparedStatement);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            int idDb = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String nation = resultSet.getString("nation");
            Boolean bender = resultSet.getBoolean("bender");

            AvatarCharacter avatarCharacter = new AvatarCharacter(idDb, name, nation, bender);
            return avatarCharacter;
        } else{
            System.out.println("Character might not exist.");
        }
    } catch(SQLException e) {
        System.out.println("something went wrong retrieving the data");
        e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AvatarCharacter> getAllAvatarCharacters() {

        List<AvatarCharacter> avatarCharacters = new ArrayList<>();

        String sql = "select * from avatarcharacter;";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String nation = resultSet.getString("nation");
                Boolean bender = resultSet.getBoolean("bender");
                AvatarCharacter avatarCharacter = new AvatarCharacter(id, name, nation, bender);

                avatarCharacters.add(avatarCharacter);
            }

        } catch(SQLException e) {
            System.out.println("something went wrong retrieving the data");
            e.printStackTrace();
        }
        return avatarCharacters;
    }

    @Override
    public AvatarCharacter update(AvatarCharacter avatarCharacter) {
        String sql = "update avatarcharacter set name = ?, nation = ?, bender = ? where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,avatarCharacter.getName());
            preparedStatement.setString(2, avatarCharacter.getNation());
            preparedStatement.setBoolean(3, avatarCharacter.getBender());
            preparedStatement.setInt(4, avatarCharacter.getId());

            //we've set up the string but haven't executed the statement
            int count = preparedStatement.executeUpdate();
            if(count == 1){
                System.out.println("Update successful!");
                return avatarCharacter;
                //now we have to get the generated id

            } else{
                System.out.println("Something went wrong with the update");
                if(count == 0) {
                    System.out.println("No rows were affected");
                } else{
                    System.out.println("Many rows were affected");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from avatarcharacter where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int count = preparedStatement.executeUpdate();
            if(count == 1) {
                System.out.println("Deletion successful!");
                return true;
            }
            else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
