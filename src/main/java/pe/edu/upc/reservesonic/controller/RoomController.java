package pe.edu.upc.reservesonic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.reservesonic.models.entities.Room;
import pe.edu.upc.reservesonic.models.entities.Studio;
import pe.edu.upc.reservesonic.service.IRoomService;
import pe.edu.upc.reservesonic.service.IStudioService;

@Named
@RequestScoped
public class RoomController {
	
	@Inject
	private IRoomService rService;
	
	@Inject
	private IStudioService sService;
	
	private Room room;
	List<Room> roomList;
	List<Studio> studioList;
	
	//Constructor
	@PostConstruct
	public void init() {
		this.room = new Room();
		roomList = new ArrayList<Room>();
		studioList = new ArrayList<Studio>();
		
	}
	
	// Specialized Methods
	public String newRoom() {
		this.setRoom(new Room());
		return "room.xhtml";
	}
	
	public void insert() {
		try {
			rService.insert(room);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listRoom() {
		try {
			roomList = rService.list();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listStudio() {
		try {
			studioList = sService.list();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(Room room) {
		try {
			rService.delete(room.getId());
			this.listRoom();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Getters & Setters
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	public List<Studio> getStudioList() {
		return studioList;
	}

	public void setStudioList(List<Studio> studioList) {
		this.studioList = studioList;
	}
	
	
	
	
}
