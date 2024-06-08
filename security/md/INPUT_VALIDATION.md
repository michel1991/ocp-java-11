#### Which of the following are valid approaches for input validation from security perspective?
* A. Validate input at the client.
* B. Integral values should be validated by using appropriate constraints in the database.
* C. Input validation should be done using trusted domain specific libraries.
    Every application domain has its own rules regarding what constitutes valid input.
    Thus, validation must be done according to the rules of the domain of that application.
    The code that performs validation must be part of "trusted" code.
* D. Accept only valid character and input values.
    Input should be validated as soon as it is received instead of postponing the validation till it reaches lower layers.
    Invalid characters should be rejected at the outset.

    Guideline 3-1 / INJECT-1: Generate valid formatting:

    If the input string has a particular format, combining correction and validation is highly error-prone.
    Parsing and canonicalization should be done before validation.
    If possible, reject invalid data and any subsequent data, without attempting correction.

* E. Modify input values to make sure they pass validation.

Correct(C, D)
