package com.stackroute.pe3;

import java.util.regex.Pattern;

public class RegularExpression {
    public String implementingReguarExprssion(String name) {
        String result="";
        String pattern = ".*henery*";

        boolean isMatch = Pattern.matches(pattern, name);
       result+="is henery there ?"+ isMatch;
       return result;
    }
}
