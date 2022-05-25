// Generated from C:/Users/Sergio Arroni/IdeaProjects/DLP/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

import ast.definition.*;
import ast.expression.*;
import ast.expression.literal.*;
import ast.expression.operator.*;
import ast.statement.*;
import ast.type.*;
import ast.type.complexTypes.*;
import ast.type.sympleTypes.*;
import ast.*;
import java.util.*;
import symboltable.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, INT_CONSTANT=43, CHAR_CONSTANT=44, 
		REAL_CONSTANT=45, ID=46, COMENTARIO=47, COMENTARIO_COMILLAS=48, TRASH=49;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_def = 2, RULE_defVaribales = 3, 
		RULE_defFunction = 4, RULE_functionType = 5, RULE_functionTypeParametersAux = 6, 
		RULE_tipo = 7, RULE_tipoSimple = 8, RULE_recordField = 9, RULE_statement = 10, 
		RULE_swtichbody = 11, RULE_temporal = 12, RULE_inBody = 13, RULE_statementbody = 14, 
		RULE_listExpression = 15, RULE_expression = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "def", "defVaribales", "defFunction", "functionType", 
			"functionTypeParametersAux", "tipo", "tipoSimple", "recordField", "statement", 
			"swtichbody", "temporal", "inBody", "statementbody", "listExpression", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "','", "'='", "';'", "'struct'", 
			"'{'", "'}'", "'['", "']'", "'char'", "'double'", "'int'", "'while'", 
			"'if'", "'else'", "'switch'", "'default'", "'return'", "'input'", "'print'", 
			"'case'", "'break'", "'continue'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'=='", "'!='", "'>='", "'<'", "'>'", "'<='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT_CONSTANT", "CHAR_CONSTANT", 
			"REAL_CONSTANT", "ID", "COMENTARIO", "COMENTARIO_COMILLAS", "TRASH"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> defs = new ArrayList<>();
		public DefContext def1;
		public MainContext mainProgam;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					((ProgramContext)_localctx).def1 = def();
					_localctx.defs.addAll(((ProgramContext)_localctx).def1.ast);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42);
			((ProgramContext)_localctx).mainProgam = main();
			setState(43);
			match(EOF);
			_localctx.defs.add(((ProgramContext)_localctx).mainProgam.ast);
			((ProgramContext)_localctx).ast =  new Program(_localctx.defs);
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

	public static class MainContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token OP1;
		public InBodyContext cuerpoMain;
		public InBodyContext inBody() {
			return getRuleContext(InBodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((MainContext)_localctx).OP1 = match(T__0);
			setState(48);
			match(T__1);
			setState(49);
			match(T__2);
			setState(50);
			match(T__3);
			setState(51);
			match(T__4);
			setState(52);
			((MainContext)_localctx).cuerpoMain = inBody();
			((MainContext)_localctx).ast =  new FuncDefinition(((MainContext)_localctx).OP1.getCharPositionInLine()+1, ((MainContext)_localctx).OP1.getLine(),"main", new FunctionType(((MainContext)_localctx).OP1.getCharPositionInLine()+1, ((MainContext)_localctx).OP1.getLine(), "main", new ArrayList<VarDefinition>(), VoidType.getInstance(((MainContext)_localctx).OP1.getCharPositionInLine()+1, ((MainContext)_localctx).OP1.getLine())), ((MainContext)_localctx).cuerpoMain.ast);
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

	public static class DefContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public DefVaribalesContext defVar;
		public DefFunctionContext defFunc;
		public DefVaribalesContext defVaribales() {
			return getRuleContext(DefVaribalesContext.class,0);
		}
		public DefFunctionContext defFunction() {
			return getRuleContext(DefFunctionContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				((DefContext)_localctx).defVar = defVaribales();
				_localctx.ast.addAll(((DefContext)_localctx).defVar.ast);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				((DefContext)_localctx).defFunc = defFunction();
				_localctx.ast.addAll(((DefContext)_localctx).defFunc.ast);
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

	public static class DefVaribalesContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public List<String> idList = new ArrayList<>();
		public List<String> common = new ArrayList<>();
		public Expression expr = null;
		public Token OP1;
		public Token OP2;
		public TipoContext type;
		public ExpressionContext expression;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefVaribalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVaribales; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefVaribales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefVaribalesContext defVaribales() throws RecognitionException {
		DefVaribalesContext _localctx = new DefVaribalesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defVaribales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((DefVaribalesContext)_localctx).OP1 = match(ID);
			_localctx.idList.add((((DefVaribalesContext)_localctx).OP1!=null?((DefVaribalesContext)_localctx).OP1.getText():null));
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(65);
				match(T__5);
				setState(66);
				((DefVaribalesContext)_localctx).OP2 = match(ID);
				_localctx.idList.add((((DefVaribalesContext)_localctx).OP2!=null?((DefVaribalesContext)_localctx).OP2.getText():null));
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__4);
			setState(74);
			((DefVaribalesContext)_localctx).type = tipo();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(75);
				match(T__6);
				setState(76);
				((DefVaribalesContext)_localctx).expression = expression(0);
				((DefVaribalesContext)_localctx).expr =  ((DefVaribalesContext)_localctx).expression.ast;
				}
			}

			setState(81);
			match(T__7);
			for(String elem : _localctx.idList) { if(!_localctx.common.contains(elem)){ _localctx.ast.add(new VarDefinition(((DefVaribalesContext)_localctx).OP1.getCharPositionInLine()+1, ((DefVaribalesContext)_localctx).OP1.getLine(), elem, ((DefVaribalesContext)_localctx).type.ast, _localctx.expr)); _localctx.common.add(elem);}else{new ErrorType(((DefVaribalesContext)_localctx).OP1.getCharPositionInLine()+1, ((DefVaribalesContext)_localctx).OP1.getLine(), "The variable named " + elem + " is already being used");} } 
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

	public static class DefFunctionContext extends ParserRuleContext {
		public List<FuncDefinition> ast = new ArrayList<>();
		public FunctionTypeContext aux;
		public FunctionTypeContext functionType;
		public InBodyContext cuerpo;
		public List<FunctionTypeContext> functionType() {
			return getRuleContexts(FunctionTypeContext.class);
		}
		public FunctionTypeContext functionType(int i) {
			return getRuleContext(FunctionTypeContext.class,i);
		}
		public List<InBodyContext> inBody() {
			return getRuleContexts(InBodyContext.class);
		}
		public InBodyContext inBody(int i) {
			return getRuleContext(InBodyContext.class,i);
		}
		public DefFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFunctionContext defFunction() throws RecognitionException {
		DefFunctionContext _localctx = new DefFunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(84);
					((DefFunctionContext)_localctx).aux = ((DefFunctionContext)_localctx).functionType = functionType();
					setState(85);
					((DefFunctionContext)_localctx).cuerpo = inBody();
					_localctx.ast.add(new FuncDefinition(((DefFunctionContext)_localctx).functionType.ast.getColumn(),((DefFunctionContext)_localctx).functionType.ast.getLine(),((DefFunctionContext)_localctx).aux.ast.getName(), ((DefFunctionContext)_localctx).aux.ast ,((DefFunctionContext)_localctx).cuerpo.ast));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionType ast;
		public Type tipoFunc = VoidType.getInstance(0,0);
		public List<VarDefinition> parameter = new ArrayList<>();
		public Token OP;
		public FunctionTypeParametersAuxContext var;
		public TipoSimpleContext type;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FunctionTypeParametersAuxContext functionTypeParametersAux() {
			return getRuleContext(FunctionTypeParametersAuxContext.class,0);
		}
		public TipoSimpleContext tipoSimple() {
			return getRuleContext(TipoSimpleContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(93);
			((FunctionTypeContext)_localctx).OP = match(ID);
			setState(94);
			match(T__2);
			setState(95);
			((FunctionTypeContext)_localctx).var = functionTypeParametersAux();
			setState(96);
			match(T__3);
			setState(97);
			match(T__4);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(98);
				((FunctionTypeContext)_localctx).type = tipoSimple();
				((FunctionTypeContext)_localctx).tipoFunc =  ((FunctionTypeContext)_localctx).type.ast;
				}
			}

			((FunctionTypeContext)_localctx).ast =   new FunctionType(((FunctionTypeContext)_localctx).OP.getCharPositionInLine()+1, ((FunctionTypeContext)_localctx).OP.getLine(), (((FunctionTypeContext)_localctx).OP!=null?((FunctionTypeContext)_localctx).OP.getText():null), ((FunctionTypeContext)_localctx).var.ast, _localctx.tipoFunc);
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

	public static class FunctionTypeParametersAuxContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public Token OP1;
		public TipoSimpleContext type1;
		public Token OP2;
		public TipoSimpleContext type2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TipoSimpleContext> tipoSimple() {
			return getRuleContexts(TipoSimpleContext.class);
		}
		public TipoSimpleContext tipoSimple(int i) {
			return getRuleContext(TipoSimpleContext.class,i);
		}
		public FunctionTypeParametersAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParametersAux; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunctionTypeParametersAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeParametersAuxContext functionTypeParametersAux() throws RecognitionException {
		FunctionTypeParametersAuxContext _localctx = new FunctionTypeParametersAuxContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionTypeParametersAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(105);
				((FunctionTypeParametersAuxContext)_localctx).OP1 = match(ID);
				setState(106);
				match(T__4);
				setState(107);
				((FunctionTypeParametersAuxContext)_localctx).type1 = tipoSimple();
				_localctx.ast.add(new VarDefinition(((FunctionTypeParametersAuxContext)_localctx).OP1.getCharPositionInLine()+1, ((FunctionTypeParametersAuxContext)_localctx).OP1.getLine(), (((FunctionTypeParametersAuxContext)_localctx).OP1!=null?((FunctionTypeParametersAuxContext)_localctx).OP1.getText():null),((FunctionTypeParametersAuxContext)_localctx).type1.ast, null));
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(109);
					match(T__5);
					setState(110);
					((FunctionTypeParametersAuxContext)_localctx).OP2 = match(ID);
					setState(111);
					match(T__4);
					setState(112);
					((FunctionTypeParametersAuxContext)_localctx).type2 = tipoSimple();
					_localctx.ast.add(new VarDefinition(((FunctionTypeParametersAuxContext)_localctx).OP2.getCharPositionInLine()+1, ((FunctionTypeParametersAuxContext)_localctx).OP2.getLine(), (((FunctionTypeParametersAuxContext)_localctx).OP2!=null?((FunctionTypeParametersAuxContext)_localctx).OP2.getText():null),((FunctionTypeParametersAuxContext)_localctx).type2.ast,null));
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(124);
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

	public static class TipoContext extends ParserRuleContext {
		public Type ast;
		public List<RecordField> fields = new ArrayList<>();
		public TipoSimpleContext type1;
		public Token OP1;
		public RecordFieldContext op1;
		public Token INT_CONSTANT;
		public TipoContext of;
		public TipoSimpleContext tipoSimple() {
			return getRuleContext(TipoSimpleContext.class,0);
		}
		public List<RecordFieldContext> recordField() {
			return getRuleContexts(RecordFieldContext.class);
		}
		public RecordFieldContext recordField(int i) {
			return getRuleContext(RecordFieldContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				((TipoContext)_localctx).type1 = tipoSimple();
				((TipoContext)_localctx).ast = ((TipoContext)_localctx).type1.ast;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				((TipoContext)_localctx).OP1 = match(T__8);
				setState(130);
				match(T__9);
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					((TipoContext)_localctx).op1 = recordField();
					_localctx.fields.addAll(((TipoContext)_localctx).op1.ast);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(138);
				match(T__10);
				((TipoContext)_localctx).ast =  new Struct(((TipoContext)_localctx).OP1.getCharPositionInLine()+1, ((TipoContext)_localctx).OP1.getLine(), _localctx.fields);
				((Struct)_localctx.ast).CheckErrors();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__11);
				setState(143);
				((TipoContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(144);
				match(T__12);
				setState(145);
				((TipoContext)_localctx).of = tipo();
				((TipoContext)_localctx).ast =  new ArrayType(((TipoContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, ((TipoContext)_localctx).INT_CONSTANT.getLine(), LexerHelper.lexemeToInt((((TipoContext)_localctx).INT_CONSTANT!=null?((TipoContext)_localctx).INT_CONSTANT.getText():null)) , ((TipoContext)_localctx).of.ast);
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

	public static class TipoSimpleContext extends ParserRuleContext {
		public Type ast;
		public Token TYPE;
		public TipoSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoSimple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitTipoSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoSimpleContext tipoSimple() throws RecognitionException {
		TipoSimpleContext _localctx = new TipoSimpleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipoSimple);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((TipoSimpleContext)_localctx).TYPE = match(T__13);
				((TipoSimpleContext)_localctx).ast =  CharType.getInstance(((TipoSimpleContext)_localctx).TYPE.getCharPositionInLine()+1, ((TipoSimpleContext)_localctx).TYPE.getLine());
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((TipoSimpleContext)_localctx).TYPE = match(T__14);
				((TipoSimpleContext)_localctx).ast =  DoubleType.getInstance(((TipoSimpleContext)_localctx).TYPE.getCharPositionInLine()+1, ((TipoSimpleContext)_localctx).TYPE.getLine());
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				((TipoSimpleContext)_localctx).TYPE = match(T__15);
				((TipoSimpleContext)_localctx).ast =  IntType.getInstance(((TipoSimpleContext)_localctx).TYPE.getCharPositionInLine()+1, ((TipoSimpleContext)_localctx).TYPE.getLine());
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

	public static class RecordFieldContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<>();
		public List<String> fields = new ArrayList<>();
		public Token OP1;
		public Token OP2;
		public TipoContext type;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public RecordFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitRecordField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldContext recordField() throws RecognitionException {
		RecordFieldContext _localctx = new RecordFieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recordField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((RecordFieldContext)_localctx).OP1 = match(ID);
			_localctx.fields.add((((RecordFieldContext)_localctx).OP1!=null?((RecordFieldContext)_localctx).OP1.getText():null));
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(160);
				match(T__5);
				setState(161);
				((RecordFieldContext)_localctx).OP2 = match(ID);
				_localctx.fields.add((((RecordFieldContext)_localctx).OP2!=null?((RecordFieldContext)_localctx).OP2.getText():null));
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__4);
			setState(169);
			((RecordFieldContext)_localctx).type = tipo();
			setState(170);
			match(T__7);
			for(String elem : _localctx.fields) { _localctx.ast.add(new RecordField(((RecordFieldContext)_localctx).OP1.getCharPositionInLine()+1, ((RecordFieldContext)_localctx).OP1.getLine(),elem, ((RecordFieldContext)_localctx).type.ast));}
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
		public Statement ast;
		public List<Expression> param = new ArrayList<>();
		public List<Expression> parameter = new ArrayList<>();
		public List<Statement> elses = new ArrayList<>();
		public ExpressionContext exprWhile;
		public StatementbodyContext cuerpo;
		public ExpressionContext exprIf;
		public StatementbodyContext stateIf;
		public StatementbodyContext statelse;
		public Token AUX;
		public ExpressionContext expression;
		public SwtichbodyContext swtichbody;
		public Token DEFA;
		public StatementContext defState;
		public TemporalContext temporal;
		public ExpressionContext stat3;
		public ListExpressionContext stateRead;
		public ListExpressionContext stateWrite;
		public ExpressionContext left;
		public ExpressionContext right;
		public Token ID;
		public ListExpressionContext expr1;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementbodyContext> statementbody() {
			return getRuleContexts(StatementbodyContext.class);
		}
		public StatementbodyContext statementbody(int i) {
			return getRuleContext(StatementbodyContext.class,i);
		}
		public SwtichbodyContext swtichbody() {
			return getRuleContext(SwtichbodyContext.class,0);
		}
		public TemporalContext temporal() {
			return getRuleContext(TemporalContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ListExpressionContext> listExpression() {
			return getRuleContexts(ListExpressionContext.class);
		}
		public ListExpressionContext listExpression(int i) {
			return getRuleContext(ListExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__16);
				setState(174);
				((StatementContext)_localctx).exprWhile = expression(0);
				setState(175);
				match(T__4);
				setState(176);
				((StatementContext)_localctx).cuerpo = statementbody();
				((StatementContext)_localctx).ast =  new Iterative(((StatementContext)_localctx).exprWhile.ast.getColumn(), ((StatementContext)_localctx).exprWhile.ast.getLine(), ((StatementContext)_localctx).exprWhile.ast, ((StatementContext)_localctx).cuerpo.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__17);
				setState(180);
				((StatementContext)_localctx).exprIf = expression(0);
				setState(181);
				match(T__4);
				setState(182);
				((StatementContext)_localctx).stateIf = statementbody();
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(183);
					match(T__18);
					setState(184);
					((StatementContext)_localctx).statelse = statementbody();
					((StatementContext)_localctx).elses =  ((StatementContext)_localctx).statelse.ast;
					}
					break;
				}
				((StatementContext)_localctx).ast =  new Condition(((StatementContext)_localctx).exprIf.ast.getColumn(), ((StatementContext)_localctx).exprIf.ast.getLine(), ((StatementContext)_localctx).exprIf.ast, ((StatementContext)_localctx).stateIf.ast, _localctx.elses);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				((StatementContext)_localctx).AUX = match(T__19);
				setState(192);
				match(T__2);
				setState(193);
				((StatementContext)_localctx).expression = expression(0);
				setState(194);
				match(T__3);
				setState(195);
				match(T__9);
				setState(196);
				((StatementContext)_localctx).swtichbody = swtichbody();
				setState(197);
				((StatementContext)_localctx).DEFA = match(T__20);
				setState(198);
				match(T__4);
				setState(199);
				((StatementContext)_localctx).defState = statement();
				setState(200);
				((StatementContext)_localctx).temporal = temporal();
				setState(201);
				match(T__10);
				((StatementContext)_localctx).ast =  new Switch(((StatementContext)_localctx).AUX.getCharPositionInLine()+1, ((StatementContext)_localctx).AUX.getLine(), ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).swtichbody.ast, new Case(((StatementContext)_localctx).DEFA.getCharPositionInLine()+1, ((StatementContext)_localctx).DEFA.getLine(), null, ((StatementContext)_localctx).defState.ast, ((StatementContext)_localctx).temporal.ast)) ;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(T__21);
				setState(205);
				((StatementContext)_localctx).stat3 = expression(0);
				setState(206);
				match(T__7);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).stat3.ast.getColumn(), ((StatementContext)_localctx).stat3.ast.getLine(), ((StatementContext)_localctx).stat3.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				((StatementContext)_localctx).AUX = match(T__22);
				setState(210);
				((StatementContext)_localctx).stateRead = listExpression();
				setState(211);
				match(T__7);
				((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).AUX.getCharPositionInLine()+1, ((StatementContext)_localctx).AUX.getLine(), ((StatementContext)_localctx).stateRead.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				((StatementContext)_localctx).AUX = match(T__23);
				setState(215);
				((StatementContext)_localctx).stateWrite = listExpression();
				setState(216);
				match(T__7);
				((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).AUX.getCharPositionInLine()+1, ((StatementContext)_localctx).AUX.getLine(), ((StatementContext)_localctx).stateWrite.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				((StatementContext)_localctx).left = expression(0);
				{
				setState(220);
				match(T__6);
				}
				setState(221);
				((StatementContext)_localctx).right = expression(0);
				setState(222);
				match(T__7);
				((StatementContext)_localctx).ast =  new Assigmment(((StatementContext)_localctx).left.ast.getColumn(), ((StatementContext)_localctx).left.ast.getLine(), ((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(225);
				((StatementContext)_localctx).ID = match(ID);
				setState(226);
				match(T__2);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__28) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(227);
					((StatementContext)_localctx).expr1 = listExpression();
					((StatementContext)_localctx).parameter =  ((StatementContext)_localctx).expr1.ast;
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__3);
				setState(236);
				match(T__7);
				_localctx.param.addAll(_localctx.parameter);
				((StatementContext)_localctx).ast =  new FunctionInvoke(((StatementContext)_localctx).ID.getCharPositionInLine()+1, ((StatementContext)_localctx).ID.getLine(), _localctx.param, new Variable(((StatementContext)_localctx).ID.getCharPositionInLine()+1, ((StatementContext)_localctx).ID.getLine(), (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)));
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

	public static class SwtichbodyContext extends ParserRuleContext {
		public List<Case> ast = new ArrayList<>();
		public Token AUX;
		public ExpressionContext expression;
		public StatementContext statement;
		public TemporalContext temporal;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TemporalContext> temporal() {
			return getRuleContexts(TemporalContext.class);
		}
		public TemporalContext temporal(int i) {
			return getRuleContext(TemporalContext.class,i);
		}
		public SwtichbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swtichbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSwtichbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwtichbodyContext swtichbody() throws RecognitionException {
		SwtichbodyContext _localctx = new SwtichbodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_swtichbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				((SwtichbodyContext)_localctx).AUX = match(T__24);
				setState(242);
				((SwtichbodyContext)_localctx).expression = expression(0);
				setState(243);
				match(T__4);
				setState(244);
				((SwtichbodyContext)_localctx).statement = statement();
				setState(245);
				((SwtichbodyContext)_localctx).temporal = temporal();
				_localctx.ast.add(new Case(((SwtichbodyContext)_localctx).AUX.getCharPositionInLine()+1, ((SwtichbodyContext)_localctx).AUX.getLine(), ((SwtichbodyContext)_localctx).expression.ast, ((SwtichbodyContext)_localctx).statement.ast, ((SwtichbodyContext)_localctx).temporal.ast ));
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 );
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

	public static class TemporalContext extends ParserRuleContext {
		public String ast;
		public Token AUX;
		public TemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitTemporal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporalContext temporal() throws RecognitionException {
		TemporalContext _localctx = new TemporalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_temporal);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				((TemporalContext)_localctx).AUX = match(T__25);
				setState(253);
				match(T__7);
				((TemporalContext)_localctx).ast =  (((TemporalContext)_localctx).AUX!=null?((TemporalContext)_localctx).AUX.getText():null);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((TemporalContext)_localctx).AUX = match(T__26);
				setState(256);
				match(T__7);
				((TemporalContext)_localctx).ast =  (((TemporalContext)_localctx).AUX!=null?((TemporalContext)_localctx).AUX.getText():null);
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

	public static class InBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public DefVaribalesContext sta1;
		public StatementContext sta2;
		public List<DefVaribalesContext> defVaribales() {
			return getRuleContexts(DefVaribalesContext.class);
		}
		public DefVaribalesContext defVaribales(int i) {
			return getRuleContext(DefVaribalesContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitInBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InBodyContext inBody() throws RecognitionException {
		InBodyContext _localctx = new InBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__9);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					((InBodyContext)_localctx).sta1 = defVaribales();
					_localctx.ast.addAll(((InBodyContext)_localctx).sta1.ast);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(269);
				((InBodyContext)_localctx).sta2 = statement();
				_localctx.ast.add(((InBodyContext)_localctx).sta2.ast);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(T__10);
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

	public static class StatementbodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public DefVaribalesContext sta1;
		public StatementContext sta2;
		public StatementContext stat1;
		public List<DefVaribalesContext> defVaribales() {
			return getRuleContexts(DefVaribalesContext.class);
		}
		public DefVaribalesContext defVaribales(int i) {
			return getRuleContext(DefVaribalesContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatementbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementbodyContext statementbody() throws RecognitionException {
		StatementbodyContext _localctx = new StatementbodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementbody);
		int _la;
		try {
			int _alt;
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__9);
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						((StatementbodyContext)_localctx).sta1 = defVaribales();
						_localctx.ast.addAll(((StatementbodyContext)_localctx).sta1.ast);
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(288);
					((StatementbodyContext)_localctx).sta2 = statement();
					_localctx.ast.add(((StatementbodyContext)_localctx).sta2.ast);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				match(T__10);
				}
				break;
			case T__2:
			case T__16:
			case T__17:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__28:
			case T__29:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				((StatementbodyContext)_localctx).stat1 = statement();
				_localctx.ast.add(((StatementbodyContext)_localctx).stat1.ast);
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

	public static class ListExpressionContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((ListExpressionContext)_localctx).expr1 = expression(0);
			_localctx.ast.add(((ListExpressionContext)_localctx).expr1.ast);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(304);
				match(T__5);
				setState(305);
				((ListExpressionContext)_localctx).expr2 = expression(0);
				_localctx.ast.add(((ListExpressionContext)_localctx).expr2.ast);
				}
				}
				setState(312);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> param = new ArrayList<>();
		public ExpressionContext expr1;
		public ExpressionContext field;
		public ExpressionContext left;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public ExpressionContext expr;
		public TipoContext type;
		public ExpressionContext unary;
		public ExpressionContext exprNeg;
		public ListExpressionContext parameters;
		public Token OP;
		public ExpressionContext right;
		public ExpressionContext expr2;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(314);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)) );
				}
				break;
			case 2:
				{
				setState(316);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)) );
				}
				break;
			case 3:
				{
				setState(318);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(320);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).ID.getLine(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) );
				}
				break;
			case 5:
				{
				setState(322);
				match(T__2);
				setState(323);
				((ExpressionContext)_localctx).expr = expression(0);
				setState(324);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expr.ast;
				}
				break;
			case 6:
				{
				setState(327);
				match(T__2);
				setState(328);
				((ExpressionContext)_localctx).type = tipo();
				setState(329);
				match(T__3);
				setState(330);
				((ExpressionContext)_localctx).expr = expression(8);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).type.ast.getColumn(),((ExpressionContext)_localctx).type.ast.getLine() , ((ExpressionContext)_localctx).expr.ast, ((ExpressionContext)_localctx).type.ast );
				}
				break;
			case 7:
				{
				setState(333);
				match(T__28);
				setState(334);
				((ExpressionContext)_localctx).unary = expression(7);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).unary.ast.getColumn(), ((ExpressionContext)_localctx).unary.ast.getLine(), ((ExpressionContext)_localctx).unary.ast);
				}
				break;
			case 8:
				{
				setState(337);
				match(T__29);
				setState(338);
				((ExpressionContext)_localctx).exprNeg = expression(6);
				((ExpressionContext)_localctx).ast =  new Negative( ((ExpressionContext)_localctx).exprNeg.ast.getColumn(), ((ExpressionContext)_localctx).exprNeg.ast.getLine(), ((ExpressionContext)_localctx).exprNeg.ast);
				}
				break;
			case 9:
				{
				setState(341);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(342);
				match(T__2);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__28) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(343);
					((ExpressionContext)_localctx).parameters = listExpression();
					_localctx.param.addAll(((ExpressionContext)_localctx).parameters.ast);
					}
				}

				setState(348);
				match(T__3);
				((ExpressionContext)_localctx).ast =  new FunctionInvoke(((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).ID.getLine(), _localctx.param, new Variable(((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).ID.getLine(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(353);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(354);
						((ExpressionContext)_localctx).right = expression(6);
						((ExpressionContext)_localctx).ast =  new Aritmmetic(((ExpressionContext)_localctx).left.ast.getColumn(),((ExpressionContext)_localctx).left.ast.getLine() ,((ExpressionContext)_localctx).left.ast , ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null) );
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(358);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__33) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						((ExpressionContext)_localctx).right = expression(5);
						((ExpressionContext)_localctx).ast =  new Aritmmetic(((ExpressionContext)_localctx).left.ast.getColumn(),((ExpressionContext)_localctx).left.ast.getLine() ,((ExpressionContext)_localctx).left.ast , ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null) );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(363);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						((ExpressionContext)_localctx).right = expression(4);
						((ExpressionContext)_localctx).ast =  new Comparision(((ExpressionContext)_localctx).left.ast.getColumn(),((ExpressionContext)_localctx).left.ast.getLine() ,((ExpressionContext)_localctx).left.ast , ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null) );
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(368);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(369);
						((ExpressionContext)_localctx).right = expression(3);
						((ExpressionContext)_localctx).ast =  new Logic(((ExpressionContext)_localctx).left.ast.getColumn(),((ExpressionContext)_localctx).left.ast.getLine() ,((ExpressionContext)_localctx).left.ast , ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null) );
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr1 = _prevctx;
						_localctx.expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(373);
						match(T__11);
						setState(374);
						((ExpressionContext)_localctx).expr2 = expression(0);
						setState(375);
						match(T__12);
						((ExpressionContext)_localctx).ast =  new ArrayAccess( ((ExpressionContext)_localctx).expr1.ast.getColumn(), ((ExpressionContext)_localctx).expr1.ast.getLine(), ((ExpressionContext)_localctx).expr1.ast, ((ExpressionContext)_localctx).expr2.ast );
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.field = _prevctx;
						_localctx.field = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(378);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(379);
						match(T__27);
						setState(380);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAcess(((ExpressionContext)_localctx).field.ast.getColumn(),((ExpressionContext)_localctx).field.ast.getLine() ,((ExpressionContext)_localctx).field.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) );
						}
						break;
					}
					} 
				}
				setState(386);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0186\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\6\6[\n\6\r\6\16\6\\\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7h\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bv\n\b"+
		"\f\b\16\by\13\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\6\t\u0089\n\t\r\t\16\t\u008a\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00be"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e9\n\f\f\f\16\f\u00ec\13\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00f2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00fb\n\r\r\r\16"+
		"\r\u00fc\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0105\n\16\3\17\3\17\3\17"+
		"\3\17\7\17\u010b\n\17\f\17\16\17\u010e\13\17\3\17\3\17\3\17\7\17\u0113"+
		"\n\17\f\17\16\17\u0116\13\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u011e"+
		"\n\20\f\20\16\20\u0121\13\20\3\20\3\20\3\20\7\20\u0126\n\20\f\20\16\20"+
		"\u0129\13\20\3\20\3\20\3\20\3\20\5\20\u012f\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u0137\n\21\f\21\16\21\u013a\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u015d\n\22\3\22\3\22\5\22\u0161\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0181\n\22"+
		"\f\22\16\22\u0184\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\6\3\2!#\4\2\37\37$$\3\2%*\3\2+,\2\u01a3\2)\3\2\2\2\4\61\3"+
		"\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nZ\3\2\2\2\f^\3\2\2\2\16|\3\2\2\2\20\u0096"+
		"\3\2\2\2\22\u009e\3\2\2\2\24\u00a0\3\2\2\2\26\u00f1\3\2\2\2\30\u00fa\3"+
		"\2\2\2\32\u0104\3\2\2\2\34\u0106\3\2\2\2\36\u012e\3\2\2\2 \u0130\3\2\2"+
		"\2\"\u0160\3\2\2\2$%\5\6\4\2%&\b\2\1\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\4\3\2-.\7\2\2\3./\b\2\1"+
		"\2/\60\b\2\1\2\60\3\3\2\2\2\61\62\7\3\2\2\62\63\7\4\2\2\63\64\7\5\2\2"+
		"\64\65\7\6\2\2\65\66\7\7\2\2\66\67\5\34\17\2\678\b\3\1\28\5\3\2\2\29:"+
		"\5\b\5\2:;\b\4\1\2;@\3\2\2\2<=\5\n\6\2=>\b\4\1\2>@\3\2\2\2?9\3\2\2\2?"+
		"<\3\2\2\2@\7\3\2\2\2AB\7\60\2\2BH\b\5\1\2CD\7\b\2\2DE\7\60\2\2EG\b\5\1"+
		"\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\7\2"+
		"\2LQ\5\20\t\2MN\7\t\2\2NO\5\"\22\2OP\b\5\1\2PR\3\2\2\2QM\3\2\2\2QR\3\2"+
		"\2\2RS\3\2\2\2ST\7\n\2\2TU\b\5\1\2U\t\3\2\2\2VW\5\f\7\2WX\5\34\17\2XY"+
		"\b\6\1\2Y[\3\2\2\2ZV\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2"+
		"\2\2^_\7\3\2\2_`\7\60\2\2`a\7\5\2\2ab\5\16\b\2bc\7\6\2\2cg\7\7\2\2de\5"+
		"\22\n\2ef\b\7\1\2fh\3\2\2\2gd\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\7\1\2j\r"+
		"\3\2\2\2kl\7\60\2\2lm\7\7\2\2mn\5\22\n\2nw\b\b\1\2op\7\b\2\2pq\7\60\2"+
		"\2qr\7\7\2\2rs\5\22\n\2st\b\b\1\2tv\3\2\2\2uo\3\2\2\2vy\3\2\2\2wu\3\2"+
		"\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zk\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0097\3\2\2\2\u0080\u0081\5\22\n\2\u0081"+
		"\u0082\b\t\1\2\u0082\u0097\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0088\7"+
		"\f\2\2\u0085\u0086\5\24\13\2\u0086\u0087\b\t\1\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\r\2\2\u008d\u008e\b\t\1\2\u008e"+
		"\u008f\b\t\1\2\u008f\u0097\3\2\2\2\u0090\u0091\7\16\2\2\u0091\u0092\7"+
		"-\2\2\u0092\u0093\7\17\2\2\u0093\u0094\5\20\t\2\u0094\u0095\b\t\1\2\u0095"+
		"\u0097\3\2\2\2\u0096\177\3\2\2\2\u0096\u0080\3\2\2\2\u0096\u0083\3\2\2"+
		"\2\u0096\u0090\3\2\2\2\u0097\21\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009f"+
		"\b\n\1\2\u009a\u009b\7\21\2\2\u009b\u009f\b\n\1\2\u009c\u009d\7\22\2\2"+
		"\u009d\u009f\b\n\1\2\u009e\u0098\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7\60\2\2\u00a1\u00a7\b\13\1\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\u00a4\7\60\2\2\u00a4\u00a6\b\13\1\2\u00a5\u00a2\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5\20"+
		"\t\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\b\13\1\2\u00ae\25\3\2\2\2\u00af\u00b0"+
		"\7\23\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5\36\20"+
		"\2\u00b3\u00b4\b\f\1\2\u00b4\u00f2\3\2\2\2\u00b5\u00b6\7\24\2\2\u00b6"+
		"\u00b7\5\"\22\2\u00b7\u00b8\7\7\2\2\u00b8\u00bd\5\36\20\2\u00b9\u00ba"+
		"\7\25\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\b\f\1\2\u00bc\u00be\3\2\2"+
		"\2\u00bd\u00b9\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\b\f\1\2\u00c0\u00f2\3\2\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00c3\7\5\2\2"+
		"\u00c3\u00c4\5\"\22\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7"+
		"\5\30\r\2\u00c7\u00c8\7\27\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00ca\5\26\f"+
		"\2\u00ca\u00cb\5\32\16\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\b\f\1\2\u00cd"+
		"\u00f2\3\2\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\7"+
		"\n\2\2\u00d1\u00d2\b\f\1\2\u00d2\u00f2\3\2\2\2\u00d3\u00d4\7\31\2\2\u00d4"+
		"\u00d5\5 \21\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\b\f\1\2\u00d7\u00f2\3\2"+
		"\2\2\u00d8\u00d9\7\32\2\2\u00d9\u00da\5 \21\2\u00da\u00db\7\n\2\2\u00db"+
		"\u00dc\b\f\1\2\u00dc\u00f2\3\2\2\2\u00dd\u00de\5\"\22\2\u00de\u00df\7"+
		"\t\2\2\u00df\u00e0\5\"\22\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\b\f\1\2\u00e2"+
		"\u00f2\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00ea\7\5\2\2\u00e5\u00e6\5"+
		" \21\2\u00e6\u00e7\b\f\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\7\n\2\2\u00ef"+
		"\u00f0\b\f\1\2\u00f0\u00f2\b\f\1\2\u00f1\u00af\3\2\2\2\u00f1\u00b5\3\2"+
		"\2\2\u00f1\u00c1\3\2\2\2\u00f1\u00ce\3\2\2\2\u00f1\u00d3\3\2\2\2\u00f1"+
		"\u00d8\3\2\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00e3\3\2\2\2\u00f2\27\3\2\2"+
		"\2\u00f3\u00f4\7\33\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\7\7\2\2\u00f6"+
		"\u00f7\5\26\f\2\u00f7\u00f8\5\32\16\2\u00f8\u00f9\b\r\1\2\u00f9\u00fb"+
		"\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\31\3\2\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\7\n\2"+
		"\2\u0100\u0105\b\16\1\2\u0101\u0102\7\35\2\2\u0102\u0103\7\n\2\2\u0103"+
		"\u0105\b\16\1\2\u0104\u00fe\3\2\2\2\u0104\u0101\3\2\2\2\u0105\33\3\2\2"+
		"\2\u0106\u010c\7\f\2\2\u0107\u0108\5\b\5\2\u0108\u0109\b\17\1\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u0114\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\5\26\f\2\u0110\u0111\b\17\1\2\u0111\u0113\3\2\2\2\u0112\u010f\3"+
		"\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\r\2\2\u0118\35\3\2\2"+
		"\2\u0119\u011f\7\f\2\2\u011a\u011b\5\b\5\2\u011b\u011c\b\20\1\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\5\26\f\2\u0123\u0124\b\20\1\2\u0124\u0126\3\2\2\2\u0125\u0122\3"+
		"\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012f\7\r\2\2\u012b\u012c\5\26"+
		"\f\2\u012c\u012d\b\20\1\2\u012d\u012f\3\2\2\2\u012e\u0119\3\2\2\2\u012e"+
		"\u012b\3\2\2\2\u012f\37\3\2\2\2\u0130\u0131\5\"\22\2\u0131\u0138\b\21"+
		"\1\2\u0132\u0133\7\b\2\2\u0133\u0134\5\"\22\2\u0134\u0135\b\21\1\2\u0135"+
		"\u0137\3\2\2\2\u0136\u0132\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139!\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c"+
		"\b\22\1\2\u013c\u013d\7-\2\2\u013d\u0161\b\22\1\2\u013e\u013f\7/\2\2\u013f"+
		"\u0161\b\22\1\2\u0140\u0141\7.\2\2\u0141\u0161\b\22\1\2\u0142\u0143\7"+
		"\60\2\2\u0143\u0161\b\22\1\2\u0144\u0145\7\5\2\2\u0145\u0146\5\"\22\2"+
		"\u0146\u0147\7\6\2\2\u0147\u0148\b\22\1\2\u0148\u0161\3\2\2\2\u0149\u014a"+
		"\7\5\2\2\u014a\u014b\5\20\t\2\u014b\u014c\7\6\2\2\u014c\u014d\5\"\22\n"+
		"\u014d\u014e\b\22\1\2\u014e\u0161\3\2\2\2\u014f\u0150\7\37\2\2\u0150\u0151"+
		"\5\"\22\t\u0151\u0152\b\22\1\2\u0152\u0161\3\2\2\2\u0153\u0154\7 \2\2"+
		"\u0154\u0155\5\"\22\b\u0155\u0156\b\22\1\2\u0156\u0161\3\2\2\2\u0157\u0158"+
		"\7\60\2\2\u0158\u015c\7\5\2\2\u0159\u015a\5 \21\2\u015a\u015b\b\22\1\2"+
		"\u015b\u015d\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u015f\7\6\2\2\u015f\u0161\b\22\1\2\u0160\u013b\3\2\2\2"+
		"\u0160\u013e\3\2\2\2\u0160\u0140\3\2\2\2\u0160\u0142\3\2\2\2\u0160\u0144"+
		"\3\2\2\2\u0160\u0149\3\2\2\2\u0160\u014f\3\2\2\2\u0160\u0153\3\2\2\2\u0160"+
		"\u0157\3\2\2\2\u0161\u0182\3\2\2\2\u0162\u0163\f\7\2\2\u0163\u0164\t\2"+
		"\2\2\u0164\u0165\5\"\22\b\u0165\u0166\b\22\1\2\u0166\u0181\3\2\2\2\u0167"+
		"\u0168\f\6\2\2\u0168\u0169\t\3\2\2\u0169\u016a\5\"\22\7\u016a\u016b\b"+
		"\22\1\2\u016b\u0181\3\2\2\2\u016c\u016d\f\5\2\2\u016d\u016e\t\4\2\2\u016e"+
		"\u016f\5\"\22\6\u016f\u0170\b\22\1\2\u0170\u0181\3\2\2\2\u0171\u0172\f"+
		"\4\2\2\u0172\u0173\t\5\2\2\u0173\u0174\5\"\22\5\u0174\u0175\b\22\1\2\u0175"+
		"\u0181\3\2\2\2\u0176\u0177\f\f\2\2\u0177\u0178\7\16\2\2\u0178\u0179\5"+
		"\"\22\2\u0179\u017a\7\17\2\2\u017a\u017b\b\22\1\2\u017b\u0181\3\2\2\2"+
		"\u017c\u017d\f\13\2\2\u017d\u017e\7\36\2\2\u017e\u017f\7\60\2\2\u017f"+
		"\u0181\b\22\1\2\u0180\u0162\3\2\2\2\u0180\u0167\3\2\2\2\u0180\u016c\3"+
		"\2\2\2\u0180\u0171\3\2\2\2\u0180\u0176\3\2\2\2\u0180\u017c\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183#\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\35)?HQ\\gw|\u008a\u0096\u009e\u00a7\u00bd\u00ea\u00f1"+
		"\u00fc\u0104\u010c\u0114\u011f\u0127\u012e\u0138\u015c\u0160\u0180\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}