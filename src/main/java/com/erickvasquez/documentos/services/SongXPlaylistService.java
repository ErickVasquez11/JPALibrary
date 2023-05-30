package com.erickvasquez.documentos.services;

import java.security.Timestamp;
import java.util.List;
import java.util.UUID;

import com.erickvasquez.documentos.models.entities.PlayList;
import com.erickvasquez.documentos.models.entities.Song;
import com.erickvasquez.documentos.models.entities.SongXPlaylist;

public interface SongXPlaylistService {
	void save(Song song, PlayList playlist) throws Exception;
	
	/*
	List<SongXPlaylist> findAll();
	SongXPlaylistService findOneById(UUID id);
	void delete (String insertion_code) throws Exception;
	*/
}
