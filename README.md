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
