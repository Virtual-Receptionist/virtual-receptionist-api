virtual-receptionist-api
=============

### Accommodation management application's backend.

[![Continuous integration](https://github.com/Virtual-Receptionist/virtual-receptionist-api/actions/workflows/build.yml/badge.svg)](https://github.com/Virtual-Receptionist/virtual-receptionist-api/actions/workflows/build.yml)

[Contributing Guide](.github/CONTRIBUTING.md)

Prerequisites
-------------

To avoid any unexpected application behaviour, make sure you have installed the following tools with the proper version numbers:

- [Eclipse Temurin JDK](https://adoptium.net/temurin/releases)
- [Maven 3.9.6](https://maven.apache.org/download.cgi)

Running project locally
-----------------------

TODO.

Note that:

- The **default** Spring profile is configured with an H2 in-memory database for passing the Continuous integration GitHub check. In case you need to use this, you can manage it in the [H2 Console](http://localhost:8080/h2-console).

#### To view GraphQL queries and mutations, open [GraphiQL](http://localhost:8080/graphiql) in your web browser.
