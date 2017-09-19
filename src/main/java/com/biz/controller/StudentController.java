package com.biz.controller;

import com.biz.vo.BaseRespVO;
import com.biz.vo.StudentReqVO;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
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
public class StudentController extends BaseController {

    @RequestMapping(value = "toAdd")
    public String toAdd() {
        return "add";
    }

    @ResponseBody
    @PostMapping(value = "/add")
    public BaseRespVO add(@Valid StudentReqVO student) {
        //TODO
        return new BaseRespVO();
    }

}
