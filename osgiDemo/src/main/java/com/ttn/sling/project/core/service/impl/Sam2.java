package com.ttn.sling.project.core.service.impl;

import com.ttn.sling.project.core.service.MySimpleService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,service = MySimpleService.class,
property = {
        "service.ranking:Integer=10"
})
public class Sam2 implements MySimpleService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Activate
    public void activate(){
        logger.info(getSimpleValue());
    }
    @Override
    public String getSimpleValue() {
        return "true";
    }
}
