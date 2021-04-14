/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor1;

/**
 *
 * @author PERSONAL
 */
public class Stack {
    int size;
    int top;
    String[] kata;
    
    public Stack(int size){
        this.size = size;
        kata = new String[size];
        top = -1;
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean isFull(){
        if(top == size - 1){
            return true;
        }else {
            return false;
        }
    }
    
    public void push(String kt){
        if(!isFull()){
            top++;
            kata[top] = kt;
        }else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public String pop(){
        String result = null;
        if (top >= 0){
            result = kata[top];
            top--;
        }
        return result;
    }
    
    public void print(){
        System.out.println("Isi stack : ");
        if(!isEmpty()){
            for(int i = 0; i <= top; i++){
                System.out.println(kata[i] + " ");
            }
        }
        
        System.out.println("");
    }
    
}
