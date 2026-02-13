public class B  extends A{
    int x;
    int y;
    public B(){
        x=30;
        y=40;
    }
    public B(int x,int y){
        super(x,y);
        this.x=x;//100
        this.y=y;//200
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
