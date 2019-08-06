package com.demo.controller;


import com.blade.mvc.RouteContext;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;

/**
 * @author andy
 */
@Path
public class IndexController {

    @GetRoute("/")
    public void index(RouteContext ctx){
        ctx.redirect("/swagger");
    }

}
