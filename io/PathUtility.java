package io;
public class PathUtility {
   static StringBuilder getResourcePath(){
       String rootPath = System.getProperty("user.dir");
       String fileSeparator = System.getProperty("file.separator");
       String resourceFolder = "resource";
       StringBuilder pathToResourceFile = new StringBuilder(rootPath);
       pathToResourceFile
       .append(fileSeparator)
       .append("io")
       .append(fileSeparator)
       .append(resourceFolder)
       ;
       return  pathToResourceFile;
   }
}