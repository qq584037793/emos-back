package com.example.emos.api.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@Schema(description = "add user")
public class InsertUserForm {
    @NotBlank(message = "username cannot be empty")
    @Schema(description = "username")
    private String username;

    @NotBlank(message = "password cannot be empty")
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$",message = "password is incorrect")
    @Schema(description = "username")
    private String password;

    @NotBlank(message = "name cannot be empty")
    @Schema(description = "name")
    private String name;

    @NotBlank(message = "sex cannot be empty")
    @Pattern(regexp = "^男$|^女$",message="sex is incorrect")
    @Schema(description = "sex")
    private String sex;

    @NotBlank(message = "tel cannot be empty")
    @Schema(description = "tel")
    private String tel;

    @NotBlank(message = "email cannot be empty")
    @Email(message = "email is incorrect")
    @Schema(description = "email")
    private String email;

    @NotBlank(message = "hireDate is cannot be empty")
    @Pattern(regexp = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$", message = "hireDate is incorrect")
    @Schema(description = "入职日期")
    private String hiredate;


    @NotEmpty(message = "role is cannot be empty")
    @Schema(description = "role")
    private Integer[] role;

    @NotNull(message = "deptId is cannot be empty")
    @Min(value = 1, message = "deptId not lesser than 1")
    @Schema(description = "dept")
    private Integer deptId;


}
