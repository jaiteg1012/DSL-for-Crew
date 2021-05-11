// Generated from Grammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SINGLE_DIGIT=5, MULTI_DIGIT=6, ZERO=7, 
		RULE=8, SUIT_VAL=9, CARD_VAL=10, CARD_DIR=11, OP_UNION=12, OP_INTERSECT=13, 
		OP_COMPLEMENT=14, PLUS=15, MINUS=16, LT=17, GT=18, LTE=19, GTE=20, EQ=21, 
		LP=22, RP=23, SETL=24, SETR=25, IL=26, IR=27, CARDS=28, CARD=29, SUIT=30, 
		VALUE=31, FIRST=32, LAST=33, ANY=34, ALL=35, MAX_WINS=36, MIN_WINS=37, 
		WINS_RULE=38, WINS=39, DUP=40, ORDER=41, CDE=42, CDWI=43, CDI=44, PD=45, 
		CD=46, TRICK=47, WIN_TRICK=48, DONT_WIN_TRICK=49, WIN_CARDS=50, DONT_WIN_CARDS=51, 
		NO_COM=52, LIM_COM=53, COM=54, DRAW_LEFT=55, DRAW_RIGHT=56, PLAYER_ID=57, 
		PLAYERS=58, PLAYER=59, LEFT=60, RIGHT=61, TASKS=62, TOKENS=63, TOKEN=64, 
		O_T=65, DISTRESS_SIGNAL=66, CONSTRAINTS=67, ON=68, OFF=69, DISTRIBUTION=70, 
		CDinput=71, NORMAL=72, MISSION=73, VAR=74, WHITE_SPACE=75, COMMENT=76;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "SINGLE_DIGIT", "MULTI_DIGIT", "ZERO", 
			"RULE", "SUIT_VAL", "CARD_VAL", "CARD_DIR", "OP_UNION", "OP_INTERSECT", 
			"OP_COMPLEMENT", "PLUS", "MINUS", "LT", "GT", "LTE", "GTE", "EQ", "LP", 
			"RP", "SETL", "SETR", "IL", "IR", "CARDS", "CARD", "SUIT", "VALUE", "FIRST", 
			"LAST", "ANY", "ALL", "MAX_WINS", "MIN_WINS", "WINS_RULE", "WINS", "DUP", 
			"ORDER", "CDE", "CDWI", "CDI", "PD", "CD", "TRICK", "WIN_TRICK", "DONT_WIN_TRICK", 
			"WIN_CARDS", "DONT_WIN_CARDS", "NO_COM", "LIM_COM", "COM", "DRAW_LEFT", 
			"DRAW_RIGHT", "PLAYER_ID", "PLAYERS", "PLAYER", "LEFT", "RIGHT", "TASKS", 
			"TOKENS", "TOKEN", "O_T", "DISTRESS_SIGNAL", "CONSTRAINTS", "ON", "OFF", 
			"DISTRIBUTION", "CDinput", "NORMAL", "MISSION", "VAR", "WHITE_SPACE", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'nSwap'", "'nSwitch'", null, null, "'0'", "'Rule'", 
			null, null, null, "'|'", "'&'", "'!'", "'+'", "'-'", "'<'", "'>'", "'<='", 
			"'>='", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", null, null, 
			null, null, null, null, null, "'all'", "'maxWins'", "'minWins'", "'WR'", 
			"'wins'", "'dup'", "'order'", "'cde'", "'cdwi'", "'cdi'", "'pd'", "'cd'", 
			null, "'WT'", "'DWT'", "'WC'", "'DWC'", "'NC'", "'LC'", "'c'", "'DCL'", 
			"'DCR'", null, null, null, null, null, null, null, null, null, null, 
			"'ruleDist'", "'on'", "'off'", "'taskDist'", "'cdInput'", "'n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SINGLE_DIGIT", "MULTI_DIGIT", "ZERO", 
			"RULE", "SUIT_VAL", "CARD_VAL", "CARD_DIR", "OP_UNION", "OP_INTERSECT", 
			"OP_COMPLEMENT", "PLUS", "MINUS", "LT", "GT", "LTE", "GTE", "EQ", "LP", 
			"RP", "SETL", "SETR", "IL", "IR", "CARDS", "CARD", "SUIT", "VALUE", "FIRST", 
			"LAST", "ANY", "ALL", "MAX_WINS", "MIN_WINS", "WINS_RULE", "WINS", "DUP", 
			"ORDER", "CDE", "CDWI", "CDI", "PD", "CD", "TRICK", "WIN_TRICK", "DONT_WIN_TRICK", 
			"WIN_CARDS", "DONT_WIN_CARDS", "NO_COM", "LIM_COM", "COM", "DRAW_LEFT", 
			"DRAW_RIGHT", "PLAYER_ID", "PLAYERS", "PLAYER", "LEFT", "RIGHT", "TASKS", 
			"TOKENS", "TOKEN", "O_T", "DISTRESS_SIGNAL", "CONSTRAINTS", "ON", "OFF", 
			"DISTRIBUTION", "CDinput", "NORMAL", "MISSION", "VAR", "WHITE_SPACE", 
			"COMMENT"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u021f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\6\7\u00b2\n\7\r\7\16\7"+
		"\u00b3\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00d6\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\5:\u019f\n:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@"+
		"\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\5B\u01d4\nB\3C\3C\3C"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K"+
		"\3K\3K\7K\u0209\nK\fK\16K\u020c\13K\3L\6L\u020f\nL\rL\16L\u0210\3L\3L"+
		"\3M\3M\3M\3M\7M\u0219\nM\fM\16M\u021c\13M\3M\3M\2\2N\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\3\2\36\3\2\63;\3\2\62;\7\2DDIIRRTT[[\3\2\63\66"+
		"\4\2EEee\4\2CCcc\4\2TTtt\4\2FFff\4\2UUuu\4\2WWww\4\2KKkk\4\2VVvv\4\2X"+
		"Xxx\4\2NNnn\4\2GGgg\4\2HHhh\4\2PPpp\4\2[[{{\4\2MMmm\4\2RRrr\4\2IIii\4"+
		"\2JJjj\4\2QQqq\4\2OOoo\3\2c|\6\2\62;C\\aac|\4\2\13\f\"\"\4\2\f\f\17\17"+
		"\2\u022d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u009d\3\2\2"+
		"\2\7\u009f\3\2\2\2\t\u00a5\3\2\2\2\13\u00ad\3\2\2\2\r\u00af\3\2\2\2\17"+
		"\u00b5\3\2\2\2\21\u00b7\3\2\2\2\23\u00bc\3\2\2\2\25\u00c8\3\2\2\2\27\u00ca"+
		"\3\2\2\2\31\u00d7\3\2\2\2\33\u00d9\3\2\2\2\35\u00db\3\2\2\2\37\u00dd\3"+
		"\2\2\2!\u00df\3\2\2\2#\u00e1\3\2\2\2%\u00e3\3\2\2\2\'\u00e5\3\2\2\2)\u00e8"+
		"\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3\2\2\2/\u00ef\3\2\2\2\61\u00f1\3\2\2\2"+
		"\63\u00f3\3\2\2\2\65\u00f5\3\2\2\2\67\u00f7\3\2\2\29\u00f9\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0104\3\2\2\2?\u0109\3\2\2\2A\u010f\3\2\2\2C\u0115\3\2\2\2E"+
		"\u011a\3\2\2\2G\u011e\3\2\2\2I\u0122\3\2\2\2K\u012a\3\2\2\2M\u0132\3\2"+
		"\2\2O\u0135\3\2\2\2Q\u013a\3\2\2\2S\u013e\3\2\2\2U\u0144\3\2\2\2W\u0148"+
		"\3\2\2\2Y\u014d\3\2\2\2[\u0151\3\2\2\2]\u0154\3\2\2\2_\u0157\3\2\2\2a"+
		"\u015d\3\2\2\2c\u0160\3\2\2\2e\u0164\3\2\2\2g\u0167\3\2\2\2i\u016b\3\2"+
		"\2\2k\u016e\3\2\2\2m\u0171\3\2\2\2o\u0173\3\2\2\2q\u0177\3\2\2\2s\u019e"+
		"\3\2\2\2u\u01a0\3\2\2\2w\u01a8\3\2\2\2y\u01af\3\2\2\2{\u01b5\3\2\2\2}"+
		"\u01bc\3\2\2\2\177\u01c2\3\2\2\2\u0081\u01c9\3\2\2\2\u0083\u01cf\3\2\2"+
		"\2\u0085\u01d5\3\2\2\2\u0087\u01d8\3\2\2\2\u0089\u01e1\3\2\2\2\u008b\u01e4"+
		"\3\2\2\2\u008d\u01e8\3\2\2\2\u008f\u01f1\3\2\2\2\u0091\u01f9\3\2\2\2\u0093"+
		"\u01fb\3\2\2\2\u0095\u0203\3\2\2\2\u0097\u020e\3\2\2\2\u0099\u0214\3\2"+
		"\2\2\u009b\u009c\7<\2\2\u009c\4\3\2\2\2\u009d\u009e\7.\2\2\u009e\6\3\2"+
		"\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7r\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7U\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\u00ac\7j\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae"+
		"\f\3\2\2\2\u00af\u00b1\t\2\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\16"+
		"\3\2\2\2\u00b5\u00b6\7\62\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7T\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7g\2\2\u00bb\22\3\2\2\2\u00bc"+
		"\u00bd\t\4\2\2\u00bd\24\3\2\2\2\u00be\u00bf\7R\2\2\u00bf\u00c9\t\2\2\2"+
		"\u00c0\u00c1\7[\2\2\u00c1\u00c9\t\2\2\2\u00c2\u00c3\7D\2\2\u00c3\u00c9"+
		"\t\2\2\2\u00c4\u00c5\7I\2\2\u00c5\u00c9\t\2\2\2\u00c6\u00c7\7T\2\2\u00c7"+
		"\u00c9\t\5\2\2\u00c8\u00be\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c2\3\2"+
		"\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\26\3\2\2\2\u00ca\u00cb"+
		"\5\25\13\2\u00cb\u00d5\7/\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf\u00d6\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2"+
		"\u00d2\u00d3\7i\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d6\7v\2\2\u00d5\u00cc"+
		"\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\30\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8"+
		"\32\3\2\2\2\u00d9\u00da\7(\2\2\u00da\34\3\2\2\2\u00db\u00dc\7#\2\2\u00dc"+
		"\36\3\2\2\2\u00dd\u00de\7-\2\2\u00de \3\2\2\2\u00df\u00e0\7/\2\2\u00e0"+
		"\"\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4"+
		"&\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7?\2\2\u00e7(\3\2\2\2\u00e8\u00e9"+
		"\7@\2\2\u00e9\u00ea\7?\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec,\3"+
		"\2\2\2\u00ed\u00ee\7*\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7+\2\2\u00f0\60\3"+
		"\2\2\2\u00f1\u00f2\7}\2\2\u00f2\62\3\2\2\2\u00f3\u00f4\7\177\2\2\u00f4"+
		"\64\3\2\2\2\u00f5\u00f6\7]\2\2\u00f6\66\3\2\2\2\u00f7\u00f8\7_\2\2\u00f8"+
		"8\3\2\2\2\u00f9\u00fa\t\6\2\2\u00fa\u00fb\t\7\2\2\u00fb\u00fc\t\b\2\2"+
		"\u00fc\u00fd\t\t\2\2\u00fd\u00fe\t\n\2\2\u00fe:\3\2\2\2\u00ff\u0100\t"+
		"\6\2\2\u0100\u0101\t\7\2\2\u0101\u0102\t\b\2\2\u0102\u0103\t\t\2\2\u0103"+
		"<\3\2\2\2\u0104\u0105\t\n\2\2\u0105\u0106\t\13\2\2\u0106\u0107\t\f\2\2"+
		"\u0107\u0108\t\r\2\2\u0108>\3\2\2\2\u0109\u010a\t\16\2\2\u010a\u010b\t"+
		"\7\2\2\u010b\u010c\t\17\2\2\u010c\u010d\t\13\2\2\u010d\u010e\t\20\2\2"+
		"\u010e@\3\2\2\2\u010f\u0110\t\21\2\2\u0110\u0111\t\f\2\2\u0111\u0112\t"+
		"\b\2\2\u0112\u0113\t\n\2\2\u0113\u0114\t\r\2\2\u0114B\3\2\2\2\u0115\u0116"+
		"\t\17\2\2\u0116\u0117\t\7\2\2\u0117\u0118\t\n\2\2\u0118\u0119\t\r\2\2"+
		"\u0119D\3\2\2\2\u011a\u011b\t\7\2\2\u011b\u011c\t\22\2\2\u011c\u011d\t"+
		"\23\2\2\u011dF\3\2\2\2\u011e\u011f\7c\2\2\u011f\u0120\7n\2\2\u0120\u0121"+
		"\7n\2\2\u0121H\3\2\2\2\u0122\u0123\7o\2\2\u0123\u0124\7c\2\2\u0124\u0125"+
		"\7z\2\2\u0125\u0126\7Y\2\2\u0126\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128"+
		"\u0129\7u\2\2\u0129J\3\2\2\2\u012a\u012b\7o\2\2\u012b\u012c\7k\2\2\u012c"+
		"\u012d\7p\2\2\u012d\u012e\7Y\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2"+
		"\u0130\u0131\7u\2\2\u0131L\3\2\2\2\u0132\u0133\7Y\2\2\u0133\u0134\7T\2"+
		"\2\u0134N\3\2\2\2\u0135\u0136\7y\2\2\u0136\u0137\7k\2\2\u0137\u0138\7"+
		"p\2\2\u0138\u0139\7u\2\2\u0139P\3\2\2\2\u013a\u013b\7f\2\2\u013b\u013c"+
		"\7w\2\2\u013c\u013d\7r\2\2\u013dR\3\2\2\2\u013e\u013f\7q\2\2\u013f\u0140"+
		"\7t\2\2\u0140\u0141\7f\2\2\u0141\u0142\7g\2\2\u0142\u0143\7t\2\2\u0143"+
		"T\3\2\2\2\u0144\u0145\7e\2\2\u0145\u0146\7f\2\2\u0146\u0147\7g\2\2\u0147"+
		"V\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a\7f\2\2\u014a\u014b\7y\2\2\u014b"+
		"\u014c\7k\2\2\u014cX\3\2\2\2\u014d\u014e\7e\2\2\u014e\u014f\7f\2\2\u014f"+
		"\u0150\7k\2\2\u0150Z\3\2\2\2\u0151\u0152\7r\2\2\u0152\u0153\7f\2\2\u0153"+
		"\\\3\2\2\2\u0154\u0155\7e\2\2\u0155\u0156\7f\2\2\u0156^\3\2\2\2\u0157"+
		"\u0158\t\r\2\2\u0158\u0159\t\b\2\2\u0159\u015a\t\f\2\2\u015a\u015b\t\6"+
		"\2\2\u015b\u015c\t\24\2\2\u015c`\3\2\2\2\u015d\u015e\7Y\2\2\u015e\u015f"+
		"\7V\2\2\u015fb\3\2\2\2\u0160\u0161\7F\2\2\u0161\u0162\7Y\2\2\u0162\u0163"+
		"\7V\2\2\u0163d\3\2\2\2\u0164\u0165\7Y\2\2\u0165\u0166\7E\2\2\u0166f\3"+
		"\2\2\2\u0167\u0168\7F\2\2\u0168\u0169\7Y\2\2\u0169\u016a\7E\2\2\u016a"+
		"h\3\2\2\2\u016b\u016c\7P\2\2\u016c\u016d\7E\2\2\u016dj\3\2\2\2\u016e\u016f"+
		"\7N\2\2\u016f\u0170\7E\2\2\u0170l\3\2\2\2\u0171\u0172\7e\2\2\u0172n\3"+
		"\2\2\2\u0173\u0174\7F\2\2\u0174\u0175\7E\2\2\u0175\u0176\7N\2\2\u0176"+
		"p\3\2\2\2\u0177\u0178\7F\2\2\u0178\u0179\7E\2\2\u0179\u017a\7T\2\2\u017a"+
		"r\3\2\2\2\u017b\u017c\7R\2\2\u017c\u017d\7n\2\2\u017d\u017e\7c\2\2\u017e"+
		"\u017f\7{\2\2\u017f\u0180\7g\2\2\u0180\u0181\7t\2\2\u0181\u019f\7\63\2"+
		"\2\u0182\u0183\7R\2\2\u0183\u0184\7n\2\2\u0184\u0185\7c\2\2\u0185\u0186"+
		"\7{\2\2\u0186\u0187\7g\2\2\u0187\u0188\7t\2\2\u0188\u019f\7\64\2\2\u0189"+
		"\u018a\7R\2\2\u018a\u018b\7n\2\2\u018b\u018c\7c\2\2\u018c\u018d\7{\2\2"+
		"\u018d\u018e\7g\2\2\u018e\u018f\7t\2\2\u018f\u019f\7\65\2\2\u0190\u0191"+
		"\7R\2\2\u0191\u0192\7n\2\2\u0192\u0193\7c\2\2\u0193\u0194\7{\2\2\u0194"+
		"\u0195\7g\2\2\u0195\u0196\7t\2\2\u0196\u019f\7\66\2\2\u0197\u0198\7R\2"+
		"\2\u0198\u0199\7n\2\2\u0199\u019a\7c\2\2\u019a\u019b\7{\2\2\u019b\u019c"+
		"\7g\2\2\u019c\u019d\7t\2\2\u019d\u019f\7\67\2\2\u019e\u017b\3\2\2\2\u019e"+
		"\u0182\3\2\2\2\u019e\u0189\3\2\2\2\u019e\u0190\3\2\2\2\u019e\u0197\3\2"+
		"\2\2\u019ft\3\2\2\2\u01a0\u01a1\t\25\2\2\u01a1\u01a2\t\17\2\2\u01a2\u01a3"+
		"\t\7\2\2\u01a3\u01a4\t\23\2\2\u01a4\u01a5\t\20\2\2\u01a5\u01a6\t\b\2\2"+
		"\u01a6\u01a7\t\n\2\2\u01a7v\3\2\2\2\u01a8\u01a9\t\25\2\2\u01a9\u01aa\t"+
		"\17\2\2\u01aa\u01ab\t\7\2\2\u01ab\u01ac\t\23\2\2\u01ac\u01ad\t\20\2\2"+
		"\u01ad\u01ae\t\b\2\2\u01aex\3\2\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1\t\17"+
		"\2\2\u01b1\u01b2\t\20\2\2\u01b2\u01b3\t\21\2\2\u01b3\u01b4\t\r\2\2\u01b4"+
		"z\3\2\2\2\u01b5\u01b6\7/\2\2\u01b6\u01b7\t\b\2\2\u01b7\u01b8\t\f\2\2\u01b8"+
		"\u01b9\t\26\2\2\u01b9\u01ba\t\27\2\2\u01ba\u01bb\t\r\2\2\u01bb|\3\2\2"+
		"\2\u01bc\u01bd\t\r\2\2\u01bd\u01be\t\7\2\2\u01be\u01bf\t\n\2\2\u01bf\u01c0"+
		"\t\24\2\2\u01c0\u01c1\t\n\2\2\u01c1~\3\2\2\2\u01c2\u01c3\t\r\2\2\u01c3"+
		"\u01c4\t\30\2\2\u01c4\u01c5\t\24\2\2\u01c5\u01c6\t\20\2\2\u01c6\u01c7"+
		"\t\22\2\2\u01c7\u01c8\t\n\2\2\u01c8\u0080\3\2\2\2\u01c9\u01ca\t\r\2\2"+
		"\u01ca\u01cb\t\30\2\2\u01cb\u01cc\t\24\2\2\u01cc\u01cd\t\20\2\2\u01cd"+
		"\u01ce\t\22\2\2\u01ce\u0082\3\2\2\2\u01cf\u01d3\7z\2\2\u01d0\u01d4\5\13"+
		"\6\2\u01d1\u01d4\5\r\7\2\u01d2\u01d4\7z\2\2\u01d3\u01d0\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u0084\3\2\2\2\u01d5\u01d6\t\t"+
		"\2\2\u01d6\u01d7\t\n\2\2\u01d7\u0086\3\2\2\2\u01d8\u01d9\7t\2\2\u01d9"+
		"\u01da\7w\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7F\2\2"+
		"\u01dd\u01de\7k\2\2\u01de\u01df\7u\2\2\u01df\u01e0\7v\2\2\u01e0\u0088"+
		"\3\2\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7p\2\2\u01e3\u008a\3\2\2\2\u01e4"+
		"\u01e5\7q\2\2\u01e5\u01e6\7h\2\2\u01e6\u01e7\7h\2\2\u01e7\u008c\3\2\2"+
		"\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7u\2\2\u01eb\u01ec"+
		"\7m\2\2\u01ec\u01ed\7F\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7u\2\2\u01ef"+
		"\u01f0\7v\2\2\u01f0\u008e\3\2\2\2\u01f1\u01f2\7e\2\2\u01f2\u01f3\7f\2"+
		"\2\u01f3\u01f4\7K\2\2\u01f4\u01f5\7p\2\2\u01f5\u01f6\7r\2\2\u01f6\u01f7"+
		"\7w\2\2\u01f7\u01f8\7v\2\2\u01f8\u0090\3\2\2\2\u01f9\u01fa\7p\2\2\u01fa"+
		"\u0092\3\2\2\2\u01fb\u01fc\t\31\2\2\u01fc\u01fd\t\f\2\2\u01fd\u01fe\t"+
		"\n\2\2\u01fe\u01ff\t\n\2\2\u01ff\u0200\t\f\2\2\u0200\u0201\t\30\2\2\u0201"+
		"\u0202\t\22\2\2\u0202\u0094\3\2\2\2\u0203\u0204\7a\2\2\u0204\u0205\7a"+
		"\2\2\u0205\u0206\3\2\2\2\u0206\u020a\t\32\2\2\u0207\u0209\t\33\2\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u0096\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\t\34\2\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\bL\2\2\u0213\u0098\3\2\2\2\u0214"+
		"\u0215\7\61\2\2\u0215\u0216\7\61\2\2\u0216\u021a\3\2\2\2\u0217\u0219\n"+
		"\35\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\bM"+
		"\2\2\u021e\u009a\3\2\2\2\13\2\u00b3\u00c8\u00d5\u019e\u01d3\u020a\u0210"+
		"\u021a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}