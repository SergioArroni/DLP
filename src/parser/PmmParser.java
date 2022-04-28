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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		CHAR_CONSTANT=39, REAL_CONSTANT=40, ID=41, COMENTARIO=42, COMENTARIO_COMILLAS=43, 
		TRASH=44;
	public static final int
		RULE_program = 0, RULE_listDef = 1, RULE_main = 2, RULE_def = 3, RULE_defVaribales = 4, 
		RULE_tipo = 5, RULE_recordField = 6, RULE_defFunction = 7, RULE_functionType = 8, 
		RULE_functionTypeParametersAux = 9, RULE_tipoSimple = 10, RULE_statement = 11, 
		RULE_inBody = 12, RULE_statementbody = 13, RULE_listExpression = 14, RULE_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "listDef", "main", "def", "defVaribales", "tipo", "recordField", 
			"defFunction", "functionType", "functionTypeParametersAux", "tipoSimple", 
			"statement", "inBody", "statementbody", "listExpression", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "','", "';'", "'struct'", 
			"'{'", "'}'", "'['", "']'", "'char'", "'double'", "'int'", "'while'", 
			"'if'", "'else'", "'return'", "'input'", "'print'", "'='", "'.'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'=='", "'!='", "'>='", "'<'", "'>'", 
			"'<='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "ID", "COMENTARIO", 
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
		public ArrayList<Definition> defs = new ArrayList<Definition>();
		public ListDefContext progamList;
		public MainContext mainProgam;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public ListDefContext listDef() {
			return getRuleContext(ListDefContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((ProgramContext)_localctx).progamList = listDef();
			setState(33);
			((ProgramContext)_localctx).mainProgam = main();
			setState(34);
			match(EOF);
			_localctx.defs.addAll(((ProgramContext)_localctx).progamList.ast);
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

	public static class ListDefContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public DefContext def1;
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ListDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitListDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDefContext listDef() throws RecognitionException {
		ListDefContext _localctx = new ListDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					((ListDefContext)_localctx).def1 = def();
					_localctx.ast.addAll(((ListDefContext)_localctx).def1.ast);
					}
					} 
				}
				setState(46);
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
		enterRule(_localctx, 4, RULE_main);
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
		public List<Definition> ast = new ArrayList<Definition>();
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
		enterRule(_localctx, 6, RULE_def);
		try {
			setState(62);
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public List<String> idList = new ArrayList<String>();
		public List<String> common = new ArrayList<String>();
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
		enterRule(_localctx, 8, RULE_defVaribales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((DefVaribalesContext)_localctx).OP1 = match(ID);
			_localctx.idList.add((((DefVaribalesContext)_localctx).OP1!=null?((DefVaribalesContext)_localctx).OP1.getText():null));
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(66);
				match(T__5);
				setState(67);
				((DefVaribalesContext)_localctx).OP2 = match(ID);
				_localctx.idList.add((((DefVaribalesContext)_localctx).OP2!=null?((DefVaribalesContext)_localctx).OP2.getText():null));
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__4);
			setState(75);
			((DefVaribalesContext)_localctx).type = tipo();
			setState(76);
			match(T__6);
			for(String elem : _localctx.idList) { if(!_localctx.common.contains(elem)){ _localctx.ast.add(new VarDefinition(((DefVaribalesContext)_localctx).OP1.getCharPositionInLine()+1, ((DefVaribalesContext)_localctx).OP1.getLine(), elem, ((DefVaribalesContext)_localctx).type.ast)); _localctx.common.add(elem);}else{new ErrorType(((DefVaribalesContext)_localctx).OP1.getCharPositionInLine()+1, ((DefVaribalesContext)_localctx).OP1.getLine(), "The variable named " + elem + " is already being used");} } 
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
		public List<RecordField> fields = new ArrayList<RecordField>();
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
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((TipoContext)_localctx).type1 = tipoSimple();
				((TipoContext)_localctx).ast = ((TipoContext)_localctx).type1.ast;
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				((TipoContext)_localctx).OP1 = match(T__7);
				setState(84);
				match(T__8);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					((TipoContext)_localctx).op1 = recordField();
					_localctx.fields.addAll(((TipoContext)_localctx).op1.ast);
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(92);
				match(T__9);
				((TipoContext)_localctx).ast =  new Struct(((TipoContext)_localctx).OP1.getCharPositionInLine()+1, ((TipoContext)_localctx).OP1.getLine(), _localctx.fields);
				((Struct)_localctx.ast).CheckErrors();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(T__10);
				setState(97);
				((TipoContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(98);
				match(T__11);
				setState(99);
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

	public static class RecordFieldContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public List<String> fields = new ArrayList<String>();
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
		enterRule(_localctx, 12, RULE_recordField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((RecordFieldContext)_localctx).OP1 = match(ID);
			_localctx.fields.add((((RecordFieldContext)_localctx).OP1!=null?((RecordFieldContext)_localctx).OP1.getText():null));
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(106);
				match(T__5);
				setState(107);
				((RecordFieldContext)_localctx).OP2 = match(ID);
				_localctx.fields.add((((RecordFieldContext)_localctx).OP2!=null?((RecordFieldContext)_localctx).OP2.getText():null));
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__4);
			setState(115);
			((RecordFieldContext)_localctx).type = tipo();
			setState(116);
			match(T__6);
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

	public static class DefFunctionContext extends ParserRuleContext {
		public List<FuncDefinition> ast = new ArrayList<FuncDefinition>();
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
		enterRule(_localctx, 14, RULE_defFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					((DefFunctionContext)_localctx).aux = ((DefFunctionContext)_localctx).functionType = functionType();
					setState(120);
					((DefFunctionContext)_localctx).cuerpo = inBody();
					_localctx.ast.add(new FuncDefinition(((DefFunctionContext)_localctx).functionType.ast.getColumn(),((DefFunctionContext)_localctx).functionType.ast.getLine(),((DefFunctionContext)_localctx).aux.ast.getName(), ((DefFunctionContext)_localctx).aux.ast ,((DefFunctionContext)_localctx).cuerpo.ast));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public List<VarDefinition> parameter = new ArrayList<VarDefinition>();
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
		enterRule(_localctx, 16, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__0);
			setState(128);
			((FunctionTypeContext)_localctx).OP = match(ID);
			setState(129);
			match(T__2);
			setState(130);
			((FunctionTypeContext)_localctx).var = functionTypeParametersAux();
			setState(131);
			match(T__3);
			setState(132);
			match(T__4);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(133);
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public List<VarDefinition> param = new ArrayList<VarDefinition>();
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
		enterRule(_localctx, 18, RULE_functionTypeParametersAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(140);
				((FunctionTypeParametersAuxContext)_localctx).OP1 = match(ID);
				setState(141);
				match(T__4);
				setState(142);
				((FunctionTypeParametersAuxContext)_localctx).type1 = tipoSimple();
				_localctx.param.add(new VarDefinition(((FunctionTypeParametersAuxContext)_localctx).OP1.getCharPositionInLine()+1, ((FunctionTypeParametersAuxContext)_localctx).OP1.getLine(), (((FunctionTypeParametersAuxContext)_localctx).OP1!=null?((FunctionTypeParametersAuxContext)_localctx).OP1.getText():null),((FunctionTypeParametersAuxContext)_localctx).type1.ast));
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(144);
					match(T__5);
					setState(145);
					((FunctionTypeParametersAuxContext)_localctx).OP2 = match(ID);
					setState(146);
					match(T__4);
					setState(147);
					((FunctionTypeParametersAuxContext)_localctx).type2 = tipoSimple();
					_localctx.param.add(new VarDefinition(((FunctionTypeParametersAuxContext)_localctx).OP2.getCharPositionInLine()+1, ((FunctionTypeParametersAuxContext)_localctx).OP2.getLine(), (((FunctionTypeParametersAuxContext)_localctx).OP2!=null?((FunctionTypeParametersAuxContext)_localctx).OP2.getText():null),((FunctionTypeParametersAuxContext)_localctx).type2.ast));
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.ast.addAll(_localctx.param);
				}
				}
				setState(161);
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
		enterRule(_localctx, 20, RULE_tipoSimple);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				((TipoSimpleContext)_localctx).TYPE = match(T__12);
				((TipoSimpleContext)_localctx).ast =  CharType.getInstance(((TipoSimpleContext)_localctx).TYPE.getCharPositionInLine()+1, ((TipoSimpleContext)_localctx).TYPE.getLine());
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				((TipoSimpleContext)_localctx).TYPE = match(T__13);
				((TipoSimpleContext)_localctx).ast =  DoubleType.getInstance(((TipoSimpleContext)_localctx).TYPE.getCharPositionInLine()+1, ((TipoSimpleContext)_localctx).TYPE.getLine());
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				((TipoSimpleContext)_localctx).TYPE = match(T__14);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public List<Expression> param = new ArrayList<Expression>();
		public List<Expression> parameter = new ArrayList<Expression>();
		public List<Statement> elses = new ArrayList<Statement>();
		public ExpressionContext exprWhile;
		public StatementbodyContext cuerpo;
		public ExpressionContext exprIf;
		public StatementbodyContext stateIf;
		public StatementbodyContext statelse;
		public ExpressionContext stat3;
		public Token AUX;
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
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__15);
				setState(171);
				((StatementContext)_localctx).exprWhile = expression(0);
				setState(172);
				match(T__4);
				setState(173);
				((StatementContext)_localctx).cuerpo = statementbody();
				((StatementContext)_localctx).ast =  new Iterative(((StatementContext)_localctx).exprWhile.ast.getColumn(), ((StatementContext)_localctx).exprWhile.ast.getLine(), ((StatementContext)_localctx).exprWhile.ast, ((StatementContext)_localctx).cuerpo.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__16);
				setState(177);
				((StatementContext)_localctx).exprIf = expression(0);
				setState(178);
				match(T__4);
				setState(179);
				((StatementContext)_localctx).stateIf = statementbody();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(180);
					match(T__17);
					setState(181);
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
				setState(188);
				match(T__18);
				setState(189);
				((StatementContext)_localctx).stat3 = expression(0);
				setState(190);
				match(T__6);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).stat3.ast.getColumn(), ((StatementContext)_localctx).stat3.ast.getLine(), ((StatementContext)_localctx).stat3.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				((StatementContext)_localctx).AUX = match(T__19);
				setState(194);
				((StatementContext)_localctx).stateRead = listExpression();
				setState(195);
				match(T__6);
				((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).AUX.getCharPositionInLine()+1, ((StatementContext)_localctx).AUX.getLine(), ((StatementContext)_localctx).stateRead.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				((StatementContext)_localctx).AUX = match(T__20);
				setState(199);
				((StatementContext)_localctx).stateWrite = listExpression();
				setState(200);
				match(T__6);
				((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).AUX.getCharPositionInLine()+1, ((StatementContext)_localctx).AUX.getLine(), ((StatementContext)_localctx).stateWrite.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				((StatementContext)_localctx).left = expression(0);
				{
				setState(204);
				match(T__21);
				}
				setState(205);
				((StatementContext)_localctx).right = expression(0);
				setState(206);
				match(T__6);
				((StatementContext)_localctx).ast =  new Assigmment(((StatementContext)_localctx).left.ast.getColumn(), ((StatementContext)_localctx).left.ast.getLine(), ((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				((StatementContext)_localctx).ID = match(ID);
				setState(210);
				match(T__2);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(211);
					((StatementContext)_localctx).expr1 = listExpression();
					((StatementContext)_localctx).parameter =  ((StatementContext)_localctx).expr1.ast;
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__3);
				setState(220);
				match(T__6);
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

	public static class InBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
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
		enterRule(_localctx, 24, RULE_inBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__8);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					((InBodyContext)_localctx).sta1 = defVaribales();
					_localctx.ast.addAll(((InBodyContext)_localctx).sta1.ast);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(234);
				((InBodyContext)_localctx).sta2 = statement();
				_localctx.ast.add(((InBodyContext)_localctx).sta2.ast);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__9);
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
		public List<Statement> ast = new ArrayList<Statement>();
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
		enterRule(_localctx, 26, RULE_statementbody);
		int _la;
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__8);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(245);
						((StatementbodyContext)_localctx).sta1 = defVaribales();
						_localctx.ast.addAll(((StatementbodyContext)_localctx).sta1.ast);
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(253);
					((StatementbodyContext)_localctx).sta2 = statement();
					_localctx.ast.add(((StatementbodyContext)_localctx).sta2.ast);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__9);
				}
				break;
			case T__2:
			case T__15:
			case T__16:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__24:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
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
		public List<Expression> ast = new ArrayList<Expression>();
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
		enterRule(_localctx, 28, RULE_listExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((ListExpressionContext)_localctx).expr1 = expression(0);
			_localctx.ast.add(((ListExpressionContext)_localctx).expr1.ast);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(269);
				match(T__5);
				setState(270);
				((ListExpressionContext)_localctx).expr2 = expression(0);
				_localctx.ast.add(((ListExpressionContext)_localctx).expr2.ast);
				}
				}
				setState(277);
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
		public List<Expression> param = new ArrayList<Expression>();
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(279);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)) );
				}
				break;
			case 2:
				{
				setState(281);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)) );
				}
				break;
			case 3:
				{
				setState(283);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(285);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).ID.getLine(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) );
				}
				break;
			case 5:
				{
				setState(287);
				match(T__2);
				setState(288);
				((ExpressionContext)_localctx).expr = expression(0);
				setState(289);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expr.ast;
				}
				break;
			case 6:
				{
				setState(292);
				match(T__2);
				setState(293);
				((ExpressionContext)_localctx).type = tipo();
				setState(294);
				match(T__3);
				setState(295);
				((ExpressionContext)_localctx).expr = expression(8);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).type.ast.getColumn(),((ExpressionContext)_localctx).type.ast.getLine() , ((ExpressionContext)_localctx).expr.ast, ((ExpressionContext)_localctx).type.ast );
				}
				break;
			case 7:
				{
				setState(298);
				match(T__23);
				setState(299);
				((ExpressionContext)_localctx).unary = expression(7);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).unary.ast.getColumn(), ((ExpressionContext)_localctx).unary.ast.getLine(), ((ExpressionContext)_localctx).unary.ast);
				}
				break;
			case 8:
				{
				setState(302);
				match(T__24);
				setState(303);
				((ExpressionContext)_localctx).exprNeg = expression(6);
				((ExpressionContext)_localctx).ast =  new Negative( ((ExpressionContext)_localctx).exprNeg.ast.getColumn(), ((ExpressionContext)_localctx).exprNeg.ast.getLine(), ((ExpressionContext)_localctx).exprNeg.ast);
				}
				break;
			case 9:
				{
				setState(306);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(307);
				match(T__2);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(308);
					((ExpressionContext)_localctx).parameters = listExpression();
					_localctx.param.addAll(((ExpressionContext)_localctx).parameters.ast);
					}
				}

				setState(313);
				match(T__3);
				((ExpressionContext)_localctx).ast =  new FunctionInvoke(((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).ID.getLine(), _localctx.param, new Variable(((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).ID.getLine(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(318);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
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
						setState(322);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(323);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(324);
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
						setState(327);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(328);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
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
						setState(332);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(333);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(334);
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
						setState(337);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(338);
						match(T__10);
						setState(339);
						((ExpressionContext)_localctx).expr2 = expression(0);
						setState(340);
						match(T__11);
						((ExpressionContext)_localctx).ast =  new ArrayAccess( ((ExpressionContext)_localctx).expr1.ast.getColumn(), ((ExpressionContext)_localctx).expr1.ast.getLine(), ((ExpressionContext)_localctx).expr1.ast, ((ExpressionContext)_localctx).expr2.ast );
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.field = _prevctx;
						_localctx.field = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(344);
						match(T__22);
						setState(345);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAcess(((ExpressionContext)_localctx).field.ast.getColumn(),((ExpressionContext)_localctx).field.ast.getLine() ,((ExpressionContext)_localctx).field.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) );
						}
						break;
					}
					} 
				}
				setState(351);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0163\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\6\7[\n\7\r\7\16\7\\\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\6\t~\n\t\r\t\16\t\177\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\13\3\13\7\13"+
		"\u00a0\n\13\f\13\16\13\u00a3\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ab\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bb\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d9\n\r\f\r\16\r\u00dc"+
		"\13\r\3\r\3\r\3\r\3\r\5\r\u00e2\n\r\3\16\3\16\3\16\3\16\7\16\u00e8\n\16"+
		"\f\16\16\16\u00eb\13\16\3\16\3\16\3\16\7\16\u00f0\n\16\f\16\16\16\u00f3"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00fb\n\17\f\17\16\17\u00fe"+
		"\13\17\3\17\3\17\3\17\7\17\u0103\n\17\f\17\16\17\u0106\13\17\3\17\3\17"+
		"\3\17\3\17\5\17\u010c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0114\n"+
		"\20\f\20\16\20\u0117\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013a\n\21\3\21"+
		"\3\21\5\21\u013e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u015e\n\21\f\21\16\21\u0161\13\21"+
		"\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\34\36\4"+
		"\2\32\32\37\37\3\2 %\3\2&\'\2\u017d\2\"\3\2\2\2\4.\3\2\2\2\6\61\3\2\2"+
		"\2\b@\3\2\2\2\nB\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20}\3\2\2\2\22\u0081\3"+
		"\2\2\2\24\u00a1\3\2\2\2\26\u00aa\3\2\2\2\30\u00e1\3\2\2\2\32\u00e3\3\2"+
		"\2\2\34\u010b\3\2\2\2\36\u010d\3\2\2\2 \u013d\3\2\2\2\"#\5\4\3\2#$\5\6"+
		"\4\2$%\7\2\2\3%&\b\2\1\2&\'\b\2\1\2\'(\b\2\1\2(\3\3\2\2\2)*\5\b\5\2*+"+
		"\b\3\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2"+
		"\2\60.\3\2\2\2\61\62\7\3\2\2\62\63\7\4\2\2\63\64\7\5\2\2\64\65\7\6\2\2"+
		"\65\66\7\7\2\2\66\67\5\32\16\2\678\b\4\1\28\7\3\2\2\29:\5\n\6\2:;\b\5"+
		"\1\2;A\3\2\2\2<=\5\20\t\2=>\b\5\1\2>?\b\5\1\2?A\3\2\2\2@9\3\2\2\2@<\3"+
		"\2\2\2A\t\3\2\2\2BC\7+\2\2CI\b\6\1\2DE\7\b\2\2EF\7+\2\2FH\b\6\1\2GD\3"+
		"\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\7\2\2MN\5"+
		"\f\7\2NO\7\t\2\2OP\b\6\1\2P\13\3\2\2\2Qi\3\2\2\2RS\5\26\f\2ST\b\7\1\2"+
		"Ti\3\2\2\2UV\7\n\2\2VZ\7\13\2\2WX\5\16\b\2XY\b\7\1\2Y[\3\2\2\2ZW\3\2\2"+
		"\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\f\2\2_`\b\7\1\2`a\b"+
		"\7\1\2ai\3\2\2\2bc\7\r\2\2cd\7(\2\2de\7\16\2\2ef\5\f\7\2fg\b\7\1\2gi\3"+
		"\2\2\2hQ\3\2\2\2hR\3\2\2\2hU\3\2\2\2hb\3\2\2\2i\r\3\2\2\2jk\7+\2\2kq\b"+
		"\b\1\2lm\7\b\2\2mn\7+\2\2np\b\b\1\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3"+
		"\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\7\2\2uv\5\f\7\2vw\7\t\2\2wx\b\b\1\2x\17"+
		"\3\2\2\2yz\5\22\n\2z{\5\32\16\2{|\b\t\1\2|~\3\2\2\2}y\3\2\2\2~\177\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082\7\3\2"+
		"\2\u0082\u0083\7+\2\2\u0083\u0084\7\5\2\2\u0084\u0085\5\24\13\2\u0085"+
		"\u0086\7\6\2\2\u0086\u008a\7\7\2\2\u0087\u0088\5\26\f\2\u0088\u0089\b"+
		"\n\1\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\n\1\2\u008d\23\3\2\2\2\u008e\u008f\7+\2\2"+
		"\u008f\u0090\7\7\2\2\u0090\u0091\5\26\f\2\u0091\u009a\b\13\1\2\u0092\u0093"+
		"\7\b\2\2\u0093\u0094\7+\2\2\u0094\u0095\7\7\2\2\u0095\u0096\5\26\f\2\u0096"+
		"\u0097\b\13\1\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\b\13\1\2\u009e\u00a0\3\2\2\2\u009f\u008e\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\25\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\17\2\2\u00a5\u00ab\b\f\1"+
		"\2\u00a6\u00a7\7\20\2\2\u00a7\u00ab\b\f\1\2\u00a8\u00a9\7\21\2\2\u00a9"+
		"\u00ab\b\f\1\2\u00aa\u00a4\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\27\3\2\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af"+
		"\7\7\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\b\r\1\2\u00b1\u00e2\3\2\2\2"+
		"\u00b2\u00b3\7\23\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\7\2\2\u00b5\u00ba"+
		"\5\34\17\2\u00b6\u00b7\7\24\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\b\r"+
		"\1\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\r\1\2\u00bd\u00e2\3\2\2\2\u00be\u00bf\7\25"+
		"\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\b\r\1\2\u00c2"+
		"\u00e2\3\2\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6"+
		"\7\t\2\2\u00c6\u00c7\b\r\1\2\u00c7\u00e2\3\2\2\2\u00c8\u00c9\7\27\2\2"+
		"\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\b\r\1\2\u00cc\u00e2"+
		"\3\2\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7\30\2\2\u00cf\u00d0\5 \21\2"+
		"\u00d0\u00d1\7\t\2\2\u00d1\u00d2\b\r\1\2\u00d2\u00e2\3\2\2\2\u00d3\u00d4"+
		"\7+\2\2\u00d4\u00da\7\5\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\b\r\1\2"+
		"\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7\6\2\2\u00de\u00df\7\t\2\2\u00df\u00e0\b\r\1\2\u00e0\u00e2\b\r"+
		"\1\2\u00e1\u00ac\3\2\2\2\u00e1\u00b2\3\2\2\2\u00e1\u00be\3\2\2\2\u00e1"+
		"\u00c3\3\2\2\2\u00e1\u00c8\3\2\2\2\u00e1\u00cd\3\2\2\2\u00e1\u00d3\3\2"+
		"\2\2\u00e2\31\3\2\2\2\u00e3\u00e9\7\13\2\2\u00e4\u00e5\5\n\6\2\u00e5\u00e6"+
		"\b\16\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\5\30\r\2\u00ed\u00ee\b\16\1\2\u00ee\u00f0\3\2\2\2"+
		"\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\f\2\2\u00f5"+
		"\33\3\2\2\2\u00f6\u00fc\7\13\2\2\u00f7\u00f8\5\n\6\2\u00f8\u00f9\b\17"+
		"\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0104\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0100\5\30\r\2\u0100\u0101\b\17\1\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010c\7\f\2\2\u0108"+
		"\u0109\5\30\r\2\u0109\u010a\b\17\1\2\u010a\u010c\3\2\2\2\u010b\u00f6\3"+
		"\2\2\2\u010b\u0108\3\2\2\2\u010c\35\3\2\2\2\u010d\u010e\5 \21\2\u010e"+
		"\u0115\b\20\1\2\u010f\u0110\7\b\2\2\u0110\u0111\5 \21\2\u0111\u0112\b"+
		"\20\1\2\u0112\u0114\3\2\2\2\u0113\u010f\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\37\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0118\u0119\b\21\1\2\u0119\u011a\7(\2\2\u011a\u013e\b\21\1\2\u011b"+
		"\u011c\7*\2\2\u011c\u013e\b\21\1\2\u011d\u011e\7)\2\2\u011e\u013e\b\21"+
		"\1\2\u011f\u0120\7+\2\2\u0120\u013e\b\21\1\2\u0121\u0122\7\5\2\2\u0122"+
		"\u0123\5 \21\2\u0123\u0124\7\6\2\2\u0124\u0125\b\21\1\2\u0125\u013e\3"+
		"\2\2\2\u0126\u0127\7\5\2\2\u0127\u0128\5\f\7\2\u0128\u0129\7\6\2\2\u0129"+
		"\u012a\5 \21\n\u012a\u012b\b\21\1\2\u012b\u013e\3\2\2\2\u012c\u012d\7"+
		"\32\2\2\u012d\u012e\5 \21\t\u012e\u012f\b\21\1\2\u012f\u013e\3\2\2\2\u0130"+
		"\u0131\7\33\2\2\u0131\u0132\5 \21\b\u0132\u0133\b\21\1\2\u0133\u013e\3"+
		"\2\2\2\u0134\u0135\7+\2\2\u0135\u0139\7\5\2\2\u0136\u0137\5\36\20\2\u0137"+
		"\u0138\b\21\1\2\u0138\u013a\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u013a\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\6\2\2\u013c\u013e\b\21\1\2\u013d"+
		"\u0118\3\2\2\2\u013d\u011b\3\2\2\2\u013d\u011d\3\2\2\2\u013d\u011f\3\2"+
		"\2\2\u013d\u0121\3\2\2\2\u013d\u0126\3\2\2\2\u013d\u012c\3\2\2\2\u013d"+
		"\u0130\3\2\2\2\u013d\u0134\3\2\2\2\u013e\u015f\3\2\2\2\u013f\u0140\f\7"+
		"\2\2\u0140\u0141\t\2\2\2\u0141\u0142\5 \21\b\u0142\u0143\b\21\1\2\u0143"+
		"\u015e\3\2\2\2\u0144\u0145\f\6\2\2\u0145\u0146\t\3\2\2\u0146\u0147\5 "+
		"\21\7\u0147\u0148\b\21\1\2\u0148\u015e\3\2\2\2\u0149\u014a\f\5\2\2\u014a"+
		"\u014b\t\4\2\2\u014b\u014c\5 \21\6\u014c\u014d\b\21\1\2\u014d\u015e\3"+
		"\2\2\2\u014e\u014f\f\4\2\2\u014f\u0150\t\5\2\2\u0150\u0151\5 \21\5\u0151"+
		"\u0152\b\21\1\2\u0152\u015e\3\2\2\2\u0153\u0154\f\f\2\2\u0154\u0155\7"+
		"\r\2\2\u0155\u0156\5 \21\2\u0156\u0157\7\16\2\2\u0157\u0158\b\21\1\2\u0158"+
		"\u015e\3\2\2\2\u0159\u015a\f\13\2\2\u015a\u015b\7\31\2\2\u015b\u015c\7"+
		"+\2\2\u015c\u015e\b\21\1\2\u015d\u013f\3\2\2\2\u015d\u0144\3\2\2\2\u015d"+
		"\u0149\3\2\2\2\u015d\u014e\3\2\2\2\u015d\u0153\3\2\2\2\u015d\u0159\3\2"+
		"\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"!\3\2\2\2\u0161\u015f\3\2\2\2\32.@I\\hq\177\u008a\u009a\u00a1\u00aa\u00ba"+
		"\u00da\u00e1\u00e9\u00f1\u00fc\u0104\u010b\u0115\u0139\u013d\u015d\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}