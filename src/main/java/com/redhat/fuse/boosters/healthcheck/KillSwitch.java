package com.redhat.fuse.boosters.healthcheck;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KillSwitch {

    @Autowired
    private CamelContext context;

    @RequestMapping("/killswitch")
    public void killCamel() {
       try {
        context.stop();        
	   } catch (Exception e) {
		e.printStackTrace();
	   }
    }
}