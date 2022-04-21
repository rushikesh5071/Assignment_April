package Optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null;
		
       Optional <String> op = Optional.ofNullable(str);
       System.out.println(op);
       System.out.println(op.isPresent());
       
	}

}
