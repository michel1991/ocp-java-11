package concurrency.tricky;
/**
 * A programmer is using the following class for wrapping objects and passing it around to multiple threads.
   Which of the given statements regarding this class are correct?
   
    A. Objects of this class are thread safe but the objects wrapped by this class are not thread safe.
    B. Objects of this class are thread safe but you cannot say anything about the objects wrapped by this class.
    C. Objects of this class are not thread safe.
    D. Objects of this class as well as the objects wrapped by this class are thread safe.
    E. None of these.
    
    
    Objects of this class i.e. DataObjectWrapper are thread safe because this class does not perform any operation on the wrapped objects.
    There is only one method that is only returning the object reference of the wrapped object which is a thread safe operation.
    If this class were doing some operation on the instance variables, then it would not thread safe. For example:
    public void modify()
    {
       i =  20; //assuming i and j are instance variables.
       j = 30;
    }
    
    In this case, the objects of DataObjectWrapper are not thread safe.
    
    The objects wrapped by DataObjectWrapper may or may not be thread safe because after the reference of the wrapped object is returned,
    multiple threads can operate on the object.
    Therefore, whether the wrapped object itself is thread safe or not is determined by how the class of the wrapped object is implemented.
    This information is not given in the question, so you cannot say whether the object wrapped by this class is thread safe or not.

   correct (B)

 */
public class DataObjectWrapper
    {
        private final Object obj;

        public DataObjectWrapper(Object pObj){ obj = pObj; }

    public Object getObject() { return obj; }
    }