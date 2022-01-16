package Activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try{
        File file = new File("C:\\Users\\002A6X744\\Desktop\\FST\\src\\main\\java\\Activities\\Activity14File");
        boolean fStatus = file.createNewFile();
        File fileUtil = FileUtils.getFile(file);
        System.out.println(FileUtils.readFileToString(fileUtil, "UTF8"));
        //Create directory
        File destDir = new File("resources");
        System.out.println(destDir.getAbsolutePath());
        //Copy file to directory
        FileUtils.copyFileToDirectory(file, destDir);
        //Get file from new directory
        File newFile = FileUtils.getFile(destDir, "Activity14File");
        //Read data from file
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        //Print it
        System.out.println("Data in newFileData: " + newFileData);
    } catch(IOException Message) {
        System.out.println(Message);
    }
    }
}
