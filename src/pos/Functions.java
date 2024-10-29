/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author LABKOM
 */
public class Functions {
    static String folder = ".kelasC";
    static String home = System.getProperty("user.home");
    static String pathFolder = home + File.separator + folder;
    
    static String logName = "Log.txt";
    static String pathLog = pathFolder + File.separator + logName;
    
    public static void saveLog(String text){
        try {
            File f = new File(pathFolder);
            f.mkdir();
            
            File log = new File(pathLog);
            log.createNewFile();
            
            Files.write(
                    Paths.get(pathLog), 
                    text.getBytes(), 
                    StandardOpenOption.APPEND);
            
        } catch (IOException e) {
            System.out.println("Error Code: 101 => "+e.getMessage());
        }
    }
    
}
