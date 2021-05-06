package pe.edu.upc.reservesonic.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
	@Id
	@Column(name = "room_id")
	private Integer id;

	@Column(name = "capacity", length = 2, nullable = false)
	private Integer capacity;
	
	//OneToMany relationships
	@OneToMany(mappedBy = "room")
	private List<Instrument> instruments;

	//ManyToOne relationships
	@ManyToOne
	@JoinColumn(name = "studio_id")
	private Studio studio;
	
	//Constructor, getters & setters
	public Room() {
		super();
//		instruments = new ArrayList<Instrument>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	public Studio getStudio() {
		return studio;
	}

	public void setStudio(Studio studio) {
		this.studio = studio;
	}
	
	
}