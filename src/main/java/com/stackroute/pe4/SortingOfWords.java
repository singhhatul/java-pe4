package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOfWords {
    public String wordsSorting(String str) {
            if(str==null){
                return "string input is null";
            }else {
                List<String> sorter = new ArrayList();
                String[] inputArray = str.split(" ");
                for (int i = 0; i < inputArray.length; i++) {
                    sorter.add(inputArray[i]);
                }
                Collections.sort(sorter);
                StringBuilder sb = new StringBuilder();
                for (String s : sorter) {
                    sb.append(s);
                    sb.append(" ");
                }
                return sb.toString().trim();}
        }
    }

