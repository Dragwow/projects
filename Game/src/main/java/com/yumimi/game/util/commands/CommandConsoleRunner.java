package com.yumimi.game.util.commands;

import com.yumimi.game.service.CommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@RequiredArgsConstructor
public class CommandConsoleRunner implements CommandLineRunner  {

    private final CommandService commandService;

    @Override
    public void run(String... args) throws Exception {
        new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                commandService.executeCommand(line);
            }
        }, "CommandConsoleThread").start();
    }
}
