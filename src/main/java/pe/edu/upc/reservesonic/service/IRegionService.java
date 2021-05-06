package pe.edu.upc.reservesonic.service;

import java.util.List;

import pe.edu.upc.reservesonic.models.entities.Region;

public interface IRegionService {
	
	public void insert(Region region);
	
	public List<Region> list();
	
	public void delete(String id);
	
}
