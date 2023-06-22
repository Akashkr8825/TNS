package task3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries(value= {@NamedQuery(name="findAll",query = "select b from Bank b"),
		@NamedQuery(name="findByAccountNumber",query = "select b from Bank b where b.AccNumber=?2")})
@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long AccNumber;
	private double balance;

	
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", AccNumber=" + AccNumber + ", balance=" + balance + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(long accNumber) {
		AccNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
