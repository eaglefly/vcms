package com.demo;

import com.blade.Blade;
import lombok.extern.log4j.Log4j2;

/**
 * @author andy
 */
@Log4j2
public class Main {
    public static void main(String[] args) {
        log.info("start ......");
        Blade.of().start(Main.class, args);
    }
}
