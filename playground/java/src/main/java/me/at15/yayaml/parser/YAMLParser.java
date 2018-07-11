// Generated from src/main/java/me/at15/yayaml/parser/YAML.g4 by ANTLR 4.7.1
package me.at15.yayaml.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOL=2, INT=3, DOUBLE=4, STRING=5, ID=6, INDENT=7, DEDENT=8, NEWLINE=9;
	public static final int
		RULE_pair = 0, RULE_value = 1, RULE_obj = 2;
	public static final String[] ruleNames = {
		"pair", "value", "obj"
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

	@Override
	public String getGrammarFileName() { return "YAML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PairContext extends ParserRuleContext {
		public Token k;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(YAMLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(YAMLParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pair);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				((PairContext)_localctx).k = match(ID);
				setState(7);
				match(T__0);
				setState(8);
				value();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				((PairContext)_localctx).k = match(STRING);
				setState(10);
				match(T__0);
				setState(11);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValBoolContext extends ValueContext {
		public TerminalNode BOOL() { return getToken(YAMLParser.BOOL, 0); }
		public ValBoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValueContext {
		public TerminalNode INT() { return getToken(YAMLParser.INT, 0); }
		public ValIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(YAMLParser.STRING, 0); }
		public ValStringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValDoubleContext extends ValueContext {
		public TerminalNode DOUBLE() { return getToken(YAMLParser.DOUBLE, 0); }
		public ValDoubleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitValDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValObjContext extends ValueContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ValObjContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitValObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(BOOL);
				}
				break;
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new ValDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(STRING);
				}
				break;
			case NEWLINE:
				_localctx = new ValObjContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(18);
				obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(YAMLParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(YAMLParser.INDENT, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(YAMLParser.DEDENT, 0); }
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(NEWLINE);
			setState(22);
			match(INDENT);
			setState(23);
			pair();
			setState(24);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\26\n\3\3\4\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\36\2\16\3\2\2\2\4"+
		"\25\3\2\2\2\6\27\3\2\2\2\b\t\7\b\2\2\t\n\7\3\2\2\n\17\5\4\3\2\13\f\7\7"+
		"\2\2\f\r\7\3\2\2\r\17\5\4\3\2\16\b\3\2\2\2\16\13\3\2\2\2\17\3\3\2\2\2"+
		"\20\26\7\4\2\2\21\26\7\5\2\2\22\26\7\6\2\2\23\26\7\7\2\2\24\26\5\6\4\2"+
		"\25\20\3\2\2\2\25\21\3\2\2\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2"+
		"\26\5\3\2\2\2\27\30\7\13\2\2\30\31\7\t\2\2\31\32\5\2\2\2\32\33\7\n\2\2"+
		"\33\7\3\2\2\2\4\16\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}