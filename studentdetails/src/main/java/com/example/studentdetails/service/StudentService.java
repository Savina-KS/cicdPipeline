package com.example.studentdetails.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentdetails.entity.Student;

@Service
public class StudentService {
	
    
    private List<Student> st = new ArrayList<>(Arrays.asList(
    		new Student(1, "Sam", "ECE"),
    		new Student(2, "Anu", "CSE"),
    		new Student(3, "Ganesh", "EEE")

    		));



    public Student getById(int id){
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getId() == (id)) {
                return st.get(i);
            }
        }
		return null;

}

    public List<Student> getAll() {
        return st;
    }
	
}
