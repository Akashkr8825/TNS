package task3;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByAccount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your account Number");
	long accountNumber=sc.nextLong();
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Query q=manager.createNamedQuery("findByAccountNumber");
	q.setParameter(2, accountNumber);
	List<Bank> bank=q.getResultList();
	for(Bank b:bank) {
		System.out.println(b);
	}
}
}
