
If you haven’t connected dependencies before, connect them. To do this, use Alt + Ctrl + Shift + S (in Idea), Libraries tab.
Dependencies can be downloaded here.
Unpack the archive and add each dependency to the module. This part of the job is not checked, but if you don't do it, you won't be able to run the code locally.

In the main method, get the session from MySessionFactory.getSessionFactory(). Write a query in hql to get the smth column from the employee table.
Filter the values by age > 18, sort by smth and remove duplicates.
Print the values to the console, each on a new line.

**Requirements:**<br>
•	The main method must open a session using the SessionFactory returned by the getSessionFactory method.<br>
•	The main method should output the data of the smth column to the console according to the condition.