#### Which of the following static methods does not exist in the Executors class? (Choose two.)
* A. newFixedScheduledThreadPool()
* B. newThreadPool()
* C. newFixedThreadPool(int)
* D. newSingleThreadExecutor()
* E. newScheduledThreadPool(int)
* F. newSingleThreadScheduledExecutor()

Options C, D, E, and F are all proper ways to obtain instances of ExecutorService.
Remember that newSingleThreadExecutor() is equivalent to calling newFixedThreadPool(int)
with a value of 1. The correct answers are options A and B, as neither of these methods exist.
