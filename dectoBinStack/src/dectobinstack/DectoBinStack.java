/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dectobinstack;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DectoBinStack {

    /**
     * @param args the command line arguments
     */
     public int current_size=-1;
    public final int MAX_SIZE=100;
    public int []stack=new int[MAX_SIZE];
    
    //check isEmpty
    public boolean isEmpty(){
        return (current_size==-1);
    }
    
    //check full
    public boolean isFull(){
        return (current_size==MAX_SIZE);
    }
    
    //them mot phan tu vao stack
    
    public void push(int data){
        if(isFull()){
            System.out.print("Full");
        }
        else
        {
            current_size++;
            stack[current_size]=data;
        }
    }
           //hien thi top nhung khong xoa
    public int top(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
            
        }
        else
        {
            return stack[current_size];
        }
    }
          //hien thi va xoa
    public int pop(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        else
        {
            int data=stack[current_size];
            current_size--;
            return data;
        }
    }

   public static void main(String[] args) {
      
      Scanner input =new Scanner(System.in);
      int k;
      System.out.println("input k=");
      k=input.nextInt();
      dectoBin(k);
// TODO code application logic here
     } 
    public static void dectoBin(int k){
        DectoBinStack s = new DectoBinStack();
        System.out.println(k + " in binary system is: ");
        
        
        //dua vao stack phan tu
        
        while (k>0){
            s.push(new Integer(k%2));
            k=k/2;
        }
        
        //in ra man hinh
        while(!s.isEmpty()){
            System.out.println(s.pop()); 
        }
       System.out.println("");
    }

}
