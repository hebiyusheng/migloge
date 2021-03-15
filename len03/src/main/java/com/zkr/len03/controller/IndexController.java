package com.zkr.len03.controller;

import com.zkr.len03.mapper.StudentMapper;
import com.zkr.len03.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/15 - 13:41
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class IndexController {

    @Autowired
    private StudentMapper studentMapper;



    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }

    /**
     * 学生列表获取
     * @param model
     * @return
     */
    @GetMapping("/getstudent")
    public String getStudent(Model model){
        List<Student> students = studentMapper.selectList(null);
        model.addAttribute("student",students);
        return "list";
    }

    /**
     * 删除
     * @param stuid
     * @return
     */
    @Transactional
    @GetMapping("/delstudent/{stuid}")
    public String delstudent(@PathVariable("stuid") Integer stuid){
        System.out.println(stuid);
        studentMapper.deleteById(stuid);
        return "redirect:/getstudent";
    }

    /**
     * 添加学生
     */
    @Transactional
    @PostMapping("/insertstu")
    public String addUser(Student student) {
        int insert = studentMapper.insert(student);
        return "redirect:/getstudent";
    }

    /**
     * 修改学生
     */
    @Transactional
    @PostMapping("/updatestu")
    public String updateStu(Student student) {
        studentMapper.updateById(student);
        return "redirect:/getstudent";
    }

}
