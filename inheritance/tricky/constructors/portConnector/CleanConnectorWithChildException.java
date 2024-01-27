package inheritance.tricky.constructors.portConnector;
import java.io.*;

public class CleanConnectorWithChildException  extends PortConnector{
    public CleanConnectorWithChildException() throws FileNotFoundException{
        super(1);
    }
}