package Vorlesung.JavaInputOutput;

import java.io.File;
import java.io.FileFilter;

public class PdfFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".pdf");
    }
}
