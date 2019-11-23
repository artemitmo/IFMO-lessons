package Lesson10.lists;

import java.util.Iterator;

class LinkedList <T> {
    //РЕАЛИЗАЦИЯ СВЯЗАННОГО СПИСКА
    /* Идет поиск элемента с ссылкой на null, происходит перестановка, вместо null подставляется новый объект,
    возвращением элементов и присваивание новому ссылку на null. Дома подставлять значения. */
    private  Node head;

    public  void add (T value) {
        if (head == null) {
            head = new Node<>(value);
            return;
        }
        find(-1).next = new Node<>(value);
    }

    public T get(int ind){  //1
        Node<T> result = find(ind);
        return result == null ? null : result.value;
    }

    private Node find(int ind){
       if (ind == 0) return head;
       int cnt = 0;
       Node node = head;
       while (node != null){
           if ( (cnt++ == ind)) return node; //сработает на второй итерации
           if (ind < 0 && node.next == null) return node;
           node = node.next;
       }
       return  null;
    }

}

class Node <T>{ //узлы в linkedList
    T value;
    Node next; //next node
    public Node(T value){
        this.value = value;
    }
}
