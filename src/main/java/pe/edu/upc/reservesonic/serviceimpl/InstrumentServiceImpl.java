package pe.edu.upc.reservesonic.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.reservesonic.dao.IInstrumentDao;
import pe.edu.upc.reservesonic.models.entities.Instrument;
import pe.edu.upc.reservesonic.service.IInstrumentService;

@Named
@RequestScoped
public class InstrumentServiceImpl implements IInstrumentService {
	
	@Inject
	private IInstrumentDao iDao;
	
	@Override
	public void insert(Instrument instrument) {
		iDao.insert(instrument);
	}

	@Override
	public List<Instrument> list() {
		return iDao.list();
	}

	@Override
	public void delete(Integer id) {
		iDao.delete(id);
	}

}
