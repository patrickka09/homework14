package edu.dmacc.codedsm.hw14;


import java.util.ArrayList;
import java.util.List;

public class Runner{

    public static void main(String[] args) {

        Task task1 = new Task(1,"Grocery","January 01 2019: 07:00 AM","January 01 2019: 09:00 AM","running",1,"Home");
        Task task2 = new Task(2,"Laundry","January 01 2019: 11:00 AM","January 01 2019: 01:00 PM","Todo",2,"Home");
        List<Task> Tasks = new ArrayList<>();
        Tasks.add(task1);
        Tasks.add(task2);
        User user1 = new User("Pauline","Mum", Tasks,true);
        User user2 = new User("Ismael","Dad",Tasks,true);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        System.out.println(user1.toString());

    }
}

