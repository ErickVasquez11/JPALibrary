package com.erickvasquez.documentos.models.dtos.songs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveSongDTO {
	
	@NotBlank(message = "Title is required")
	private String title;
	
	@NotBlank(message = "Duration code is required")
	private int duration;
}
