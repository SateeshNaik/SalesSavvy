public class Queue {
     private  int[] arr;
     private int size;
     private int front=-1;
     private int rear=-1;

     public Queue(int size){
         arr=new int[size];
         this.size=size;

     }
     public void insert(int value){
         if(rear!=arr.length-1){
             rear++;
             arr[rear]=value;
         } else {
             System.out.println("Queue is full");
         }
     }
     public void delete(){
         if((front==-1 && rear==-1) || (front==size-1)){
             System.out.println("Queue is empty");
         } else {
             front++;
             System.out.println("Deleted element is="+ arr[front]);


         }
     }
     public void display(){
         if((front==-1 && rear==-1) || (front==size-1)) {
             System.out.println("Queue is empty");
         } else {
             for(int i=front+1; i<=rear; i++){
                 System.out.println(arr[i]);
             }
         }

     }
}
