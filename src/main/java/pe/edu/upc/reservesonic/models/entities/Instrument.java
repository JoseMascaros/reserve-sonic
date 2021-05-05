package pe.edu.upc.reservesonic.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instruments")
public class Instrument {
	@Id
	@Column(name = "instrument_id", length = 5, nullable = false)
	private String id;

	@Column(name = "name", length = 20, nullable = false)
	private String name;
	
	@Column(name = "brand", length = 20, nullable = false)
	private String brand;
	
	@Column(name = "description", length = 120, nullable = false)
	private String description;
	
	//ManyToOne relationships
	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	private Room room;
	
	//Constructor, getters & setters
	public Instrument() {
		//To do
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
}