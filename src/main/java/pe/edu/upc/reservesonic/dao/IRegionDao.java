package pe.edu.upc.reservesonic.dao;

import java.util.List;

import pe.edu.upc.reservesonic.models.entities.Region;

public interface IRegionDao {
	public void insert(Region region);
	
	public List<Region> list();
	
	public void delete(String id);
}
