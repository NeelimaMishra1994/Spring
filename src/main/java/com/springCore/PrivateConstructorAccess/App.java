package com.springCore.PrivateConstructorAccess;

import java.lang.reflect.Constructor;


public class App 
{
    public static void main( String[] args )
    {
    	try {
    		Class c= Class.forName("com.springCore.PrivateConstructorAccess.Student");
    		Constructor con[] = c.getDeclaredConstructors();//by using this approach,reflection code,  spring IOc can create instance of your private constructor
    		con[0].setAccessible(true);						//So,by using reflection classes, we can instantiate private constructor classes also.
    		con[0].newInstance();							//both IOC container will use same approach
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
