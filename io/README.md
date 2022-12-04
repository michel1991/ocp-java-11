# Which of the following are not java.io classes? (Choose all that apply.)
A. BufferedReader
B. BufferedWriter
C. FileReader
D. FileWriter
E. PrintReader
F. PrintWriter

PrintStream and PrintWriter are the only I/O classes that you need to know that don’t have a complementary InputStream or Reader class, so option E is correct.

# What modifiers must be used with the serialPersistentFields field in a class? (Choose all that apply.)
A. final
B. private
C. protected
D. public
E. transient
F. static

The serialPersistentFields field is used to specify which fields should be used in serialization.
It must be declared private static final, or it will be ignored. Therefore, options A, B, and F are correct.