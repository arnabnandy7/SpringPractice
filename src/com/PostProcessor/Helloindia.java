package com.PostProcessor;

public class Helloindia {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void init(){
      System.out.println("Helloindia Bean is going through init.");
   }
   public void destroy(){
      System.out.println("Helloindia Bean will destroy now.");
   }
}