package pe.edu.upc.reservesonic.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Districts")
public class District {
	@Id
	@Column(name = "district_id", length = 5, nullable = false)
	private String id;
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;

}

