package pe.edu.upc.reservesonic.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.reservesonic.dao.IRegionDao;
import pe.edu.upc.reservesonic.models.entities.Region;
import pe.edu.upc.reservesonic.service.IRegionService;

public class RegionServiceImpl implements IRegionService{

	@Inject
	private IRegionDao rD;
	
	@Override
	public void insert(Region region) {
		// TODO Auto-generated method stub
		rD.insert(region);
	}

	@Override
	public List<Region> list() {
		// TODO Auto-generated method stub
		return rD.list();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		rD.delete(id);
	}

}
