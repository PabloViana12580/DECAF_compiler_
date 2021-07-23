// Generated from dgrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		LETTER=39, DIGIT=40;
	public static final int
		RULE_id = 0, RULE_num = 1, RULE_program = 2, RULE_declaration = 3, RULE_varDeclaration = 4, 
		RULE_structDeclaration = 5, RULE_varType = 6, RULE_methodDeclaration = 7, 
		RULE_methodType = 8, RULE_parameter = 9, RULE_parameterType = 10, RULE_block = 11, 
		RULE_statement = 12, RULE_location = 13, RULE_expression = 14, RULE_methodCall = 15, 
		RULE_arg = 16, RULE_op = 17, RULE_arith_op = 18, RULE_rel_op = 19, RULE_eq_op = 20, 
		RULE_cond_op = 21, RULE_literal = 22, RULE_int_literal = 23, RULE_char_literal = 24, 
		RULE_bool_literal = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"id", "num", "program", "declaration", "varDeclaration", "structDeclaration", 
			"varType", "methodDeclaration", "methodType", "parameter", "parameterType", 
			"block", "statement", "location", "expression", "methodCall", "arg", 
			"op", "arith_op", "rel_op", "eq_op", "cond_op", "literal", "int_literal", 
			"char_literal", "bool_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'Program'", "'{'", "'}'", "';'", "'['", "']'", "'struct'", 
			"'int'", "'char'", "'boolean'", "'void'", "'('", "','", "')'", "'if'", 
			"'else'", "'while'", "'return'", "'='", "'.'", "'-'", "'!'", "'+'", "'*'", 
			"'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'\"'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "LETTER", "DIGIT"
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
	public String getGrammarFileName() { return "dgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(dgrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(dgrammarParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(dgrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(dgrammarParser.DIGIT, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LETTER);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class NumContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(dgrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(dgrammarParser.DIGIT, i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_num);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(DIGIT);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(DIGIT);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ProgramContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(T__1);
			setState(68);
			match(T__2);
			{
			setState(69);
			declaration();
			}
			setState(70);
			match(T__3);
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

	public static class DeclarationContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				structDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				methodDeclaration();
				}
				break;
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				varType();
				setState(78);
				id();
				setState(79);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				varType();
				setState(82);
				id();
				setState(83);
				match(T__5);
				setState(84);
				num();
				setState(85);
				match(T__6);
				setState(86);
				match(T__4);
				}
				break;
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__7);
			setState(91);
			id();
			setState(92);
			match(T__2);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(93);
				varDeclaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__3);
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

	public static class VarTypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitVarType(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varType);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__7);
				setState(105);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				structDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(T__11);
				}
				break;
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			methodType();
			setState(111);
			id();
			setState(112);
			match(T__12);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(113);
				parameter();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(114);
					match(T__13);
					setState(115);
					parameter();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__14);
			setState(127);
			block();
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

	public static class MethodTypeContext extends ParserRuleContext {
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitMethodType(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				parameterType();
				setState(132);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				parameterType();
				setState(135);
				id();
				setState(136);
				match(T__5);
				setState(137);
				match(T__6);
				}
				break;
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

	public static class ParameterTypeContext extends ParserRuleContext {
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitParameterType(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__2);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(144);
				varDeclaration();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(150);
				statement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__15);
				setState(159);
				match(T__12);
				setState(160);
				expression(0);
				setState(161);
				match(T__14);
				setState(162);
				block();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(163);
					match(T__16);
					setState(164);
					block();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__17);
				setState(168);
				match(T__12);
				setState(169);
				expression(0);
				setState(170);
				match(T__14);
				setState(171);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(T__18);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__21) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
					{
					setState(174);
					expression(0);
					}
				}

				setState(177);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				methodCall();
				setState(179);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				location();
				setState(183);
				match(T__19);
				setState(184);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__21) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
					{
					setState(186);
					expression(0);
					}
				}

				setState(189);
				match(T__4);
				}
				break;
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

	public static class LocationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(192);
				id();
				}
				break;
			case 2:
				{
				setState(193);
				id();
				setState(194);
				match(T__5);
				setState(195);
				expression(0);
				setState(196);
				match(T__6);
				}
				break;
			}
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(200);
				match(T__20);
				setState(201);
				location();
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

	public static class ExpressionContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(205);
				location();
				}
				break;
			case 2:
				{
				setState(206);
				methodCall();
				}
				break;
			case 3:
				{
				setState(207);
				literal();
				}
				break;
			case 4:
				{
				setState(208);
				match(T__21);
				setState(209);
				expression(3);
				}
				break;
			case 5:
				{
				setState(210);
				match(T__22);
				setState(211);
				expression(2);
				}
				break;
			case 6:
				{
				setState(212);
				match(T__12);
				setState(213);
				expression(0);
				setState(214);
				match(T__14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(218);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(219);
					op();
					setState(220);
					expression(5);
					}
					} 
				}
				setState(226);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			id();
			setState(228);
			match(T__12);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__21) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << LETTER) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(229);
				arg();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(230);
					match(T__13);
					setState(231);
					arg();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__14);
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

	public static class ArgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			expression(0);
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

	public static class OpContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				arith_op();
				}
				break;
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				rel_op();
				}
				break;
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				eq_op();
				}
				break;
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				cond_op();
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

	public static class Arith_opContext extends ParserRuleContext {
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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

	public static class Cond_opContext extends ParserRuleContext {
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				int_literal();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				char_literal();
				}
				break;
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				bool_literal();
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

	public static class Int_literalContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			num();
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(dgrammarParser.LETTER, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__35);
			setState(268);
			match(LETTER);
			setState(269);
			match(T__35);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dgrammarListener ) ((dgrammarListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\7\3@\n\3"+
		"\f\3\16\3C\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\7\7a\n\7\f"+
		"\7\16\7d\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\tw\n\t\f\t\16\tz\13\t\7\t|\n\t\f\t\16\t\177\13\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13"+
		"\3\f\3\f\3\r\3\r\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\r\7\r\u009a\n\r\f"+
		"\r\16\r\u009d\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a8"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00be\n\16\3\16\5\16\u00c1"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c9\n\17\3\17\3\17\5\17\u00cd"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00db\n\20\3\20\3\20\3\20\3\20\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u00eb\n\21\f\21\16\21\u00ee\13\21\7\21"+
		"\u00f0\n\21\f\21\16\21\u00f3\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u00fd\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\5\30\u010a\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\2\3"+
		"\36\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\n\3"+
		"\2)*\3\2\13\16\3\2\13\r\4\2\30\30\32\35\3\2\36!\3\2\"#\3\2$%\3\2\'(\2"+
		"\u0121\2\66\3\2\2\2\4=\3\2\2\2\6D\3\2\2\2\bM\3\2\2\2\nZ\3\2\2\2\f\\\3"+
		"\2\2\2\16n\3\2\2\2\20p\3\2\2\2\22\u0083\3\2\2\2\24\u008d\3\2\2\2\26\u008f"+
		"\3\2\2\2\30\u0091\3\2\2\2\32\u00c0\3\2\2\2\34\u00c8\3\2\2\2\36\u00da\3"+
		"\2\2\2 \u00e5\3\2\2\2\"\u00f6\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(\u0100"+
		"\3\2\2\2*\u0102\3\2\2\2,\u0104\3\2\2\2.\u0109\3\2\2\2\60\u010b\3\2\2\2"+
		"\62\u010d\3\2\2\2\64\u0111\3\2\2\2\66:\7)\2\2\679\t\2\2\28\67\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2\2\2<:\3\2\2\2=A\7*\2\2>@\7*\2\2"+
		"?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2DE\7\3\2"+
		"\2EF\7\4\2\2FG\7\5\2\2GH\5\b\5\2HI\7\6\2\2I\7\3\2\2\2JN\5\f\7\2KN\5\n"+
		"\6\2LN\5\20\t\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\t\3\2\2\2OP\5\16\b\2PQ"+
		"\5\2\2\2QR\7\7\2\2R[\3\2\2\2ST\5\16\b\2TU\5\2\2\2UV\7\b\2\2VW\5\4\3\2"+
		"WX\7\t\2\2XY\7\7\2\2Y[\3\2\2\2ZO\3\2\2\2ZS\3\2\2\2[\13\3\2\2\2\\]\7\n"+
		"\2\2]^\5\2\2\2^b\7\5\2\2_a\5\n\6\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2ce\3\2\2\2db\3\2\2\2ef\7\6\2\2f\r\3\2\2\2go\7\13\2\2ho\7\f\2\2io\7"+
		"\r\2\2jk\7\n\2\2ko\5\2\2\2lo\5\f\7\2mo\7\16\2\2ng\3\2\2\2nh\3\2\2\2ni"+
		"\3\2\2\2nj\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\17\3\2\2\2pq\5\22\n\2qr\5\2\2"+
		"\2r}\7\17\2\2sx\5\24\13\2tu\7\20\2\2uw\5\24\13\2vt\3\2\2\2wz\3\2\2\2x"+
		"v\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2|\177\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\21\2\2\u0081\u0082"+
		"\5\30\r\2\u0082\21\3\2\2\2\u0083\u0084\t\3\2\2\u0084\23\3\2\2\2\u0085"+
		"\u0086\5\26\f\2\u0086\u0087\5\2\2\2\u0087\u008e\3\2\2\2\u0088\u0089\5"+
		"\26\f\2\u0089\u008a\5\2\2\2\u008a\u008b\7\b\2\2\u008b\u008c\7\t\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0088\3\2\2\2\u008e\25\3\2\2"+
		"\2\u008f\u0090\t\4\2\2\u0090\27\3\2\2\2\u0091\u0095\7\5\2\2\u0092\u0094"+
		"\5\n\6\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u009b\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\5\32"+
		"\16\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\6"+
		"\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7\17\2\2\u00a2"+
		"\u00a3\5\36\20\2\u00a3\u00a4\7\21\2\2\u00a4\u00a7\5\30\r\2\u00a5\u00a6"+
		"\7\23\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00c1\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ac"+
		"\5\36\20\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00c1\3\2\2"+
		"\2\u00af\u00b1\7\25\2\2\u00b0\u00b2\5\36\20\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00c1\7\7\2\2\u00b4\u00b5\5 "+
		"\21\2\u00b5\u00b6\7\7\2\2\u00b6\u00c1\3\2\2\2\u00b7\u00c1\5\30\r\2\u00b8"+
		"\u00b9\5\34\17\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00c1"+
		"\3\2\2\2\u00bc\u00be\5\36\20\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\7\2\2\u00c0\u00a0\3\2\2\2\u00c0\u00a9"+
		"\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c9\5\2\2"+
		"\2\u00c3\u00c4\5\2\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5\36\20\2\u00c6"+
		"\u00c7\7\t\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\7\27\2\2\u00cb\u00cd\5\34\17\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\b\20\1"+
		"\2\u00cf\u00db\5\34\17\2\u00d0\u00db\5 \21\2\u00d1\u00db\5.\30\2\u00d2"+
		"\u00d3\7\30\2\2\u00d3\u00db\5\36\20\5\u00d4\u00d5\7\31\2\2\u00d5\u00db"+
		"\5\36\20\4\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\7\21"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d0\3\2\2\2\u00da"+
		"\u00d1\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d6\3\2"+
		"\2\2\u00db\u00e2\3\2\2\2\u00dc\u00dd\f\6\2\2\u00dd\u00de\5$\23\2\u00de"+
		"\u00df\5\36\20\7\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\37\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\5\2\2\2\u00e6\u00f1\7\17\2\2\u00e7\u00ec\5"+
		"\"\22\2\u00e8\u00e9\7\20\2\2\u00e9\u00eb\5\"\22\2\u00ea\u00e8\3\2\2\2"+
		"\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e7\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f5\7\21\2\2\u00f5!\3\2\2\2\u00f6\u00f7\5\36\20\2\u00f7#"+
		"\3\2\2\2\u00f8\u00fd\5&\24\2\u00f9\u00fd\5(\25\2\u00fa\u00fd\5*\26\2\u00fb"+
		"\u00fd\5,\27\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fd%\3\2\2\2\u00fe\u00ff\t\5\2\2\u00ff\'\3"+
		"\2\2\2\u0100\u0101\t\6\2\2\u0101)\3\2\2\2\u0102\u0103\t\7\2\2\u0103+\3"+
		"\2\2\2\u0104\u0105\t\b\2\2\u0105-\3\2\2\2\u0106\u010a\5\60\31\2\u0107"+
		"\u010a\5\62\32\2\u0108\u010a\5\64\33\2\u0109\u0106\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u0108\3\2\2\2\u010a/\3\2\2\2\u010b\u010c\5\4\3\2\u010c"+
		"\61\3\2\2\2\u010d\u010e\7&\2\2\u010e\u010f\7)\2\2\u010f\u0110\7&\2\2\u0110"+
		"\63\3\2\2\2\u0111\u0112\t\t\2\2\u0112\65\3\2\2\2\31:AMZbnx}\u008d\u0095"+
		"\u009b\u00a7\u00b1\u00bd\u00c0\u00c8\u00cc\u00da\u00e2\u00ec\u00f1\u00fc"+
		"\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}