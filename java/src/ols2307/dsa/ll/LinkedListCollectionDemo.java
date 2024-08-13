package ols2307.dsa.ll;

import java.util.LinkedList;

public class LinkedListCollectionDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("------------------------- Before deletion--------------------------");
        for (int element : linkedList) {
            System.out.println(element);
        }
        System.out.println("------------------------- After deletion--------------------------");
        linkedList.remove();
        for (int element : linkedList) {
            System.out.println(element);
        }
    }
}
