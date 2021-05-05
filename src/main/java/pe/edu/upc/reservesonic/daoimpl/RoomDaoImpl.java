package pe.edu.upc.reservesonic.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.reservesonic.dao.IRoomDao;
import pe.edu.upc.reservesonic.models.entities.Room;

public class RoomDaoImpl implements IRoomDao {

	@PersistenceContext(unitName = "reserve-sonicPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Room room) {
		try {
			em.persist(room);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Room> list() {
		List<Room> list = new ArrayList<Room>();

		try {
			Query q = em.createQuery("FROM Room r");
			list = (List<Room>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}

	@Transactional
	@Override
	public void delete(String id) {
		Room room = new Room();

		try {
			room = em.getReference(Room.class, id);
			em.remove(room);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
