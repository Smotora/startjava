public class ConditionalStatement {
	public static void main (String [] args) {

		int age= 24;
	if (age > 20) {
System.out.println ("Вам более двадцати лет ");
}

		int sex = 1;
	boolean isSex = sex == 1;
	if (isSex = true) {
System.out.println ("Ваш пол - мужской ");
}
	if (isSex = false) {
System.out.println ("Ваш пол - женский ");
}

		double height = 1.78;
	if (height < 1.80) {
System.out.println ("Ваш рост менее 1.80 ");
	} else {
System.out.println ("Ваш рост более 1.80 ");
}

		String str = "MIKE";

		int first = str.length ()-str.length ();

		char firstLetter = str.charAt(first);

	if (firstLetter == 'M') {

System.out.println ("Первая буква имени: " + firstLetter);

	} else if (firstLetter == 'I') {

System.out.println ("Первая буква имени: " + firstLetter);

	} else {

System.out.println ("Первая буква имени не M и не I ");
			}
		}
	}