package com.randy.note.base.file;

import java.io.File;
import java.io.FilenameFilter;

class MyFilter implements FilenameFilter {
    MyFilter() {
    }

    public boolean accept(File dir, String name) {
        File file = new File(dir, name);
        boolean b = file.getName().endsWith(".txt");
        return b;
    }
}
