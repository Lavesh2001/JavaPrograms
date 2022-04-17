package unit_02;//Inside this package we can create many classes!

/*
  - A java package is a group of similar types of classes, interfaces and sub-packages.
  - Package in java can be categorized in two form
    - built-in package {lang, awt, javax, swing, net, io, util, sql}
    -user-defined package
    
    - Package also helps to avoid class name collision
    - Packages also helps us to maintain access protection in java
    - Packages are named in reverse order of domain names
      - unit01.javaproject.com-> "com.javaproject.unit01"
      
    import java.util.vector; // import the vector class from util package
    import java.util.*;// import all the classes from util packages
    
    Static Import:
    - Static import is a feature introduced in java programming language (version 5 and above)
    - That allows members (fields and methods) defined in a class as public static
    to be used in java without specifying the class in which the field is defined.
    
 */

import static java.lang.System.*;
import static java.lang.Math.*;

public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		
             out.println("Welcome to package");
             
             out.println(sqrt(4)); 
             System.out.println(pow(2,2));
             System.out.println(abs(6.3));
             
             
	}

}
