package pe.edu.upc.reservesonic.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.reservesonic.dao.IRegionDao;
import pe.edu.upc.reservesonic.models.entities.Region;

public class RegionDaoImpl implements IRegionDao{
	
	@PersistenceContext(unitName = "reserve-sonicPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Region region) {
		try {
			em.persist(region);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Region> list() {
		List<Region> list = new ArrayList<Region>();
		try {
			Query q = em.createQuery("FROM Region r") ;
			list = (List<Region>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Transactional
	@Override
	public void delete(String id) {
		Region reg = new Region();
		try {
			reg = em.getReference(Region.class, id);
			em.remove(reg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}