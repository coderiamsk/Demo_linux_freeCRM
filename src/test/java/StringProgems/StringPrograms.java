package StringProgems;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringPrograms<vowelsCount> {
    @Test(priority = 2)
    public void totalNumberOfCharacters() {
        String words = "Sharath Kumar A M";
        int count = 0;

        //Counts each character except space
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) != ' ')
                count++;
        }


        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }

    @Test(priority = 1)
    public void numberOfChars() {


        //Stores the count of punctuation marks
        int count = 0;
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
        for (int i = 0; i < str.length(); i++) {
            //Checks whether given character is punctuation mark
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println("The number of punctuations exists in the string is: " + count);
    }

    @Test(priority = 3)
    public void countVowels_AND_Consonant() {
        int vowelsCount = 0;
        int consonantCount = 0;

        String words = "This is a simple sentence to check for vowels and consonant";

        words = words.toLowerCase();

        for (int i = 0; i < words.length(); i++) {

            if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u') {
                vowelsCount++;
            } else if (words.charAt(i) >= 'a' || words.charAt(i) <= 'z')
                consonantCount++;
        }
        System.out.println("the number of vowels is equal to " + vowelsCount);
        System.out.println("the number of consonant is equal to " + consonantCount);

    }

    @Test(priority = 4)
    public void anagram() {
        String str1 = "Brag";
        String str2 = "Grab";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            System.out.println("Both are anagram");
        } else {
            System.out.println("Both are anagram");
        }

        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        //Sorting the arrays using in-built function sort ()
        Arrays.sort(string1);
        Arrays.sort(string2);

        //Comparing both the arrays using in-built function equals ()
        if(Arrays.equals(string1, string2) == true) {
            System.out.println("Both the strings are anagram");
        }
        else {
            System.out.println("Both the strings are not anagram");
        }
    }

}




