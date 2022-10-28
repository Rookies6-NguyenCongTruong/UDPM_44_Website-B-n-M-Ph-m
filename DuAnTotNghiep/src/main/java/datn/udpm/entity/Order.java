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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orders")
public class Order implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@Column(name="address")
	private String address ;
	
	@Column(name="create_date")
	@Temporal(TemporalType.DATE)
	private Date createDate ;
	
	@Column(name="phone")
	private String phone ;
	
	@Column(name="status")
	private Integer status ;
	
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account accountOrder ;
	
	
	@ManyToOne
	@JoinColumn(name="voucher_id")
	private Voucher voucher ;
	
	@ManyToOne
	@JoinColumn(name="payment_id")
	private Payment payment ;
	
	@OneToMany(mappedBy = "order")
	private List<OrderDetail> orderDetails ;
	
	@OneToMany(mappedBy = "order")
	private List<PaymentHistory> paymentHistories ;
}
