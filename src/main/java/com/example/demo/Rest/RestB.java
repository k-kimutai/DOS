package com.example.demo.Rest;

import com.example.demo.feign.StudentFeign;
import com.example.demo.models.blindDate;
import com.example.demo.models.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestB implements CommandLineRunner {
    private  StudentFeign studentFeign;

    public RestB(StudentFeign studentFeign) {
        this.studentFeign = studentFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        student register_student = studentFeign.newStudent(new student("93938","Kelvin Kimutai"));
        System.out.println("Created the following: " + register_student);
        blindDate newBlind = studentFeign.newblindDate("FEMALE",Integer.toUnsignedLong(623));
    }
}
