package cn.rknight.resources;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Slf4j
@NoArgsConstructor
public class HelloWorldResource {

    @GET
    @Path("/sayHello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(){
        log.info("call sayHello {}","hahaha");
        return "hello world";
    }

}
