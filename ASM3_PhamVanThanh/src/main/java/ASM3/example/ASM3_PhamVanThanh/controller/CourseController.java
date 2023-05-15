package ASM3.example.ASM3_PhamVanThanh.controller;

import ASM3.example.ASM3_PhamVanThanh.model.Course;
import ASM3.example.ASM3_PhamVanThanh.model.Enrollment;
import ASM3.example.ASM3_PhamVanThanh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("course",new Course());
        return "create";
    }

    @PostMapping("/create")
    public String create(Course newSourse, Model model){
        courseService.add(newSourse);
        return "redirect:/home";
    }



}
