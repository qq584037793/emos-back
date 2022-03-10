package com.example.emos.api.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Schema(description = "查询分页数据")
public class SearchByPageForm {
    @NotNull(message = "page cannot be  empty")
    @Min(value = 1,message = "page不能少于1")
    @Schema(description = "页数")
    private Integer page;

    @NotNull(message = "length cannot be empty")
    @Range(min = 10, max =50,message="length between 10 and 50")
    @Schema(description = "每页记录数")
    private Integer length;


    @Schema(description = "user")
    private String user;

    @Pattern(regexp = "^男$|^女$",message="sex is incorrect")
    @Schema(description = "sex")
    private String sex;


    @Schema(description = "role")
    private String role;

    @Min(value = 1,message="dept不能少于1")
    private Integer deptId;

    @Min(value = 1,message="status不能少于1")
    private Integer status;

}
