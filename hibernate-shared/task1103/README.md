Try to get an object of the **Animal** class with id + 1 from the database. Use the **get()**, **load()** and **find()** of the **session** object.
Write the result in the fields **animalGet**, **animalLoad** and **animalFind** respectively. Run the program and make sure that the values of the fields **animalGet** and **animalFind** are equal to **null**, and the value of **animalLoad** is not equal to **null**.

**Requirements:** <br>
*	In the main method, the **get** method must be called on the Session class object with the **Animal.class** and **id+1** parameters.
*	In the main method, the **load** method must be called on the Session class object with the **Animal.class** and **id+1** parameters.
*	In the main method, the **find** method must be called on the Session class object with the **Animal.class** and **id+1** parameters.
*	After the program runs, the values of the **animalGet** and **animalFind** fields must be equal to **null**, and the value of **animalLoad** must not be equal to null.