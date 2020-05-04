package com.PostProcessor;

public class Helloworld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void init(){
      System.out.println("Helloworld Bean is going through init.");
   }
   public void destroy(){
      System.out.println("Helloworld Bean will destroy now.");
   }
}