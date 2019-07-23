package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOccurrence {
    public String occurrrenceOfString(String s, String se) {

            if(s==null){
                return "string input is null";
            }
            if(s.contains(se)) {
                String result = "";
                Pattern pattern = Pattern.compile(se);
                Matcher matcher = pattern.matcher(s);

                while (matcher.find()) {
                    result += "Found at: " + matcher.start() + " - " + matcher.end() + "\n";
                }
                return result;
            }else{
                return "not found in the string";
            }
    }
}

