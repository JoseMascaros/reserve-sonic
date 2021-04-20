package pe.edu.upc.reservesonic.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Rooms")
public class Room {
@Id
	//Attributes declaration
	@Column(name = "room_id", length = 5, nullable = false)
	private String id;

	@Column(name = "capacity", length = 2, nullable = false)
	private Integer capacity;
	
	//@ManyToOne
	//@JoinColumn(name = "studio_id")
	//private Studio studio;
	
	//@ManyToOne
	//@JoinColumn(name = "admin_id")
	//private Admin admin;
	
	//@OneToMany
	//@JoinColumn(name = "instrument_id")
	//private List<Instrument> instruments;
	
}