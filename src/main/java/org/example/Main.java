package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        Spisok list = new Spisok();
        System.out.print("Enter the number of elements:");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert(i + 1);
        }
        System.out.print("List generated!Display on screen:");
        list.print();
        System.out.print("Enter the element to remove:");
        n = in.nextInt();
        list.remove(n);
        list.remove_first();
        list.insert_last(88);
        System.out.print("List view after changes:");
        list.print();
        System.out.print("Enter the element to find:");
        n = in.nextInt();
        System.out.print( list.find(n+1));

    }
}