package exceptions.handled;
import java.io.*;
import java.sql.*;

class ServerException extends Exception{
    public ServerException(String msg){
        super(msg);
    }
    
    public  void setCause(Exception ex){
        
    }
}
public class GetDataForUser {
    
    /**
      Identify correct statements about the following code:

        public String[] getDataForUser(String userid) throws ServerException{
            try{
                String dbdata = loadFromDB(userid);
                String filedata = loadFromFile(userid);
                return new String[]{dbdata, filedata};
            }catch(SQLException|IOException se){
                ServerException e = new ServerException("Unable to load data");
                e.setCause(se);
                throw e;
            }
        }
        
       NOTE: Some candidates have reported seeing the usage of ServerException in the exam.
       It is not known what ServerException does it refer to. There is one java.rmi.ServerException class but it does not have any setCause method.
       ServerException does have a ServerException(String s, Exception ex) constructor, which can be used to store the actual exception.
       This exception can then be retrieved using the getCause() method.

       Our suggestion is to answer it assuming that it refers to java.rmi.ServerException and that it has a setCause method.
       
       A. This is a good approach to exception handling because it can handle new exceptions without affecting caller code.
       
       B. This is not a good approach to exception handling because the actual cause of exception is lost.
            The root cause of the exception is not lost. It is stored in ServerException and can be retrieved using getCause method.
            
       C. This is not a good approach to exception handling because it leaks memory by holding on to an exception while creating a new exception.
            Memory leakage issue does not arise here because the exception object will be garbage collected
            once it is not referred to by any active part of the code.
       
      D. This is not a good approach to exception handling because resources cannot be closed correctly in this approach.
            There is no such issue in this approach.

        ---------------
         Correct(A)
     */
    
    static String loadFromDB(String userId) throws SQLException {
        return null;
    }
    
    static String loadFromFile(String userId) throws IOException{
        return null;
    }
    
    public String[] getDataForUser(String userid) throws ServerException{
        try{
            String dbdata = loadFromDB(userid);
            String filedata = loadFromFile(userid);
            return new String[]{dbdata, filedata};
        }catch(SQLException|IOException se){
            ServerException e = new ServerException("Unable to load data");
            e.setCause(se);
            throw e;
        }
    }  
}