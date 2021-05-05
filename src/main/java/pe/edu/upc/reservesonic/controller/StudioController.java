package pe.edu.upc.reservesonic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.reservesonic.models.entities.Room;
import pe.edu.upc.reservesonic.models.entities.Studio;
import pe.edu.upc.reservesonic.service.IStudioService;

@Named
@RequestScoped
public class StudioController {
	@Inject
	private IStudioService sService;
	
	private Studio studio;
	List<Studio> studioList;
	
	@PostConstruct
	public void init() {
		this.studio = new Studio();
		this.studioList = new ArrayList<Studio>();
		this.list();
	}
	
	/*
	 * public String newStudio() { this.setStudio(new Studio()); return
	 * "Studio.xhtml"; }
	 */
	
	public void insert() {
		try {
			sService.insert(studio);
			this.list();
			this.studio = new Studio();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void list() {
		try {
			studioList = sService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(Studio stu) {
		try {
			sService.delete(stu.getId());
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Getters & Setters
	public Studio getStudio() {
		return studio;
	}

	public void setStudio(Studio studio) {
		this.studio = studio;
	}

	public List<Studio> getStudioList() {
		return studioList;
	}

	public void setStudioList(List<Studio> studioList) {
		this.studioList = studioList;
	}
	
	
	
}
