package com.algorithms.week4;

import com.algorithms.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JsonReader {
    private static final Logger logger = LoggerFactory.getLogger(JsonReader.class);

    public static int[] readJsonArray(String keyName) throws IOException {
        JSONParser parser = new JSONParser();

        try {
            // Load the JSON file from the resources folder
            String fileName = keyName + ".json";
            InputStream inputStream = App.class.getClassLoader().getResourceAsStream(fileName);
            InputStreamReader reader = new InputStreamReader(inputStream);

            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;
            JSONObject arraysObject = (JSONObject) jsonObject.get("arrays");
            JSONArray oneKArray = (JSONArray) arraysObject.get(keyName);

            // Convert JSONArray to int array
            int[] intArray = new int[oneKArray.size()];
            for (int i = 0; i < oneKArray.size(); i++) {
                intArray[i] = ((Long) oneKArray.get(i)).intValue();
            }

            // Now you have your intArray containing the values from json array
            return intArray;
        } catch (Exception e) {
//            return new int[(int)(Math.random() * 1000) + 1];
            logger.error("An error occurred:", e);
        }
        return new int[(int)(Math.random() * 1000) + 1];
    }
}