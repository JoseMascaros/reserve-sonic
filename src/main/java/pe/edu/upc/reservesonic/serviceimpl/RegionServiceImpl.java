package pe.edu.upc.reservesonic.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.reservesonic.dao.IRegionDao;
import pe.edu.upc.reservesonic.models.entities.Region;
import pe.edu.upc.reservesonic.service.IRegionService;

@Named
@RequestScoped
public class RegionServiceImpl implements IRegionService{

	@Inject
	private IRegionDao rD;
	
	@Override
	public void insert(Region region) {
		rD.insert(region);
	}

	@Override
	public List<Region> list() {
		return rD.list();
	}

	@Override
	public void delete(String id) {
		rD.delete(id);
	}

}
