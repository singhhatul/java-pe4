package com.stackroute.pe4;

public class StringReplacement {

    public String getCharacterReplacer(String str, String from, String to) {
        if(str==null){
            return "string input is null";
        }
        String result = str.replace(from, to);
        return result;
    }
}
