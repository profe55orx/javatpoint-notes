# Javatpoint Spring tutorial notes

Following this [link](https://www.javatpoint.com/spring-tutorial)

## Projects

### [first](https://www.javatpoint.com/example-of-spring-application-in-myeclipse)

* applicationContext.xml needs to be under src directory in order to be found.
* idea autocompletes the Student class in the applicationContext.xml

Seems that `XmlBeanFactory()` is deprecated. The code for the Test class has changed to:

```java
  ...
  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
  Student student = (Student) applicationContext.getBean("student");
  student.displayInfo();
  ...
```

