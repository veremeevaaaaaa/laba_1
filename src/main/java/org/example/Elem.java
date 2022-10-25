package org.example;

public class Elem {
    int el;
    Elem next;

    public Elem(int new_el,Elem next){
        this.next=next;
        this.el=new_el;
    }
}
