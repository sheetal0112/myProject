package com.ttn.sling.project.core.service.impl2;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Class Configuration Service", description = "Service Configuration")
public @interface ClassConfigurationService {
    @AttributeDefinition(name = "NoofStudents", description = "No of Students", type = AttributeType.INTEGER) //type- check one more time
            int NoofStudents() default 10;

    @AttributeDefinition(name = "PassingMarks", description = "Passing Marks", type = AttributeType.INTEGER) //type- check one more time
            int PassingMarks() default 15;
}
