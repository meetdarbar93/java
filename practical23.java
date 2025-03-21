public class practical23 extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        practical23 obj = new practical23(); //create a same object as a file name
        obj.start();
    }
}
