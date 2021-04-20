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
@Table(name = "Admins")
public class Admin {
	@Id
	@Column(name = "admin_id", length = 4, nullable = false)
	private String id;
	
	@Column(name = "admin_name", length = 50, nullable = false)
	private String name;

	@Column(name= "admin_email", length = 25, nullable = false)
	private String email;

	@Column(name = "admin_description", length = 60)
	private String description;

	//@ManyToOne
	//@JoinColumn(name = "district_id", nullable = false)
	//private District district;

	//@OneToMany(mappedBy = "studio", fetch = FetchType.LAZY)
	//private List<Studio> studios;
}
