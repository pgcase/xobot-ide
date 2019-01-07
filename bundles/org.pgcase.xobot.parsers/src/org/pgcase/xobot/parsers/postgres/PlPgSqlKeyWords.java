// Generated from org\pgcase\xobot\parsers\postgres\PlPgSqlKeyWords.g4 by ANTLR 4.5
package org.pgcase.xobot.parsers.postgres;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlPgSqlKeyWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_MESSAGE=1, K_NEXT=2, K_MESSAGE_TEXT=3, K_STACKED=4, K_DIAGNOSTICS=5, 
		K_PG_EXCEPTION_CONTEXT=6, K_LOOP=7, K_USE_COLUMN=8, K_DUMP=9, K_SLICE=10, 
		K_EXECUTE=11, K_COLLATE=12, K_RESULT_OID=13, K_WHILE=14, K_ERROR=15, K_FORWARD=16, 
		K_FOREACH=17, K_RETURNED_SQLSTATE=18, K_BACKWARD=19, K_EXCEPTION=20, K_HINT=21, 
		K_CURRENT=22, K_RAISE=23, K_OPEN=24, K_DETAIL=25, K_RETURN=26, K_CLOSE=27, 
		K_SCROLL=28, K_MOVE=29, K_USE_VARIABLE=30, K_ALIAS=31, K_INFO=32, K_NO=33, 
		K_RELATIVE=34, K_LOG=35, K_QUERY=36, K_GET=37, K_CONTINUE=38, K_FETCH=39, 
		K_ROW_COUNT=40, K_DEBUG=41, K_CONSTANT=42, K_CURSOR=43, K_PG_EXCEPTION_DETAIL=44, 
		K_ELSIF=45, K_PRIOR=46, K_EXIT=47, K_ABSOLUTE=48, K_FIRST=49, K_LAST=50, 
		K_ROWTYPE=51, K_VARIABLE_CONFLICT=52, K_PG_EXCEPTION_HINT=53, K_OPTION=54, 
		K_NOTICE=55, K_PERFORM=56, K_WARNING=57, K_REVERSE=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"K_MESSAGE", "K_NEXT", "K_MESSAGE_TEXT", "K_STACKED", "K_DIAGNOSTICS", 
		"K_PG_EXCEPTION_CONTEXT", "K_LOOP", "K_USE_COLUMN", "K_DUMP", "K_SLICE", 
		"K_EXECUTE", "K_COLLATE", "K_RESULT_OID", "K_WHILE", "K_ERROR", "K_FORWARD", 
		"K_FOREACH", "K_RETURNED_SQLSTATE", "K_BACKWARD", "K_EXCEPTION", "K_HINT", 
		"K_CURRENT", "K_RAISE", "K_OPEN", "K_DETAIL", "K_RETURN", "K_CLOSE", "K_SCROLL", 
		"K_MOVE", "K_USE_VARIABLE", "K_ALIAS", "K_INFO", "K_NO", "K_RELATIVE", 
		"K_LOG", "K_QUERY", "K_GET", "K_CONTINUE", "K_FETCH", "K_ROW_COUNT", "K_DEBUG", 
		"K_CONSTANT", "K_CURSOR", "K_PG_EXCEPTION_DETAIL", "K_ELSIF", "K_PRIOR", 
		"K_EXIT", "K_ABSOLUTE", "K_FIRST", "K_LAST", "K_ROWTYPE", "K_VARIABLE_CONFLICT", 
		"K_PG_EXCEPTION_HINT", "K_OPTION", "K_NOTICE", "K_PERFORM", "K_WARNING", 
		"K_REVERSE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "K_MESSAGE", "K_NEXT", "K_MESSAGE_TEXT", "K_STACKED", "K_DIAGNOSTICS", 
		"K_PG_EXCEPTION_CONTEXT", "K_LOOP", "K_USE_COLUMN", "K_DUMP", "K_SLICE", 
		"K_EXECUTE", "K_COLLATE", "K_RESULT_OID", "K_WHILE", "K_ERROR", "K_FORWARD", 
		"K_FOREACH", "K_RETURNED_SQLSTATE", "K_BACKWARD", "K_EXCEPTION", "K_HINT", 
		"K_CURRENT", "K_RAISE", "K_OPEN", "K_DETAIL", "K_RETURN", "K_CLOSE", "K_SCROLL", 
		"K_MOVE", "K_USE_VARIABLE", "K_ALIAS", "K_INFO", "K_NO", "K_RELATIVE", 
		"K_LOG", "K_QUERY", "K_GET", "K_CONTINUE", "K_FETCH", "K_ROW_COUNT", "K_DEBUG", 
		"K_CONSTANT", "K_CURSOR", "K_PG_EXCEPTION_DETAIL", "K_ELSIF", "K_PRIOR", 
		"K_EXIT", "K_ABSOLUTE", "K_FIRST", "K_LAST", "K_ROWTYPE", "K_VARIABLE_CONFLICT", 
		"K_PG_EXCEPTION_HINT", "K_OPTION", "K_NOTICE", "K_PERFORM", "K_WARNING", 
		"K_REVERSE"
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


	public PlPgSqlKeyWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlPgSqlKeyWords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u025c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01ea\n.\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\3"+
		"9\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\2"+
		"\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<\3\2\33\4\2OOoo\4\2GGgg\4\2UUuu\4\2CCcc\4\2IIii\4\2PPpp\4\2"+
		"ZZzz\4\2VVvv\3\2aa\4\2EEee\4\2MMmm\4\2FFff\4\2KKkk\4\2QQqq\4\2RRrr\4\2"+
		"NNnn\4\2WWww\4\2TTtt\4\2YYyy\4\2JJjj\4\2HHhh\4\2SSss\4\2DDdd\4\2XXxx\4"+
		"\2[[{{\u025c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5"+
		"\177\3\2\2\2\7\u0084\3\2\2\2\t\u0091\3\2\2\2\13\u0099\3\2\2\2\r\u00a5"+
		"\3\2\2\2\17\u00ba\3\2\2\2\21\u00bf\3\2\2\2\23\u00ca\3\2\2\2\25\u00cf\3"+
		"\2\2\2\27\u00d5\3\2\2\2\31\u00dd\3\2\2\2\33\u00e5\3\2\2\2\35\u00f0\3\2"+
		"\2\2\37\u00f6\3\2\2\2!\u00fc\3\2\2\2#\u0104\3\2\2\2%\u010c\3\2\2\2\'\u011e"+
		"\3\2\2\2)\u0127\3\2\2\2+\u0131\3\2\2\2-\u0136\3\2\2\2/\u013e\3\2\2\2\61"+
		"\u0144\3\2\2\2\63\u0149\3\2\2\2\65\u0150\3\2\2\2\67\u0157\3\2\2\29\u015d"+
		"\3\2\2\2;\u0164\3\2\2\2=\u0169\3\2\2\2?\u0176\3\2\2\2A\u017c\3\2\2\2C"+
		"\u0181\3\2\2\2E\u0184\3\2\2\2G\u018d\3\2\2\2I\u0191\3\2\2\2K\u0197\3\2"+
		"\2\2M\u019b\3\2\2\2O\u01a4\3\2\2\2Q\u01aa\3\2\2\2S\u01b4\3\2\2\2U\u01ba"+
		"\3\2\2\2W\u01c3\3\2\2\2Y\u01ca\3\2\2\2[\u01e9\3\2\2\2]\u01eb\3\2\2\2_"+
		"\u01f1\3\2\2\2a\u01f6\3\2\2\2c\u01ff\3\2\2\2e\u0205\3\2\2\2g\u020a\3\2"+
		"\2\2i\u0212\3\2\2\2k\u0224\3\2\2\2m\u0236\3\2\2\2o\u023d\3\2\2\2q\u0244"+
		"\3\2\2\2s\u024c\3\2\2\2u\u0254\3\2\2\2wx\t\2\2\2xy\t\3\2\2yz\t\4\2\2z"+
		"{\t\4\2\2{|\t\5\2\2|}\t\6\2\2}~\t\3\2\2~\4\3\2\2\2\177\u0080\t\7\2\2\u0080"+
		"\u0081\t\3\2\2\u0081\u0082\t\b\2\2\u0082\u0083\t\t\2\2\u0083\6\3\2\2\2"+
		"\u0084\u0085\t\2\2\2\u0085\u0086\t\3\2\2\u0086\u0087\t\4\2\2\u0087\u0088"+
		"\t\4\2\2\u0088\u0089\t\5\2\2\u0089\u008a\t\6\2\2\u008a\u008b\t\3\2\2\u008b"+
		"\u008c\t\n\2\2\u008c\u008d\t\t\2\2\u008d\u008e\t\3\2\2\u008e\u008f\t\b"+
		"\2\2\u008f\u0090\t\t\2\2\u0090\b\3\2\2\2\u0091\u0092\t\4\2\2\u0092\u0093"+
		"\t\t\2\2\u0093\u0094\t\5\2\2\u0094\u0095\t\13\2\2\u0095\u0096\t\f\2\2"+
		"\u0096\u0097\t\3\2\2\u0097\u0098\t\r\2\2\u0098\n\3\2\2\2\u0099\u009a\t"+
		"\r\2\2\u009a\u009b\t\16\2\2\u009b\u009c\t\5\2\2\u009c\u009d\t\6\2\2\u009d"+
		"\u009e\t\7\2\2\u009e\u009f\t\17\2\2\u009f\u00a0\t\4\2\2\u00a0\u00a1\t"+
		"\t\2\2\u00a1\u00a2\t\16\2\2\u00a2\u00a3\t\13\2\2\u00a3\u00a4\t\4\2\2\u00a4"+
		"\f\3\2\2\2\u00a5\u00a6\t\20\2\2\u00a6\u00a7\t\6\2\2\u00a7\u00a8\t\n\2"+
		"\2\u00a8\u00a9\t\3\2\2\u00a9\u00aa\t\b\2\2\u00aa\u00ab\t\13\2\2\u00ab"+
		"\u00ac\t\3\2\2\u00ac\u00ad\t\20\2\2\u00ad\u00ae\t\t\2\2\u00ae\u00af\t"+
		"\16\2\2\u00af\u00b0\t\17\2\2\u00b0\u00b1\t\7\2\2\u00b1\u00b2\t\n\2\2\u00b2"+
		"\u00b3\t\13\2\2\u00b3\u00b4\t\17\2\2\u00b4\u00b5\t\7\2\2\u00b5\u00b6\t"+
		"\t\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\t\b\2\2\u00b8\u00b9\t\t\2\2\u00b9"+
		"\16\3\2\2\2\u00ba\u00bb\t\21\2\2\u00bb\u00bc\t\17\2\2\u00bc\u00bd\t\17"+
		"\2\2\u00bd\u00be\t\20\2\2\u00be\20\3\2\2\2\u00bf\u00c0\t\22\2\2\u00c0"+
		"\u00c1\t\4\2\2\u00c1\u00c2\t\3\2\2\u00c2\u00c3\t\n\2\2\u00c3\u00c4\t\13"+
		"\2\2\u00c4\u00c5\t\17\2\2\u00c5\u00c6\t\21\2\2\u00c6\u00c7\t\22\2\2\u00c7"+
		"\u00c8\t\2\2\2\u00c8\u00c9\t\7\2\2\u00c9\22\3\2\2\2\u00ca\u00cb\t\r\2"+
		"\2\u00cb\u00cc\t\22\2\2\u00cc\u00cd\t\2\2\2\u00cd\u00ce\t\20\2\2\u00ce"+
		"\24\3\2\2\2\u00cf\u00d0\t\4\2\2\u00d0\u00d1\t\21\2\2\u00d1\u00d2\t\16"+
		"\2\2\u00d2\u00d3\t\13\2\2\u00d3\u00d4\t\3\2\2\u00d4\26\3\2\2\2\u00d5\u00d6"+
		"\t\3\2\2\u00d6\u00d7\t\b\2\2\u00d7\u00d8\t\3\2\2\u00d8\u00d9\t\13\2\2"+
		"\u00d9\u00da\t\22\2\2\u00da\u00db\t\t\2\2\u00db\u00dc\t\3\2\2\u00dc\30"+
		"\3\2\2\2\u00dd\u00de\t\13\2\2\u00de\u00df\t\17\2\2\u00df\u00e0\t\21\2"+
		"\2\u00e0\u00e1\t\21\2\2\u00e1\u00e2\t\5\2\2\u00e2\u00e3\t\t\2\2\u00e3"+
		"\u00e4\t\3\2\2\u00e4\32\3\2\2\2\u00e5\u00e6\t\23\2\2\u00e6\u00e7\t\3\2"+
		"\2\u00e7\u00e8\t\4\2\2\u00e8\u00e9\t\22\2\2\u00e9\u00ea\t\21\2\2\u00ea"+
		"\u00eb\t\t\2\2\u00eb\u00ec\t\n\2\2\u00ec\u00ed\t\17\2\2\u00ed\u00ee\t"+
		"\16\2\2\u00ee\u00ef\t\r\2\2\u00ef\34\3\2\2\2\u00f0\u00f1\t\24\2\2\u00f1"+
		"\u00f2\t\25\2\2\u00f2\u00f3\t\16\2\2\u00f3\u00f4\t\21\2\2\u00f4\u00f5"+
		"\t\3\2\2\u00f5\36\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\u00f8\t\23\2\2\u00f8"+
		"\u00f9\t\23\2\2\u00f9\u00fa\t\17\2\2\u00fa\u00fb\t\23\2\2\u00fb \3\2\2"+
		"\2\u00fc\u00fd\t\26\2\2\u00fd\u00fe\t\17\2\2\u00fe\u00ff\t\23\2\2\u00ff"+
		"\u0100\t\24\2\2\u0100\u0101\t\5\2\2\u0101\u0102\t\23\2\2\u0102\u0103\t"+
		"\r\2\2\u0103\"\3\2\2\2\u0104\u0105\t\26\2\2\u0105\u0106\t\17\2\2\u0106"+
		"\u0107\t\23\2\2\u0107\u0108\t\3\2\2\u0108\u0109\t\5\2\2\u0109\u010a\t"+
		"\13\2\2\u010a\u010b\t\25\2\2\u010b$\3\2\2\2\u010c\u010d\t\23\2\2\u010d"+
		"\u010e\t\3\2\2\u010e\u010f\t\t\2\2\u010f\u0110\t\22\2\2\u0110\u0111\t"+
		"\23\2\2\u0111\u0112\t\7\2\2\u0112\u0113\t\3\2\2\u0113\u0114\t\r\2\2\u0114"+
		"\u0115\t\n\2\2\u0115\u0116\t\4\2\2\u0116\u0117\t\27\2\2\u0117\u0118\t"+
		"\21\2\2\u0118\u0119\t\4\2\2\u0119\u011a\t\t\2\2\u011a\u011b\t\5\2\2\u011b"+
		"\u011c\t\t\2\2\u011c\u011d\t\3\2\2\u011d&\3\2\2\2\u011e\u011f\t\30\2\2"+
		"\u011f\u0120\t\5\2\2\u0120\u0121\t\13\2\2\u0121\u0122\t\f\2\2\u0122\u0123"+
		"\t\24\2\2\u0123\u0124\t\5\2\2\u0124\u0125\t\23\2\2\u0125\u0126\t\r\2\2"+
		"\u0126(\3\2\2\2\u0127\u0128\t\3\2\2\u0128\u0129\t\b\2\2\u0129\u012a\t"+
		"\13\2\2\u012a\u012b\t\3\2\2\u012b\u012c\t\20\2\2\u012c\u012d\t\t\2\2\u012d"+
		"\u012e\t\16\2\2\u012e\u012f\t\17\2\2\u012f\u0130\t\7\2\2\u0130*\3\2\2"+
		"\2\u0131\u0132\t\25\2\2\u0132\u0133\t\16\2\2\u0133\u0134\t\7\2\2\u0134"+
		"\u0135\t\t\2\2\u0135,\3\2\2\2\u0136\u0137\t\13\2\2\u0137\u0138\t\22\2"+
		"\2\u0138\u0139\t\23\2\2\u0139\u013a\t\23\2\2\u013a\u013b\t\3\2\2\u013b"+
		"\u013c\t\7\2\2\u013c\u013d\t\t\2\2\u013d.\3\2\2\2\u013e\u013f\t\23\2\2"+
		"\u013f\u0140\t\5\2\2\u0140\u0141\t\16\2\2\u0141\u0142\t\4\2\2\u0142\u0143"+
		"\t\3\2\2\u0143\60\3\2\2\2\u0144\u0145\t\17\2\2\u0145\u0146\t\20\2\2\u0146"+
		"\u0147\t\3\2\2\u0147\u0148\t\7\2\2\u0148\62\3\2\2\2\u0149\u014a\t\r\2"+
		"\2\u014a\u014b\t\3\2\2\u014b\u014c\t\t\2\2\u014c\u014d\t\5\2\2\u014d\u014e"+
		"\t\16\2\2\u014e\u014f\t\21\2\2\u014f\64\3\2\2\2\u0150\u0151\t\23\2\2\u0151"+
		"\u0152\t\3\2\2\u0152\u0153\t\t\2\2\u0153\u0154\t\22\2\2\u0154\u0155\t"+
		"\23\2\2\u0155\u0156\t\7\2\2\u0156\66\3\2\2\2\u0157\u0158\t\13\2\2\u0158"+
		"\u0159\t\21\2\2\u0159\u015a\t\17\2\2\u015a\u015b\t\4\2\2\u015b\u015c\t"+
		"\3\2\2\u015c8\3\2\2\2\u015d\u015e\t\4\2\2\u015e\u015f\t\13\2\2\u015f\u0160"+
		"\t\23\2\2\u0160\u0161\t\17\2\2\u0161\u0162\t\21\2\2\u0162\u0163\t\21\2"+
		"\2\u0163:\3\2\2\2\u0164\u0165\t\2\2\2\u0165\u0166\t\17\2\2\u0166\u0167"+
		"\t\31\2\2\u0167\u0168\t\3\2\2\u0168<\3\2\2\2\u0169\u016a\t\22\2\2\u016a"+
		"\u016b\t\4\2\2\u016b\u016c\t\3\2\2\u016c\u016d\t\n\2\2\u016d\u016e\t\31"+
		"\2\2\u016e\u016f\t\5\2\2\u016f\u0170\t\23\2\2\u0170\u0171\t\16\2\2\u0171"+
		"\u0172\t\5\2\2\u0172\u0173\t\30\2\2\u0173\u0174\t\21\2\2\u0174\u0175\t"+
		"\3\2\2\u0175>\3\2\2\2\u0176\u0177\t\5\2\2\u0177\u0178\t\21\2\2\u0178\u0179"+
		"\t\16\2\2\u0179\u017a\t\5\2\2\u017a\u017b\t\4\2\2\u017b@\3\2\2\2\u017c"+
		"\u017d\t\16\2\2\u017d\u017e\t\7\2\2\u017e\u017f\t\26\2\2\u017f\u0180\t"+
		"\17\2\2\u0180B\3\2\2\2\u0181\u0182\t\7\2\2\u0182\u0183\t\17\2\2\u0183"+
		"D\3\2\2\2\u0184\u0185\t\23\2\2\u0185\u0186\t\3\2\2\u0186\u0187\t\21\2"+
		"\2\u0187\u0188\t\5\2\2\u0188\u0189\t\t\2\2\u0189\u018a\t\16\2\2\u018a"+
		"\u018b\t\31\2\2\u018b\u018c\t\3\2\2\u018cF\3\2\2\2\u018d\u018e\t\21\2"+
		"\2\u018e\u018f\t\17\2\2\u018f\u0190\t\6\2\2\u0190H\3\2\2\2\u0191\u0192"+
		"\t\27\2\2\u0192\u0193\t\22\2\2\u0193\u0194\t\3\2\2\u0194\u0195\t\23\2"+
		"\2\u0195\u0196\t\32\2\2\u0196J\3\2\2\2\u0197\u0198\t\6\2\2\u0198\u0199"+
		"\t\3\2\2\u0199\u019a\t\t\2\2\u019aL\3\2\2\2\u019b\u019c\t\13\2\2\u019c"+
		"\u019d\t\17\2\2\u019d\u019e\t\7\2\2\u019e\u019f\t\t\2\2\u019f\u01a0\t"+
		"\16\2\2\u01a0\u01a1\t\7\2\2\u01a1\u01a2\t\22\2\2\u01a2\u01a3\t\3\2\2\u01a3"+
		"N\3\2\2\2\u01a4\u01a5\t\26\2\2\u01a5\u01a6\t\3\2\2\u01a6\u01a7\t\t\2\2"+
		"\u01a7\u01a8\t\13\2\2\u01a8\u01a9\t\25\2\2\u01a9P\3\2\2\2\u01aa\u01ab"+
		"\t\23\2\2\u01ab\u01ac\t\17\2\2\u01ac\u01ad\t\24\2\2\u01ad\u01ae\t\n\2"+
		"\2\u01ae\u01af\t\13\2\2\u01af\u01b0\t\17\2\2\u01b0\u01b1\t\22\2\2\u01b1"+
		"\u01b2\t\7\2\2\u01b2\u01b3\t\t\2\2\u01b3R\3\2\2\2\u01b4\u01b5\t\r\2\2"+
		"\u01b5\u01b6\t\3\2\2\u01b6\u01b7\t\30\2\2\u01b7\u01b8\t\22\2\2\u01b8\u01b9"+
		"\t\6\2\2\u01b9T\3\2\2\2\u01ba\u01bb\t\13\2\2\u01bb\u01bc\t\17\2\2\u01bc"+
		"\u01bd\t\7\2\2\u01bd\u01be\t\4\2\2\u01be\u01bf\t\t\2\2\u01bf\u01c0\t\5"+
		"\2\2\u01c0\u01c1\t\7\2\2\u01c1\u01c2\t\t\2\2\u01c2V\3\2\2\2\u01c3\u01c4"+
		"\t\13\2\2\u01c4\u01c5\t\22\2\2\u01c5\u01c6\t\23\2\2\u01c6\u01c7\t\4\2"+
		"\2\u01c7\u01c8\t\17\2\2\u01c8\u01c9\t\23\2\2\u01c9X\3\2\2\2\u01ca\u01cb"+
		"\t\20\2\2\u01cb\u01cc\t\6\2\2\u01cc\u01cd\t\n\2\2\u01cd\u01ce\t\3\2\2"+
		"\u01ce\u01cf\t\b\2\2\u01cf\u01d0\t\13\2\2\u01d0\u01d1\t\3\2\2\u01d1\u01d2"+
		"\t\20\2\2\u01d2\u01d3\t\t\2\2\u01d3\u01d4\t\16\2\2\u01d4\u01d5\t\17\2"+
		"\2\u01d5\u01d6\t\7\2\2\u01d6\u01d7\t\n\2\2\u01d7\u01d8\t\r\2\2\u01d8\u01d9"+
		"\t\3\2\2\u01d9\u01da\t\t\2\2\u01da\u01db\t\5\2\2\u01db\u01dc\t\16\2\2"+
		"\u01dc\u01dd\t\21\2\2\u01ddZ\3\2\2\2\u01de\u01df\t\3\2\2\u01df\u01e0\t"+
		"\21\2\2\u01e0\u01e1\t\4\2\2\u01e1\u01e2\t\3\2\2\u01e2\u01e3\t\16\2\2\u01e3"+
		"\u01ea\t\26\2\2\u01e4\u01e5\t\3\2\2\u01e5\u01e6\t\21\2\2\u01e6\u01e7\t"+
		"\4\2\2\u01e7\u01e8\t\16\2\2\u01e8\u01ea\t\26\2\2\u01e9\u01de\3\2\2\2\u01e9"+
		"\u01e4\3\2\2\2\u01ea\\\3\2\2\2\u01eb\u01ec\t\20\2\2\u01ec\u01ed\t\23\2"+
		"\2\u01ed\u01ee\t\16\2\2\u01ee\u01ef\t\17\2\2\u01ef\u01f0\t\23\2\2\u01f0"+
		"^\3\2\2\2\u01f1\u01f2\t\3\2\2\u01f2\u01f3\t\b\2\2\u01f3\u01f4\t\16\2\2"+
		"\u01f4\u01f5\t\t\2\2\u01f5`\3\2\2\2\u01f6\u01f7\t\5\2\2\u01f7\u01f8\t"+
		"\30\2\2\u01f8\u01f9\t\4\2\2\u01f9\u01fa\t\17\2\2\u01fa\u01fb\t\21\2\2"+
		"\u01fb\u01fc\t\22\2\2\u01fc\u01fd\t\t\2\2\u01fd\u01fe\t\3\2\2\u01feb\3"+
		"\2\2\2\u01ff\u0200\t\26\2\2\u0200\u0201\t\16\2\2\u0201\u0202\t\23\2\2"+
		"\u0202\u0203\t\4\2\2\u0203\u0204\t\t\2\2\u0204d\3\2\2\2\u0205\u0206\t"+
		"\21\2\2\u0206\u0207\t\5\2\2\u0207\u0208\t\4\2\2\u0208\u0209\t\t\2\2\u0209"+
		"f\3\2\2\2\u020a\u020b\t\23\2\2\u020b\u020c\t\17\2\2\u020c\u020d\t\24\2"+
		"\2\u020d\u020e\t\t\2\2\u020e\u020f\t\32\2\2\u020f\u0210\t\20\2\2\u0210"+
		"\u0211\t\3\2\2\u0211h\3\2\2\2\u0212\u0213\t\31\2\2\u0213\u0214\t\5\2\2"+
		"\u0214\u0215\t\23\2\2\u0215\u0216\t\16\2\2\u0216\u0217\t\5\2\2\u0217\u0218"+
		"\t\30\2\2\u0218\u0219\t\21\2\2\u0219\u021a\t\3\2\2\u021a\u021b\t\n\2\2"+
		"\u021b\u021c\t\13\2\2\u021c\u021d\t\17\2\2\u021d\u021e\t\7\2\2\u021e\u021f"+
		"\t\26\2\2\u021f\u0220\t\21\2\2\u0220\u0221\t\16\2\2\u0221\u0222\t\13\2"+
		"\2\u0222\u0223\t\t\2\2\u0223j\3\2\2\2\u0224\u0225\t\20\2\2\u0225\u0226"+
		"\t\6\2\2\u0226\u0227\t\n\2\2\u0227\u0228\t\3\2\2\u0228\u0229\t\b\2\2\u0229"+
		"\u022a\t\13\2\2\u022a\u022b\t\3\2\2\u022b\u022c\t\20\2\2\u022c\u022d\t"+
		"\t\2\2\u022d\u022e\t\16\2\2\u022e\u022f\t\17\2\2\u022f\u0230\t\7\2\2\u0230"+
		"\u0231\t\n\2\2\u0231\u0232\t\25\2\2\u0232\u0233\t\16\2\2\u0233\u0234\t"+
		"\7\2\2\u0234\u0235\t\t\2\2\u0235l\3\2\2\2\u0236\u0237\t\17\2\2\u0237\u0238"+
		"\t\20\2\2\u0238\u0239\t\t\2\2\u0239\u023a\t\16\2\2\u023a\u023b\t\17\2"+
		"\2\u023b\u023c\t\7\2\2\u023cn\3\2\2\2\u023d\u023e\t\7\2\2\u023e\u023f"+
		"\t\17\2\2\u023f\u0240\t\t\2\2\u0240\u0241\t\16\2\2\u0241\u0242\t\13\2"+
		"\2\u0242\u0243\t\3\2\2\u0243p\3\2\2\2\u0244\u0245\t\20\2\2\u0245\u0246"+
		"\t\3\2\2\u0246\u0247\t\23\2\2\u0247\u0248\t\26\2\2\u0248\u0249\t\17\2"+
		"\2\u0249\u024a\t\23\2\2\u024a\u024b\t\2\2\2\u024br\3\2\2\2\u024c\u024d"+
		"\t\24\2\2\u024d\u024e\t\5\2\2\u024e\u024f\t\23\2\2\u024f\u0250\t\7\2\2"+
		"\u0250\u0251\t\16\2\2\u0251\u0252\t\7\2\2\u0252\u0253\t\6\2\2\u0253t\3"+
		"\2\2\2\u0254\u0255\t\23\2\2\u0255\u0256\t\3\2\2\u0256\u0257\t\31\2\2\u0257"+
		"\u0258\t\3\2\2\u0258\u0259\t\23\2\2\u0259\u025a\t\4\2\2\u025a\u025b\t"+
		"\3\2\2\u025bv\3\2\2\2\4\2\u01e9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}