package spotify.artists;

//this class is for defining the blueprint of what makes up an artist object
//we will first declare the variables that make up an artist
//then we will write constructors to help us build the objects in the Spotify.java class
//finally we will create our methods that we can call from Spotify.java class's main method
public class Artist {

    //variables to define an artist
    String name;
    String country;
    int rank;
    String genre;
    int monthlyListeners;
    String topSong;
    long topSongStreamsL;



    //constructors
    //this first constructor will help us build objects where we have all of this information
    public Artist(String name,String country,int rank,String genre,int monthlyListeners,String topSong,long topSongStreams){
        this.name = name;
        this.country = country;
        this.rank = rank;
        this.genre = genre;
        this.monthlyListeners = monthlyListeners;
        this.topSong = topSong;
        this.topSongStreamsL = topSongStreams;
    }

    //this next constructor is to let us still create an artist when we are missing the rank variable
    //only the top artists on spotify have ranks so this allows us to create an artist object for way more artists
    public Artist(String name,String country,String genre,int monthlyListeners,String topSong,long topSongStreams){
        this.name = name;
        this.country = country;
        //the default for rank will be 0 because no one can be in zeroth place
        this.rank = 0;
        this.genre = genre;
        this.monthlyListeners = monthlyListeners;
        this.topSong = topSong;
        this.topSongStreamsL = topSongStreams;
    }


    //methods

    //this method will allow the artist to sort of react to getting a song request for their top song
    public void songRequest() {
        System.out.println("Ughhh I'm so tired of singing " + this.topSong + "! I don't care if it has " + this.topSongStreamsL + " streams on Spotify.");
    }

    //this method will override the toString() method so that it prints the variable values of the artist rather than the memory
    //first we need to let Java know we're overriding
    @Override
    //now we write a toString() method that will return our String results and add the next bits of info to the previous lines
    public String toString(){
        //first we create the variable "result" that will store our string lines
        //then we add whichever lines we want to, using the this.variable to concatenate different artist info with our Strings
        String result = "Hi, my name is " + this.name + " and I'm from " + this.country + ".";
        result += "\nI am the number " + this.rank + " artist in the world on Spotify with " + this.monthlyListeners + " monthly listeners.";
        result += "\nI make " + this.genre + " music and my top song is called " + "'" + this.topSong + "." + "'";
        result += "\n" + "'" +this.topSong + "'" + " has been streamed a total of " + this.topSongStreamsL + " times.";
        //then we can print out our result
        System.out.println(result);
        //then we have to return the result variable because we specified that we would return a string in this method's signature
        return result;
    }

    //this method will override the equals() method
    @Override
    //it will return a boolean value of true or false
    //we want it to test each variable to see if they are all the same
    //if they are all the same then the method will return the value "true"
    //then add an if statement at the end that tells us "these artists have the same stats" (as long as it returns true)
    public boolean equals(Object obj){
        //first we need to make sure that the object is an artist
        if(!(obj instanceof Artist)){return false;}

        //next we need to cast the obj as an Artist (that we will call other) so that we can access its variables
        //this is because Java will just assume that it is any type of object and not specifically an artist
        Artist other = (Artist) obj;

        //now we test each variable to see if they are not equal to each other
        //if they are not equal then the method will return false. If they are equal then it will continue checking
        if (!(other.name.equals(this.name))){return false;}
        if (!(other.country.equals(this.country))){return false;}
        if (!(other.genre.equals(this.genre))){return false;}
        if (!(other.topSong.equals(this.topSong))){return false;}
        if (other.rank != this.rank){return false;}
        if (other.monthlyListeners != this.monthlyListeners){return false;}
        if (other.topSongStreamsL != this.topSongStreamsL){return false;}

        //if everything is the same, return true
        return true;
    }

}
