package io;
import java.io.*;

public class SomeMethodDoesNotThrowCheckedException {
    public static void deleteTree(File file) {
        if(!file.isFile())                    // f1
            for(File entry: file.listFiles())  // f2
                deleteTree(entry);
        else file.delete();
    }

    public static void main(String... args){

    }
}