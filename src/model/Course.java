package model;

public class Course {
	private Student root;
	
	public void addStudent(int c, String n) {
	     boolean added = false;
	     Student current = root;
	     Student addme = new Student(c, n);
	     if(current != null) {
	          while (!added) {
	               if(addme.compareTo(current)<=0) {
	                    if(current.getLeft() == null) {
	                          current.setLeft(addme);
	                          added = true;
	                    } else {
	                    	current = current.getLeft();
	                    }
	               } else {
	            	   if(current.getRight() == null) {
	            		   current.setRight(addme);
	            		   added = true;
	            	   } else {
	            		   current = current.getRight();
	            	   }
	               }
	          }
	     } else {
	          root = addme;
	     }
	}
	
	public Student searchStudent(int c) {
		boolean found = false;
		Student current = root;
		Student st;
		while(current != null && !found) {
			if(current.getCode() ) {
				
			}
		}
		return st;
	}
}
