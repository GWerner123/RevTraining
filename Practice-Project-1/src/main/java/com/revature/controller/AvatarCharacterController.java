package com.revature.controller;

import com.revature.service.AvatarCharacterService;
import com.revature.entity.AvatarCharacter;

import java.util.Scanner;
import java.util.List;

public class AvatarCharacterController {

    //a very primitive controller where we accept requests from the command line and direct to the appropriate service layers
    public static void menu() {
        //initialize our AvatarCharacterService:
        AvatarCharacterService avatarCharacterService = new AvatarCharacterService();
        //set up scanners
        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        Scanner booleanScanner = new Scanner(System.in);
        //loop endlessly
        while(true) {
            //print the options
            printOptions();
            //get the choice from the user
            int choice = numScanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter character information");
                    System.out.println("Character name => ");
                    String name = stringScanner.nextLine();
                    System.out.println("Character nation => ");
                    String nation = stringScanner.nextLine();
                    System.out.println("Bender status => ");
                    boolean bender = booleanScanner.nextBoolean();
                    AvatarCharacter newCharacter = new AvatarCharacter(name,nation,bender);
                    System.out.println(avatarCharacterService.insert(newCharacter));
                    break;
                case 2:
                    System.out.println("Enter the id of the character: ");
                    int id = numScanner.nextInt();
                    System.out.println(avatarCharacterService.getById(id));
                    break;
                case 3:
                    List<AvatarCharacter> avatarCharacters = avatarCharacterService.getAllAvatarCharacters();
                    for(int i = 0; i < avatarCharacters.size(); i ++) {
                        System.out.println(avatarCharacters.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Enter character information");
                    System.out.println("Character id => ");
                    id = numScanner.nextInt();
                    System.out.println("name => ");
                    name = stringScanner.nextLine();
                    System.out.println("nation => ");
                    nation = stringScanner.nextLine();
                    System.out.println("bender status => ");
                    bender = booleanScanner.nextBoolean();
                    AvatarCharacter avatarCharacter = new AvatarCharacter(id,name,nation,bender);
                    System.out.println(avatarCharacterService.update(avatarCharacter));
                    break;
                case 5:
                    System.out.println("Enter the id of the character you want to delete: ");
                    id = numScanner.nextInt();
                    if(avatarCharacterService.delete(id)){
                        System.out.println("Character successfully deleted");
                    } else {
                        System.out.println("Something went wrong when deleting the character");
                    }
                    break;
            }

        }

        }

    public static void printOptions() {
        System.out.println("What would you like to do?");
        System.out.println("1 - Create a new character");
        System.out.println("2 - Get character by id");
        System.out.println("3 - Get all characters");
        System.out.println("4 - Update a character");
        System.out.println("5 - Delete a character");
        System.out.println("Enter => ");
    }
}
