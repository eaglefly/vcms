package com.cms.bootstrap;

import com.blade.Blade;
import com.blade.ioc.annotation.Bean;
import com.blade.loader.BladeLoader;
import com.blade.mvc.Const;
import com.zaxxer.hikari.HikariDataSource;
import io.github.biezhi.anima.Anima;
import lombok.extern.slf4j.Slf4j;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.SQLExec;
import org.apache.tools.ant.types.EnumeratedAttribute;

import java.io.File;

/**
 * @author andy
 */
@Slf4j
@Bean
public class Bootstrap implements BladeLoader {

    private static String DBTYPE = "H2";
    private enum Driver{
        /**
         * H2
         */
        H2DRIVER("org.h2.Driver");

        private String driverClass;
        Driver(String driverClass) {
            this.driverClass = driverClass;
        }
    }

    @Override
    public void preLoad(Blade blade) {
        HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(Driver.H2DRIVER.driverClass);
        ds.setJdbcUrl(blade.environment().getOrNull("h2.mem"));
        ds.setUsername("sa");
        ds.setPassword("");
        ds.setConnectionTestQuery("select 1 from dual");
//        Anima.open(ds);

        String DB_PATH = Const.CLASSPATH  + "vcms.db";
        Anima.open("jdbc:sqlite:" + DB_PATH);


    }

    @Override
    public void load(Blade blade) {
        log.info("{},start server.....{}", "2018","");
        SQLExec sqlExec = new SQLExec();
        //设置数据库参数
        sqlExec.setDriver(Driver.H2DRIVER.driverClass);
        sqlExec.setUrl(blade.environment().getOrNull("h2.mem"));
        sqlExec.setUserid("sa");
        sqlExec.setPassword("");
        sqlExec.setSrc(new File(Const.CLASSPATH+"schema.sql"));
        sqlExec.setOnerror((SQLExec.OnError)(EnumeratedAttribute.getInstance(SQLExec.OnError.class, "abort")));
        sqlExec.setPrint(false);
        sqlExec.setProject(new Project());
        sqlExec.execute();
    }
}
