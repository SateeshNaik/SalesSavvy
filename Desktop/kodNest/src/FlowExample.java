public class FlowExample {
    static int staticvar=20;

    int instance=30;

    static {
        System.out.println("static block will be excuted = " + staticvar);
        staticvar=40;
    }

    {
        System.out.println("instance block excuted = " + instance);
        instance=50;
    }
    static void staticMethod() {
        System.out.println("static method excuted = "+ staticvar);
    }
    void instanceMethod (){
        System.out.println("instance method  = " +instance);
    }
    public FlowExample(){
        System.out.println("constructor excuted = " + instance);
    }

    public static void main(String[] args) {
        System.out.println("main method");

        staticMethod();
        FlowExample fe=new FlowExample();
        fe.instanceMethod();
    }

}
