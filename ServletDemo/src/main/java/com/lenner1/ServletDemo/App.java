package com.lenner1.ServletDemo;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8085);
        
        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet()); // "HelloServlet" <- can be change and put it in map below
        context.addServletMappingDecoded("/hello", "HelloServlet");// <--- here
        
        
        tomcat.start();
        tomcat.getServer().await(); 
 
    }
}
