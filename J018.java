import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J018 {
	private static final String REGEX1 = "\\d";
	private static final String REGEX2 = "[a-zA-Z]";
	private static final String REGEX3 = " ";
	private static final String REGEX4 = "[^a-zA-Z0-9 ]";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final String INPUT = scan.nextLine();
		Pattern p1 = Pattern.compile(REGEX1);
		Matcher q1 = p1.matcher(INPUT);
		int count1 = 0;
		while(q1.find()) {
			count1++;
		}
		System.out.println("数字个数：" + count1);
		Pattern p2 = Pattern.compile(REGEX2);
		Matcher q2 = p2.matcher(INPUT);
		int count2 = 0;
		while(q2.find()) {
			count2++;
		}
		System.out.println("字母个数：" + count2);
		Pattern p3 = Pattern.compile(REGEX3);
		Matcher q3 = p3.matcher(INPUT);
		int count3 = 0;
		while(q3.find()) {
			count3++;
		}
		System.out.println("空格个数：" + count3);
		Pattern p4 = Pattern.compile(REGEX4);
		Matcher q4 = p4.matcher(INPUT);
		int count4 = 0;
		while(q4.find()) {
			count4++;
		}
		System.out.println("其他字符个数：" + count4);
	}
}
