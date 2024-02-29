package Shopping_Mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Order
{
    private Integer or_id;
    private String order_productname;
    private String order_custname;
    private int order_phno;
    private Float order_payment;
    private String order_addr;
    
    
    
	public Order() 
	{
		super();
	}
	public Order(Integer or_id, String or_productname, String or_custname, int or_phno, Float or_payment,
			String or_addr) {
		super();
		this.or_id = or_id;
		this.order_productname = or_productname;
		this.order_custname = or_custname;
		this.order_phno = or_phno;
		this.order_payment = or_payment;
		this.order_addr = or_addr;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getOr_id() {
		return or_id;
	}
	public void setOr_id(Integer or_id) {
		this.or_id = or_id;
	}
	public String getOr_productname() {
		return order_productname;
	}
	public void setOr_productname(String or_productname) {
		this.order_productname = or_productname;
	}
	public String getOr_custname() {
		return order_custname;
	}
	public void setOr_custname(String or_custname) {
		this.order_custname = or_custname;
	}
	public int getOr_phno() {
		return order_phno;
	}
	public void setOr_phno(int or_phno) {
		this.order_phno = or_phno;
	}
	public Float getOr_payment() {
		return order_payment;
	}
	public void setOr_payment(Float or_payment) {
		this.order_payment = or_payment;
	}
	public String getOr_addr() {
		return order_addr;
	}
	public void setOr_addr(String or_addr) {
		this.order_addr = or_addr;
	}
	@Override
	public String toString() {
		return "Order [or_id=" + or_id + ", or_productname=" + order_productname + ", or_custname=" + order_custname
				+ ", or_phno=" + order_phno + ", or_payment=" + order_payment + ", or_addr=" + order_addr + "]";
	}
    
    
}
