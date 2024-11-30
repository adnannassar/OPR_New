package Vorlesung.JavaInputOutput;

import java.io.File;
import java.io.FileFilter;

public class TxtFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".txt");
    }
}
