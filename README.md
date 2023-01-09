# spring-boot-with-postgreSQL

This tutorial assumes you have the latest version of [Postman](https://www.postman.com/downloads/), [Docker](https://www.docker.com/products/docker-desktop/), and [pgAdmin](https://www.pgadmin.org/download/) installed.

- Clone the repository into a local directory.
- In the same directory, enter ``docker-compose up`` in the terminal. This build might take a few minutes to complete.
- Open pgAdmin and click ``Add New Server``. Feel free to name your server anything, but make sure to fill in the fields for ``host name/address, username, password`` to ``localhost, compose-postgres, compose-postgres``.

### Testing 
- We will use Postman to test the creation of the API.
- Import ``postgres_postman_collection.json`` located within the repository into the Postman desktop app.
- Use Postman to test the **POST endpoint** by creating a user in the database.
- Use Postman to test the **GET endpoint** by returning the new user you have just created.
