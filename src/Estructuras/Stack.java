package EstructurasDeDatos;

import java.lang.reflect.Array;

public class Stack {
    String pila[];
    int top;
    public Stack(){
        pila=new String[10];
        top=0;
    }

    public boolean empty(){
        if(top==0){
            return true;
        }else{
            return false;
        }
    }

    public void push(String str){

        if (top >= pila.length) {
            String temp[] = new String[pila.length * 2];
            for (int i = 0; i < pila.length; i++) {
                temp[i] = pila[i];
            }
            pila = temp;
        }
        pila[top]=str;
        top++;
    }

    public String peek(){
        if(top>0) {
            return pila[top - 1];
        }else{
            return null;
        }
    }
    public String pop(){
        String temp=null;
        if(top>0){
            temp=pila[top-1];
            pila[top-1]=null;
            top--;
        }
        return temp;
    }
}