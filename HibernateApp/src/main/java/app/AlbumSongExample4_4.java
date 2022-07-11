package app;

import java.util.List;

import dao.AlbumSongDao4_5;
import entity.Song4_2;

public class AlbumSongExample4_4 {

	public static void main(String[] args) {
		//GenericDao dao = new GenericDao();
		AlbumSongDao4_5 dao = new AlbumSongDao4_5();
		
		//adding an album
		/*Album album = new Album();
		album.setName("Hits of 2020");
		album.setReleaseDate(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		dao.save(album);*/
		
		//adding song to an album
		/*Album album = (Album) dao.fetchById(Album.class, 2);
		Song song = new Song();
		song.setTitle("stu");
		song.setArtist("Ed Sheeran");
		song.setDuration(3.15);
		song.setAlbum(album);
		dao.save(song);*/
		
		/*List<Song> songs = dao.fetchSongsSungBy("Taylor Swift");
		for(Song song : songs)
			System.out.println(song.getTitle() + " " + song.getDuration()); */
		
		dao.delete(Song4_2.class, 8);
	}
}
