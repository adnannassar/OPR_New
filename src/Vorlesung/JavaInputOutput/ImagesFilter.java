package Vorlesung.JavaInputOutput;

import java.io.File;
import java.io.FileFilter;

public class ImagesFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".jpg") ||
                file.getName().endsWith(".png") ||
                file.getName().endsWith(".jpeg");
    }
}
