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
//PROFE SOLO FUNCIONA CUANDO SE LE DA LA GANA NO SIEMPRE TARDA 2 SEGUNDOS!!! :(
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
    t1.setName("impresion");
    t2.setName("conexion");
    t3.setName("guardar");
     }
    @Override
    public void run(){
        try{
   // System.out.println("soy un thread mediano");
    if(Thread.currentThread().getName().equals("conexion"))Thread.sleep(2000);
    if(Thread.currentThread().getName().equals("impresion"))Thread.sleep(4000);
    if(Thread.currentThread().getName().equals("guardar"))Thread.sleep(6000);
    System.out.println(Thread.currentThread().getName());
        }
        catch(Exception e){}
        
    
    }
    
}
