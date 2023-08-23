package com.playlist;

public class MainPlaylist {
	 public static void main(String[] args) {
	        Playlist playlist = new Playlist();

	        playlist.addMusica("Música 1");
	        playlist.addMusica("Música 2");
	        playlist.addMusica("Música 3");

	        System.out.println("Lista de músicas na playlist:");
	        playlist.listarMusicas();

	        playlist.removeMusica("Música 2");
	        System.out.println("\nLista de músicas após remover a música 2:");
	        playlist.listarMusicas();
	    }
	}
