package com.example.emos.api.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Schema(description = "updatePasswordForm")
public class UpdatePasswordForm {
    @NotBlank(message = "password cannot be empty")
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$",message = "password is incorrect")
    @Schema(description = "username")
    private String password;
}

