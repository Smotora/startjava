public class ConditionalStatement {
	public static void main (String [] args) {
		int age = 24;
		if (age > 20) {
			System.out.println ("Вам более двадцати лет ");
		}

		int sex = 1;
		boolean isMale = true;
		if (isMale == true) {
			System.out.println ("Ваш пол - мужской ");
		}
		if (!isMale == true) {
			System.out.println ("Ваш пол - женский ");
		}

		double height = 1.78;
		if (height < 1.80) {
			System.out.println ("Ваш рост менее 1.80 ");
		} else {
			System.out.println ("Ваш рост более 1.80 ");
		}

		String name = "MIKE";
		char firstNameLetter = name.charAt(0);
		if (firstNameLetter == 'M') {
			System.out.println ("Первая буква имени: " + firstNameLetter);
		} else if (firstNameLetter == 'I') {
			System.out.println ("Первая буква имени: " + firstNameLetter);
		} else {
			System.out.println ("Первая буква имени не M и не I ");
		}
	}
}