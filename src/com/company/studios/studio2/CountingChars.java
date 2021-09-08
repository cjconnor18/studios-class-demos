package com.company.studios.studio2;

import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {


        String aString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // Option One for removing non-alphabetic characters; using replaceAll method with method chaining
//        String withoutSpecialChars = aString.replaceAll("\\.", "") // remove all periods
//                .replaceAll(",", "") // remove all commas
//                .replaceAll("\\?", "") // remove all question marks
//                .replaceAll("’", "") // removes the "not quite" an apostrophe
//                .replaceAll(" ", ""); // remove all spaces
        //we can keep going with all the other characters that we can think of using this method chaining, but there is an easier way, see option 2;

        // Option Two: use replaceAll method with regex expression https://www.w3schools.com/java/java_regex.asp
        // this works better. to use comment out all the lines and method chaining for the other withoutSpecialChars and then uncomment the next line
         String withoutSpecialChars = aString.replaceAll("[^a-zA-Z0-9]", "");


        // to lowercase makes everything lowercase and case insensitive
        // toCharArray turns the string into an array of characters
        char[] charactersInString = withoutSpecialChars.toLowerCase().toCharArray();

        // create new HashMap
        HashMap<Character, Integer> characterCount = new HashMap<>();

        // foreach loop iterates through each character in the array charactersInString
            for (char letter : charactersInString) {
            //if characterCount contains the letter, we want to increase it's value by one
            if(characterCount.containsKey(letter)) {
                characterCount.put( letter, characterCount.get(letter) + 1);
            } else {
                // otherwise we want to add the letter as the key and put one as the value
                characterCount.put(letter, 1);
            }
        }

        // this iterates through the key value pairs ato display each entry set in the console.
        // review this page if you need more help with iterating through HashMap https://education.launchcode.org/java-independent-track/chapters/control-flow-and-collections/hashmap.html
        for(Map.Entry<Character, Integer> oneChar : characterCount.entrySet()) {
            System.out.println(oneChar.getKey() + " : " + oneChar.getValue());
        }


    }
}
