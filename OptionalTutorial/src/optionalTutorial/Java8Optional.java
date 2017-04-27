package optionalTutorial;
import java.util.Optional;

public class Java8Optional {

	public static void main(String args[]){
		sum sum = new sum();
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		//Optional.isNullable - allows passed parameter to be null
		Optional<Integer> a = Optional.ofNullable(value1);
		
		//Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		
		System.out.println(sum.sum(a,b));
	}

}
