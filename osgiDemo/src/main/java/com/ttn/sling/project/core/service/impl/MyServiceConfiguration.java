package com.ttn.sling.project.core.service.impl;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "My Service Configuration", description = "Service Configuration") //required annotation
public @interface MyServiceConfiguration {

    //The id of this AttributeDefinition is generated from the name of the annotated method. The annotated method name is processed from left to right changing each character as follows:
    // A dollar sign ('$' \u0024) is removed unless it is followed by another dollar sign in which case the two consecutive dollar signs ( '$$') are changed to a single dollar sign.
    // A low line ('_' \u005F) is changed to a full stop ( '.' \u002E) unless is it followed by another low line in which case the two consecutive low lines ('__') are changed to a single low line.
    //This id is the value of the id attribute of the generate AD element and is used as the name of the corresponding configuration property.

    String configValue() default "idx";

    @AttributeDefinition(name = "Multiple-Values",
            description = "Multi Configuration values, max 4",
            cardinality = 4) //optional annotation - This annotation is only used to specify non-default AttributeDefinition information.
            String[] getStringValues() default "[1]";

    @AttributeDefinition(name = "NumberValue", description = "Number values", type=AttributeType.INTEGER ) //type- check one more time
            int getNumberValue() default 2;

    @AttributeDefinition(description = "Single Configuration value")
    String my_property_name(); // gets to my.property.name

    @AttributeDefinition(description = "Used method",
            options = {
                    @Option(label = "GET", value = "GET"),
                    @Option(label = "POST", value = "POST"),
                    @Option(label = "PUT", value = "PUT"),
                    @Option(label = "PATCH", value = "PATCH"),
                    @Option(label = "DELETE", value = "DELETE")
            })
    String method() default "GET";

}


