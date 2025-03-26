package en.ase.sqt.CLI;

import en.ase.sqt.core.Sheriff;
import en.ase.sqt.dispatcher.CrisisDispatcher;
import en.ase.sqt.dispatcher.Dispatcher;
import en.ase.sqt.dispatcher.EmergencyDispatcher;
import en.ase.sqt.dispatcher.RegularDispatcher;
import en.ase.sqt.model.Request;
import en.ase.sqt.model.RequestType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CLI {
    private final Scanner scanner=new Scanner(System.in);
    private Sheriff sheriff;
    private final Map<String, Dispatcher> dispatchers=new HashMap<>();

    public static void main( String[]args){
        CLI cli=new CLI();
        cli.start();
    }
    public void start(){
        System.out.println("welcome to sheriff cli");
        createSheriff();
        while(true){
            System.out.println("\nOptions: create-dispatcher | list-dispatchers | delete-dispatcher | add-request | solve | show | transform | exit");
            String command=scanner.nextLine();
            switch(command){
                case"create-dispatcher"->createDispatcher();
                case "list-dispatchers" -> dispatchers.values().forEach(System.out::println);
                case "delete-dispatcher" -> deleteDispatcher();
                case "add-request" -> addRequest();
                case "show" -> sheriff.printQueue();
                case "solve" -> sheriff.solveRequest();
                case "transform" -> transformRequest();
                case "exit" -> { return; }
                default -> System.out.println("Unknown command.");

            }
        }
    }

    private void createSheriff() {
        System.out.print("Sheriff name: ");
        String name = scanner.nextLine();
        System.out.print("Tenure: ");
        int tenure = Integer.parseInt(scanner.nextLine());
        sheriff = new Sheriff(name, tenure);
    }

    private void createDispatcher() {
        System.out.print("Dispatcher type (regular/emergency/crisis): ");
        String type = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        Dispatcher d = switch (type) {
            case "regular" -> new RegularDispatcher(id, address);
            case "emergency" -> new EmergencyDispatcher(id, address);
            case "crisis" -> new CrisisDispatcher(id, address);
            default -> null;
        };

        if (d != null) {
            dispatchers.put(id, d);
            System.out.println("Dispatcher created.");
        } else {
            System.out.println("Invalid type.");
        }
    }

    private void deleteDispatcher() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        if (dispatchers.remove(id) != null) {
            System.out.println("Dispatcher removed.");
        } else {
            System.out.println("Dispatcher not found.");
        }
    }

    private void addRequest() {
        System.out.print("Dispatcher ID: ");
        String id = scanner.nextLine();
        Dispatcher dispatcher = dispatchers.get(id);
        if (dispatcher == null) {
            System.out.println("Dispatcher not found.");
            return;
        }
        System.out.print("Request description: ");
        String description = scanner.nextLine();
        RequestType type = switch (dispatcher.getClass().getSimpleName()) {
            case "RegularDispatcher" -> RequestType.REGULAR;
            case "EmergencyDispatcher" -> RequestType.EMERGENCY;
            case "CrisisDispatcher" -> RequestType.CRISIS;
            default -> null;
        };
        Request request = new Request(type, description);
        dispatcher.dispatch(request, sheriff);
        System.out.println("Request added.");
    }

    private void transformRequest() {
        System.out.print("Request ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("New type (regular/emergency/crisis): ");
        String typeStr = scanner.nextLine();
        RequestType type = switch (typeStr) {
            case "regular" -> RequestType.REGULAR;
            case "emergency" -> RequestType.EMERGENCY;
            case "crisis" -> RequestType.CRISIS;
            default -> null;
        };
        if (type != null) {
            sheriff.transformRequest(id, type);
            System.out.println("Request transformed.");
        } else {
            System.out.println("Invalid type.");
        }
    }
}


