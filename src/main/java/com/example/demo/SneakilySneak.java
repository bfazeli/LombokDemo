package com.example.demo;

import lombok.SneakyThrows;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

// Checked Exception
import java.io.IOException;

@Log
public class SneakilySneak {
    public static void main(String[] args) {
        firstLevel();
    }

    // Sneaky throws avoids "throw" clause even though secondLevel function throws a checked exception
    @SneakyThrows
    public static void firstLevel() {

        log.warning("WEEEOOOOO WEEEOOOOO, crash incoming");
        secondLevel();
        log.warning("I shouldn't be getting printed");
    }

    public static void secondLevel() throws IOException {
        System.out.println("You think you're SO cool with your logs?");
        throw new IOException(" >:D ");
    }
}