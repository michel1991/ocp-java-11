package introducingThreads.creatingAThread;

public class BeCarefullExecuteThreadSynchronousWithRun {
    public static void main(String[] args){
        System.out.println("begin");
        ( new ReadInventoryThread()).run();
        ( new Thread( new PrintData() ) ).run();
        ( new ReadInventoryThread()).run();
        System.out.println("end");
    }
}