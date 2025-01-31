package datn.udpm.entity;


import java.io.Serializable;
import java.util.Date;
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
@Table(name="discount_product")
public class DiscountProduct implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@Column(name="name")
	private String name ;
	
	@Column(name="code")
	private String code ;
	
	
	@Column(name = "quantity")
	private Integer quantity ;
	
	@Column(name="apply_day")
	private Date applyDay ;
	
	@Column(name="expiration")
	private Date expiration ;
	
	@Column(name="money_limit")
	private Double moneyLimit ;
	
	@Column(name="create_day")
	private Date createDay ;
	
	
	@OneToMany(mappedBy = "discount")
	@JsonIgnore
	private List<Product> products ;
}
