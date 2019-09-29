package com.zxl.ctroller;

import com.zxl.admin.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxl16
 * @Date 2019/9/26.
 */
@Controller
public class ThymeleafCtroller {
    @RequestMapping("/")
    public String thymeleaf(Model model){
        Person person = new Person("李思雨",23);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("xx",11);
        Person p2 = new Person("yy",22);
        Person p3 = new Person("zz",33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson",person);
        model.addAttribute("people",people);
        return "index";
    }
}
