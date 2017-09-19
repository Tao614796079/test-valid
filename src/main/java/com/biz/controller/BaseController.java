package com.biz.controller;

import com.biz.editor.NumberPropertyEditor;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;

/**
 * BaseController
 *
 * @author zhangtao
 * @date 2017年09月19日
 * @reviewer
 * @see
 */
public class BaseController {

    /***
     * 参数绑定异常统一处理
     * @param e
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @ExceptionHandler(BindException.class)
    public void validExceptionHandler(BindException e, WebRequest request, HttpServletResponse response) throws IOException {
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        Map<String, String> map = fieldErrors.stream().collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(map);
        response.flushBuffer();
    }
    /**
     * 注册参数编辑器
     * @param binder
     */
    @InitBinder//必须有参数WebDataBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Integer.class, new NumberPropertyEditor());
    }
}
