package pe.edu.upc.reservesonic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.reservesonic.models.entities.Instrument;
import pe.edu.upc.reservesonic.models.entities.Room;
import pe.edu.upc.reservesonic.service.IInstrumentService;
import pe.edu.upc.reservesonic.service.IRoomService;

@Named
@RequestScoped
public class InstrumentController {

	@Inject
	private IInstrumentService iService;

	@Inject
	private IRoomService rService;

	private Instrument instrument;
	List<Instrument> instrumentList;
	List<Room> roomList;

	// Constructor
	@PostConstruct
	public void init() {
		this.instrument = new Instrument();
		instrumentList = new ArrayList<Instrument>();
		roomList = new ArrayList<Room>();
		this.listInstrument();
		this.listRoom();
	}

	// Specialized Methods
	public void insert() {
		try {
			iService.insert(instrument);
			this.listInstrument();
			this.instrument = new Instrument();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listRoom() {
		try {
			roomList = rService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listInstrument() {
		try {
			instrumentList = iService.list();
		} catch (Exception e) {
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

	// Getters & Setters
	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public List<Instrument> getInstrumentList() {
		return instrumentList;
	}

	public void setInstrumentList(List<Instrument> instrumentList) {
		this.instrumentList = instrumentList;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setStudioList(List<Room> roomList) {
		this.roomList = roomList;
	}

}
