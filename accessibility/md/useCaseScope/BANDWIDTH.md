### Given:
```txt
    public class Bandwidth{
    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public Bandwidth(int quota){
        this.available = quota;
    }
    public void addMore(int more){
        available += more;
    }
    
}
and a piece of code from another class:
        Bandwidth bw = new Bandwidth(100);
        //INSERT CODE HERE
        System.out.println(bw.getAvailable());

What can be inserted in the code above so that it will print 0?
```

* A. bw(0);
* B. bw.available = 0;
* C. bw.setAvailable(0);
    There is no setAvailable method in the given code so this will not compile.

* D. bw = new Bandwidth();
    Bandwidth class does not have a no-args constructor so this will not compile.

* E. bw.addMore(-bw.getAvailable());

* F. --bw.available;
    This will just decrement bw.available by 1.

Correct(B, E)
