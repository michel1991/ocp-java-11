package io;
public class PathUtility {
   public static StringBuilder getResourcePath(){
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
   
   public static StringBuilder getResourcePath(String packageName, String resourceFolder){
      String rootPath = System.getProperty("user.dir");
      String fileSeparator = System.getProperty("file.separator");
      StringBuilder pathToResourceFile = new StringBuilder(rootPath);
      pathToResourceFile
                         .append(fileSeparator)
                         .append(packageName)
                         .append(fileSeparator)
                         .append(resourceFolder)
       ;

      return  pathToResourceFile;
   }

    public static String getFileSeparator(){
       return System.getProperty("file.separator");
   }
}