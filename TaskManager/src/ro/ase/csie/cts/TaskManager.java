package ro.ase.csie.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//gestionarea utilizatorilor și task-urilor
public class TaskManager {
    private List<User> users = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();
    private User currentUser = null;
    private Scanner scanner = new Scanner(System.in); //citire input utilizator

    public void addUser() {
        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.print("Is admin? (yes/no): ");
        boolean isAdmin = scanner.nextLine().equalsIgnoreCase("yes");
        User user = new User(name, isAdmin);
        users.add(user);
        System.out.println("User '" + name + "' added successfully! (ID: " + user.id + ")\n");
    }

    public void chooseUser() {
        if (users.isEmpty()) {
            System.out.println("No users available. Please add a user first.\n");
            return;
        }
        System.out.println("\nUsers:");
        for (User user : users) {
            System.out.println("ID: " + user.id + " | Name: " + user.name + " | Admin: " + user.isAdmin);
        }
        System.out.print("Enter user ID: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid numeric ID.\n");
            scanner.next();
            return;
        }
        int id = scanner.nextInt();
        scanner.nextLine();
        currentUser = users.stream().filter(u -> u.id == id).findFirst().orElse(null);
        if (currentUser != null) {
            System.out.println("User '" + currentUser.name + "' selected!\n");
        } else {
            System.out.println("User not found.\n");
        }
    }

    public void addTask() {
        if (currentUser == null) {
            System.out.println("No user selected! Choose a user first.\n");
            return;
        }
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(title, description, currentUser.id);
        tasks.add(task);
        System.out.println("Task '" + title + "' created successfully! (ID: " + task.id + ")\n");
    }

    public void viewTasks() {
        if (currentUser == null) {
            System.out.println("No user selected! Choose a user first.\n");
            return;
        }
        System.out.println("\nTASK LIST:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.\n");
        } else {
            for (Task task : tasks) {
                if (currentUser.isAdmin || !task.isHidden || task.userId == currentUser.id) {
                    System.out.println("Task ID: " + task.id);
                    System.out.println("Title: " + task.title);
                    System.out.println("Description: " + task.description);
                    System.out.println("Assigned to User ID: " + task.userId);
                    System.out.println("Hidden: " + task.isHidden + "\n");
                }
            }
        }
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\n========================");
            System.out.println("TASK MANAGER MENU");
            System.out.println("========================");
            System.out.println("1. Add User");
            System.out.println("2. Choose User");
            System.out.println("3. Create Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("\nChoose an option: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.\n");
                scanner.next();
                continue;
            }
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> addUser();
                case 2 -> chooseUser();
                case 3 -> addTask();
                case 4 -> viewTasks();
                case 5 -> {
                    System.out.println("Exiting Task Manager. Goodbye!\n");
                    return;
                }
                default -> System.out.println("Invalid option! Please choose a valid number.\n");
            }
        }
    }
}
