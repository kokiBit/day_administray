package dayRegist;

public class Sample {

	public String input(String message,Check check) {
		System.out.println(message);
		String input = null;
		do {
			// readline;
			input = "aaa";
		} while (check.check(input));
		return input;
	}

	interface Check{
		boolean check(String input);
	}
	
	class DayCheck implements Check {

		@Override
		public boolean check(String input) {
			// TODO 自動生成されたメソッド・スタブ
			return false;
		}
		
	}
	
	public void go() {
		Sample s = new Sample();
		String input = s.input("作業開始の日付は", new DayCheck());
		String input2 = s.input("作業開始の", new DayCheck());
	}
}
