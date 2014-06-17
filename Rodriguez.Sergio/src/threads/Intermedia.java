/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;
//en esta forma se hacen dos cosas 
//las interfaces 
/**
 *
 * @author Sergio
 */
public class Intermedia implements Runnable {
    
    public static void main(String args[]){
        
        //paso1: crear el thread 
    Runnable algo=new Intermedia();
    Thread t1=new Thread(algo);
    t1.start();
    Thread t2=new Thread(algo);  
     t2.start();    
    Thread t3=new Thread(algo);
     t3.start();
    
    
    }
    @Override
    public void run(){
    System.out.println("soy un thread mediano");
    
    
    }
    
}
