package pe.edu.upc.reservesonic.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.reservesonic.dao.IStudioDao;
import pe.edu.upc.reservesonic.models.entities.Studio;

public class StudioDaoImpl implements IStudioDao {
	
	@PersistenceContext(unitName = "reserve-sonicPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Studio studio) {
		try {
			em.persist(studio);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Studio> list() {
		List<Studio> list = new ArrayList<Studio>();
		try {
			Query q = em.createQuery("FROM Studio s") ;
			list = (List<Studio>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public void delete(Integer id) {
		Studio stu = new Studio();
		try {
			stu = em.getReference(Studio.class, id);
			em.remove(stu);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
