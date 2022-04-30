[![CircleCI](https://circleci.com/gh/yerasoni20/java_ee_todo_app/tree/master.svg?style=svg)](https://circleci.com/gh/yerasoni20/java_ee_todo_app/tree/master)

# Java Enterprise Edition Todo app

This Java EE Todo application manages the todos for a user by creating the entities, services and resources. To run this application, we use Payara Microserver and the user requests was handled by Insomnia Client request handler. For testing environment of this application, JUnit Arquillian framework is used. In Arquillian Framework, ShrinkWrap library is used to generate the testing archive.

Arquillian runs in a managed environment or runs in an application server to test Java EE components. To run the components of the application, it needs some managed environment in the testing context, that is what Arquillian does for us. Arquillian simply manages the container for us. So, in the testing environment, Arquillian takes the giving container that we declare and it starts the container, then it creates an archive of the project and deploy that archive of the container to test the components. So, Arquillian will do all the infrastructure work and JUnit will do test for us.

This application performs the steps of:-

1) Modelling the Todo classes
2) Adding validation constraints to those classes
3) Querying the TodoUser as well as TodoEntity 
4) Designed the Service class
5) Adding the SecurityUtil Class
6) Getting Todos by Task Method Impelementation
7) Implemented Stateless Security with JWT - The Authz and ContainerRequestFilter
