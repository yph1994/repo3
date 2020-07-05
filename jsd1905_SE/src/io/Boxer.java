package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Boxer {
	     public static void main (String[]args) throws Exception { 
	           String name = "tarena";
	            byte[] c = name.getBytes();
	            try { 
	                 File f = new File("company.txt"); 
	                 FileOutputStream out = new FileOutputStream(f, true); 
	                     out.write(c);
	                     out.close();
	              } 
	              catch (IOException e)   {} 
	       } 
		}

