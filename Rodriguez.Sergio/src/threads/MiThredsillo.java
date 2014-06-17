/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author Sergio
 */
public class MiThredsillo implements Runnable{
    public static void main(String args[]){
    
    Runnable r=new MiThredsillo();
    Thread t1=new  Thread(r);
    t1.start();
     Thread t2=new  Thread(r);
    t2.start();
}
public void run()
{
System.out.println("soy feliz estoy dentro del run");
}
}