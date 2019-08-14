package com.demo;

import com.blade.Blade;
import com.blade.mvc.Const;
import com.blade.security.web.csrf.CsrfMiddleware;
import io.github.biezhi.anima.Anima;
import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.util.List;

import static io.github.biezhi.anima.Anima.select;

/**
 * @author andy
 */
@Log4j2
public class Main {
    public static void main(String[] args) {
        log.info("start ......");
//        Blade  blade = Blade.of();
//        blade.use(new CsrfMiddleware()).start(Main.class, args);

//        Anima.open("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
       String DB_PATH = Const.CLASSPATH  + "vcms.db";
       log.info(DB_PATH);
        Anima.open("jdbc:sqlite:" + DB_PATH);
        List<Areas> users = select().from(Areas.class).all();
        for(Areas u:users){
            System.out.println(u.getName());
        }
    }
}
