
public class RunCipher {

	public static void main(String[] args) {
		RouteCipher rc = new RouteCipher();
//		rc.fillBlock("Meet at midnight");
//		rc.encryptBlock();
		System.out.println(rc.encryptMessage("Meet at midnight"));
	}

}
