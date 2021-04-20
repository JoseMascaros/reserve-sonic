package pe.edu.upc.reservesonic.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Studios")

public class Studio {
	@Id
	@Column(name = "studio_id", length = 2, nullable = false)
	private String id;

	@Column(name = "name", length = 40)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "district_id", nullable = false)
	private District district;
	
	@ManyToOne
	@JoinColumn(name = "reservation_id", nullable = false)
	private Reservation reservation;
	
	@ManyToOne
	@JoinColumn(name = "admin_id", nullable = false)
	private Admin admin;
	
	@OneToMany(mappedBy = "studio")
	private List<Room> rooms;
	
	@OneToMany(mappedBy = "studio")
	private List<Review> reviews;
}
