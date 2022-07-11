package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import entity.Customer;
import entity.Song4_2;

public class AlbumSongDao4_5 extends GenericDao4_3 {

	public List<Song4_2> fetchSongsSungBy(String artist) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select s from Song s where s.artist = :artist");
			q.setParameter("artist", artist);
			List<Song4_2> list = q.getResultList();
			return list;
		}
		finally {
			emf.close();
		}
	}

}
