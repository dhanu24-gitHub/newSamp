package optionalClass;

import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		String a = null;
		String b = "David";
		
//Using of() method in null values:
//		Optional<String> check = Optional.of(a);
		
		Optional<String> check1 = Optional.of(b);
		

// Using ofNullable() method in null value:
		Optional <String> check = Optional.ofNullable(a);
		System.out.println(check);                               // ---> Optional.empty
		
		
// Using ofNullable() method in value:
//		Optional <String> check1 = Optional.ofNullable(b);
		System.out.println(check1);                              // ---> Optional[David]
		
		
// Using isPresent() method:
		System.out.println(check.isPresent());                   // ---> false
		

// Using isEmpty() method:
		System.out.println(check.isEmpty());                     // ---> true
		

// Using orElse() method:
		System.out.println(check.orElse(a));                     // ---> Return null if there is null value
		System.out.println(check.orElse(b));
		System.out.println("Heyyy");
		

// Using orEseThrow() method:		
//		System.out.println(check.orElseThrow(() -> new NullPointerException()));                 // ---> Throws NoSuchElementException if the value is null
		
		
// Using get() method:
//		System.out.println(check.get());                         // ---> Throws NoSuchElementException is the value is null
	}

}
