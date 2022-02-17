// Generated from C:/Users/Sergio Arroni/IdeaProjects/DLP/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, CHAR_CONSTANT=2, REAL_CONSTANT=3, IDENT=4, COMENTARIO=5, 
		COMENTARIO_COMILLAS=6, TRASH=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "NUMERIC_REAL_CONSTANT", 
			"IDENT", "COMENTARIO", "COMENTARIO_COMILLAS", "TRASH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "IDENT", "COMENTARIO", 
			"COMENTARIO_COMILLAS", "TRASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u0092\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\5\2\34\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\6\3\67\n\3\r\3\16\38\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?\3\3\5\3C\n\3\3\4"+
		"\3\4\3\4\5\4H\n\4\3\4\3\4\5\4L\n\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\7\5U\n"+
		"\5\f\5\16\5X\13\5\3\5\3\5\6\5\\\n\5\r\5\16\5]\5\5`\n\5\3\6\3\6\7\6d\n"+
		"\6\f\6\16\6g\13\6\3\6\6\6j\n\6\r\6\16\6k\3\6\7\6o\n\6\f\6\16\6r\13\6\5"+
		"\6t\n\6\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\u0085\2\n\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\3\2\n\3\2\63;\3\2\62"+
		";\4\2GGgg\4\2--//\4\2C\\c|\6\2\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\"\"\2"+
		"\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\3\33\3\2\2\2\5B\3\2\2\2\7O\3\2\2\2\t_\3\2\2\2"+
		"\13s\3\2\2\2\ru\3\2\2\2\17~\3\2\2\2\21\u008e\3\2\2\2\23\34\7\62\2\2\24"+
		"\30\t\2\2\2\25\27\t\3\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30"+
		"\31\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\33\23\3\2\2\2\33\24\3\2\2\2\34"+
		"\4\3\2\2\2\35\36\7)\2\2\36\37\13\2\2\2\37C\7)\2\2 !\7)\2\2!\"\7^\2\2\""+
		"#\3\2\2\2#$\7p\2\2$C\7)\2\2%&\7)\2\2&\'\7^\2\2\'(\3\2\2\2()\7v\2\2)C\7"+
		")\2\2*+\7)\2\2+,\7^\2\2,-\3\2\2\2-.\7t\2\2.C\7)\2\2/\60\7)\2\2\60\61\7"+
		"\"\2\2\61C\7)\2\2\62\63\7)\2\2\63\64\7^\2\2\64\66\3\2\2\2\65\67\t\3\2"+
		"\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:C\7)\2\2"+
		";=\7)\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2"+
		"AC\7)\2\2B\35\3\2\2\2B \3\2\2\2B%\3\2\2\2B*\3\2\2\2B/\3\2\2\2B\62\3\2"+
		"\2\2B;\3\2\2\2C\6\3\2\2\2DP\5\t\5\2EH\5\t\5\2FH\5\3\2\2GE\3\2\2\2GF\3"+
		"\2\2\2HI\3\2\2\2IK\t\4\2\2JL\t\5\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5"+
		"\3\2\2NP\3\2\2\2OD\3\2\2\2OG\3\2\2\2P\b\3\2\2\2QR\5\3\2\2RV\7\60\2\2S"+
		"U\t\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W`\3\2\2\2XV\3\2\2\2"+
		"Y[\7\60\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2"+
		"\2\2_Q\3\2\2\2_Y\3\2\2\2`\n\3\2\2\2ae\t\6\2\2bd\t\7\2\2cb\3\2\2\2dg\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2ft\3\2\2\2ge\3\2\2\2hj\7a\2\2ih\3\2\2\2jk\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2lp\3\2\2\2mo\t\7\2\2nm\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sa\3\2\2\2si\3\2\2\2t\f\3\2\2\2uy"+
		"\7%\2\2vx\n\b\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y"+
		"\3\2\2\2|}\b\7\2\2}\16\3\2\2\2~\177\7$\2\2\177\u0080\7$\2\2\u0080\u0081"+
		"\7$\2\2\u0081\u0085\3\2\2\2\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7$\2\2\u0089\u008a\7$\2\2\u008a\u008b"+
		"\7$\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\b\2\2\u008d\20\3\2\2\2\u008e"+
		"\u008f\t\t\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\t\2\2\u0091\22\3\2\2"+
		"\2\24\2\30\338?BGKOV]_ekpsy\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}