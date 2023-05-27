package com.erickvasquez.documentos.models.dtos.users;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterUserDTO {

	@NotBlank(message = "Username is required")
	private String username;
	
	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message = "Password code is required")
	private String password;
}
