package ASM3.example.ASM3_PhamVanThanh.service;

import ASM3.example.ASM3_PhamVanThanh.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private List<Course> listCourse = new ArrayList<>();

    public void add(Course newProduct) {
        listCourse.add(newProduct);
    }

    public List<Course> GetAll() {return listCourse;}


}
