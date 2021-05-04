package pe.edu.upc.reservesonic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.reservesonic.models.entities.Region;
import pe.edu.upc.reservesonic.service.IRegionService;

public class RegionController {
	@Inject
	private IRegionService rService;
	private Region region;
	List<Region> listRegions;
	
	@PostConstruct
	public void init() {
		this.region = new Region();
		this.listRegions = new ArrayList<Region>();
		this.list();
	}
	
	public String newRegion() {
		this.setRegion(new Region());
		return "region.xhtml";
	}
	
	public void insert() {
		try {

			rService.insert(region);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void list() {
		try {
			listRegions = rService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public void delete(Region re) {
		try {
			rService.delete(re.getId());
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	// get and set
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Region> getListRegions() {
		return listRegions;
	}

	public void setListRegions(List<Region> listRegions) {
		this.listRegions = listRegions;
	}
		
}
