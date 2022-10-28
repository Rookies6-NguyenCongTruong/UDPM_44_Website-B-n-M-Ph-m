package datn.udpm.entity;

import java.io.Serializable;
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Table(name="products")
public class Product  implements Serializable{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@Column(name="name")
	private String name ;
	
	@Column(name="description")
	private String description ;
	
	@Column(name="picture1")
	private String picture1 ;
	
	@Column(name="picture2")
	private String picture2 ;
	
	@Column(name="create_date")
	private Date createDate ;
	
	@Column(name="available")
	private Integer available ;
	
	@Column(name="expire_date")
	private Date expireDate ;
	
	@OneToMany(mappedBy = "product")
	private List<Favourite> favourities ;
	
	@ManyToOne
	@JoinColumn(name = "sup_id")
	private Supplier supplier ;
	
	@ManyToOne
	@JoinColumn(name = "supcategory_id")
	private SubCategory subCategory ;
	
	@ManyToOne
	@JoinColumn(name = "capacity_id")
	private Capacity capacity ;
	
	@ManyToOne
	@JoinColumn(name = "discount_id")
	private DiscountProduct discount ;
	
	
	@OneToMany(mappedBy = "product")
	private List<OrderDetail> orderDetails ;
}
