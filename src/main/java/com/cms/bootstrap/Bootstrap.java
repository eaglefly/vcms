package com.cms.bootstrap;

import com.blade.Blade;
import com.blade.ioc.annotation.Bean;
import com.blade.loader.BladeLoader;
import com.blade.mvc.Const;
import com.zaxxer.hikari.HikariDataSource;
import io.github.biezhi.anima.Anima;
import lombok.extern.slf4j.Slf4j;

/**
 * @author andy
 */
@Slf4j
@Bean
public class Bootstrap implements BladeLoader {

    @Override
    public void preLoad(Blade blade) {
        HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(blade.environment().getOrNull("jdbc.driver"));
        ds.setJdbcUrl(blade.environment().getOrNull("jdbc.url"));
        ds.setUsername(blade.environment().getOrNull("jdbc.user"));
        ds.setPassword(blade.environment().getOrNull("jdbc.pass"));
        ds.setConnectionTestQuery("select 1 from dual");
        //Anima.open(ds);

        String DB_PATH = Const.CLASSPATH  + "vcms.db";
        Anima.open("jdbc:sqlite:" + DB_PATH);

    }

    @Override
    public void load(Blade blade) {
        log.info("{},start server.....{}", "2018","");
    }
}
