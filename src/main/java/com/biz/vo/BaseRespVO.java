package com.biz.vo;

import java.io.Serializable;

/**
 * BaseRespVO
 *
 * @author zhangtao
 * @date 2017年08月08日
 * @reviewer
 * @see
 */
public class BaseRespVO implements Serializable {

    private static final long serialVersionUID = 8560606988776522818L;

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 信息
     */
    private String code_msg;

    public BaseRespVO() {
        this.code=200;
        this.code_msg="操作成功";
    }

    public BaseRespVO(Integer code, String code_msg) {
        this.code = code;
        this.code_msg = code_msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCode_msg() {
        return code_msg;
    }

    public void setCode_msg(String code_msg) {
        this.code_msg = code_msg;
    }
}
