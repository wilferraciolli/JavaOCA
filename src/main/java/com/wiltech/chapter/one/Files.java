/*
 * (c) Midland Software Limited 2019
 * Name     : Files.java
 * Author   : ferraciolliw
 * Date     : 09 Jul 2019
 */
package com.wiltech.chapter.one;

import java.io.File;
import java.io.FileFilter;

/**
 *
 */
public class Files
{
    public static void main(String[] args) {
        File myTestDir = new File("C:\\DEV\\test1");
        File[] files = myTestDir.listFiles(new FFF());

        for (File f: files){
            System.out.println(f.getAbsolutePath());
        }

    }

}

class FFF implements FileFilter{
    @Override
    public boolean accept(File p){
        return p.isHidden();
    }
}
