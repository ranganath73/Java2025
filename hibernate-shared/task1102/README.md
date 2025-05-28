Save the <mark>animalCat</mark> object to the database using the **save** method of the <mark>session</mark>, then call the **saveOrUpdate** method on the **animalCat** and animalDog. Run the program and make sure that the database contains only two records (the **saveOrUpdate** method for the **animalDog** object worked like **save**, and for the **animalCat** object - as update).

**Requirements:** <br>
*	In the main method, the save method must be called on the Session class object with the required parameter.
*	In the main method of the Session class object, the saveOrUpdate method must be called for two different objects.