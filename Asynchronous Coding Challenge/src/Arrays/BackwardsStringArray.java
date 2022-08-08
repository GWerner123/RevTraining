package Arrays;

public class BackwardsStringArray {


    public static void main(String[] args) {


        //Write a program to create an array of strings and then print out the array and strings backwards.
        String[] stringArray = {"Thor","Ironman","Hulk","Captain America","Dr. Strange", "Groot","Stan Lee","Captain Marvel","Black Panther"};

        String result = "";

        for(int i = stringArray.length - 1; i >= 0; i --) {
            char[] charArray = stringArray[i].toCharArray();
            result += " ";
            for(int j = charArray.length - 1; j >= 0; j --) {
                 char x = charArray[j];
                 String y = Character.toString(x);
                 result += y;
            }

        }
        System.out.println(result);
    }
}
