package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;


public class FileInput {
    public static Map<String, ArrayList<String>> main() throws Exception
    {
        Map<String, ArrayList<String>> result = new HashMap<>();

        // Load from resources
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("day1_input.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String st;
        ArrayList<String> left_list = new ArrayList<>();
        ArrayList<String> right_list = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            String[] splited = st.split("\\s+");
            left_list.add(splited[0]);
            right_list.add(splited[1]);
        };
        Collections.sort(left_list);
        Collections.sort(right_list);
        result.put("left", left_list);
        result.put("right", right_list);
        
        return result;

    }
}
