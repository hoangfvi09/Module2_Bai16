package BT1;

import java.io.*;

public class FileCopying {
    public static void copyFile(String sourcePath, String destinationPath){
        try {
            File source = new File(sourcePath);

            if (!source.exists()) {
                throw new FileNotFoundException();
            }


            BufferedReader sourceReader = new BufferedReader(new FileReader(source));
            FileWriter destinationWriter = new FileWriter(destinationPath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(destinationWriter);

            String line = "";
            while ((line = sourceReader.readLine()) != null) {

                bufferedWriter.write(line+"\n");

            }
            sourceReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyFile("/Users/hoangfvi/Documents/JAVA/Module 2/Bai16/src/BT1/source.txt","/Users/hoangfvi/Documents/JAVA/Module 2/Bai16/src/BT1/destination.txt");
    }
}
