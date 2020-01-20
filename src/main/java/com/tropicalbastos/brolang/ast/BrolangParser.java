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
		T__0=1, T__1=2, T__2=3, BLOCK_OPEN=4, BLOCK_CLOSE=5, SAY=6, SET=7, TO=8, 
		INT=9, STRING=10, FLOAT=11, IF=12, NOT_EQUALS=13, EQUALS=14, AS=15, IS=16, 
		AND=17, OR=18, ELSE=19, ID=20, NEXT_STATEMENT=21, WS=22;
	public static final int
		RULE_compilationUnit = 0, RULE_stmt = 1, RULE_assignStmt = 2, RULE_elsecondition = 3, 
		RULE_elseifcondition = 4, RULE_ifcondition = 5, RULE_printstmt = 6, RULE_expr = 7, 
		RULE_equalityexpr = 8, RULE_variableexpr = 9, RULE_endscope = 10, RULE_typeSpecifier = 11;
	public static final String[] ruleNames = {
		"compilationUnit", "stmt", "assignStmt", "elsecondition", "elseifcondition", 
		"ifcondition", "printstmt", "expr", "equalityexpr", "variableexpr", "endscope", 
		"typeSpecifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brint'", "'bring'", "'broat'", "'{'", "'}'", "'bray'", "'set'", 
		"'to'", null, null, null, "'brif'", "'broesn't brequal'", "'brequals'", 
		"'bras'", "'bris'", "'brand'", "'bror'", "'brelse'", null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "BLOCK_OPEN", "BLOCK_CLOSE", "SAY", "SET", "TO", 
		"INT", "STRING", "FLOAT", "IF", "NOT_EQUALS", "EQUALS", "AS", "IS", "AND", 
		"OR", "ELSE", "ID", "NEXT_STATEMENT", "WS"
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << BLOCK_CLOSE) | (1L << SAY) | (1L << IF) | (1L << ELSE))) != 0)) {
				{
				{
				setState(24);
				stmt();
				}
				}
				setState(29);
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
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				printstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				ifcondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				elsecondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				elseifcondition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				endscope();
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
			setState(38);
			typeSpecifier();
			setState(39);
			match(ID);
			setState(40);
			match(IS);
			setState(41);
			variableexpr();
			setState(42);
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
			setState(44);
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
			setState(46);
			match(ELSE);
			setState(47);
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
		public List<VariableexprContext> variableexpr() {
			return getRuleContexts(VariableexprContext.class);
		}
		public VariableexprContext variableexpr(int i) {
			return getRuleContext(VariableexprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(BrolangParser.EQUALS, 0); }
		public TerminalNode BLOCK_OPEN() { return getToken(BrolangParser.BLOCK_OPEN, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IF);
			setState(50);
			variableexpr();
			setState(51);
			match(EQUALS);
			setState(52);
			variableexpr();
			setState(53);
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

	public static class PrintstmtContext extends ParserRuleContext {
		public TerminalNode SAY() { return getToken(BrolangParser.SAY, 0); }
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
			setState(55);
			match(SAY);
			setState(56);
			variableexpr();
			setState(57);
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

	public static class ExprContext extends ParserRuleContext {
		public VariableexprContext variableexpr() {
			return getRuleContext(VariableexprContext.class,0);
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
		enterRule(_localctx, 14, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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

	public static class EqualityexprContext extends ParserRuleContext {
		public List<VariableexprContext> variableexpr() {
			return getRuleContexts(VariableexprContext.class);
		}
		public VariableexprContext variableexpr(int i) {
			return getRuleContext(VariableexprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(BrolangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(BrolangParser.NOT_EQUALS, 0); }
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
		enterRule(_localctx, 16, RULE_equalityexpr);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(61);
				variableexpr();
				setState(62);
				match(EQUALS);
				setState(63);
				variableexpr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(65);
				variableexpr();
				setState(66);
				match(NOT_EQUALS);
				setState(67);
				variableexpr();
				}
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
		enterRule(_localctx, 18, RULE_variableexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
		enterRule(_localctx, 20, RULE_endscope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		enterRule(_localctx, 22, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nH"+
		"\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\4\4\2\13\r\26\26\3\2\3\5\2J\2\35\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b.\3"+
		"\2\2\2\n\60\3\2\2\2\f\63\3\2\2\2\169\3\2\2\2\20=\3\2\2\2\22G\3\2\2\2\24"+
		"I\3\2\2\2\26K\3\2\2\2\30M\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3"+
		"\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 \'\5\6\4"+
		"\2!\'\5\16\b\2\"\'\5\f\7\2#\'\5\b\5\2$\'\5\n\6\2%\'\5\26\f\2& \3\2\2\2"+
		"&!\3\2\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2()\5\30"+
		"\r\2)*\7\26\2\2*+\7\22\2\2+,\5\24\13\2,-\7\27\2\2-\7\3\2\2\2./\7\25\2"+
		"\2/\t\3\2\2\2\60\61\7\25\2\2\61\62\5\f\7\2\62\13\3\2\2\2\63\64\7\16\2"+
		"\2\64\65\5\24\13\2\65\66\7\20\2\2\66\67\5\24\13\2\678\7\6\2\28\r\3\2\2"+
		"\29:\7\b\2\2:;\5\24\13\2;<\7\27\2\2<\17\3\2\2\2=>\5\24\13\2>\21\3\2\2"+
		"\2?@\5\24\13\2@A\7\20\2\2AB\5\24\13\2BH\3\2\2\2CD\5\24\13\2DE\7\17\2\2"+
		"EF\5\24\13\2FH\3\2\2\2G?\3\2\2\2GC\3\2\2\2H\23\3\2\2\2IJ\t\2\2\2J\25\3"+
		"\2\2\2KL\7\7\2\2L\27\3\2\2\2MN\t\3\2\2N\31\3\2\2\2\5\35&G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}