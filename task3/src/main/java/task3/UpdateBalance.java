package task3;

import java.util.Scanner;


public class UpdateBalance {
   public static void main(String[] args) {
	   AccountDao dao=new AccountDaoImp();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("1.deposite amount");
	   System.out.println("2.withdrawl amount");
	   System.out.println("enter your choice");
	   int choice=sc.nextInt();
	   switch (choice) {
	case 1:{
		System.out.println("enter account id");
		   int ac=sc.nextInt();
		   
		   boolean f=dao.depositAmount(ac);
		   System.out.println(f);
		   System.out.println("Deposite amount sucessfully");
		break;
	}
	case 2:{
		System.out.println("enter account id");
		   int ac1=sc.nextInt();
		   
		   boolean fa=dao.withdrawlAmount(ac1);
		   System.out.println(fa);
		   break;
	}
	default:
		break;
	}
   }}