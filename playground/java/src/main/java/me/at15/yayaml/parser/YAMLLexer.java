// Generated from src/main/java/me/at15/yayaml/parser/YAML.g4 by ANTLR 4.7.1
package me.at15.yayaml.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOL=2, INT=3, DOUBLE=4, STRING=5, ID=6, INDENT=7, DEDENT=8, NEWLINE=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "BOOL", "INT", "DOUBLE", "STRING", "ID", "INDENT", "DEDENT", "DIGIT", 
		"ESC", "ID_LETTER", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", null, null, null, null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BOOL", "INT", "DOUBLE", "STRING", "ID", "INDENT", "DEDENT", 
		"NEWLINE"
	};
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


	public YAMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YAML.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\'"+
		"\n\3\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\5\4\61\n\4\3\5\6\5\64\n\5\r\5"+
		"\16\5\65\3\5\3\5\6\5:\n\5\r\5\16\5;\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13"+
		"\6\3\6\3\6\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\5\fY\n\f\3\r\5\r\\\n\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\2\25\2\27\2\31\13\3\2\b\3\2\63;\4\2$$^^\3\2c|\3\2"+
		"\62;\n\2$$\61\61^^ddhhppttvv\5\2C\\aac|\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\31\3\2\2\2\3\33\3\2\2\2\5&\3\2\2\2\7\60\3\2\2\2\t\63\3\2\2\2\13="+
		"\3\2\2\2\rG\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27"+
		"X\3\2\2\2\31[\3\2\2\2\33\34\7<\2\2\34\4\3\2\2\2\35\36\7v\2\2\36\37\7t"+
		"\2\2\37 \7w\2\2 \'\7g\2\2!\"\7h\2\2\"#\7c\2\2#$\7n\2\2$%\7u\2\2%\'\7g"+
		"\2\2&\35\3\2\2\2&!\3\2\2\2\'\6\3\2\2\2(\61\7\62\2\2)-\t\2\2\2*,\5\23\n"+
		"\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61\3\2\2\2/-\3\2\2\2\60(\3"+
		"\2\2\2\60)\3\2\2\2\61\b\3\2\2\2\62\64\5\23\n\2\63\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\7\60\2\28:\5\23\n\2"+
		"98\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\n\3\2\2\2=B\7$\2\2>A\5\25\13"+
		"\2?A\n\3\2\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2"+
		"\2DB\3\2\2\2EF\7$\2\2F\f\3\2\2\2GK\t\4\2\2HJ\5\27\f\2IH\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2L\16\3\2\2\2MK\3\2\2\2NO\7}\2\2O\20\3\2\2\2PQ"+
		"\7\177\2\2Q\22\3\2\2\2RS\t\5\2\2S\24\3\2\2\2TU\7^\2\2UV\t\6\2\2V\26\3"+
		"\2\2\2WY\t\7\2\2XW\3\2\2\2Y\30\3\2\2\2Z\\\7\17\2\2[Z\3\2\2\2[\\\3\2\2"+
		"\2\\]\3\2\2\2]^\7\f\2\2^\32\3\2\2\2\r\2&-\60\65;@BKX[\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}