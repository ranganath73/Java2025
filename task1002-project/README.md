If you haven’t connected dependencies before, connect them. To do this, use Alt + Ctrl + Shift + S (in Idea), Libraries tab.
Dependencies can be downloaded here.
Unpack the archive and add each dependency to the module. This part of the job is not checked, but if you don't do it, you won't be able to run the code locally.

In the getDirector method, get the session from MySessionFactory.getSessionFactory(). Write a query in hql to get an Employee whose smth = 'director'.
The query result expects one value, return it in the getDirector.

method
**Requirements:**<br>
•	The getDirector method must open a session using the SessionFactory returned by the getSessionFactory method.<br>
•	The getDirector method should return the Employee object according to the condition.