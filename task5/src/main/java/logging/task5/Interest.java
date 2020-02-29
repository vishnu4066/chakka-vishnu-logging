package logging.task5;

public class Interest {
	public double simpleInterest(double principal,double time,double rateOfInterest){
        double simpleinterest = principal*time*rateOfInterest/100;
        return simpleinterest;
    }

    public double compoundInterest(double principal,double time,double rateOfInterest,double num){
        double amount = principal * Math.pow(1 + (rateOfInterest / num), num * time);
        double compoundinterest = amount - principal;
        return compoundinterest;
    }

}
