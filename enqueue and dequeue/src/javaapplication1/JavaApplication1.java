/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class queue
{int head,tail;
int[] number;

public queue()
{head=0;
tail=0;
number=new int[35];
}
public void enqueue(int value)
{
    if(tail<number.length)
    {
      number[tail++]=value;
    }
}
public int dequeue()
{
    return number[head++];
}
public void show()
{
    for(int c=head;c<=tail;c++)
    {
        System.out.println("value is"+number[c]);
    }
}

}
/**
 *
 * @author Malindu
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        queue q1=new queue();
        q1.enqueue(20);
         q1.enqueue(42);
        q1.dequeue();
        q1.enqueue(51);
        q1.enqueue(21);
        q1.enqueue(15);
        
        q1.show();
    }
    
}
