package br.com.spring.celso.endpoint;

import br.com.spring.celso.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Celso Bueno, 28/01/2020
 */

@RestController
@RequestMapping("student")
public class StudentEndpoint {


    @RequestMapping(method = RequestMethod.GET,path="/list")
    public List<Student> listAll() {
         return asList (new Student(name: "Celso")new Student(name: "Bueno"))    ;


    }
}
