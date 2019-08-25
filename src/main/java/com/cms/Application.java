package com.cms;

import com.blade.Blade;
import com.blade.security.web.csrf.CsrfMiddleware;

/**
 * @author andy
 */
public class Application {

    public static void main( String[] args ) {
       Blade blade =  Blade.of();
       blade.use(new CsrfMiddleware()).start(Application.class, args);
    }
}
