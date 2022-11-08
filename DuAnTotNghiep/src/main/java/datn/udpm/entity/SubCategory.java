package datn.udpm.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="sub_categories")
public class SubCategory implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@Column(name="name")
	private String name ; 
	
	@Column(name="description")
	private String description ;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category ;
	
	@OneToMany(mappedBy = "subCategory",fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Product> products ;
}
