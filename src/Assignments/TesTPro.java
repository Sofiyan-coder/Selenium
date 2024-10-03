package Assignments;

public class TesTPro {
	public static void main(String[] args) {
        
		for (int i = 0; i < args.length; i++) {
			
			String data = "//*[@id=\\\"poll-block-1\\\"]/ul/li["+"(i+1)"+"]label";
			System.out.println(data);
			
		}
		
}

}
