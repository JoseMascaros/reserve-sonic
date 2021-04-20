package pe.edu.upc.reservesonic.models.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sun.jdi.connect.Connector.BooleanArgument;

@Entity
@Table(name = "Reservations")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id",columnDefinition="NUMERIC(6)")
	private Integer id;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name = "hour")
	@Temporal(TemporalType.TIME)
	private Date hour;

	@Column(name="price", length=15, nullable=false)
	private Float price;
	
	@Column(name = "status", length = 35)
	private String status;
	
	//@ManyToOne
	//@JoinColumn(name = "user_id",nullable=false)
	//private User user;
	
	//@OneToMany(mappedBy = "reservation")
	//private List<Studio> studios;

}