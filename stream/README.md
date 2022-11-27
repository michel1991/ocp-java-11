# When performing a parallel reduction, which of the following would make a valid BinaryOperator<Integer> accumulator argument to the reduce() stream operation? Assume p is a valid ArrayList<Integer> instance. (Choose all that apply.)
    A. (a,b) -> 10
    B. (a,b) -> a-b
    C. (a,b) -> a/b
    D. (a,b) -> {p.add(a); return 1;}
    E. (a,b) -> a+b
    F. (a,b) -> {p.add(a); return a;}

To be a valid accumulator in a parallel reduction, the lambda expression must be associative such that ((a op b) op c) is equal to (a op (b op c)).
For these reasons, options A and E are correct, while options B and C are not correct.
Options D and F are incorrect because the lambda expression must also be stateless.