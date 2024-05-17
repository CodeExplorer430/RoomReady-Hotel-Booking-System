/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.room.datatable;

/**
 *
 * @author Miguel
 */
import java.io.*;
import java.util.*;

public class FileUtil {
    public static List<List<String>> readFile(String filename) throws IOException {
        List<List<String>> data = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("\\|"); // Using '|' as delimiter
            data.add(Arrays.asList(values));
        }
        reader.close();
        return data;
    }
}
