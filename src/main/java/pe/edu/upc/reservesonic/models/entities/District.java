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
@Table(name = "Districts")
public class District {
	@Id
	@Column(name = "district_id", length = 5, nullable = false)
	private String id;
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	
	//OneToMany relationships
	@OneToMany(mappedBy = "district")
	private List<User> users;
	
	@OneToMany(mappedBy = "district")
	private List<Admin> admins;
	
	@OneToMany(mappedBy = "district")
	private List<Studio> studios;
	
	//ManyToOne relationships
	@ManyToOne
	@JoinColumn(name = "region_id", nullable = false)
	private Region region;
	
	
}

