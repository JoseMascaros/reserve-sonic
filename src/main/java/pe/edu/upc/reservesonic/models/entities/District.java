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
@Table(name = "districts")
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
	
	//Constructor, getters & setters
	public District() {
		users = new ArrayList<User>();
		admins = new ArrayList<Admin>();
		studios = new ArrayList<Studio>();
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	public List<Studio> getStudios() {
		return studios;
	}

	public void setStudios(List<Studio> studios) {
		this.studios = studios;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	
	
	
}

