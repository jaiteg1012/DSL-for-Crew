// Generated from Grammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_single_interval = 1, RULE_multi_interval = 2, RULE_single_set = 3, 
		RULE_multi_set = 4, RULE_trick_set = 5, RULE_suit_set = 6, RULE_card_set = 7, 
		RULE_player_set = 8, RULE_token_set = 9, RULE_any = 10, RULE_tasks = 11, 
		RULE_d_t = 12, RULE_distribution = 13, RULE_players = 14, RULE_constratints_distribution = 15, 
		RULE_equation = 16, RULE_suit_expr = 17, RULE_value_expr = 18, RULE_card_spec = 19, 
		RULE_card_expr = 20, RULE_trick_expr = 21, RULE_player_expr = 22, RULE_token_expr = 23, 
		RULE_rules = 24, RULE_nSwap = 25, RULE_nSwitch = 26, RULE_tokens = 27, 
		RULE_mission = 28, RULE_var_dec = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "single_interval", "multi_interval", "single_set", "multi_set", 
			"trick_set", "suit_set", "card_set", "player_set", "token_set", "any", 
			"tasks", "d_t", "distribution", "players", "constratints_distribution", 
			"equation", "suit_expr", "value_expr", "card_spec", "card_expr", "trick_expr", 
			"player_expr", "token_expr", "rules", "nSwap", "nSwitch", "tokens", "mission", 
			"var_dec"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<MissionContext> mission() {
			return getRuleContexts(MissionContext.class);
		}
		public MissionContext mission(int i) {
			return getRuleContext(MissionContext.class,i);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<Suit_exprContext> suit_expr() {
			return getRuleContexts(Suit_exprContext.class);
		}
		public Suit_exprContext suit_expr(int i) {
			return getRuleContext(Suit_exprContext.class,i);
		}
		public List<Value_exprContext> value_expr() {
			return getRuleContexts(Value_exprContext.class);
		}
		public Value_exprContext value_expr(int i) {
			return getRuleContext(Value_exprContext.class,i);
		}
		public List<Card_specContext> card_spec() {
			return getRuleContexts(Card_specContext.class);
		}
		public Card_specContext card_spec(int i) {
			return getRuleContext(Card_specContext.class,i);
		}
		public List<Card_exprContext> card_expr() {
			return getRuleContexts(Card_exprContext.class);
		}
		public Card_exprContext card_expr(int i) {
			return getRuleContext(Card_exprContext.class,i);
		}
		public List<Trick_exprContext> trick_expr() {
			return getRuleContexts(Trick_exprContext.class);
		}
		public Trick_exprContext trick_expr(int i) {
			return getRuleContext(Trick_exprContext.class,i);
		}
		public List<Player_exprContext> player_expr() {
			return getRuleContexts(Player_exprContext.class);
		}
		public Player_exprContext player_expr(int i) {
			return getRuleContext(Player_exprContext.class,i);
		}
		public List<Token_exprContext> token_expr() {
			return getRuleContexts(Token_exprContext.class);
		}
		public Token_exprContext token_expr(int i) {
			return getRuleContext(Token_exprContext.class,i);
		}
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					mission();
					}
					break;
				case 2:
					{
					setState(61);
					equation(0);
					}
					break;
				case 3:
					{
					setState(62);
					suit_expr(0);
					}
					break;
				case 4:
					{
					setState(63);
					value_expr(0);
					}
					break;
				case 5:
					{
					setState(64);
					card_spec();
					}
					break;
				case 6:
					{
					setState(65);
					card_expr(0);
					}
					break;
				case 7:
					{
					setState(66);
					trick_expr(0);
					}
					break;
				case 8:
					{
					setState(67);
					player_expr(0);
					}
					break;
				case 9:
					{
					setState(68);
					token_expr(0);
					}
					break;
				case 10:
					{
					setState(69);
					var_dec();
					}
					break;
				case 11:
					{
					setState(70);
					suit_expr(0);
					}
					break;
				case 12:
					{
					setState(71);
					value_expr(0);
					}
					break;
				case 13:
					{
					setState(72);
					card_spec();
					}
					break;
				case 14:
					{
					setState(73);
					card_expr(0);
					}
					break;
				case 15:
					{
					setState(74);
					trick_expr(0);
					}
					break;
				case 16:
					{
					setState(75);
					player_expr(0);
					}
					break;
				case 17:
					{
					setState(76);
					token_expr(0);
					}
					break;
				case 18:
					{
					setState(77);
					rules();
					}
					break;
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_DIGIT) | (1L << MULTI_DIGIT) | (1L << OP_COMPLEMENT) | (1L << LP) | (1L << SETL) | (1L << IL) | (1L << CARDS) | (1L << MAX_WINS) | (1L << MIN_WINS) | (1L << WINS_RULE) | (1L << WIN_TRICK) | (1L << DONT_WIN_TRICK) | (1L << WIN_CARDS) | (1L << DONT_WIN_CARDS) | (1L << NO_COM) | (1L << LIM_COM) | (1L << DRAW_LEFT) | (1L << DRAW_RIGHT))) != 0) || _la==MISSION || _la==VAR );
			setState(82);
			match(EOF);
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

	public static class Single_intervalContext extends ParserRuleContext {
		public TerminalNode IL() { return getToken(GrammarParser.IL, 0); }
		public List<TerminalNode> SINGLE_DIGIT() { return getTokens(GrammarParser.SINGLE_DIGIT); }
		public TerminalNode SINGLE_DIGIT(int i) {
			return getToken(GrammarParser.SINGLE_DIGIT, i);
		}
		public TerminalNode IR() { return getToken(GrammarParser.IR, 0); }
		public Single_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingle_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingle_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSingle_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_intervalContext single_interval() throws RecognitionException {
		Single_intervalContext _localctx = new Single_intervalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IL);
			setState(85);
			match(SINGLE_DIGIT);
			setState(86);
			match(T__0);
			setState(87);
			match(SINGLE_DIGIT);
			setState(88);
			match(IR);
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

	public static class Multi_intervalContext extends ParserRuleContext {
		public TerminalNode IL() { return getToken(GrammarParser.IL, 0); }
		public TerminalNode IR() { return getToken(GrammarParser.IR, 0); }
		public List<TerminalNode> SINGLE_DIGIT() { return getTokens(GrammarParser.SINGLE_DIGIT); }
		public TerminalNode SINGLE_DIGIT(int i) {
			return getToken(GrammarParser.SINGLE_DIGIT, i);
		}
		public List<TerminalNode> MULTI_DIGIT() { return getTokens(GrammarParser.MULTI_DIGIT); }
		public TerminalNode MULTI_DIGIT(int i) {
			return getToken(GrammarParser.MULTI_DIGIT, i);
		}
		public Multi_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulti_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulti_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulti_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_intervalContext multi_interval() throws RecognitionException {
		Multi_intervalContext _localctx = new Multi_intervalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multi_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IL);
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_DIGIT || _la==MULTI_DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			match(T__0);
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_DIGIT || _la==MULTI_DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			match(IR);
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

	public static class Single_setContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public List<TerminalNode> SINGLE_DIGIT() { return getTokens(GrammarParser.SINGLE_DIGIT); }
		public TerminalNode SINGLE_DIGIT(int i) {
			return getToken(GrammarParser.SINGLE_DIGIT, i);
		}
		public Single_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingle_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingle_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSingle_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_setContext single_set() throws RecognitionException {
		Single_setContext _localctx = new Single_setContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(SETL);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(SINGLE_DIGIT);
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SINGLE_DIGIT );
			setState(102);
			match(SETR);
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

	public static class Multi_setContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public List<TerminalNode> SINGLE_DIGIT() { return getTokens(GrammarParser.SINGLE_DIGIT); }
		public TerminalNode SINGLE_DIGIT(int i) {
			return getToken(GrammarParser.SINGLE_DIGIT, i);
		}
		public List<TerminalNode> MULTI_DIGIT() { return getTokens(GrammarParser.MULTI_DIGIT); }
		public TerminalNode MULTI_DIGIT(int i) {
			return getToken(GrammarParser.MULTI_DIGIT, i);
		}
		public Multi_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulti_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulti_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulti_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_setContext multi_set() throws RecognitionException {
		Multi_setContext _localctx = new Multi_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multi_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(SETL);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_DIGIT || _la==MULTI_DIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SINGLE_DIGIT || _la==MULTI_DIGIT );
			setState(110);
			match(SETR);
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

	public static class Trick_setContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public List<TerminalNode> SINGLE_DIGIT() { return getTokens(GrammarParser.SINGLE_DIGIT); }
		public TerminalNode SINGLE_DIGIT(int i) {
			return getToken(GrammarParser.SINGLE_DIGIT, i);
		}
		public List<TerminalNode> MULTI_DIGIT() { return getTokens(GrammarParser.MULTI_DIGIT); }
		public TerminalNode MULTI_DIGIT(int i) {
			return getToken(GrammarParser.MULTI_DIGIT, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(GrammarParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(GrammarParser.FIRST, i);
		}
		public List<TerminalNode> LAST() { return getTokens(GrammarParser.LAST); }
		public TerminalNode LAST(int i) {
			return getToken(GrammarParser.LAST, i);
		}
		public Trick_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trick_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trick_setContext trick_set() throws RecognitionException {
		Trick_setContext _localctx = new Trick_setContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_trick_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SETL);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_DIGIT) | (1L << MULTI_DIGIT) | (1L << FIRST) | (1L << LAST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_DIGIT) | (1L << MULTI_DIGIT) | (1L << FIRST) | (1L << LAST))) != 0) );
			setState(118);
			match(SETR);
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

	public static class Suit_setContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public List<TerminalNode> SUIT_VAL() { return getTokens(GrammarParser.SUIT_VAL); }
		public TerminalNode SUIT_VAL(int i) {
			return getToken(GrammarParser.SUIT_VAL, i);
		}
		public Suit_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suit_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSuit_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSuit_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSuit_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Suit_setContext suit_set() throws RecognitionException {
		Suit_setContext _localctx = new Suit_setContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_suit_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SETL);
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				match(SUIT_VAL);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SUIT_VAL );
			setState(126);
			match(SETR);
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

	public static class Card_setContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public List<TerminalNode> CARD_VAL() { return getTokens(GrammarParser.CARD_VAL); }
		public TerminalNode CARD_VAL(int i) {
			return getToken(GrammarParser.CARD_VAL, i);
		}
		public Card_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Card_setContext card_set() throws RecognitionException {
		Card_setContext _localctx = new Card_setContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_card_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SETL);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				match(CARD_VAL);
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CARD_VAL );
			setState(134);
			match(SETR);
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

	public static class Player_setContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public List<TerminalNode> PLAYER_ID() { return getTokens(GrammarParser.PLAYER_ID); }
		public TerminalNode PLAYER_ID(int i) {
			return getToken(GrammarParser.PLAYER_ID, i);
		}
		public List<TerminalNode> CARD_VAL() { return getTokens(GrammarParser.CARD_VAL); }
		public TerminalNode CARD_VAL(int i) {
			return getToken(GrammarParser.CARD_VAL, i);
		}
		public List<TerminalNode> CARD_DIR() { return getTokens(GrammarParser.CARD_DIR); }
		public TerminalNode CARD_DIR(int i) {
			return getToken(GrammarParser.CARD_DIR, i);
		}
		public Player_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayer_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayer_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayer_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Player_setContext player_set() throws RecognitionException {
		Player_setContext _localctx = new Player_setContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_player_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(SETL);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLAYER_ID:
					{
					setState(137);
					match(PLAYER_ID);
					}
					break;
				case CARD_VAL:
				case CARD_DIR:
					{
					setState(138);
					_la = _input.LA(1);
					if ( !(_la==CARD_VAL || _la==CARD_DIR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARD_VAL) | (1L << CARD_DIR) | (1L << PLAYER_ID))) != 0) );
			setState(143);
			match(SETR);
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

	public static class Token_setContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public List<TerminalNode> SINGLE_DIGIT() { return getTokens(GrammarParser.SINGLE_DIGIT); }
		public TerminalNode SINGLE_DIGIT(int i) {
			return getToken(GrammarParser.SINGLE_DIGIT, i);
		}
		public List<TerminalNode> MULTI_DIGIT() { return getTokens(GrammarParser.MULTI_DIGIT); }
		public TerminalNode MULTI_DIGIT(int i) {
			return getToken(GrammarParser.MULTI_DIGIT, i);
		}
		public List<TerminalNode> O_T() { return getTokens(GrammarParser.O_T); }
		public TerminalNode O_T(int i) {
			return getToken(GrammarParser.O_T, i);
		}
		public Token_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_setContext token_set() throws RecognitionException {
		Token_setContext _localctx = new Token_setContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_token_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(SETL);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (SINGLE_DIGIT - 5)) | (1L << (MULTI_DIGIT - 5)) | (1L << (O_T - 5)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (SINGLE_DIGIT - 5)) | (1L << (MULTI_DIGIT - 5)) | (1L << (O_T - 5)))) != 0) );
			setState(151);
			match(SETR);
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

	public static class AnyContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(GrammarParser.ANY, 0); }
		public TerminalNode SINGLE_DIGIT() { return getToken(GrammarParser.SINGLE_DIGIT, 0); }
		public TerminalNode MULTI_DIGIT() { return getToken(GrammarParser.MULTI_DIGIT, 0); }
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ANY);
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_DIGIT || _la==MULTI_DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TasksContext extends ParserRuleContext {
		public TerminalNode TASKS() { return getToken(GrammarParser.TASKS, 0); }
		public TerminalNode ZERO() { return getToken(GrammarParser.ZERO, 0); }
		public TerminalNode SINGLE_DIGIT() { return getToken(GrammarParser.SINGLE_DIGIT, 0); }
		public TerminalNode MULTI_DIGIT() { return getToken(GrammarParser.MULTI_DIGIT, 0); }
		public TasksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tasks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTasks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTasks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTasks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TasksContext tasks() throws RecognitionException {
		TasksContext _localctx = new TasksContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tasks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TASKS);
			setState(157);
			match(T__0);
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_DIGIT) | (1L << MULTI_DIGIT) | (1L << ZERO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class D_tContext extends ParserRuleContext {
		public TerminalNode DISTRESS_SIGNAL() { return getToken(GrammarParser.DISTRESS_SIGNAL, 0); }
		public TerminalNode ON() { return getToken(GrammarParser.ON, 0); }
		public TerminalNode OFF() { return getToken(GrammarParser.OFF, 0); }
		public D_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterD_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitD_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitD_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_tContext d_t() throws RecognitionException {
		D_tContext _localctx = new D_tContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_d_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(DISTRESS_SIGNAL);
			setState(161);
			match(T__0);
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==ON || _la==OFF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DistributionContext extends ParserRuleContext {
		public TerminalNode DISTRIBUTION() { return getToken(GrammarParser.DISTRIBUTION, 0); }
		public TerminalNode CDE() { return getToken(GrammarParser.CDE, 0); }
		public TerminalNode CDI() { return getToken(GrammarParser.CDI, 0); }
		public TerminalNode NORMAL() { return getToken(GrammarParser.NORMAL, 0); }
		public DistributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDistribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDistribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDistribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistributionContext distribution() throws RecognitionException {
		DistributionContext _localctx = new DistributionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_distribution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(DISTRIBUTION);
			setState(165);
			match(T__0);
			setState(166);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (CDE - 42)) | (1L << (CDI - 42)) | (1L << (NORMAL - 42)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class PlayersContext extends ParserRuleContext {
		public TerminalNode PLAYERS() { return getToken(GrammarParser.PLAYERS, 0); }
		public TerminalNode SINGLE_DIGIT() { return getToken(GrammarParser.SINGLE_DIGIT, 0); }
		public PlayersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_players; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayersContext players() throws RecognitionException {
		PlayersContext _localctx = new PlayersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_players);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PLAYERS);
			setState(169);
			match(T__0);
			setState(170);
			match(SINGLE_DIGIT);
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

	public static class Constratints_distributionContext extends ParserRuleContext {
		public TerminalNode CONSTRAINTS() { return getToken(GrammarParser.CONSTRAINTS, 0); }
		public TerminalNode CDE() { return getToken(GrammarParser.CDE, 0); }
		public TerminalNode PD() { return getToken(GrammarParser.PD, 0); }
		public TerminalNode CDWI() { return getToken(GrammarParser.CDWI, 0); }
		public Constratints_distributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constratints_distribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConstratints_distribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConstratints_distribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConstratints_distribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constratints_distributionContext constratints_distribution() throws RecognitionException {
		Constratints_distributionContext _localctx = new Constratints_distributionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constratints_distribution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(CONSTRAINTS);
			setState(173);
			match(T__0);
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CDE) | (1L << CDWI) | (1L << PD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class EquationContext extends ParserRuleContext {
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	 
		public EquationContext() { }
		public void copyFrom(EquationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Eq_MaxWinsContext extends EquationContext {
		public TerminalNode MAX_WINS() { return getToken(GrammarParser.MAX_WINS, 0); }
		public Eq_MaxWinsContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_MaxWins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_MaxWins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_MaxWins(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_MinWinsContext extends EquationContext {
		public TerminalNode MIN_WINS() { return getToken(GrammarParser.MIN_WINS, 0); }
		public Eq_MinWinsContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_MinWins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_MinWins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_MinWins(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_MultiDigitContext extends EquationContext {
		public TerminalNode MULTI_DIGIT() { return getToken(GrammarParser.MULTI_DIGIT, 0); }
		public Eq_MultiDigitContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_MultiDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_MultiDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_MultiDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_SubtractContext extends EquationContext {
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Eq_SubtractContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_Subtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_Subtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_Subtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_varContext extends EquationContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public Eq_varContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_SingleDigitContext extends EquationContext {
		public TerminalNode SINGLE_DIGIT() { return getToken(GrammarParser.SINGLE_DIGIT, 0); }
		public Eq_SingleDigitContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_SingleDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_SingleDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_SingleDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_AddContext extends EquationContext {
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Eq_AddContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_Add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_Add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_Add(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_ParanthesisContext extends EquationContext {
		public TerminalNode LP() { return getToken(GrammarParser.LP, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode RP() { return getToken(GrammarParser.RP, 0); }
		public Eq_ParanthesisContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq_Paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq_Paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEq_Paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		return equation(0);
	}

	private EquationContext equation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EquationContext _localctx = new EquationContext(_ctx, _parentState);
		EquationContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_equation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new Eq_ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				match(LP);
				setState(178);
				equation(0);
				setState(179);
				match(RP);
				}
				break;
			case MAX_WINS:
				{
				_localctx = new Eq_MaxWinsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(MAX_WINS);
				}
				break;
			case MIN_WINS:
				{
				_localctx = new Eq_MinWinsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(MIN_WINS);
				}
				break;
			case VAR:
				{
				_localctx = new Eq_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(VAR);
				}
				break;
			case SINGLE_DIGIT:
				{
				_localctx = new Eq_SingleDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(SINGLE_DIGIT);
				}
				break;
			case MULTI_DIGIT:
				{
				_localctx = new Eq_MultiDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(MULTI_DIGIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Eq_AddContext(new EquationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equation);
						setState(188);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(189);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						equation(8);
						}
						break;
					case 2:
						{
						_localctx = new Eq_SubtractContext(new EquationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equation);
						setState(191);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(192);
						match(MINUS);
						setState(193);
						equation(7);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Suit_exprContext extends ParserRuleContext {
		public Suit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suit_expr; }
	 
		public Suit_exprContext() { }
		public void copyFrom(Suit_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Suit_expr_suit_setContext extends Suit_exprContext {
		public Suit_setContext suit_set() {
			return getRuleContext(Suit_setContext.class,0);
		}
		public Suit_expr_suit_setContext(Suit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSuit_expr_suit_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSuit_expr_suit_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSuit_expr_suit_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Suit_expr_unionContext extends Suit_exprContext {
		public List<Suit_exprContext> suit_expr() {
			return getRuleContexts(Suit_exprContext.class);
		}
		public Suit_exprContext suit_expr(int i) {
			return getRuleContext(Suit_exprContext.class,i);
		}
		public TerminalNode OP_UNION() { return getToken(GrammarParser.OP_UNION, 0); }
		public Suit_expr_unionContext(Suit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSuit_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSuit_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSuit_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Suit_expr_varContext extends Suit_exprContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public Suit_expr_varContext(Suit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSuit_expr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSuit_expr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSuit_expr_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Suit_expr_intersectContext extends Suit_exprContext {
		public List<Suit_exprContext> suit_expr() {
			return getRuleContexts(Suit_exprContext.class);
		}
		public Suit_exprContext suit_expr(int i) {
			return getRuleContext(Suit_exprContext.class,i);
		}
		public TerminalNode OP_INTERSECT() { return getToken(GrammarParser.OP_INTERSECT, 0); }
		public Suit_expr_intersectContext(Suit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSuit_expr_intersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSuit_expr_intersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSuit_expr_intersect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Suit_expr_complementContext extends Suit_exprContext {
		public TerminalNode OP_COMPLEMENT() { return getToken(GrammarParser.OP_COMPLEMENT, 0); }
		public Suit_exprContext suit_expr() {
			return getRuleContext(Suit_exprContext.class,0);
		}
		public Suit_expr_complementContext(Suit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSuit_expr_complement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSuit_expr_complement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSuit_expr_complement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Suit_expr_paranthesisContext extends Suit_exprContext {
		public TerminalNode LP() { return getToken(GrammarParser.LP, 0); }
		public Suit_exprContext suit_expr() {
			return getRuleContext(Suit_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GrammarParser.RP, 0); }
		public Suit_expr_paranthesisContext(Suit_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSuit_expr_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSuit_expr_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSuit_expr_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Suit_exprContext suit_expr() throws RecognitionException {
		return suit_expr(0);
	}

	private Suit_exprContext suit_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Suit_exprContext _localctx = new Suit_exprContext(_ctx, _parentState);
		Suit_exprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_suit_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new Suit_expr_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200);
				match(LP);
				setState(201);
				suit_expr(0);
				setState(202);
				match(RP);
				}
				break;
			case OP_COMPLEMENT:
				{
				_localctx = new Suit_expr_complementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(OP_COMPLEMENT);
				setState(205);
				suit_expr(3);
				}
				break;
			case VAR:
				{
				_localctx = new Suit_expr_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(VAR);
				}
				break;
			case SETL:
				{
				_localctx = new Suit_expr_suit_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				suit_set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Suit_expr_unionContext(new Suit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_suit_expr);
						setState(210);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(211);
						match(OP_UNION);
						setState(212);
						suit_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Suit_expr_intersectContext(new Suit_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_suit_expr);
						setState(213);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(214);
						match(OP_INTERSECT);
						setState(215);
						suit_expr(5);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Value_exprContext extends ParserRuleContext {
		public Value_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expr; }
	 
		public Value_exprContext() { }
		public void copyFrom(Value_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Value_expr_unionContext extends Value_exprContext {
		public List<Value_exprContext> value_expr() {
			return getRuleContexts(Value_exprContext.class);
		}
		public Value_exprContext value_expr(int i) {
			return getRuleContext(Value_exprContext.class,i);
		}
		public TerminalNode OP_UNION() { return getToken(GrammarParser.OP_UNION, 0); }
		public Value_expr_unionContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_expr_single_setContext extends Value_exprContext {
		public Single_setContext single_set() {
			return getRuleContext(Single_setContext.class,0);
		}
		public Value_expr_single_setContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_expr_single_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_expr_single_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_expr_single_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_expr_single_intervalContext extends Value_exprContext {
		public Single_intervalContext single_interval() {
			return getRuleContext(Single_intervalContext.class,0);
		}
		public Value_expr_single_intervalContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_expr_single_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_expr_single_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_expr_single_interval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_expr_complementContext extends Value_exprContext {
		public TerminalNode OP_COMPLEMENT() { return getToken(GrammarParser.OP_COMPLEMENT, 0); }
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public Value_expr_complementContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_expr_complement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_expr_complement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_expr_complement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_expr_paranthesisContext extends Value_exprContext {
		public TerminalNode LP() { return getToken(GrammarParser.LP, 0); }
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GrammarParser.RP, 0); }
		public Value_expr_paranthesisContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_expr_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_expr_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_expr_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_expr_intersectContext extends Value_exprContext {
		public List<Value_exprContext> value_expr() {
			return getRuleContexts(Value_exprContext.class);
		}
		public Value_exprContext value_expr(int i) {
			return getRuleContext(Value_exprContext.class,i);
		}
		public TerminalNode OP_INTERSECT() { return getToken(GrammarParser.OP_INTERSECT, 0); }
		public Value_expr_intersectContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_expr_intersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_expr_intersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_expr_intersect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_expr_varContext extends Value_exprContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public Value_expr_varContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue_expr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue_expr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue_expr_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_exprContext value_expr() throws RecognitionException {
		return value_expr(0);
	}

	private Value_exprContext value_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Value_exprContext _localctx = new Value_exprContext(_ctx, _parentState);
		Value_exprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_value_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new Value_expr_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				match(LP);
				setState(223);
				value_expr(0);
				setState(224);
				match(RP);
				}
				break;
			case OP_COMPLEMENT:
				{
				_localctx = new Value_expr_complementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(OP_COMPLEMENT);
				setState(227);
				value_expr(4);
				}
				break;
			case VAR:
				{
				_localctx = new Value_expr_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(VAR);
				}
				break;
			case SETL:
				{
				_localctx = new Value_expr_single_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				single_set();
				}
				break;
			case IL:
				{
				_localctx = new Value_expr_single_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				single_interval();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Value_expr_unionContext(new Value_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value_expr);
						setState(233);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(234);
						match(OP_UNION);
						setState(235);
						value_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Value_expr_intersectContext(new Value_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value_expr);
						setState(236);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(237);
						match(OP_INTERSECT);
						setState(238);
						value_expr(6);
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Card_specContext extends ParserRuleContext {
		public TerminalNode CARDS() { return getToken(GrammarParser.CARDS, 0); }
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SUIT() { return getToken(GrammarParser.SUIT, 0); }
		public TerminalNode VALUE() { return getToken(GrammarParser.VALUE, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public Suit_exprContext suit_expr() {
			return getRuleContext(Suit_exprContext.class,0);
		}
		public List<TerminalNode> ALL() { return getTokens(GrammarParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(GrammarParser.ALL, i);
		}
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public Card_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Card_specContext card_spec() throws RecognitionException {
		Card_specContext _localctx = new Card_specContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_card_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CARDS);
			setState(245);
			match(SETL);
			setState(246);
			match(SUIT);
			setState(247);
			match(T__0);
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_COMPLEMENT:
			case LP:
			case SETL:
			case VAR:
				{
				setState(248);
				suit_expr(0);
				}
				break;
			case ALL:
				{
				setState(249);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(252);
			match(VALUE);
			setState(253);
			match(T__0);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_COMPLEMENT:
			case LP:
			case SETL:
			case IL:
			case VAR:
				{
				setState(254);
				value_expr(0);
				}
				break;
			case ALL:
				{
				setState(255);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			match(SETR);
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

	public static class Card_exprContext extends ParserRuleContext {
		public Card_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_expr; }
	 
		public Card_exprContext() { }
		public void copyFrom(Card_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Card_expr_varContext extends Card_exprContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public Card_expr_varContext(Card_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_expr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_expr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_expr_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Card_expr_card_specContext extends Card_exprContext {
		public Card_specContext card_spec() {
			return getRuleContext(Card_specContext.class,0);
		}
		public Card_expr_card_specContext(Card_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_expr_card_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_expr_card_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_expr_card_spec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Card_expr_paranthesisContext extends Card_exprContext {
		public TerminalNode LP() { return getToken(GrammarParser.LP, 0); }
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GrammarParser.RP, 0); }
		public Card_expr_paranthesisContext(Card_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_expr_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_expr_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_expr_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Card_expr_intersectContext extends Card_exprContext {
		public List<Card_exprContext> card_expr() {
			return getRuleContexts(Card_exprContext.class);
		}
		public Card_exprContext card_expr(int i) {
			return getRuleContext(Card_exprContext.class,i);
		}
		public TerminalNode OP_INTERSECT() { return getToken(GrammarParser.OP_INTERSECT, 0); }
		public Card_expr_intersectContext(Card_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_expr_intersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_expr_intersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_expr_intersect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Card_expr_card_setContext extends Card_exprContext {
		public Card_setContext card_set() {
			return getRuleContext(Card_setContext.class,0);
		}
		public Card_expr_card_setContext(Card_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_expr_card_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_expr_card_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_expr_card_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Card_expr_complementContext extends Card_exprContext {
		public TerminalNode OP_COMPLEMENT() { return getToken(GrammarParser.OP_COMPLEMENT, 0); }
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public Card_expr_complementContext(Card_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_expr_complement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_expr_complement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_expr_complement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Card_expr_unionContext extends Card_exprContext {
		public List<Card_exprContext> card_expr() {
			return getRuleContexts(Card_exprContext.class);
		}
		public Card_exprContext card_expr(int i) {
			return getRuleContext(Card_exprContext.class,i);
		}
		public TerminalNode OP_UNION() { return getToken(GrammarParser.OP_UNION, 0); }
		public Card_expr_unionContext(Card_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCard_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCard_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCard_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Card_exprContext card_expr() throws RecognitionException {
		return card_expr(0);
	}

	private Card_exprContext card_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Card_exprContext _localctx = new Card_exprContext(_ctx, _parentState);
		Card_exprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_card_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new Card_expr_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				match(LP);
				setState(262);
				card_expr(0);
				setState(263);
				match(RP);
				}
				break;
			case OP_COMPLEMENT:
				{
				_localctx = new Card_expr_complementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(OP_COMPLEMENT);
				setState(266);
				card_expr(4);
				}
				break;
			case VAR:
				{
				_localctx = new Card_expr_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(VAR);
				}
				break;
			case SETL:
				{
				_localctx = new Card_expr_card_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				card_set();
				}
				break;
			case CARDS:
				{
				_localctx = new Card_expr_card_specContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				card_spec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Card_expr_unionContext(new Card_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_card_expr);
						setState(272);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(273);
						match(OP_UNION);
						setState(274);
						card_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Card_expr_intersectContext(new Card_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_card_expr);
						setState(275);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(276);
						match(OP_INTERSECT);
						setState(277);
						card_expr(6);
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Trick_exprContext extends ParserRuleContext {
		public Trick_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trick_expr; }
	 
		public Trick_exprContext() { }
		public void copyFrom(Trick_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Trick_expr_varContext extends Trick_exprContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public Trick_expr_varContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_trick_setContext extends Trick_exprContext {
		public Trick_setContext trick_set() {
			return getRuleContext(Trick_setContext.class,0);
		}
		public Trick_expr_trick_setContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_trick_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_trick_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_trick_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_single_setContext extends Trick_exprContext {
		public Single_setContext single_set() {
			return getRuleContext(Single_setContext.class,0);
		}
		public Trick_expr_single_setContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_single_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_single_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_single_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_multi_intervalContext extends Trick_exprContext {
		public Multi_intervalContext multi_interval() {
			return getRuleContext(Multi_intervalContext.class,0);
		}
		public Trick_expr_multi_intervalContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_multi_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_multi_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_multi_interval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_complementContext extends Trick_exprContext {
		public TerminalNode OP_COMPLEMENT() { return getToken(GrammarParser.OP_COMPLEMENT, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public Trick_expr_complementContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_complement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_complement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_complement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_single_intervalContext extends Trick_exprContext {
		public Single_intervalContext single_interval() {
			return getRuleContext(Single_intervalContext.class,0);
		}
		public Trick_expr_single_intervalContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_single_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_single_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_single_interval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_multi_setContext extends Trick_exprContext {
		public Multi_setContext multi_set() {
			return getRuleContext(Multi_setContext.class,0);
		}
		public Trick_expr_multi_setContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_multi_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_multi_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_multi_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_paranthesisContext extends Trick_exprContext {
		public TerminalNode LP() { return getToken(GrammarParser.LP, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GrammarParser.RP, 0); }
		public Trick_expr_paranthesisContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_unionContext extends Trick_exprContext {
		public List<Trick_exprContext> trick_expr() {
			return getRuleContexts(Trick_exprContext.class);
		}
		public Trick_exprContext trick_expr(int i) {
			return getRuleContext(Trick_exprContext.class,i);
		}
		public TerminalNode OP_UNION() { return getToken(GrammarParser.OP_UNION, 0); }
		public Trick_expr_unionContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trick_expr_intersectContext extends Trick_exprContext {
		public List<Trick_exprContext> trick_expr() {
			return getRuleContexts(Trick_exprContext.class);
		}
		public Trick_exprContext trick_expr(int i) {
			return getRuleContext(Trick_exprContext.class,i);
		}
		public TerminalNode OP_INTERSECT() { return getToken(GrammarParser.OP_INTERSECT, 0); }
		public Trick_expr_intersectContext(Trick_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrick_expr_intersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrick_expr_intersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrick_expr_intersect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trick_exprContext trick_expr() throws RecognitionException {
		return trick_expr(0);
	}

	private Trick_exprContext trick_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Trick_exprContext _localctx = new Trick_exprContext(_ctx, _parentState);
		Trick_exprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_trick_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new Trick_expr_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(284);
				match(LP);
				setState(285);
				trick_expr(0);
				setState(286);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new Trick_expr_complementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(OP_COMPLEMENT);
				setState(289);
				trick_expr(7);
				}
				break;
			case 3:
				{
				_localctx = new Trick_expr_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(VAR);
				}
				break;
			case 4:
				{
				_localctx = new Trick_expr_single_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				single_set();
				}
				break;
			case 5:
				{
				_localctx = new Trick_expr_multi_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				multi_set();
				}
				break;
			case 6:
				{
				_localctx = new Trick_expr_trick_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				trick_set();
				}
				break;
			case 7:
				{
				_localctx = new Trick_expr_single_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				single_interval();
				}
				break;
			case 8:
				{
				_localctx = new Trick_expr_multi_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				multi_interval();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new Trick_expr_unionContext(new Trick_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_trick_expr);
						setState(298);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(299);
						match(OP_UNION);
						setState(300);
						trick_expr(10);
						}
						break;
					case 2:
						{
						_localctx = new Trick_expr_intersectContext(new Trick_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_trick_expr);
						setState(301);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(302);
						match(OP_INTERSECT);
						setState(303);
						trick_expr(9);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Player_exprContext extends ParserRuleContext {
		public Player_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_expr; }
	 
		public Player_exprContext() { }
		public void copyFrom(Player_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Player_expr_variableContext extends Player_exprContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public Player_expr_variableContext(Player_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayer_expr_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayer_expr_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayer_expr_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Player_expr_intersectContext extends Player_exprContext {
		public List<Player_exprContext> player_expr() {
			return getRuleContexts(Player_exprContext.class);
		}
		public Player_exprContext player_expr(int i) {
			return getRuleContext(Player_exprContext.class,i);
		}
		public TerminalNode OP_INTERSECT() { return getToken(GrammarParser.OP_INTERSECT, 0); }
		public Player_expr_intersectContext(Player_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayer_expr_intersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayer_expr_intersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayer_expr_intersect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Player_expr_player_setContext extends Player_exprContext {
		public Player_setContext player_set() {
			return getRuleContext(Player_setContext.class,0);
		}
		public Player_expr_player_setContext(Player_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayer_expr_player_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayer_expr_player_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayer_expr_player_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Player_expr_unionContext extends Player_exprContext {
		public List<Player_exprContext> player_expr() {
			return getRuleContexts(Player_exprContext.class);
		}
		public Player_exprContext player_expr(int i) {
			return getRuleContext(Player_exprContext.class,i);
		}
		public TerminalNode OP_UNION() { return getToken(GrammarParser.OP_UNION, 0); }
		public Player_expr_unionContext(Player_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayer_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayer_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayer_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Player_expr_paranthesisContext extends Player_exprContext {
		public TerminalNode LP() { return getToken(GrammarParser.LP, 0); }
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GrammarParser.RP, 0); }
		public Player_expr_paranthesisContext(Player_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayer_expr_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayer_expr_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayer_expr_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Player_expr_card_exprContext extends Player_exprContext {
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public Player_expr_card_exprContext(Player_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlayer_expr_card_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlayer_expr_card_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlayer_expr_card_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Player_exprContext player_expr() throws RecognitionException {
		return player_expr(0);
	}

	private Player_exprContext player_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Player_exprContext _localctx = new Player_exprContext(_ctx, _parentState);
		Player_exprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_player_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new Player_expr_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(310);
				match(LP);
				setState(311);
				player_expr(0);
				setState(312);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new Player_expr_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new Player_expr_player_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				player_set();
				}
				break;
			case 4:
				{
				_localctx = new Player_expr_card_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				card_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Player_expr_unionContext(new Player_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_player_expr);
						setState(319);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(320);
						match(OP_UNION);
						setState(321);
						player_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Player_expr_intersectContext(new Player_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_player_expr);
						setState(322);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(323);
						match(OP_INTERSECT);
						setState(324);
						player_expr(5);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Token_exprContext extends ParserRuleContext {
		public Token_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_expr; }
	 
		public Token_exprContext() { }
		public void copyFrom(Token_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Token_expr_single_setContext extends Token_exprContext {
		public Single_setContext single_set() {
			return getRuleContext(Single_setContext.class,0);
		}
		public Token_expr_single_setContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_single_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_single_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_single_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_intersectContext extends Token_exprContext {
		public List<Token_exprContext> token_expr() {
			return getRuleContexts(Token_exprContext.class);
		}
		public Token_exprContext token_expr(int i) {
			return getRuleContext(Token_exprContext.class,i);
		}
		public TerminalNode OP_INTERSECT() { return getToken(GrammarParser.OP_INTERSECT, 0); }
		public Token_expr_intersectContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_intersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_intersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_intersect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_single_intervalContext extends Token_exprContext {
		public Single_intervalContext single_interval() {
			return getRuleContext(Single_intervalContext.class,0);
		}
		public Token_expr_single_intervalContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_single_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_single_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_single_interval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_trick_setContext extends Token_exprContext {
		public Trick_setContext trick_set() {
			return getRuleContext(Trick_setContext.class,0);
		}
		public Token_expr_trick_setContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_trick_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_trick_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_trick_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_paranthesisContext extends Token_exprContext {
		public TerminalNode LP() { return getToken(GrammarParser.LP, 0); }
		public Token_exprContext token_expr() {
			return getRuleContext(Token_exprContext.class,0);
		}
		public TerminalNode RP() { return getToken(GrammarParser.RP, 0); }
		public Token_expr_paranthesisContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_multi_setContext extends Token_exprContext {
		public Multi_setContext multi_set() {
			return getRuleContext(Multi_setContext.class,0);
		}
		public Token_expr_multi_setContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_multi_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_multi_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_multi_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_token_setContext extends Token_exprContext {
		public Token_setContext token_set() {
			return getRuleContext(Token_setContext.class,0);
		}
		public Token_expr_token_setContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_token_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_token_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_token_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_unionContext extends Token_exprContext {
		public List<Token_exprContext> token_expr() {
			return getRuleContexts(Token_exprContext.class);
		}
		public Token_exprContext token_expr(int i) {
			return getRuleContext(Token_exprContext.class,i);
		}
		public TerminalNode OP_UNION() { return getToken(GrammarParser.OP_UNION, 0); }
		public Token_expr_unionContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_variableContext extends Token_exprContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public Token_expr_variableContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Token_expr_multi_intervalContext extends Token_exprContext {
		public Multi_intervalContext multi_interval() {
			return getRuleContext(Multi_intervalContext.class,0);
		}
		public Token_expr_multi_intervalContext(Token_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken_expr_multi_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken_expr_multi_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitToken_expr_multi_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_exprContext token_expr() throws RecognitionException {
		return token_expr(0);
	}

	private Token_exprContext token_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Token_exprContext _localctx = new Token_exprContext(_ctx, _parentState);
		Token_exprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_token_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new Token_expr_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(331);
				match(LP);
				setState(332);
				token_expr(0);
				setState(333);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new Token_expr_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new Token_expr_single_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				single_set();
				}
				break;
			case 4:
				{
				_localctx = new Token_expr_multi_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				multi_set();
				}
				break;
			case 5:
				{
				_localctx = new Token_expr_trick_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				trick_set();
				}
				break;
			case 6:
				{
				_localctx = new Token_expr_token_setContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				token_set();
				}
				break;
			case 7:
				{
				_localctx = new Token_expr_single_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				single_interval();
				}
				break;
			case 8:
				{
				_localctx = new Token_expr_multi_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				multi_interval();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new Token_expr_unionContext(new Token_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_token_expr);
						setState(344);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(345);
						match(OP_UNION);
						setState(346);
						token_expr(10);
						}
						break;
					case 2:
						{
						_localctx = new Token_expr_intersectContext(new Token_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_token_expr);
						setState(347);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(348);
						match(OP_INTERSECT);
						setState(349);
						token_expr(9);
						}
						break;
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
	 
		public RulesContext() { }
		public void copyFrom(RulesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DC_ruleContext extends RulesContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public TerminalNode DRAW_LEFT() { return getToken(GrammarParser.DRAW_LEFT, 0); }
		public TerminalNode DRAW_RIGHT() { return getToken(GrammarParser.DRAW_RIGHT, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public DC_ruleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDC_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDC_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDC_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WT_RuleContext extends RulesContext {
		public AnyContext trickAny;
		public AnyContext playerAny;
		public TerminalNode WIN_TRICK() { return getToken(GrammarParser.WIN_TRICK, 0); }
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public TerminalNode ALL() { return getToken(GrammarParser.ALL, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(GrammarParser.ORDER, 0); }
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public WT_RuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWT_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWT_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWT_Rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class COM_ruleContext extends RulesContext {
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public TerminalNode NO_COM() { return getToken(GrammarParser.NO_COM, 0); }
		public TerminalNode LIM_COM() { return getToken(GrammarParser.LIM_COM, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public COM_ruleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCOM_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCOM_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCOM_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WC_RuleContext extends RulesContext {
		public AnyContext cardAny;
		public AnyContext playerAny;
		public TerminalNode WIN_CARDS() { return getToken(GrammarParser.WIN_CARDS, 0); }
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public WC_RuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWC_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWC_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWC_Rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WR_ruleContext extends RulesContext {
		public TerminalNode WINS_RULE() { return getToken(GrammarParser.WINS_RULE, 0); }
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode WINS() { return getToken(GrammarParser.WINS, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public TerminalNode EQ() { return getToken(GrammarParser.EQ, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode GTE() { return getToken(GrammarParser.GTE, 0); }
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(GrammarParser.LTE, 0); }
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public WR_ruleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWR_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWR_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWR_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DWT_RuleContext extends RulesContext {
		public TerminalNode DONT_WIN_TRICK() { return getToken(GrammarParser.DONT_WIN_TRICK, 0); }
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public DWT_RuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDWT_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDWT_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDWT_Rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DWC_RuleContext extends RulesContext {
		public TerminalNode DONT_WIN_CARDS() { return getToken(GrammarParser.DONT_WIN_CARDS, 0); }
		public TerminalNode SETL() { return getToken(GrammarParser.SETL, 0); }
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public TerminalNode SETR() { return getToken(GrammarParser.SETR, 0); }
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public DWC_RuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDWC_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDWC_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDWC_Rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rules);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIN_TRICK:
				_localctx = new WT_RuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(WIN_TRICK);
				setState(356);
				match(SETL);
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(357);
					match(ALL);
					}
					break;
				case OP_COMPLEMENT:
				case LP:
				case SETL:
				case IL:
				case VAR:
					{
					setState(358);
					trick_expr(0);
					}
					break;
				case ANY:
					{
					setState(359);
					((WT_RuleContext)_localctx).trickAny = any();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(362);
					match(ORDER);
					}
				}

				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (OP_COMPLEMENT - 14)) | (1L << (LP - 14)) | (1L << (SETL - 14)) | (1L << (CARDS - 14)) | (1L << (VAR - 14)))) != 0)) {
					{
					setState(365);
					card_expr(0);
					}
				}

				setState(368);
				match(T__1);
				setState(371);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COMPLEMENT:
				case LP:
				case SETL:
				case CARDS:
				case VAR:
					{
					setState(369);
					player_expr(0);
					}
					break;
				case ANY:
					{
					setState(370);
					((WT_RuleContext)_localctx).playerAny = any();
					}
					break;
				case SETR:
					break;
				default:
					break;
				}
				setState(373);
				match(SETR);
				}
				break;
			case DONT_WIN_TRICK:
				_localctx = new DWT_RuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(DONT_WIN_TRICK);
				setState(375);
				match(SETL);
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(376);
					trick_expr(0);
					}
					break;
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (OP_COMPLEMENT - 14)) | (1L << (LP - 14)) | (1L << (SETL - 14)) | (1L << (CARDS - 14)) | (1L << (VAR - 14)))) != 0)) {
					{
					setState(379);
					card_expr(0);
					}
				}

				setState(382);
				match(T__1);
				setState(385);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COMPLEMENT:
				case LP:
				case SETL:
				case CARDS:
				case VAR:
					{
					setState(383);
					player_expr(0);
					}
					break;
				case ANY:
					{
					setState(384);
					any();
					}
					break;
				case SETR:
					break;
				default:
					break;
				}
				setState(387);
				match(SETR);
				}
				break;
			case WIN_CARDS:
				_localctx = new WC_RuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(WIN_CARDS);
				setState(389);
				match(SETL);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(390);
					((WC_RuleContext)_localctx).cardAny = any();
					}
				}

				setState(393);
				card_expr(0);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (OP_COMPLEMENT - 14)) | (1L << (LP - 14)) | (1L << (SETL - 14)) | (1L << (IL - 14)) | (1L << (VAR - 14)))) != 0)) {
					{
					setState(394);
					trick_expr(0);
					}
				}

				setState(397);
				match(T__1);
				setState(400);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COMPLEMENT:
				case LP:
				case SETL:
				case CARDS:
				case VAR:
					{
					setState(398);
					player_expr(0);
					}
					break;
				case ANY:
					{
					setState(399);
					((WC_RuleContext)_localctx).playerAny = any();
					}
					break;
				case SETR:
					break;
				default:
					break;
				}
				setState(402);
				match(SETR);
				}
				break;
			case DONT_WIN_CARDS:
				_localctx = new DWC_RuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				match(DONT_WIN_CARDS);
				setState(405);
				match(SETL);
				setState(406);
				card_expr(0);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (OP_COMPLEMENT - 14)) | (1L << (LP - 14)) | (1L << (SETL - 14)) | (1L << (IL - 14)) | (1L << (VAR - 14)))) != 0)) {
					{
					setState(407);
					trick_expr(0);
					}
				}

				setState(410);
				match(T__1);
				setState(413);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COMPLEMENT:
				case LP:
				case SETL:
				case CARDS:
				case VAR:
					{
					setState(411);
					player_expr(0);
					}
					break;
				case ANY:
					{
					setState(412);
					any();
					}
					break;
				case SETR:
					break;
				default:
					break;
				}
				setState(415);
				match(SETR);
				}
				break;
			case WINS_RULE:
				_localctx = new WR_ruleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				match(WINS_RULE);
				setState(418);
				match(SETL);
				setState(419);
				match(WINS);
				setState(420);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE) | (1L << EQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(421);
				equation(0);
				setState(422);
				match(T__1);
				setState(425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COMPLEMENT:
				case LP:
				case SETL:
				case CARDS:
				case VAR:
					{
					setState(423);
					player_expr(0);
					}
					break;
				case ANY:
					{
					setState(424);
					any();
					}
					break;
				case SETR:
					break;
				default:
					break;
				}
				setState(427);
				match(SETR);
				}
				break;
			case NO_COM:
			case LIM_COM:
				_localctx = new COM_ruleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				_la = _input.LA(1);
				if ( !(_la==NO_COM || _la==LIM_COM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(430);
				match(SETL);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (OP_COMPLEMENT - 14)) | (1L << (LP - 14)) | (1L << (SETL - 14)) | (1L << (IL - 14)) | (1L << (VAR - 14)))) != 0)) {
					{
					setState(431);
					trick_expr(0);
					}
				}

				setState(434);
				match(T__1);
				setState(437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COMPLEMENT:
				case LP:
				case SETL:
				case CARDS:
				case VAR:
					{
					setState(435);
					player_expr(0);
					}
					break;
				case ANY:
					{
					setState(436);
					any();
					}
					break;
				case SETR:
					break;
				default:
					break;
				}
				setState(439);
				match(SETR);
				}
				break;
			case DRAW_LEFT:
			case DRAW_RIGHT:
				_localctx = new DC_ruleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(_la==DRAW_LEFT || _la==DRAW_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				match(SETL);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (OP_COMPLEMENT - 14)) | (1L << (LP - 14)) | (1L << (SETL - 14)) | (1L << (IL - 14)) | (1L << (VAR - 14)))) != 0)) {
					{
					setState(442);
					trick_expr(0);
					}
				}

				setState(445);
				match(SETR);
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

	public static class NSwapContext extends ParserRuleContext {
		public TerminalNode SINGLE_DIGIT() { return getToken(GrammarParser.SINGLE_DIGIT, 0); }
		public TerminalNode MULTI_DIGIT() { return getToken(GrammarParser.MULTI_DIGIT, 0); }
		public NSwapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nSwap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNSwap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNSwap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNSwap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NSwapContext nSwap() throws RecognitionException {
		NSwapContext _localctx = new NSwapContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nSwap);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(T__2);
				setState(449);
				match(T__0);
				{
				setState(450);
				match(SINGLE_DIGIT);
				}
				}
				break;
			case MULTI_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(451);
				match(MULTI_DIGIT);
				}
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

	public static class NSwitchContext extends ParserRuleContext {
		public TerminalNode SINGLE_DIGIT() { return getToken(GrammarParser.SINGLE_DIGIT, 0); }
		public TerminalNode MULTI_DIGIT() { return getToken(GrammarParser.MULTI_DIGIT, 0); }
		public NSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nSwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NSwitchContext nSwitch() throws RecognitionException {
		NSwitchContext _localctx = new NSwitchContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nSwitch);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(T__3);
				setState(455);
				match(T__0);
				{
				setState(456);
				match(SINGLE_DIGIT);
				}
				}
				break;
			case MULTI_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(457);
				match(MULTI_DIGIT);
				}
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

	public static class TokensContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(GrammarParser.TOKENS, 0); }
		public Token_exprContext token_expr() {
			return getRuleContext(Token_exprContext.class,0);
		}
		public NSwapContext nSwap() {
			return getRuleContext(NSwapContext.class,0);
		}
		public NSwitchContext nSwitch() {
			return getRuleContext(NSwitchContext.class,0);
		}
		public TokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokensContext tokens() throws RecognitionException {
		TokensContext _localctx = new TokensContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(TOKENS);
			setState(461);
			match(T__0);
			setState(462);
			token_expr(0);
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(463);
				nSwap();
				}
				break;
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==MULTI_DIGIT) {
				{
				setState(466);
				nSwitch();
				}
			}

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

	public static class MissionContext extends ParserRuleContext {
		public TerminalNode MISSION() { return getToken(GrammarParser.MISSION, 0); }
		public TasksContext tasks() {
			return getRuleContext(TasksContext.class,0);
		}
		public PlayersContext players() {
			return getRuleContext(PlayersContext.class,0);
		}
		public D_tContext d_t() {
			return getRuleContext(D_tContext.class,0);
		}
		public DistributionContext distribution() {
			return getRuleContext(DistributionContext.class,0);
		}
		public Constratints_distributionContext constratints_distribution() {
			return getRuleContext(Constratints_distributionContext.class,0);
		}
		public TokensContext tokens() {
			return getRuleContext(TokensContext.class,0);
		}
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public MissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMission(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMission(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissionContext mission() throws RecognitionException {
		MissionContext _localctx = new MissionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mission);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(MISSION);
			setState(470);
			match(T__0);
			{
			setState(471);
			tasks();
			}
			{
			setState(472);
			players();
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKENS) {
				{
				setState(473);
				tokens();
				}
			}

			{
			setState(476);
			d_t();
			}
			{
			setState(477);
			distribution();
			}
			{
			setState(478);
			constratints_distribution();
			}
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					rules();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
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

	public static class Var_decContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(GrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(GrammarParser.VAR, i);
		}
		public TerminalNode EQ() { return getToken(GrammarParser.EQ, 0); }
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public Suit_exprContext suit_expr() {
			return getRuleContext(Suit_exprContext.class,0);
		}
		public Card_exprContext card_expr() {
			return getRuleContext(Card_exprContext.class,0);
		}
		public Trick_exprContext trick_expr() {
			return getRuleContext(Trick_exprContext.class,0);
		}
		public Token_exprContext token_expr() {
			return getRuleContext(Token_exprContext.class,0);
		}
		public Player_exprContext player_expr() {
			return getRuleContext(Player_exprContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(VAR);
			setState(486);
			match(EQ);
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(487);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(488);
				value_expr(0);
				}
				break;
			case 3:
				{
				setState(489);
				suit_expr(0);
				}
				break;
			case 4:
				{
				setState(490);
				card_expr(0);
				}
				break;
			case 5:
				{
				setState(491);
				trick_expr(0);
				}
				break;
			case 6:
				{
				setState(492);
				token_expr(0);
				}
				break;
			case 7:
				{
				setState(493);
				player_expr(0);
				}
				break;
			case 8:
				{
				setState(494);
				equation(0);
				}
				break;
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return equation_sempred((EquationContext)_localctx, predIndex);
		case 17:
			return suit_expr_sempred((Suit_exprContext)_localctx, predIndex);
		case 18:
			return value_expr_sempred((Value_exprContext)_localctx, predIndex);
		case 20:
			return card_expr_sempred((Card_exprContext)_localctx, predIndex);
		case 21:
			return trick_expr_sempred((Trick_exprContext)_localctx, predIndex);
		case 22:
			return player_expr_sempred((Player_exprContext)_localctx, predIndex);
		case 23:
			return token_expr_sempred((Token_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean equation_sempred(EquationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean suit_expr_sempred(Suit_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean value_expr_sempred(Value_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean card_expr_sempred(Card_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean trick_expr_sempred(Trick_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean player_expr_sempred(Player_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean token_expr_sempred(Token_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u01f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2Q\n"+
		"\2\r\2\16\2R\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\6\5e\n\5\r\5\16\5f\3\5\3\5\3\6\3\6\6\6m\n\6\r\6\16\6n\3\6\3\6\3"+
		"\7\3\7\6\7u\n\7\r\7\16\7v\3\7\3\7\3\b\3\b\6\b}\n\b\r\b\16\b~\3\b\3\b\3"+
		"\t\3\t\6\t\u0085\n\t\r\t\16\t\u0086\3\t\3\t\3\n\3\n\3\n\6\n\u008e\n\n"+
		"\r\n\16\n\u008f\3\n\3\n\3\13\3\13\6\13\u0096\n\13\r\13\16\13\u0097\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00bd\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00c5\n\22\f\22\16\22\u00c8\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00d3\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00db"+
		"\n\23\f\23\16\23\u00de\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00ea\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f2\n\24"+
		"\f\24\16\24\u00f5\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fd\n\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0103\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0111\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0119\n\26\f\26\16\26\u011c\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012b\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0133\n\27\f\27\16\27\u0136\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0140\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u0148\n\30\f\30\16\30\u014b\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0159\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u0161\n\31\f\31\16\31\u0164\13\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u016b\n\32\3\32\5\32\u016e\n\32\3\32\5\32\u0171\n\32\3\32\3\32\3\32\5"+
		"\32\u0176\n\32\3\32\3\32\3\32\3\32\5\32\u017c\n\32\3\32\5\32\u017f\n\32"+
		"\3\32\3\32\3\32\5\32\u0184\n\32\3\32\3\32\3\32\3\32\5\32\u018a\n\32\3"+
		"\32\3\32\5\32\u018e\n\32\3\32\3\32\3\32\5\32\u0193\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u019b\n\32\3\32\3\32\3\32\5\32\u01a0\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ac\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u01b3\n\32\3\32\3\32\3\32\5\32\u01b8\n\32\3\32\3"+
		"\32\3\32\3\32\5\32\u01be\n\32\3\32\5\32\u01c1\n\32\3\33\3\33\3\33\3\33"+
		"\5\33\u01c7\n\33\3\34\3\34\3\34\3\34\5\34\u01cd\n\34\3\35\3\35\3\35\3"+
		"\35\5\35\u01d3\n\35\3\35\5\35\u01d6\n\35\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01dd\n\36\3\36\3\36\3\36\3\36\7\36\u01e3\n\36\f\36\16\36\u01e6\13\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01f2\n\37\3\37"+
		"\2\t\"$&*,.\60 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<\2\16\3\2\7\b\4\2\7\b\"#\3\2\f\r\4\2\7\bCC\3\2\7\t\3\2FG\5\2"+
		",,..JJ\4\2,-//\3\2\21\22\3\2\23\27\3\2\66\67\3\29:\2\u024a\2P\3\2\2\2"+
		"\4V\3\2\2\2\6\\\3\2\2\2\bb\3\2\2\2\nj\3\2\2\2\fr\3\2\2\2\16z\3\2\2\2\20"+
		"\u0082\3\2\2\2\22\u008a\3\2\2\2\24\u0093\3\2\2\2\26\u009b\3\2\2\2\30\u009e"+
		"\3\2\2\2\32\u00a2\3\2\2\2\34\u00a6\3\2\2\2\36\u00aa\3\2\2\2 \u00ae\3\2"+
		"\2\2\"\u00bc\3\2\2\2$\u00d2\3\2\2\2&\u00e9\3\2\2\2(\u00f6\3\2\2\2*\u0110"+
		"\3\2\2\2,\u012a\3\2\2\2.\u013f\3\2\2\2\60\u0158\3\2\2\2\62\u01c0\3\2\2"+
		"\2\64\u01c6\3\2\2\2\66\u01cc\3\2\2\28\u01ce\3\2\2\2:\u01d7\3\2\2\2<\u01e7"+
		"\3\2\2\2>Q\5:\36\2?Q\5\"\22\2@Q\5$\23\2AQ\5&\24\2BQ\5(\25\2CQ\5*\26\2"+
		"DQ\5,\27\2EQ\5.\30\2FQ\5\60\31\2GQ\5<\37\2HQ\5$\23\2IQ\5&\24\2JQ\5(\25"+
		"\2KQ\5*\26\2LQ\5,\27\2MQ\5.\30\2NQ\5\60\31\2OQ\5\62\32\2P>\3\2\2\2P?\3"+
		"\2\2\2P@\3\2\2\2PA\3\2\2\2PB\3\2\2\2PC\3\2\2\2PD\3\2\2\2PE\3\2\2\2PF\3"+
		"\2\2\2PG\3\2\2\2PH\3\2\2\2PI\3\2\2\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3"+
		"\2\2\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7"+
		"\2\2\3U\3\3\2\2\2VW\7\34\2\2WX\7\7\2\2XY\7\3\2\2YZ\7\7\2\2Z[\7\35\2\2"+
		"[\5\3\2\2\2\\]\7\34\2\2]^\t\2\2\2^_\7\3\2\2_`\t\2\2\2`a\7\35\2\2a\7\3"+
		"\2\2\2bd\7\32\2\2ce\7\7\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh"+
		"\3\2\2\2hi\7\33\2\2i\t\3\2\2\2jl\7\32\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\33\2\2q\13\3\2\2\2rt\7\32\2\2su\t"+
		"\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\33\2\2y\r"+
		"\3\2\2\2z|\7\32\2\2{}\7\13\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0081\7\33\2\2\u0081\17\3\2\2\2\u0082\u0084"+
		"\7\32\2\2\u0083\u0085\7\f\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\7\33\2\2\u0089\21\3\2\2\2\u008a\u008d\7\32\2\2\u008b\u008e\7;\2\2\u008c"+
		"\u008e\t\4\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7\33\2\2\u0092\23\3\2\2\2\u0093\u0095\7\32\2\2\u0094\u0096\t\5"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\33\2\2\u009a\25\3\2\2"+
		"\2\u009b\u009c\7$\2\2\u009c\u009d\t\2\2\2\u009d\27\3\2\2\2\u009e\u009f"+
		"\7@\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\t\6\2\2\u00a1\31\3\2\2\2\u00a2"+
		"\u00a3\7D\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00a5\t\7\2\2\u00a5\33\3\2\2\2"+
		"\u00a6\u00a7\7H\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\t\b\2\2\u00a9\35\3"+
		"\2\2\2\u00aa\u00ab\7<\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad\7\7\2\2\u00ad"+
		"\37\3\2\2\2\u00ae\u00af\7E\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\t\t\2\2"+
		"\u00b1!\3\2\2\2\u00b2\u00b3\b\22\1\2\u00b3\u00b4\7\30\2\2\u00b4\u00b5"+
		"\5\"\22\2\u00b5\u00b6\7\31\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00bd\7&\2\2"+
		"\u00b8\u00bd\7\'\2\2\u00b9\u00bd\7L\2\2\u00ba\u00bd\7\7\2\2\u00bb\u00bd"+
		"\7\b\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c6\3\2"+
		"\2\2\u00be\u00bf\f\t\2\2\u00bf\u00c0\t\n\2\2\u00c0\u00c5\5\"\22\n\u00c1"+
		"\u00c2\f\b\2\2\u00c2\u00c3\7\22\2\2\u00c3\u00c5\5\"\22\t\u00c4\u00be\3"+
		"\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\b\23\1\2"+
		"\u00ca\u00cb\7\30\2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd\7\31\2\2\u00cd\u00d3"+
		"\3\2\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d3\5$\23\5\u00d0\u00d3\7L\2\2\u00d1"+
		"\u00d3\5\16\b\2\u00d2\u00c9\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d0\3"+
		"\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00dc\3\2\2\2\u00d4\u00d5\f\7\2\2\u00d5"+
		"\u00d6\7\16\2\2\u00d6\u00db\5$\23\b\u00d7\u00d8\f\6\2\2\u00d8\u00d9\7"+
		"\17\2\2\u00d9\u00db\5$\23\7\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd%\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e0\b\24\1\2\u00e0\u00e1\7\30\2\2\u00e1\u00e2"+
		"\5&\24\2\u00e2\u00e3\7\31\2\2\u00e3\u00ea\3\2\2\2\u00e4\u00e5\7\20\2\2"+
		"\u00e5\u00ea\5&\24\6\u00e6\u00ea\7L\2\2\u00e7\u00ea\5\b\5\2\u00e8\u00ea"+
		"\5\4\3\2\u00e9\u00df\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00f3\3\2\2\2\u00eb\u00ec\f\b"+
		"\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00f2\5&\24\t\u00ee\u00ef\f\7\2\2\u00ef"+
		"\u00f0\7\17\2\2\u00f0\u00f2\5&\24\b\u00f1\u00eb\3\2\2\2\u00f1\u00ee\3"+
		"\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\'\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\36\2\2\u00f7\u00f8\7\32\2"+
		"\2\u00f8\u00f9\7 \2\2\u00f9\u00fc\7\3\2\2\u00fa\u00fd\5$\23\2\u00fb\u00fd"+
		"\7%\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\7!\2\2\u00ff\u0102\7\3\2\2\u0100\u0103\5&\24\2\u0101\u0103\7%\2"+
		"\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\7\33\2\2\u0105)\3\2\2\2\u0106\u0107\b\26\1\2\u0107\u0108\7\30\2\2\u0108"+
		"\u0109\5*\26\2\u0109\u010a\7\31\2\2\u010a\u0111\3\2\2\2\u010b\u010c\7"+
		"\20\2\2\u010c\u0111\5*\26\6\u010d\u0111\7L\2\2\u010e\u0111\5\20\t\2\u010f"+
		"\u0111\5(\25\2\u0110\u0106\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u011a\3\2\2\2\u0112"+
		"\u0113\f\b\2\2\u0113\u0114\7\16\2\2\u0114\u0119\5*\26\t\u0115\u0116\f"+
		"\7\2\2\u0116\u0117\7\17\2\2\u0117\u0119\5*\26\b\u0118\u0112\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b+\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\b\27\1\2\u011e\u011f"+
		"\7\30\2\2\u011f\u0120\5,\27\2\u0120\u0121\7\31\2\2\u0121\u012b\3\2\2\2"+
		"\u0122\u0123\7\20\2\2\u0123\u012b\5,\27\t\u0124\u012b\7L\2\2\u0125\u012b"+
		"\5\b\5\2\u0126\u012b\5\n\6\2\u0127\u012b\5\f\7\2\u0128\u012b\5\4\3\2\u0129"+
		"\u012b\5\6\4\2\u012a\u011d\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0124\3\2"+
		"\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u0134\3\2\2\2\u012c\u012d\f\13"+
		"\2\2\u012d\u012e\7\16\2\2\u012e\u0133\5,\27\f\u012f\u0130\f\n\2\2\u0130"+
		"\u0131\7\17\2\2\u0131\u0133\5,\27\13\u0132\u012c\3\2\2\2\u0132\u012f\3"+
		"\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"-\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\b\30\1\2\u0138\u0139\7\30\2"+
		"\2\u0139\u013a\5.\30\2\u013a\u013b\7\31\2\2\u013b\u0140\3\2\2\2\u013c"+
		"\u0140\7L\2\2\u013d\u0140\5\22\n\2\u013e\u0140\5*\26\2\u013f\u0137\3\2"+
		"\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0149\3\2\2\2\u0141\u0142\f\7\2\2\u0142\u0143\7\16\2\2\u0143\u0148\5"+
		".\30\b\u0144\u0145\f\6\2\2\u0145\u0146\7\17\2\2\u0146\u0148\5.\30\7\u0147"+
		"\u0141\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a/\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d"+
		"\b\31\1\2\u014d\u014e\7\30\2\2\u014e\u014f\5\60\31\2\u014f\u0150\7\31"+
		"\2\2\u0150\u0159\3\2\2\2\u0151\u0159\7L\2\2\u0152\u0159\5\b\5\2\u0153"+
		"\u0159\5\n\6\2\u0154\u0159\5\f\7\2\u0155\u0159\5\24\13\2\u0156\u0159\5"+
		"\4\3\2\u0157\u0159\5\6\4\2\u0158\u014c\3\2\2\2\u0158\u0151\3\2\2\2\u0158"+
		"\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u0162\3\2\2\2\u015a"+
		"\u015b\f\13\2\2\u015b\u015c\7\16\2\2\u015c\u0161\5\60\31\f\u015d\u015e"+
		"\f\n\2\2\u015e\u015f\7\17\2\2\u015f\u0161\5\60\31\13\u0160\u015a\3\2\2"+
		"\2\u0160\u015d\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\61\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\62\2\2\u0166"+
		"\u016a\7\32\2\2\u0167\u016b\7%\2\2\u0168\u016b\5,\27\2\u0169\u016b\5\26"+
		"\f\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u016e\7+\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u0171\5*\26\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\7\4\2\2\u0173\u0176\5."+
		"\30\2\u0174\u0176\5\26\f\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u01c1\7\33\2\2\u0178\u0179\7"+
		"\63\2\2\u0179\u017b\7\32\2\2\u017a\u017c\5,\27\2\u017b\u017a\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\5*\26\2\u017e\u017d\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\7\4\2\2\u0181"+
		"\u0184\5.\30\2\u0182\u0184\5\26\f\2\u0183\u0181\3\2\2\2\u0183\u0182\3"+
		"\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u01c1\7\33\2\2\u0186"+
		"\u0187\7\64\2\2\u0187\u0189\7\32\2\2\u0188\u018a\5\26\f\2\u0189\u0188"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\5*\26\2\u018c"+
		"\u018e\5,\27\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0192\7\4\2\2\u0190\u0193\5.\30\2\u0191\u0193\5\26\f\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0195\7\33\2\2\u0195\u01c1\3\2\2\2\u0196\u0197\7\65\2\2\u0197"+
		"\u0198\7\32\2\2\u0198\u019a\5*\26\2\u0199\u019b\5,\27\2\u019a\u0199\3"+
		"\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\7\4\2\2\u019d"+
		"\u01a0\5.\30\2\u019e\u01a0\5\26\f\2\u019f\u019d\3\2\2\2\u019f\u019e\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7\33\2\2\u01a2"+
		"\u01c1\3\2\2\2\u01a3\u01a4\7(\2\2\u01a4\u01a5\7\32\2\2\u01a5\u01a6\7)"+
		"\2\2\u01a6\u01a7\t\13\2\2\u01a7\u01a8\5\"\22\2\u01a8\u01ab\7\4\2\2\u01a9"+
		"\u01ac\5.\30\2\u01aa\u01ac\5\26\f\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3"+
		"\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\33\2\2\u01ae"+
		"\u01c1\3\2\2\2\u01af\u01b0\t\f\2\2\u01b0\u01b2\7\32\2\2\u01b1\u01b3\5"+
		",\27\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b7\7\4\2\2\u01b5\u01b8\5.\30\2\u01b6\u01b8\5\26\f\2\u01b7\u01b5\3"+
		"\2\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01c1\7\33\2\2\u01ba\u01bb\t\r\2\2\u01bb\u01bd\7\32\2\2\u01bc\u01be\5"+
		",\27\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\7\33\2\2\u01c0\u0165\3\2\2\2\u01c0\u0178\3\2\2\2\u01c0\u0186\3"+
		"\2\2\2\u01c0\u0196\3\2\2\2\u01c0\u01a3\3\2\2\2\u01c0\u01af\3\2\2\2\u01c0"+
		"\u01ba\3\2\2\2\u01c1\63\3\2\2\2\u01c2\u01c3\7\5\2\2\u01c3\u01c4\7\3\2"+
		"\2\u01c4\u01c7\7\7\2\2\u01c5\u01c7\7\b\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c5"+
		"\3\2\2\2\u01c7\65\3\2\2\2\u01c8\u01c9\7\6\2\2\u01c9\u01ca\7\3\2\2\u01ca"+
		"\u01cd\7\7\2\2\u01cb\u01cd\7\b\2\2\u01cc\u01c8\3\2\2\2\u01cc\u01cb\3\2"+
		"\2\2\u01cd\67\3\2\2\2\u01ce\u01cf\7A\2\2\u01cf\u01d0\7\3\2\2\u01d0\u01d2"+
		"\5\60\31\2\u01d1\u01d3\5\64\33\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2"+
		"\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\5\66\34\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d69\3\2\2\2\u01d7\u01d8\7K\2\2\u01d8\u01d9\7\3\2\2\u01d9"+
		"\u01da\5\30\r\2\u01da\u01dc\5\36\20\2\u01db\u01dd\58\35\2\u01dc\u01db"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5\32\16\2"+
		"\u01df\u01e0\5\34\17\2\u01e0\u01e4\5 \21\2\u01e1\u01e3\5\62\32\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5;\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7L\2\2\u01e8\u01f1"+
		"\7\27\2\2\u01e9\u01f2\7L\2\2\u01ea\u01f2\5&\24\2\u01eb\u01f2\5$\23\2\u01ec"+
		"\u01f2\5*\26\2\u01ed\u01f2\5,\27\2\u01ee\u01f2\5\60\31\2\u01ef\u01f2\5"+
		".\30\2\u01f0\u01f2\5\"\22\2\u01f1\u01e9\3\2\2\2\u01f1\u01ea\3\2\2\2\u01f1"+
		"\u01eb\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f1\u01ed\3\2\2\2\u01f1\u01ee\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2=\3\2\2\2;PRfnv~\u0086"+
		"\u008d\u008f\u0097\u00bc\u00c4\u00c6\u00d2\u00da\u00dc\u00e9\u00f1\u00f3"+
		"\u00fc\u0102\u0110\u0118\u011a\u012a\u0132\u0134\u013f\u0147\u0149\u0158"+
		"\u0160\u0162\u016a\u016d\u0170\u0175\u017b\u017e\u0183\u0189\u018d\u0192"+
		"\u019a\u019f\u01ab\u01b2\u01b7\u01bd\u01c0\u01c6\u01cc\u01d2\u01d5\u01dc"+
		"\u01e4\u01f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}