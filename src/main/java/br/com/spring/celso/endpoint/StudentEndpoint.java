package br.com.spring.celso.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.celso.model.Student;
import br.com.spring.celso.util.DateUtil;

/**
 * Created by Celso Bueno, 28/01/2020.
 */

@RestController
@RequestMapping("students")
public class StudentEndpoint {

    @Autowired
     private DateUtil dateUtil;
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll() {
        System.out.println(" data:" + dateUtil);
        // return asList()(new Student(name: "Celso"), new Student(name: "Bueno"), new Student(name: "Texeira"));


        return null;
    }

}
