package db;

import servlets.Tasks;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
   private static List<Tasks> tasks = new ArrayList<>();
   private static Long ID = 5L;
   static {
       tasks.add(new Tasks(1L, "Купить молоко", "Новое купить надо", "20.10.2021"));
       tasks.add(new Tasks(2L, "Купить машину", "Новое купить надо", "25.10.2021"));
       tasks.add(new Tasks(3L, "Купить масло", "Новое купить надо", "24.10.2021"));
       tasks.add(new Tasks(4L, "Купить яблоко", "Новое купить надо", "22.10.2021"));
   }

   public static List<Tasks> getTasks() {
       return tasks;
   }

   public static void addtask( Tasks task) {
       if (!tasks.contains(task)) {
           task.setId(ID);
           tasks.add(task);
           ID++;
       }else{
           System.out.println("Существует");
       }
   }
}
