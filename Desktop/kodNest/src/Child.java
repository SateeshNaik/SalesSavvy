 class Child extends Parent {

    int a,b;
    Child(){
        this(9,99);
        a=300;
        b=400;
    }
    Child(int a, int b){

        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
