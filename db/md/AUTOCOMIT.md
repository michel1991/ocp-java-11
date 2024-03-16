### Given:

```
  Connection con = DriverManager.getConnection(dbURL);
  con.setAutoCommit(false);
  String updateString =
        "update SALES " +
        "set T_AMOUNT = 100 where T_NAME = 'BOB'";
  Statement stmt = con.createStatement();
  stmt.executeUpdate(updateString);
  //INSERT CODE HERE
``` 

What statement can be added to the above code so that the update is committed to the database?

* A. con.setAutoCommit(true);

* B. con.commit(true);
commit() does not take any parameter.
FYI, there are two flavors of rollback() - one does not take any argument and another one takes a java.sql.Savepoint as an argument.

* C. stmt.commit();

* D. con.setRollbackOnly(false);
   There is no such method in Connection.

E. No code is necessary.

This is a trick question. Since auto-commit has been
disabled in the given code (by calling c.setAutoCommit(false)), you have to explicitly
commit the transaction to commit the changes to the database. The regular way to do this is to call con.commit().
Notice that commit method does not take any arguments.

Another way is to utilize the side effect of changing the auto-commit mode of the connection.
If the setAutoCommit method is called during a transaction and the auto-commit mode is changed,
the transaction is committed. If setAutoCommit is called and the auto-commit mode is not changed,
the call is a no-op. In this question, con.setAutoCommit(true) changes the auto-commit
mode of the connection from false to true and therefore this call commits the changes.

(Correct A)

