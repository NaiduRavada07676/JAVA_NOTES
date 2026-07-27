package com.example.jbdl95minor1.controllers;

import com.example.jbdl95minor1.dtos.*;
import com.example.jbdl95minor1.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

//    @PostMapping("/create2")
//    public DummyResponse createWithList(@RequestBody CreateStudentRequest createStudentRequest,
//                                        @RequestParam(value = "book-list",required = false,defaultValue = "false")
//                                                Boolean bookList){
//        return this.studentService.createWithList(createStudentRequest.toStudent(),bookList);
//    }


    @PostMapping("/create")
    public CreateStudentResponse create(@Valid @RequestBody CreateStudentRequest createStudentRequest){
        return this.studentService.create(createStudentRequest.toStudent());
    }


    @GetMapping("/get")
    public GetStudentResponse get(@RequestParam Integer id){
        return this.studentService.getStudent(id);
    }

    @PutMapping("/update")
    public GetStudentResponse update(@RequestBody UpdateStudentRequest updateStudentRequest,
                                     @RequestParam Integer id){

        return this.studentService.update(updateStudentRequest.toStudent(),id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id){
        this.studentService.delete(id);
    }

}
