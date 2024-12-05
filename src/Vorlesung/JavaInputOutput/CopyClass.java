package Vorlesung.JavaInputOutput;

import java.io.*;

public class CopyClass {
    public static void main(String[] args) {
        // testCopyNormal();
        testCopyBuffered();
    }

    private static void testCopyNormal() {
        Clock clock = new Clock();
        System.out.println("Start copying test.txt");
        File f1 = new File("IO_Files/test.txt");
        File f2 = new File("IO_Files/test_copy.txt");
        clock.startTime();
        copyFile(f1, f2);
        clock.stopTime();
        System.out.println("Copying text.txt took: " + clock.getDuration() + "ns");

        System.out.println("............................................");
        System.out.println("Start copying image.png");
        File f3 = new File("IO_Files/image.png");
        File f4 = new File("IO_Files/image_copy.png");
        clock.startTime();
        copyFile(f3, f4);
        clock.stopTime();
        System.out.println("Copying image.jpg took: " + clock.getDuration() + "ns");
    }

    private static void testCopyBuffered() {
        Clock clock = new Clock();
        System.out.println("............................................");
        System.out.println("Start copying test.txt");
        File f5 = new File("IO_Files/test.txt");
        File f6 = new File("IO_Files/test_buffer_copy.txt");
        clock.startTime();
        copyFileUsingBuffer(f5, f6);
        clock.stopTime();
        System.out.println("Copying text.txt took: " + clock.getDuration() + "ns");

        System.out.println("............................................");
        System.out.println("Start copying image.png");
        File f7 = new File("IO_Files/image.png");
        File f8 = new File("IO_Files/image_buffer_copy.png");
        clock.startTime();
        copyFileUsingBuffer(f7, f8);
        clock.stopTime();
        System.out.println("Copying image.jpg took: " + clock.getDuration() + "ns");
    }

    private static void copyFile(File from, File to) {
        try {
            FileInputStream fis = new FileInputStream(from);
            FileOutputStream fos = new FileOutputStream(to);
            int result;
            while ((result = fis.read()) != -1) {
                fos.write(result);
            }
            fis.close();
            fos.close();
            fos.flush();
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void copyFileUsingBuffer(File from, File to) {
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to))
        ) {
            int result;
            while ((result = bis.read()) != -1) {
                bos.write(result);
            }

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
