package workingWithAdvancedStreamPipelineConcepts.CheckedExceptionsAndFunctionalInterfaces;
import java.io.*;
import java.util.*;

public class CreateMethodExceptionCaseStudy {
    public static List<String> create() throws IOException{
        throw new IOException();
    }
}