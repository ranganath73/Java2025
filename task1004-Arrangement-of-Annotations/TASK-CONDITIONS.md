There are three entity classes: **Author**, **Book** and **Publisher**.
Place annotations in them, taking into account that **Author** and **Publisher** are the fields of **Book**.
For simplicity, we assume that each book can have only one author.

Relevant tables:

* table **publisher** with columns id, name;
* table **author** with columns id, first_name, last_name, full_name;
* table **book** with columns id, title, author_id, publisher_id, publication_year, isbn.
<br>**Requirements:**<br>
*	All classes must have Entity and Table annotations with table names.
*	The id fields of all classes must have Id and GeneratedValue annotations.
*	All fields except id must have Column or JoinColumn annotations with column names.
*	Fields that refer to other entities must have ManyToOne annotations.
