package Password;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class SpringBootSecurityPasswordEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "sssss";
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);
		System.out.println();

	}

}