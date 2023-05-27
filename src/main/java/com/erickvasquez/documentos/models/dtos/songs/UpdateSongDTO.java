package com.erickvasquez.documentos.models.dtos.songs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateSongDTO {

	@NotBlank(message = "Code is required")
	private String code;
	
	@NotBlank(message = "Name code is required")
	private String name;
	
	@NotBlank(message = "Duration code is required")
	private int duration;
}
