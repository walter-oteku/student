package com.student.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<student>> response = restTemplate.exchange(
                "http://10.51.44.185:8080/universities",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<student>>(){});
        List<student> student = response.getBody();

        for(student student: student){
            System.out.println(student.toString());
        }

        System.err.println("Find One(GET)--------------------------------");

        student student1= restTemplate.getForObject(
                "http://10.51.10.111:1000/universities/6",
                student.class);
        System.out.println(student.toString());

        System.err.println("Creating(POST)______________________________");

        student newstudent = new student("Elphas", 1234);
        student createStudent = restTemplate.postForObject(
                "http://10.51.10.111:1000/registration",
                newstudent, student.class);
        System.out.println(createdstudent.toString());

        System.err.println("____________________________________");
        String createCourseUrl = "http://10.51.10.111:1000/registration/"
                +createdstudent.getId()+"/details";


    }
}
