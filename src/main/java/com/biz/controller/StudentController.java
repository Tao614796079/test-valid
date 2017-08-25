package com.biz.controller;

import com.biz.vo.BaseRespVO;
import com.biz.vo.StudentReqVO;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * StudentController
 *
 * @author zhangtao
 * @date 2017年08月11日
 * @reviewer
 * @see
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "toAdd")
    public String toAdd() {
        return "add";
    }

    @ResponseBody
    @PostMapping(value = "/add")
    public BaseRespVO add(@Valid StudentReqVO student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new BaseRespVO(400, bindingResult.getFieldError().getDefaultMessage());
        } else {
            //do something...
            return new BaseRespVO();
        }
    }

    @InitBinder//必须有参数WebDataBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Integer.class, new NumberPropertyEditor());
    }
}
