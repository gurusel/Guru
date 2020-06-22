public class Mark {
	
	public static void main(String[] args) {
		int mark=61;
		System.out.println("This is modified");
		if (mark<=40) {
			System.out.println("Fail");
		}else if (mark>=41 && mark<=60)
		{
			System.out.println("B grade");
		}else if (mark>60 && mark<=70)
		{
			System.out.println("A grade");
		}else
		{
			System.out.println("A+ grade");
		}
	}

}
