import java.util.*;
public class practical25 {
    public static void main(String[] args) {
        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");
        Timer t = new Timer();
        t.schedule(t1,5000);
        t.schedule(t2,1000,2000);
    } 
}
class Task extends TimerTask{
   private String name;
   public Task(String name){
       this .name = name;
   }
   public void run(){
       System.out.println("[" + new Date() + "]"+ name + "task executed");
   }
}
