package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    public static final String[] PUNCTUATION_MARKS = {".",",","-",":",";","!","?"};
    public static final String SPACE_REGEX = " ";

    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String sentence) {
        String[] words = sentence.split(SPACE_REGEX);
        char firstLetter;
        boolean hasPunctuationMark = true;

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < PUNCTUATION_MARKS.length; j++)
                if(words[i].contains(PUNCTUATION_MARKS[j]))
                    hasPunctuationMark = false;

            if (hasPunctuationMark){
                firstLetter = words[i].charAt(0);
                words[i] = words[i].substring(1, words[i].length());
                words[i] = words[i].replace(words[i], words[i] + firstLetter + "ay");
            }
            hasPunctuationMark = true;
        }

        return String.join(" ", words);
    }
}
