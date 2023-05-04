package nio;
import io.PathUtility;
public class NioUtilities {
    public static final String PACKAGE_NAME = "nio";
    public static final String FOLDER_NAME_OF_RESOURCE = "resources";
    
    public static StringBuilder getResourcePath(){
        return PathUtility.getResourcePath(PACKAGE_NAME, FOLDER_NAME_OF_RESOURCE);
    }
}