package adminMenu;

import userService.UserService;

import java.util.Scanner;

public class AdminMenu {
    static {
        UserService userService = new UserService();
        userService.addUser("User1", 10, "kinder");
        userService.addUser("User2", 20, "Student");
    }

    public static void printCommand() {
        System.out.println(
                "Chose you destiny ||" + "\n" +
                        "1: Add user" + "\n" +
                        "2: Edit user" + "\n" +
                        "3: Delete user" + "\n" +
                        "4: Print user list" + "\n" +
                        "5: Exit");
    }

    public static void execute() {
        printCommand();
        String command = "";
        Integer age = 0;
        String name = "";
        String username = "";
        Integer userId = 0;
        Scanner console = new Scanner(System.in);

        do {
            command = console.nextLine();
            if (command.equals("1")) {
                age = Integer.parseInt(console.nextLine());
                name = console.nextLine();
                username = console.nextLine();
                UserService.addUser(name, age, username);
                printCommand();
            }
            if (command.equals("2")) {
                System.out.println("2");
                printCommand();
            }
            if (command.equals("3")) {
                userId = Integer.parseInt(console.nextLine());
                UserService.deleteUser(userId);
                printCommand();
            }
            if (command.equals("4")) {
                UserService.printUser();
                printCommand();
            }
        }
        while (!command.equals("5"));
    }
}
