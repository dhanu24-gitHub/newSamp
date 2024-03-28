package optionalClass;

import java.util.Optional;

public class Task {
	public static void main(String[] args) {
		String a = null;
		String b = "Deekshi";

// Using Optional class: 
	// Using ofNullable() method:
		Optional <String> check = Optional.ofNullable(a);
		System.out.println(check);
	// Using isPresent() method: --> Checks whether the value is null. If it is null, returns 'false'
//		if(check.isPresent()) {
//			System.out.println(a.toUpperCase());
//		}
//		else {
//			System.out.println("It is null");
//		}
	// Using isEmpty() method: --> Checks whether the value is null. If it is null, returns 'True'
//		System.out.println(check.isEmpty());
		
	// Using orElse() method: --> 
//		System.out.println(check.orElse(a));
		
	// Using orElseThrow() method: Throws an Exception. It can be also a custom exception.
	
	// Using get() method: Gets the values inside it. If it is null, it throws NoSuchElementException
//		System.out.println(check.get());

	}

}
