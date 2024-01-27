package inheritance.tricky.constructors.portConnector;
import java.io.*;

public class CleanConnectorWithoutThrowsException extends PortConnector{
    /**
     * wrong require throws parent exception or super parent exception
     * at line 10 : error: unreported exception IOException; must be caught or declared to be thrown
     */
    public CleanConnectorWithoutThrowsException(){
        super(1);
    }
}