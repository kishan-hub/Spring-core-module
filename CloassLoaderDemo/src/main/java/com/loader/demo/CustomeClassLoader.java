package com.loader.demo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class CustomeClassLoader extends ClassLoader {
	
	//constructor
	
	public CustomeClassLoader(ClassLoader parent) {
		super(parent);
		System.out.println("Test Class Loaded By: "+parent.getClass().getClass());
	}
	
	public Class<?> loadClass(String name) throws ClassNotFoundException{
		
		Map<String,Class<?>> classes =new HashMap<String,Class<?>>();
		//Checks from cache
		if(classes.containsKey(name)==true) {
			return classes.get(name);
		}
		try
		{
			return findSystemClass(name);
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		byte[] byteCode =getClassDetails(name);
		Class<?> c =defineClass(name, byteCode, 0,byteCode.length);
		resolveClass(c);
		classes.put(name, c);
		return c;
		
	}
	public byte[] getClassDetails(String name) throws ClassNotFoundException{
		try
		{
			//Logic for custome classLoader
            String baseDir ="C:\\Users\\DESKTOP PC\\eclipse-workspace\\Spring-core-module\\CloassLoaderDemo\\src\\main\\java\\com\\loader\\demo";
            String classFileName =name.replace(".", "\\").concat(".class");
            
            File file =new File(baseDir+classFileName);
            FileInputStream fis =new FileInputStream(file);
            ByteArrayOutputStream bos =new ByteArrayOutputStream();
            
            int i=0;
            
            while((i=fis.read())!=-1) {
            	bos.write(i);
            }
            fis.close();
			byte[] byteCode =bos.toByteArray();
			bos.close();
		    return byteCode;
		}
		catch (Exception e) {
			throw new ClassNotFoundException();
		}
	}
	

}
