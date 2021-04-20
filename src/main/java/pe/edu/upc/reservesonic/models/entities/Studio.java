package pe.edu.upc.reservesonic.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Studios")

public class Studio {
@Id
	//Attributes declaration
	@Column(name = "studio_id", length = 2, nullable = false)
	private String id;

	@Column(name = "name", length = 40)
	private String name;
	
	//@OneToMany
	//@JoinColumn(name = "district_id")
	//private District district;
	
	//@OneToMany
	//@JoinColumn(name = "reservation_id")
	//private Reservation reservation;
	
	//@OneToOne
	//@JoinColumn(name = "admin_id")
	//private Admin admin;
	
	//@OneToMany(mappedBy = "admin")
	//@JoinColumn(name = "room_id")
	//private List<Room> rooms;
	
	//@OneToMany
	//@JoinColumn(name = "instrument_id")
	//private List<Instrument> instruments;
}
