package com.company;

public class Main {

    public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.create(3);

		list.insertion(1, 0);



		list.insertion(13,2);
		list.insertion(12,4);
		list.insertion(2,1);
		list.insertion(4,3);
		list.insertion(5,3);



		list.traverse();
		list.reverce();
        list.search(7);
		list.delete(3);
		list.delete(0);
		list.delete(7);
		list.traverse();
		list.clear();
		list.traverse();

	}
}
