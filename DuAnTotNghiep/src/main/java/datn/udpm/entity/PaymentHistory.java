package datn.udpm.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="payment_history")
public class PaymentHistory  implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@Column(name="payments")
	private String payment ;
	
	@Column(name="total_money")
	private Double totalMoney ;
	
	@Column(name="payment_date")
	@Temporal(TemporalType.DATE)
	private Date paymentDate ;
	
	@Column(name="status")
	private Integer status ;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order ;
}
