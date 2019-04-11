package com.ttn.sling.project.core.service.impl2;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,service = StudentService.class)
@Designate(ocd = ClassConfigurationService.class)
public class StudentCom2 implements StudentService {
    private int totalSt;
    private int pMarks;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //ClassConfigurationService classConfigurationService;
    @Override
    public boolean isClassLimitReached(int size) {
      if(size > totalSt)
        return false;
      return true;
    }

    @Override
    public int getPassingMarks() {
        return pMarks;
    }

    @Activate
    public void activateMethod(ClassConfigurationService classConfigurationService){
        totalSt = classConfigurationService.NoofStudents();
        pMarks = classConfigurationService.PassingMarks();
        logger.info("Class Configuration Service Activated"+"passing marks"+pMarks+"total students"+totalSt);
    }
}
