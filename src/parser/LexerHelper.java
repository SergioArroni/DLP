package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1.;
	}

	public static char lexemeToChar(String str) {
		try {
			if (str.equals("'\\n'"))
				return '\n';
			if (str.equals("'\\t'"))
				return '\t';
			if (str.equals("'\\r'"))
				return '\r';
			if (str.startsWith("\'\\"))
				return (char)(Integer.parseInt(str.substring(2,str.length()-1)));

			return str.substring(1,str.length()-1).charAt(0);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return ' ';
	}

	// TODO: Implement the lexemeToChar and lexemeToReal methods
	
}
