package pe.edu.upc.reservesonic.dao;

import java.util.List;

import pe.edu.upc.reservesonic.models.entities.Instrument;

public interface IInstrumentDao {
	
	public void insert(Instrument instrument);
	
	public List<Instrument> list();
	
	public void delete(Integer id);
}
