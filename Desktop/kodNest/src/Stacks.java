public class Stacks {
     private  int[] arr;
     private  int size;
     private  int top=-1;

     public Stacks(int size){//This constructor is called when you create a new object
         arr=new int[size];
         this.size=size;
     }
     public void push(int value){
         if(top!=arr.length-1){
             top++;
             arr[top]=value;

         } else {
             System.out.println("Stack is Full");
         }
     }
     public void pop(){
         if(top==-1){
             System.out.println("Stack is Empty");
         } else {
             System.out.println("Deleted Element is= " + arr[top]);
             top--;
         }
     }
     public void display(){
         if(top==-1) {
             System.out.println("Stack is Empty");
         } else {
             for(int i=top; i>=0; i--){
                 System.out.println(arr[i]);
             }
         }

     }
}
