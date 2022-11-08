package datn.udpm.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="suppliers")
public class Supplier implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@Column(name="name")
	private String name ;
	
	@Column(name="company_name")
	private String companyName ;
	
	@Column(name="logo")
	private String logo ;
	
	@Column(name="web_url")
	private String webUrl ;
	
	@Column(name="product_type")
	private String productType ;
	
	@Column(name="person_contact")
	private String personContact ;
	
	@Column(name="address1")
	private String address1 ;
	
	@Column(name="address2")
	private String address2 ;
	
	@Column(name="city")
	private String city ;
	
	@Column(name="country")
	private String country ;
	
	@Column(name="postal_code")
	private String postalCode ;
	
	@Column(name="telephone")
	private String telephone ;
	
	@Column(name="email")
	private String email ;
	
	
	@OneToMany(mappedBy = "supplier")
	@JsonIgnore
	private List<Product> products ;
}
