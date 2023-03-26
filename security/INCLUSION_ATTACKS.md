### Which of the following are considered inclusion attacks? (Choose all that apply.)
* A. Billion laughs attack
* B. Command injection
* C. CSRF
* D. SQL injection
* E. XSS
* F. Zip bomb

An inclusion attack needs to include something.
Options A and F are correct because they are used with XML and ZIP file respectively.
Options B and D are incorrect because injection is not an inclusion attack.
Options C and E are not inclusion attacks either.
In fact, you might not have heard of them.
Both are attacks used against web applications.
Don’t worry if you see something on the exam
that you haven’t heard of; it isn’t a correct answer.


#### Which of the following best protect against inclusion attacks? (Choose two.)
* A. Encrypt user passwords.
* B. Use immutable objects.
* C. Limit the recursive depth of ZIP files.
* D. Apply a blacklist to the input data.
* E. Turn the computer off when not in use.
* F. Restrict the number of parse levels of XML files.

Inclusion attacks occur when multiple files or components are embedded
within a single entity, such as a zip bomb or the billion laughs attack.
Both can be thwarted with depth limits, making option C and F correct.
The rest of the options are not related to inclusion attacks.

#### Which of the following are not typically considered denial of service attacks? (Choose two.)
*  A. Downloading confidential information from a log file
*  B. Uploading a very large file
*  C. Performing SQL injection
*  D. Passing invalid numbers to trigger overflow or underflow
*  E. Exploiting a database resource leak
*  F. Uploading a zip bomb

A denial of service attack is one in which one or more requests attempt
to overwhelm the system and disrupt legitimate requests.
Option A is an access or confidentiality problem.
Option C is about gaining access or changing data that the user should not be permitted to.
Options B, D, E, and F are all denial of service attacks because
they increase load in an attempt to bring a system down.
Remember, a zip bomb is when a small file is expanded to become a much larger file.