//package LeetCodeProblems;
//
//public class MyCircularQueue {
//    int[] queue;
//    int front=-1,rear=-1;
//    int size=0;
//    int capacity=0;
//    public MyCircularQueue(int k) {
//        queue=new int[k];
//    }
//
//    public boolean enQueue(int value) {
//        {
//            if (isFull()) {
//                return false;
//            } else {
//                rear = (rear + 1) % capacity;
//                queue[rear] = value;
//                size++;
//                return true;
//            }
//        }
//
//    }
//
//    public boolean deQueue() {
//        if(isEmpty()){
//            return false;
//        }
//        int value=queue[front];
//        front=(front+1)%capacity;
//        return true;
//
//    }
//
//    public int Front() {
//
//    }
//
//    public int Rear() {
//
//    }
//
//    public boolean isEmpty() {
//
//    }
//
//    public boolean isFull() {
//
//    }
//}
