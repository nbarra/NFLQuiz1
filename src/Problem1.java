import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double td;
		double yards;
		double interceptions;
		double comp;
		double att;
		double pr;

		//passer rating equation
		//((8.4*yards)+(330*td)+(100*comp)- (200*interceptions))/att
		
		//Ask how many touchdowns
		try {
			System.out.println("How many touchdowns?");
			td = input.nextDouble();
		}
		catch (Exception ex){
			System.out.println("Express as a whole number.");
			td = input.nextDouble();
		}
		
		//Ask how many yards
		try{
			System.out.println("How many yards?");
			yards = input.nextDouble();
		}
		catch (Exception ex){
			System.out.println("Express as a whole number.");
			yards = input.nextDouble();
		}
		
		//Ask how many interceptions
		try{
			System.out.println("How many interceptions?");
			interceptions = input.nextDouble();
		}
		catch (Exception ex){
			System.out.println("Express as a whole number.");
			interceptions = input.nextDouble();
		}
		
		//Ask how many completions
		try{
			System.out.println("How many completions?");
			comp = input.nextDouble();
		}
		catch (Exception ex){
			System.out.println("Express as a whole number.");
			comp = input.nextDouble();
		}
		
		//Ask how many passes were attempted
		try{
			System.out.println("How many passes were attempted?");
			att = input.nextDouble();
		}
		catch (Exception ex){
			System.out.println("Express as a whole number.");
			att = input.nextDouble();
		}
		
		//This is the passer rating equation
		pr = ((8.4*yards)+(330*td)+(100*comp)-(200*interceptions)/att);
		
		
		System.out.format("This quarterback's passer rating is: %4.1f ", pr);
		input.close();
	}

}
