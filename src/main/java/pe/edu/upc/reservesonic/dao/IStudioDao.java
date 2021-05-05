package pe.edu.upc.reservesonic.dao;

import java.util.List;

import pe.edu.upc.reservesonic.models.entities.Studio;

public interface IStudioDao {
	
	public void insert(Studio studio);
	
	public List<Studio> list();
	
	public void delete(String id);
}
