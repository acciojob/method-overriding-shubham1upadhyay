package com.driver;

public class Main {
  
  public static void main(String[] args)
  {
    
   /* now creating an object of class B to call a method of class A
    before over-ride the method it calls the method of A*/
    
    B b = new B();
    String methodOfClassA = b.meth();
    System.out.println(methodOfClassA);
    
    
    /* when we over-ride the method in class B , then after creating an object
     to call , then it always calls that over-ridden */
    
    
    
  }
  
}
