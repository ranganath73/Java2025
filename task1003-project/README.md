If you haven’t connected dependencies before, connect them. To do this, use Alt + Ctrl + Shift + S (in Idea), Libraries tab.
Dependencies can be downloaded here.
Unpack the archive and add each dependency to the module. This part of the job is not checked, but if you don't do it, you won't be able to run the code locally.

In the promoteAll method, get the session from MySessionFactory.getSessionFactory().
Write a query in hql to add 'senior' to the beginning of the current value of the smth column for all employees.
For example, if the value of smth was 'admin', then it should become 'senior admin'.

**Requirements:**<br>
•	The promoteAll method must open a session using the SessionFactory returned by the getSessionFactory method.<br>
•	The promoteAll method must make a change in the smth column for all employees according to the condition.
