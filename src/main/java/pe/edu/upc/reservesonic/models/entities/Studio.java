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
@Table(name = "Studios")
public class Studio {
	@Id
	@Column(name = "studio_id", length = 2, nullable = false)
	private String id;

	@Column(name = "name", length = 40)
	private String name;
	
	//OneToMany relationships
	@OneToMany(mappedBy = "studio")
	private List<Room> rooms;
	
	@OneToMany(mappedBy = "studio")
	private List<Review> reviews;
	
	//ManyToOne relationships
	@ManyToOne
	@JoinColumn(name = "district_id")
	private District district;
	
	@ManyToOne
	@JoinColumn(name = "reservation_id")
	private Reservation reservation;
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;
	
	//Constructor, getters & setters
	public Studio() {
		rooms = new ArrayList<Room>();
		reviews = new ArrayList<Review>();
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

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
