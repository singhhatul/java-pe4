package com.stackroute.pe4;

public class StringTranspose {
    public String stringTransposing(String str) {
        if(str==null)
            return "string input is null";
        // We have an original string here that we'll need to reverse.
        String result="";
        String[] names = str.split(" ");
        for (int i = 0; i < names.length; i++) {
            String reverse = "";
            for (int j = names[i].length() - 1; j >= 0; j--) {
                reverse = reverse + names[i].charAt(j);
            }

            names[i] = reverse;
        }
        for(int i=0;i<names.length;i++){
            result+=names[i]+" ";
        }
        return result;
    }
}
