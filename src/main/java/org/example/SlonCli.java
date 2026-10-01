package org.example;

import java.util.Scanner;

public class SlonCli
{
    static void main()
    {
        Slon slon = new Slon();
        System.out.println(slon.greeting());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (slon.isExitCommand(line)) {
                return;
            }
            if (!line.isEmpty()) {
                System.out.println();
            }
            System.out.println(slon.respond(line));
        }
    }
}
