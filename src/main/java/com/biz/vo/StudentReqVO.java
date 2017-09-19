package com.biz.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 * StudentReqVO
 *
 * @author zhangtao
 * @date 2017年08月23日
 * @reviewer
 * @see
 */
public class StudentReqVO {

    @NotBlank
    private String name;

    @NotNull(message = "年龄不能为空且为正整数")
    @Min(value = 0,message = "年龄不能为空且为正整数")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentReqVO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
