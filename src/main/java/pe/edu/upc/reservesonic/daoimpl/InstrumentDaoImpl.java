package pe.edu.upc.reservesonic.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.reservesonic.dao.IInstrumentDao;
import pe.edu.upc.reservesonic.models.entities.Instrument;

public class InstrumentDaoImpl implements IInstrumentDao {

	@PersistenceContext(unitName = "reserve-sonicPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Instrument instrument) {
		try {
			em.persist(instrument);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Instrument> list() {
		List<Instrument> list = new ArrayList<Instrument>();

		try {
			Query q = em.createQuery("FROM Instrument i");
			list = (List<Instrument>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return list;
	}

	@Transactional
	@Override
	public void delete(Integer id) {
		Instrument instrument = new Instrument();

		try {
			instrument = em.getReference(Instrument.class, id);
			em.remove(instrument);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
