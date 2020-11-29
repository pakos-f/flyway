# flyway


Flyway updates a database(table(s)) from one version to a next using migrations. 
We can write migrations either in SQL with database-specific syntax or in Java for advanced database transformations.


Migrations can either be versioned or repeatable. 
The former has a unique version and is applied exactly once. 
The latter does not have a version. Instead, they are (re-)applied every time their checksum changes.
