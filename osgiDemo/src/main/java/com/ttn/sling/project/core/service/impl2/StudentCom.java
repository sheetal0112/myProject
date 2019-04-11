package com.ttn.sling.project.core.service.impl2;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Component(immediate = true, service = StudentClassService.class)
@Designate(ocd = ClassConfigurationService.class)
public class StudentCom implements StudentClassService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    List<Student> list=new ArrayList<>();

    ClassConfigurationService classConfigurationService;
    @Reference
    StudentCom2 studentCom2;
    @Override
    public String addStudent(Student s) {
 if(studentCom2.isClassLimitReached(list.size())){
     return "Student cannot be added";

 }
 else
     {
         list.add(s);
         String s1 = "Student added" + s;
         return s1;
 }
    }

    @Override
    public boolean deleteStudent(int id) {
if(list.size()>0){
    list.remove(list.size()-1);
    return true;
}
else{
    return false;
}

    }

    @Override
    public boolean isStudentPassed(int id) {
        for(Student s:list) {
            if(s.id==id) {
                if(studentCom2.getPassingMarks() <= s.marks) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public Student getStudent(int id) {
        for(Student s:list){
            if(s.id==id){
                return s;
            }
        }
         return null;
    }

    @Override
    public List<Student> getAllStudents() {
if(list.size()>0){
    return list;
}
return new ArrayList<>();
    }


    @Activate
    public void activateMethod(ClassConfigurationService classConfigurationService){
        this.classConfigurationService = classConfigurationService;
        Student s1,s2,s3;
        s1 = new Student("Shaily",24,1);
        s2 = new Student("Annie",30,2);
        s3 = new Student("Raghav",20,3);
        logger.info("\n" +
                " Student \n"
        +"Addind Student1"+addStudent(s1)
                +"Adding Student2"+addStudent(s2)+
                "Adding Student3"+addStudent(s3));
    }
}

