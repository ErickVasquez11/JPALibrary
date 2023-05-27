package com.erickvasquez.documentos.models.dtos.users;

import jakarta.validation.constraints.NotBlank;

public class ChangePasswordDTO {

	@NotBlank(message = "Id is required")
	private String id;
	
	@NotBlank(message = "old password is required")
	private String password;
	
	@NotBlank(message = "new password code is required")
	private String newPassword;
}
