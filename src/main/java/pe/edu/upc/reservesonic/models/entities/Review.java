package pe.edu.upc.reservesonic.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Reviews")
public class Review {
	@Id
	@Column(name = "review_id", length = 5, nullable = false)
	private String id;
	
	@Column(name = "content", length = 50, nullable = false)
	private String name;
	
	//ManyToOne relathionships
	@ManyToOne
	@JoinColumn(name = "studio_id", nullable = false)
	private Studio studio;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
}
