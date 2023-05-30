package com.erickvasquez.documentos.models.dtos.songxplaylist;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveSongXPlaylistDTO {
	@NotBlank(message = "playlist code is required")
	private String playlistCode;
	
	@NotBlank(message = "Song code is required")
	private String songCode;
}
