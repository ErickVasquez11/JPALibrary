package com.erickvasquez.documentos.models.dtos.songxplaylist;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveSongXPlaylistDTO {

	@NotBlank(message = "song code is required")
	private String date_added;
	
	@NotBlank(message = "playlist code is required")
	private String playlist_code;
	
	@NotBlank(message = "Song code is required")
	private String song_code;
}
