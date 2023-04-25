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

#### Your co-worker has called you in the middle of the night to report
#### all the servers have been compromisedand have run out of memory.
#### After some debugging, it seems like the attacker exploited a file upload resource,
#### but you aren’t sure how since the endpoint has a small maximum file size limit.
#### What is the most likely type of attack perpetrated against the system?

* A. Denial of service attack
* B. Inclusion attack
* C. Distributed denial of service attack
* D. Exploit attack
* E. SQL injection
* F. Injection attack

An inclusion attack is one in which multiple components are embedded within a single file,
such as zip bomb or XML exploit (billion laughs attack).
Since the maximum file size is given to be small,
this would be the most likely type of attack used, making option B correct.
Note that if the file size was not limited, then this could be a regulardenial
of service attack in which a large file is sent repeatedly to overwhelm the system.