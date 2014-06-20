/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

import java.util.*;

/**
 *
 * @author Sergio
 */
public class XXX2 {
    
  public static void main(String args[]){
  
  Thread t1=new Thread(new Runnable(){public void run(){
  
    
    while(true){
    try{
    Calendar c= Calendar.getInstance();
    int hora =c.get(Calendar.HOUR);
    int minuto = c.get(Calendar.MINUTE);
    int segundo= c.get(Calendar.SECOND);
    if(hora==9&&minuto==36&&segundo==1){
    
    System.out.println("Se acabo la clase");
    
    }
    Thread.sleep(1000);
   
     }
    
    
    catch(Exception e){}
    
    }
  
  
  
  }});
  t1.start();
  }  
  
    
}
