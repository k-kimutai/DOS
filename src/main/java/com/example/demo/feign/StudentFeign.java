package com.example.demo.feign;

import com.example.demo.FeignConfig;
import com.example.demo.models.blindDate;
import com.example.demo.models.student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "students", url ="http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface StudentFeign {
    @RequestMapping(method = RequestMethod.POST, value = "students" )
    student newStudent(@RequestBody student Student);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    blindDate newblindDate(@PathVariable(name = "matches") String gender,@RequestParam(name = "studentId") Long studentId);
}
