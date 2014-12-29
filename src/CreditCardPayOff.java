/*
* CreditCardPayOff.java
* Author: Shovik Shyamsundar
* Submission Date: 02/03/2012
*
* Purpose: The following code calculates months needed to pay off a credit card debt, total amount needed to be paid 
* and total interest needed to be paid based on a principal, annual interest rate and monthly payment.  The program
* prompts the user for the principal, annual interest rate and monthly payment.  The program then performs calculations
* in order to calculate the months needed to pay off the credit card debt, total amount needed to be paid and total 
* interest needed to be paid and saves the values in three different variables.  The program then prints a list of
* the calculated values.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course.
*/
import java.text.NumberFormat;
import java.util.Scanner;
public class CreditCardPayOff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal, annualInterestRate, monthlyPayment, months, totalAmountPaid, totalInterestPaid;
		NumberFormat  df = NumberFormat.getCurrencyInstance();/*df converts value into currency format*/
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your principal:");/*Prompts user to enter principal*/
		principal = keyboard.nextDouble();/*Assigns value user enters to principal*/
		System.out.println("Enter your annual interest rate as a percent value:");/*Prompts user to enter annual interest rate*/
		annualInterestRate = keyboard.nextDouble();/*Assigns value user enters to annualInterestRate*/
		System.out.println("Enter your monthly payment:");/*Prompts user to enter monthly payment*/
		monthlyPayment = keyboard.nextDouble();/*Assigns value user enters to monthly payment*/
		months = (Math.log(monthlyPayment)-(Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal)))/(Math.log((annualInterestRate/1200.0)+1.0));
		/*Sets the value calculated by formula to months, formula determines number of months needed to pay off debt*/
		months = Math.ceil(months);/*Assigns smallest double that is closer to smallest integer greater than or equal to months to months*/
		totalAmountPaid = months*monthlyPayment;
		totalInterestPaid = totalAmountPaid - principal;
		System.out.println("Months Needed To Pay Off:\t" + (int)months);/*Prints number of months needed to pay off credit card debt*/
		System.out.println("Total Amount Paid:\t\t" + df.format(totalAmountPaid));/*Prints total amount paid*/
		System.out.println("Total Interest Paid:\t\t" + df.format(totalInterestPaid));/*Prints total interest paid*/
	
	}

}
