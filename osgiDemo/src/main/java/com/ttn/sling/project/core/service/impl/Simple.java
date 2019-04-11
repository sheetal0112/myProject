package com.ttn.sling.project.core.service.impl;

import com.ttn.sling.project.core.service.MySimpleService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,service = MySimpleService.class,
        property = {
        "service.ranking:Integer=10"
})
//@Designate(ocd = MyServiceConfiguration.class)
public class Simple implements MySimpleService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String configValue;
    private String[] stringValues;
    private int integerValue;
    private String usedMethod;
    private String myProperty;
    private String referenceServiceValue;
    @Activate
    public void activate(MyServiceConfiguration configuration) {
        configValue = configuration.configValue();
        stringValues = configuration.getStringValues();
        integerValue = configuration.getNumberValue();
        usedMethod = configuration.method();
        myProperty = configuration.my_property_name();
        logger.info("MySimpleServiceImpl.activate: Config values are configValue:{}, stringValues {}, referenceServiceValue {}, SimpleValue {}, ",
                configValue, stringValues, referenceServiceValue, getSimpleValue());
    }




    @Override
    public String getSimpleValue() {
        return "false";
    }
    /*@Activate
    public void sample(){

        logger.info("Activated...");
    }
    @Modified
    public void sample1(){
        logger.info("Modifiable Method");
    }*/
}
