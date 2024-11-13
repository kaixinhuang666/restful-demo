package com.hkx.rest.restfuldemo.controller;

import com.hkx.rest.restfuldemo.domain.Employee;
import com.hkx.rest.restfuldemo.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//员工对外接口声明
//员工控制层
@RestController  // = @controller + responseBody
//@Controller
@RequestMapping("employees")
public class EmployeeController {

//    @RequestMapping("/hello")
////    @ResponseBody
//    public String hello() {
//        return "ok";
//    }


//    路径、方法、参数、响应

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping()
//    @ResponseBody
    public List<Employee> list(){
        //        没有真实链接数据库
        List<Employee> list = Arrays.asList(new Employee(1L, "Bauer", 18), new Employee(2L, "Jack", 19));
        return list;
    }

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping()
//    @ResponseBody
    public Employee save( Employee employee) {
        employee.setId(1L);
        return employee;
    }

//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping()
//    @ResponseBody
    public Employee update( Employee employee) {
        employee.setName(employee.getName()+"_update");
        return employee;
    }

//    @RequestMapping(method = RequestMethod.DELETE)
    @DeleteMapping()
//    @ResponseBody
    public static JsonResult delete(Long id) {
        return JsonResult.success();
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
//    @ResponseBody
    public Employee info(Long id){
        //        没有真实链接数据库
        Employee employee = new Employee(id, "jack", 18);
        return employee;
    }
}

