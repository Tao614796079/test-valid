//package com.biz.advice;
//
//import com.biz.editor.NumberPropertyEditor;
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;
//import org.springframework.validation.BindException;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.context.request.WebRequest;
//
///**
// * ValidateControllerAdvice
// *
// * @author zhangtao
// * @date 2017年09月18日
// * @reviewer
// * @see
// */
//@ControllerAdvice
//public class ValidateControllerAdvice {
//    Logger logger = Logger.getLogger(ValidateControllerAdvice.class);
//
//    /**
//     * bean校验未通过异常
//     */
//    @ExceptionHandler(BindException.class)
//    public Map<String,String> validExceptionHandler(BindException e, WebRequest request, HttpServletResponse response) throws IOException {
//        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
//        Map<String, String> map = fieldErrors.stream().collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
//        response.setContentType("text/html;charset=UTF-8");
//        response.getWriter().println(map);
//        response.flushBuffer();
//        return map;
//    }
//
//    @InitBinder//必须有参数WebDataBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(Integer.class, new NumberPropertyEditor());
//    }
//
//}
