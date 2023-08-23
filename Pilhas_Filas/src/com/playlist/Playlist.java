package com.playlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
	private LinkedList<Musica> playlist;
	private ListIterator<Musica> iterator;

	public Playlist() {
		playlist = new LinkedList<>();
		iterator = playlist.listIterator();
	}

	public void addMusica(String nomeMusica) {
		Musica musica = new Musica(nomeMusica);
		iterator.add(musica);
	}

	public void removeMusica(String nomeMusica) {
		iterator = playlist.listIterator(); 
		while (iterator.hasNext()) {
			if (iterator.next().getNome().equals(nomeMusica)) {
				iterator.remove();
				break;
			}
		}
	}

	public void listarMusicas() {
		for (Musica musica : playlist) {
			System.out.println("Música: " + musica.getNome());
		}
	}
}
