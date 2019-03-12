package main;

public class Queue {
    private static class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    private int size=0;
    private Node front=null;
    private Node rear=null;

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue);
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i+1);
        }
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
    }

    @Override
    public String toString() {

    }

    public void enqueue(int data){
        Node node = new Node(data,null);
    }
    public int dequeue(){

    }

}
