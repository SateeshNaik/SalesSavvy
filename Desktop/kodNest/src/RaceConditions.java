public class RaceConditions extends  Thread{
    public synchronized void run(){
        String name=Thread.currentThread().getName();
        try {
            System.out.println(name + " started using printer");
            Thread.sleep(3000);
            System.out.println(name + " using printer");
            Thread.sleep(3000);
            System.out.println(name + " using printer");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }

