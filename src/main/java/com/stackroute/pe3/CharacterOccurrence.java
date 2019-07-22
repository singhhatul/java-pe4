package com.stackroute.pe3;

public class CharacterOccurrence {

    public int getCharacter(String str, String ch) {
        if(str==null)
            return 0;
        int charcount ;
        charcount= str.length() - str.replaceAll(ch, "").length();
            return charcount;
    }
}
