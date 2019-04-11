package com.ttn.sling.project.core.service.impl;

import com.ttn.sling.project.core.service.MySimpleService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;

@Component
public class Com {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference
    MySimpleService mySimpleService;

    @Activate
    public void activate(){
        logger.info("Com.activate:mySimpleService",mySimpleService.getSimpleValue());
    }
}
