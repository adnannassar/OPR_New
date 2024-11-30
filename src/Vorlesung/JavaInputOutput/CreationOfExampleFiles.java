package Vorlesung.JavaInputOutput;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CreationOfExampleFiles {

    public static void main(String[] args) {
        createExampleFiles("IO_Files");
    }

    private static void createExampleFiles(String folderName) {
        createFolder(folderName);
        createTestTextFile(FileType.txt, folderName);
        createFiles(5, FileType.txt, folderName);
        createFiles(3, FileType.png, folderName);
        createFiles(2, FileType.jpg, folderName);
        createFiles(1, FileType.pdf, folderName);
    }

    private static void createFolder(String folderName) {
        File folder = new File(folderName);
        if (folder.mkdir()) {
            System.out.println("Folder created successfully!");
        } else {
            System.out.println("Error by creating folder!");
        }
    }

    private static void createFiles(int numberOfFiles, FileType fileType, String folderName) {
        for (int i = 1; i <= numberOfFiles; i++) {
            File f1 = new File(folderName + "/File_" + new Random().nextInt(1, 100) + "." + fileType);
            try {
                boolean isCreated = f1.createNewFile();
                if (isCreated) {
                    System.out.println("File created successfully!");

                } else {
                    System.out.println("Error by creating file!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void createTestTextFile(FileType fileType, String folderName) {
        File f1 = new File(folderName + "/test." + fileType);
        try {
            boolean isCreated = f1.createNewFile();
            if (isCreated) {
                System.out.println("File created successfully!");

            } else {
                System.out.println("Error by creating file!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
