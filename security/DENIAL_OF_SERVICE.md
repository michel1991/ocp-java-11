##### Which of the following best protect againstdenial of service attacks? (Choose three.)
* A. Close resources with catch blocks.
* B. Use PreparedStatement instead of Statement.
* C. Close resources with try-with-resources statements.
* D. Set a limit of the size of a file upload.
* E. Set a limit on the size of a numeric input value.
* F. Use immutable objects.

A denial of service attack is about overloading the system
with too much data or too many requests to process legitimate incoming requests.
Option A is incorrect, and option C is correct because a try-with-resources
or finally block should be used to close resources to prevent
a resource leak.Option B is incorrect because SQL injection
is a form of injection attack, not one based on volume or resources.
Option D is correct because a malicious attack could send a lot of bad requests with huge files.
Option E is also correct as numeric overflow can be used to overwhelm a system.
Option F is incorrect because immutability does not usually play a part in DoS attacks.

### How many requests does it take to have a DDoS attack?
* A. None
* B. One
* C. Two
* D. Many

A distributed denial of service (DDoS) attack requires multiple requests by definition.
Even a regular denial of service attack often requires multiple requests.
For example, if you forget to close resources,
it will take a number of tries for your application to run out resources.
Therefore, option D is correct.