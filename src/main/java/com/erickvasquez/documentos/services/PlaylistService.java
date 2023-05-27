package com.erickvasquez.documentos.services;

import java.util.List;

import com.erickvasquez.documentos.models.dtos.playlists.SavePlayListDTO;
import com.erickvasquez.documentos.models.dtos.playlists.UpdatePlayListDTO;
import com.erickvasquez.documentos.models.entities.Song;

public interface PlaylistService {

	void save(SavePlayListDTO playlistinfo) throws Exception;
	void update(UpdatePlayListDTO playlistInfo) throws Exception;
	void deleteOneById(String code) throws Exception;
	Song findOneById(String code);
	List<Song> findAll();
}
