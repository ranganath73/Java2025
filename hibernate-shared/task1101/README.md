**Save** the created object in the database (use the save method) and **assign** the result to the **id1** field, **disconnect** the object from the session (use the method class="code text-orange">evict) and again using the save method, save the same object in the database and assign the result to the id2 field . Run the program and make sure that before and after disconnection the id of the object in the database is different (id1 == id2 returns false ).

**Requirements:** <br>
*	In the main method, the save method of the Session class object must be called twice with the required parameter.
*	In the main method, the evict method with the required parameter must be called on the Session class object.
*	After executing the program code, the values of the id1 and id2 fields must be different.
}
}


