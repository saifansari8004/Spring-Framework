# Spring-Framework

1. Open-Source Java Framework.
2. We can develop standalone as well as enterprise application and projects.
3. Initial Develop 2003 with Apache 1.0 Liscense.
4. Officially Developed in 2004 by "Rod Johnson".

# Spring - Container

1. Core-Component of Spring.
2. Heart of Spring Framework.
3. Responsiblities :
    * Manage Bean Objects.
    * Manage Bean Life-Cycle
    * Dependency Injection
    * AOP(Aspect Oriented Programming)
    * Transaction Management
 4. Types of Spring-Container(IoC):
    * BeanFactory (old)
    * Application Context (new)
          (Note: They are used to invoke and start the Spring Container)
  Note:
    # Bean :
    1. Standard class
         * Private properties
         * Getters and Setters
         * no-arg Constructor
         * Implements Serializable
      
    # Creating First Program of Spring
    1. Create POJO or Bean class
    2. Create Configuration File
         * XML file
         * Java File
         * Annotation
    3. Create Main Class
    (Note: - Follow Programs to understand)

    # Configuration :
    1. XML File Config :
        1. In XML-based Spring configuration, we use <bean> tags to define beans.
        2. ClassPathXmlApplicationContext (used for XML configurations)
    2. Java File Config :
         1.   In Java-based configuration, we use methods annotated with @Bean to define beans.
         2.   The @Bean annotation in Spring is used to declare a method as a factory for creating and configuring a bean managed by the Spring container.
         3.   AnnotationConfigApplicationContext (used for Java configurations)
         4.   The method annotated with @Bean will:
                = Create a new POJO object.
                = Configure the POJO object, setting its properties using setxxx methods.
                = The default bean name for this method will be "stdId1," which is the same as the method name
                = Return the configured POJO object.
      * Note:
        * The "@Component" annotation in Spring is used to declare a class as a Spring bean, which is a managed component in the Spring application context.
        * It helps Spring automatically detect and manage these beans during application startup, making them available for dependency injection and other Spring features

  # Dependency Injection :
      1. Dependency Injection is a design pattern used in the Spring Framework to achieve Inversion of Control (IOC).
      2. Its main task is to inject the dependencies, means injecting one object (a dependency) into another object.
      3. We can achieve Dependency Injection by 2 ways :-
            * Setter Method DI
            * Constructor DI


      * Setter Method DI :-
          1. Dependencies are injected into a class through setter methods.
          2. Setter Method DI is more readable
          3. Setter Method DI is more flexible
      * Constructor DI :-
          1. Dependencies are injected into a class through constructor
          2. Constructor DI is less readable
          3. Constructor DI is less flexible
  # AUTOWIRING : 
         1. It is a feature of Spring Framework used to achieve DI automatically.
         2. It can be achieved by : 
                  * Annotation - @autowired and @Qualifier(check which obj has to inject)
                  * XML File - autowire attribute and mode - byName , byType , Constructor
		                  * Note: autowire-candidate=false(obj not involve in autowiring)

               		    	AUTO         			                WIRING
               		Automatically manage the				  Linking those objects
               		Connection b/w objects	  				  to fulfill dependencies

         3. Advantage : 
            * It requires less code
         4. Dis advantage : 
            * It can be achieved only on non-primitive or user-defined data types (excluding String), not on primitive data types.




	# Autowiring using Annotation : 
		* Create POJO classes i.e student and address
		* Create JavaConfig.class file use @Configuration to configure and @Bean to create POJO objects.
		* Direct use @Autowired annotation with property to inject dependencies one to another.
		* Create Main class and create a applicationcontext obj with annotation*** class.
		* If there is multiple object and have to inject one object use @Qualifier annotation to simplify which object want to inject. E.g @Qualifier(“createobj”)
	
	# Autowiring using XML file: 
		* Create POJO classes i.e student and address.
		* Create XML config file.
		* Create object using <bean> tag with attribute class , id , autowire
		* Autowire mode :- 
			* byName - property , name , value 
			* byType - property , name , value
			* constructor - constructor-arg , value ,  index
		* Create Main class and create a applicationcontext obj with ClassPath*** class.
		* If there is multiple object and have to inject one object use autowire-candidate attribute to simplify which object want to inject


 # Introduction to Maven :

	1. It is a build tool which automates everything related to the build of a project (JAVA project).
	2. MAVEN in was developed by JASON VAN ZYL 2004 (Apache software foundation)
	3. Building tools- Process → 	1) Clean
					2) Compile
					3) Test
					4) Package
					5) initialize /install
					6) Deploy

	In the context of Java projects, "building" refers to the "process of transforming source code into a deployable form, typically an executable or distributable 	artifact". It contains below phases :-

		* Clean: Removes any previously generated build artifacts, ensuring a fresh start.
		* Compile: Translates the source code files (Java files) into bytecode, which is the language understood by the Java Virtual Machine (JVM).
		* Test: Executes automated tests to verify that the code behaves as expected and meets specified requirements.
		* Package: Combines the compiled classes, along with any required resources (such as configuration files or static assets), into a distributable unit.Common types of packages include JAR (Java ARchive) files for libraries and WAR (Web ARchive) files for web applications.
		* Install: Installs the packaged artifacts into a local repository, making them available for use by other projects on the same machine.
		* Deploy: Transfers the packaged artifacts to a remote environment, such as a server or a production environment, for deployment and execution.


	Responsibilities of Maven :
		1. Creates the project structure
		2. Download the required Dependencies
		3. Prepare the documentation
		4. Compile the source code
		5. Start of Stop the server
		6. Packaging the project in JAR or WAR OF EAR file
	

	First program of Maven :
		* Create maven project
		* Create archetype-quickstart project
		* Provide ID and name of project
		* Paste spring-context dependency in pom.xml file in dependency tag
		* Create bean classes with Getter and Setter and other properties
		* Create xml file / Java file for Configuration
		* Update the main and create an object to fetch your result



