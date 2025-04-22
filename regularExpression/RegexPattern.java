package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		String str = "aaaa is a aaa aa";
		
		String regex = "a{3}";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(str);
		
//		while(matcher.find()) {
//			System.out.print(matcher.group());
//		}
		
		if(matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}
}
