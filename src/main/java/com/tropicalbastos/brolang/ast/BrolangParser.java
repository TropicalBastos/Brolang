// Generated from Brolang.g4 by ANTLR 4.7.1
package com.tropicalbastos.brolang.ast;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrolangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BLOCK_OPEN=4, BLOCK_CLOSE=5, PRINT=6, INT=7, STRING=8, 
		FLOAT=9, IF=10, NOT_EQUALS=11, EQUALS=12, AS=13, IS=14, AND=15, OR=16, 
		ELSE=17, ID=18, NEXT_STATEMENT=19, WS=20;
	public static final int
		RULE_compilationUnit = 0, RULE_stmt = 1, RULE_assignStmt = 2, RULE_elsecondition = 3, 
		RULE_elseifcondition = 4, RULE_ifcondition = 5, RULE_printstmt = 6, RULE_boolexpr = 7, 
		RULE_andexpr = 8, RULE_orexpr = 9, RULE_equalityexpr = 10, RULE_notequalexpr = 11, 
		RULE_andterm = 12, RULE_orterm = 13, RULE_equalsexpr = 14, RULE_nequalexpr = 15, 
		RULE_startscope = 16, RULE_endscope = 17, RULE_expr = 18, RULE_variableexpr = 19, 
		RULE_typeSpecifier = 20;
	public static final String[] ruleNames = {
		"compilationUnit", "stmt", "assignStmt", "elsecondition", "elseifcondition", 
		"ifcondition", "printstmt", "boolexpr", "andexpr", "orexpr", "equalityexpr", 
		"notequalexpr", "andterm", "orterm", "equalsexpr", "nequalexpr", "startscope", 
		"endscope", "expr", "variableexpr", "typeSpecifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brinteger'", "'bring'", "'broat'", "'{'", "'}'", "'brint'", null, 
		null, null, "'brif'", "'broesn't brequal'", "'brequals'", "'bras'", "'bris'", 
		"'brand'", "'bror'", "'brelse'", null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "BLOCK_OPEN", "BLOCK_CLOSE", "PRINT", "INT", "STRING", 
		"FLOAT", "IF", "NOT_EQUALS", "EQUALS", "AS", "IS", "AND", "OR", "ELSE", 
		"ID", "NEXT_STATEMENT", "WS"
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
	public String getGrammarFileName() { return "Brolang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrolangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << BLOCK_OPEN) | (1L << BLOCK_CLOSE) | (1L << PRINT) | (1L << IF) | (1L << ELSE))) != 0)) {
				{
				{
				setState(42);
				stmt();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StmtContext extends ParserRuleContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public IfconditionContext ifcondition() {
			return getRuleContext(IfconditionContext.class,0);
		}
		public ElseconditionContext elsecondition() {
			return getRuleContext(ElseconditionContext.class,0);
		}
		public ElseifconditionContext elseifcondition() {
			return getRuleContext(ElseifconditionContext.class,0);
		}
		public EndscopeContext endscope() {
			return getRuleContext(EndscopeContext.class,0);
		}
		public StartscopeContext startscope() {
			return getRuleContext(StartscopeContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				printstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				ifcondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				elsecondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				elseifcondition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				endscope();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				startscope();
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

	public static class AssignStmtContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(BrolangParser.ID, 0); }
		public TerminalNode IS() { return getToken(BrolangParser.IS, 0); }
		public VariableexprContext variableexpr() {
			return getRuleContext(VariableexprContext.class,0);
		}
		public TerminalNode NEXT_STATEMENT() { return getToken(BrolangParser.NEXT_STATEMENT, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			typeSpecifier();
			setState(58);
			match(ID);
			setState(59);
			match(IS);
			setState(60);
			variableexpr();
			setState(61);
			match(NEXT_STATEMENT);
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

	public static class ElseconditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BrolangParser.ELSE, 0); }
		public ElseconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsecondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterElsecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitElsecondition(this);
		}
	}

	public final ElseconditionContext elsecondition() throws RecognitionException {
		ElseconditionContext _localctx = new ElseconditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elsecondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ELSE);
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

	public static class ElseifconditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BrolangParser.ELSE, 0); }
		public IfconditionContext ifcondition() {
			return getRuleContext(IfconditionContext.class,0);
		}
		public ElseifconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterElseifcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitElseifcondition(this);
		}
	}

	public final ElseifconditionContext elseifcondition() throws RecognitionException {
		ElseifconditionContext _localctx = new ElseifconditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseifcondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ELSE);
			setState(66);
			ifcondition();
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

	public static class IfconditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BrolangParser.IF, 0); }
		public TerminalNode BLOCK_OPEN() { return getToken(BrolangParser.BLOCK_OPEN, 0); }
		public EqualityexprContext equalityexpr() {
			return getRuleContext(EqualityexprContext.class,0);
		}
		public NotequalexprContext notequalexpr() {
			return getRuleContext(NotequalexprContext.class,0);
		}
		public VariableexprContext variableexpr() {
			return getRuleContext(VariableexprContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode NEXT_STATEMENT() { return getToken(BrolangParser.NEXT_STATEMENT, 0); }
		public IfconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterIfcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitIfcondition(this);
		}
	}

	public final IfconditionContext ifcondition() throws RecognitionException {
		IfconditionContext _localctx = new IfconditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IF);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(69);
				equalityexpr();
				}
				break;
			case 2:
				{
				setState(70);
				notequalexpr();
				}
				break;
			case 3:
				{
				setState(71);
				variableexpr();
				}
				break;
			case 4:
				{
				setState(72);
				boolexpr();
				}
				break;
			}
			setState(75);
			match(BLOCK_OPEN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT_STATEMENT) {
				{
				setState(76);
				match(NEXT_STATEMENT);
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

	public static class PrintstmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BrolangParser.PRINT, 0); }
		public VariableexprContext variableexpr() {
			return getRuleContext(VariableexprContext.class,0);
		}
		public TerminalNode NEXT_STATEMENT() { return getToken(BrolangParser.NEXT_STATEMENT, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PRINT);
			setState(80);
			variableexpr();
			setState(81);
			match(NEXT_STATEMENT);
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

	public static class BoolexprContext extends ParserRuleContext {
		public List<AndexprContext> andexpr() {
			return getRuleContexts(AndexprContext.class);
		}
		public AndexprContext andexpr(int i) {
			return getRuleContext(AndexprContext.class,i);
		}
		public List<OrexprContext> orexpr() {
			return getRuleContexts(OrexprContext.class);
		}
		public OrexprContext orexpr(int i) {
			return getRuleContext(OrexprContext.class,i);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitBoolexpr(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(83);
					andexpr();
					}
					break;
				case 2:
					{
					setState(84);
					orexpr();
					}
					break;
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << ID))) != 0) );
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

	public static class AndexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndtermContext andterm() {
			return getRuleContext(AndtermContext.class,0);
		}
		public AndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterAndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitAndexpr(this);
		}
	}

	public final AndexprContext andexpr() throws RecognitionException {
		AndexprContext _localctx = new AndexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_andexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			expr();
			setState(90);
			andterm();
			setState(91);
			expr();
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

	public static class OrexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrtermContext orterm() {
			return getRuleContext(OrtermContext.class,0);
		}
		public OrexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterOrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitOrexpr(this);
		}
	}

	public final OrexprContext orexpr() throws RecognitionException {
		OrexprContext _localctx = new OrexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expr();
			setState(94);
			orterm();
			setState(95);
			expr();
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

	public static class EqualityexprContext extends ParserRuleContext {
		public List<VariableexprContext> variableexpr() {
			return getRuleContexts(VariableexprContext.class);
		}
		public VariableexprContext variableexpr(int i) {
			return getRuleContext(VariableexprContext.class,i);
		}
		public EqualsexprContext equalsexpr() {
			return getRuleContext(EqualsexprContext.class,0);
		}
		public EqualityexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterEqualityexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitEqualityexpr(this);
		}
	}

	public final EqualityexprContext equalityexpr() throws RecognitionException {
		EqualityexprContext _localctx = new EqualityexprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equalityexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			variableexpr();
			setState(98);
			equalsexpr();
			setState(99);
			variableexpr();
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

	public static class NotequalexprContext extends ParserRuleContext {
		public List<VariableexprContext> variableexpr() {
			return getRuleContexts(VariableexprContext.class);
		}
		public VariableexprContext variableexpr(int i) {
			return getRuleContext(VariableexprContext.class,i);
		}
		public NequalexprContext nequalexpr() {
			return getRuleContext(NequalexprContext.class,0);
		}
		public NotequalexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notequalexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterNotequalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitNotequalexpr(this);
		}
	}

	public final NotequalexprContext notequalexpr() throws RecognitionException {
		NotequalexprContext _localctx = new NotequalexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notequalexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			variableexpr();
			setState(102);
			nequalexpr();
			setState(103);
			variableexpr();
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

	public static class AndtermContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(BrolangParser.AND, 0); }
		public AndtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterAndterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitAndterm(this);
		}
	}

	public final AndtermContext andterm() throws RecognitionException {
		AndtermContext _localctx = new AndtermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_andterm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(AND);
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

	public static class OrtermContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(BrolangParser.OR, 0); }
		public OrtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterOrterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitOrterm(this);
		}
	}

	public final OrtermContext orterm() throws RecognitionException {
		OrtermContext _localctx = new OrtermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orterm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OR);
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

	public static class EqualsexprContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(BrolangParser.EQUALS, 0); }
		public EqualsexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterEqualsexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitEqualsexpr(this);
		}
	}

	public final EqualsexprContext equalsexpr() throws RecognitionException {
		EqualsexprContext _localctx = new EqualsexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalsexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(EQUALS);
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

	public static class NequalexprContext extends ParserRuleContext {
		public TerminalNode NOT_EQUALS() { return getToken(BrolangParser.NOT_EQUALS, 0); }
		public NequalexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nequalexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterNequalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitNequalexpr(this);
		}
	}

	public final NequalexprContext nequalexpr() throws RecognitionException {
		NequalexprContext _localctx = new NequalexprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nequalexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(NOT_EQUALS);
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

	public static class StartscopeContext extends ParserRuleContext {
		public TerminalNode BLOCK_OPEN() { return getToken(BrolangParser.BLOCK_OPEN, 0); }
		public StartscopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startscope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterStartscope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitStartscope(this);
		}
	}

	public final StartscopeContext startscope() throws RecognitionException {
		StartscopeContext _localctx = new StartscopeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_startscope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(BLOCK_OPEN);
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

	public static class EndscopeContext extends ParserRuleContext {
		public TerminalNode BLOCK_CLOSE() { return getToken(BrolangParser.BLOCK_CLOSE, 0); }
		public EndscopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endscope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterEndscope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitEndscope(this);
		}
	}

	public final EndscopeContext endscope() throws RecognitionException {
		EndscopeContext _localctx = new EndscopeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_endscope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(BLOCK_CLOSE);
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

	public static class ExprContext extends ParserRuleContext {
		public VariableexprContext variableexpr() {
			return getRuleContext(VariableexprContext.class,0);
		}
		public EqualityexprContext equalityexpr() {
			return getRuleContext(EqualityexprContext.class,0);
		}
		public NotequalexprContext notequalexpr() {
			return getRuleContext(NotequalexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				variableexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				equalityexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				notequalexpr();
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

	public static class VariableexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BrolangParser.ID, 0); }
		public TerminalNode INT() { return getToken(BrolangParser.INT, 0); }
		public TerminalNode STRING() { return getToken(BrolangParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(BrolangParser.FLOAT, 0); }
		public VariableexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterVariableexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitVariableexpr(this);
		}
	}

	public final VariableexprContext variableexpr() throws RecognitionException {
		VariableexprContext _localctx = new VariableexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrolangListener ) ((BrolangListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\6\tX\n\t\r\t\16\tY\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24{\n\24\3\25\3\25\3\26\3\26\3\26"+
		"\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\4\2\t\13\24"+
		"\24\3\2\3\5\2z\2/\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\bA\3\2\2\2\nC\3\2\2\2"+
		"\fF\3\2\2\2\16Q\3\2\2\2\20W\3\2\2\2\22[\3\2\2\2\24_\3\2\2\2\26c\3\2\2"+
		"\2\30g\3\2\2\2\32k\3\2\2\2\34m\3\2\2\2\36o\3\2\2\2 q\3\2\2\2\"s\3\2\2"+
		"\2$u\3\2\2\2&z\3\2\2\2(|\3\2\2\2*~\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61/\3\2\2\2\62:\5\6\4\2\63:\5"+
		"\16\b\2\64:\5\f\7\2\65:\5\b\5\2\66:\5\n\6\2\67:\5$\23\28:\5\"\22\29\62"+
		"\3\2\2\29\63\3\2\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\29"+
		"8\3\2\2\2:\5\3\2\2\2;<\5*\26\2<=\7\24\2\2=>\7\20\2\2>?\5(\25\2?@\7\25"+
		"\2\2@\7\3\2\2\2AB\7\23\2\2B\t\3\2\2\2CD\7\23\2\2DE\5\f\7\2E\13\3\2\2\2"+
		"FK\7\f\2\2GL\5\26\f\2HL\5\30\r\2IL\5(\25\2JL\5\20\t\2KG\3\2\2\2KH\3\2"+
		"\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MO\7\6\2\2NP\7\25\2\2ON\3\2\2\2OP\3"+
		"\2\2\2P\r\3\2\2\2QR\7\b\2\2RS\5(\25\2ST\7\25\2\2T\17\3\2\2\2UX\5\22\n"+
		"\2VX\5\24\13\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\21\3"+
		"\2\2\2[\\\5&\24\2\\]\5\32\16\2]^\5&\24\2^\23\3\2\2\2_`\5&\24\2`a\5\34"+
		"\17\2ab\5&\24\2b\25\3\2\2\2cd\5(\25\2de\5\36\20\2ef\5(\25\2f\27\3\2\2"+
		"\2gh\5(\25\2hi\5 \21\2ij\5(\25\2j\31\3\2\2\2kl\7\21\2\2l\33\3\2\2\2mn"+
		"\7\22\2\2n\35\3\2\2\2op\7\16\2\2p\37\3\2\2\2qr\7\r\2\2r!\3\2\2\2st\7\6"+
		"\2\2t#\3\2\2\2uv\7\7\2\2v%\3\2\2\2w{\5(\25\2x{\5\26\f\2y{\5\30\r\2zw\3"+
		"\2\2\2zx\3\2\2\2zy\3\2\2\2{\'\3\2\2\2|}\t\2\2\2})\3\2\2\2~\177\t\3\2\2"+
		"\177+\3\2\2\2\t/9KOWYz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}