/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ejer
 */
public class FileReader {
    private static String filename = "English.txt";
    public static ArrayList<String> array;
    public void read() {
        FileReader read = new FileReader();
        read.ReadFromFile();
        
    }
    
    public static List<String> ReadFromFile() {
        try {
            array = new ArrayList<String>();
            java.io.FileReader read = new java.io.FileReader(filename);
            BufferedReader r = new BufferedReader(read);
            while (true) {
                String a = r.readLine();
                if(a == null) { break; }
                array.add(a);
                
                System.out.println(a);
            }
            read.close();
        } catch (IOException e){
        } 
        System.out.println(filename);
    return array;
    }

    public ArrayList<String> getArray() {
        return array;
    }

    public static void setFilename(String filename) {
        FileReader.filename = filename;
    }
    
}
