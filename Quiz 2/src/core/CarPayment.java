package core;

public class CarPayment {
double totalPriceOfCar, downPayment, interestRates;
int lengthOfLoan;
public double getTotalPriceOfCar() {
	return totalPriceOfCar;
}
public void setTotalPriceOfCar(double totalPriceOfCar) {
	this.totalPriceOfCar = totalPriceOfCar;
}
public double getDownPayment() {
	return downPayment;
}
public void setDownPayment(double downPayment) {
	this.downPayment = downPayment;
}
public double getInterestRates() {
	return interestRates;
}
public void setInterestRates(double interestRates) {
	this.interestRates = interestRates;
}
public int getLengthOfLoan() {
	return lengthOfLoan;
}
public void setLengthOfLoan(int lengthOfLoan) {
	this.lengthOfLoan = lengthOfLoan;
}
public CarPayment(double totalPriceOfCar, double downPayment, double interestRates, int lengthOfLoan) {
	super();
	this.totalPriceOfCar = totalPriceOfCar;
	this.downPayment = downPayment;
	this.interestRates = interestRates;
	this.lengthOfLoan = lengthOfLoan;
}
public double monthlyPayment() {
	double payment = (double) this.getDownPayment() * (((this.getInterestRates() / 12) * Math.pow((1 + (this.getInterestRates() / 12)), this.getLengthOfLoan())) / (Math.pow((1 + (this.getInterestRates() / 12)), this.getLengthOfLoan()) - 1));
	return payment;
}
public double totalInterestPaid() {
	double totalInterestPaid = (this.monthlyPayment() * this.getLengthOfLoan()) - this.getTotalPriceOfCar();
	return totalInterestPaid;
}

}
