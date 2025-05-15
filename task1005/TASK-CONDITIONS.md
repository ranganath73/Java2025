task1005
If you haven’t connected dependencies before, connect them. To do this, use Alt + Ctrl + Shift + S (in Idea), Libraries tab.
Dependencies can be downloaded here.
Unpack the archive and add each dependency to the module. This part of the job is not checked, but if you don't do it, you won't be able to run the code locally.

In the **main** method, get the **session** from **MySessionFactory.getSessionFactory()**.
Write a **query** in **hql** to get books from the **book** table that have **full_name** by **'Mark Twain'** and **name** of the publisher **'Folio'**.
**Output the resulting books to the console**.

**Requirements:**<br>
*	The main method must open a session using the SessionFactory returned by the getSessionFactory method.
*	The main method should output books to the console according to the condition.
1
