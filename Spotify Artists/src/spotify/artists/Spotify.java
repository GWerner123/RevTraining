package spotify.artists;

import java.util.Scanner;

public class Spotify {

    public static void main(String[] args) {

        //using the parameterized constructor from the Artist class, we can create a new instance and object of the Artist class
        Artist artist1 = new Artist("Ed Sheeran","England",1,"pop",81611802,"Shape of You",3199567345L);
        Artist artist2 = new Artist("The Weeknd","Canada",2,"R&B and pop",76960984,"Blinding Lights",3079392603L);
        Artist artist3 = new Artist("Justin Bieber","Canada",3,"R&B and pop",72248139,"Stay",1997213792L);
        Artist artist4 = new Artist("Harry Styles","England",4,"pop",71014838,"Watermelon Sugar",1870473059L);
        Artist artist5 = new Artist("Dua Lipa","England",5,"pop",70396744,"One Kiss",1493099301L);
        Artist artist6 = new Artist("Jack Johnson","America","acoustic pop",10036561,"Better Together",605142684);
        Artist artist7 = new Artist("Ed Sheeran","England",1,"pop",81611802,"Shape of You",3199567345L);

        //create a new scanner here that will show a menu, allow us to type a number in to select the artist, and then will use a switch statement and cases to call the toString() method for the chosen artist
        Scanner scannerArtist = new Scanner(System.in);
        System.out.println("Which artist would you like to learn more about? \nType 1 for Ed Sheeran\nType 2 for The Weeknd\nType 3 for Justin Bieber\nType 4 for Harry Styles\nType 5 for Dua Lipa\nType 6 for Jack Johnson\nType here: ");
        int input = scannerArtist.nextInt();

        switch(input) {
            case 1:
                artist1.toString();
                break;
            case 2:
                artist2.toString();
                break;
            case 3:
                artist3.toString();
                break;
            case 4:
                artist4.toString();
                break;
            case 5:
                artist5.toString();
                break;
            case 6:
                artist6.toString();
                break;
            default:
                System.out.println("Not a valid input.\nType 1 for Ed Sheeran\nType 2 for The Weeknd\nType 3 for Justin Bieber\nType 4 for Harry Styles\nType 5 for Dua Lipa\nType 6 for Jack Johnson\nType here: ");
        }


        //here we can call some of our methods

        //test our new equals() method
        System.out.println(artist1.equals(artist7));

        //test our songRequest() method
        artist2.songRequest();

    }
}
