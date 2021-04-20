package pe.edu.upc.reservesonic.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users")

public class User {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id",columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@Column(name = "name", length = 30, nullable = false)
	private String username;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "password", length = 60, nullable = false)
	private String password;
	
	@Column(name = "description", length = 70, nullable = false)
	private String description;
	
	//@ManyToOne
	//@JoinColumn(name = "district_id",nullable = false)
	//private District district;
	
	//@OneToMany(mappedBy = "user")
	//private List<Reservation>reservation;

}