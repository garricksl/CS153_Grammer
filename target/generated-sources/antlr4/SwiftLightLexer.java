// Generated from SwiftLight.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftLightLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, MUL=5, DIV=6, ADD=7, SUB=8, NEWLINE=9, INT=10, 
		CHAR=11, STRING=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ID", "MUL", "DIV", "ADD", "SUB", "NEWLINE", "INT", 
		"CHAR", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", null, "'*'", "'/'", "'+'", "'-'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ID", "MUL", "DIV", "ADD", "SUB", "NEWLINE", "INT", 
		"CHAR", "STRING"
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


	public SwiftLightLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwiftLight.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5&\n\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r8"+
		"\n\r\3\r\3\r\3\r\5\r=\n\r\3\r\3\r\5\rA\n\r\3\r\3\r\3\r\5\rF\n\r\5\rH\n"+
		"\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2"+
		"\3\5\2\"\"crt|\2P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t"+
		"%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21-\3\2\2\2\23/\3\2\2\2"+
		"\25\61\3\2\2\2\27\63\3\2\2\2\31G\3\2\2\2\33\34\7?\2\2\34\4\3\2\2\2\35"+
		"\36\7*\2\2\36\6\3\2\2\2\37 \7+\2\2 \b\3\2\2\2!&\5\13\6\2\"&\5\r\7\2#&"+
		"\5\17\b\2$&\5\21\t\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\n\3\2\2"+
		"\2\'(\7,\2\2(\f\3\2\2\2)*\7\61\2\2*\16\3\2\2\2+,\7-\2\2,\20\3\2\2\2-."+
		"\7/\2\2.\22\3\2\2\2/\60\7\f\2\2\60\24\3\2\2\2\61\62\4\62;\2\62\26\3\2"+
		"\2\2\63\64\t\2\2\2\64\30\3\2\2\2\658\5\25\13\2\668\5\27\f\2\67\65\3\2"+
		"\2\2\67\66\3\2\2\289\3\2\2\29<\5\25\13\2:=\5\25\13\2;=\5\27\f\2<:\3\2"+
		"\2\2<;\3\2\2\2=H\3\2\2\2>A\5\25\13\2?A\5\27\f\2@>\3\2\2\2@?\3\2\2\2AB"+
		"\3\2\2\2BE\5\27\f\2CF\5\25\13\2DF\5\27\f\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2"+
		"\2G\67\3\2\2\2G@\3\2\2\2H\32\3\2\2\2\t\2%\67<@EG\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}