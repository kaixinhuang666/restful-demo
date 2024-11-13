package com.hkx.rest.restfuldemo.controller;

import com.hkx.rest.restfuldemo.domain.Employee;
import com.hkx.rest.restfuldemo.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

//员工对外接口声明
//员工控制层

//@Controller
public class _bak {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "ok";
    }


//    路径、方法、参数、响应

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> list(){
        //        没有真实链接数据库
        List<Employee> list = Arrays.asList(new Employee(1L, "Bauer", 18), new Employee(2L, "Jack", 19));
        return list;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    @ResponseBody
    public Employee save( Employee employee) {
        employee.setId(1L);
        return employee;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.PUT)
    @ResponseBody
    public Employee update( Employee employee) {
        employee.setName(employee.getName()+"_update");
        return employee;
    }

    @RequestMapping(value = "/employees", method = RequestMethod.DELETE)
    @ResponseBody
    public static JsonResult delete(Long id) {
        return JsonResult.success();
    }

    @RequestMapping(value = "/employees/{id}/{name}/{age}", method = RequestMethod.GET)
    @ResponseBody
    public Employee info(Employee employee){
        //        没有真实链接数据库
        return employee;
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee info(Long id){
        //        没有真实链接数据库
        Employee employee = new Employee(1L, "jack", 18);
        return employee;
    }
}

