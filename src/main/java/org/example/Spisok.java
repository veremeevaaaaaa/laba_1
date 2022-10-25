package org.example;

/**
 * Container class
 */
public class Spisok{
    private Elem head;

    /**
     * The function of adding  an element to the begining of the container
     * @param new_value item to add
     */
    public void insert(int new_value){
        if(this.head==null){
            this.head=new Elem(new_value,null);
        }
        else {
            Elem cur=new Elem(new_value,head);
            head=cur;
        }
    }
    /**
     * The function of adding  an element to the end of the container
     * @param new_value item to add
     */
    public void insert_last(int new_value){
        Elem cur=head;
        while(cur.next!=null){cur=cur.next;}

        Elem last=new Elem(new_value,null);
        cur.next=last;
    }

    /**
     * *Ьethod that removes the first element of a list
     */
    public void remove_first(){
        head=head.next;
    }
    /**
     * *Method of deleting an element
     * @param value index of the item to delete
     */
    public void remove(int value){
        if(head.el==value){
            head=head.next;
        }
        else{
            Elem prev=head;
            Elem cur=head.next;
            while(cur!=null && cur.el!=value ){
                prev=cur;
                cur=cur.next;
            }
            if(cur!=null) {
                prev.next = cur.next;
                cur = null;
            }
        }
    }
    /**
     * Method for getting the element value
     * @param el index of the element to get the value
     * @return the element with the given index or -1
     */
    public int find(int el){
        Elem cur=head;
        int i=0;
        int res=-1;
        while (cur!=null && i<el){
            cur=cur.next;
            i++;
        }
        if(i!=el || cur ==null ){
            System.out.print("Error!");
        }
        else{
            res=cur.el;
        }
        return res;
    }
    /**
     * * Method for getting the element value
     * printing list of all elements
     */
    public void print(){
        Elem cur=head;
        while(cur!=null){
            System.out.print(cur.el);
            System.out.print(" ");
            cur=cur.next;
        }
        System.out.println();
    }
}