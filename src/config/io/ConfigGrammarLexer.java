// $ANTLR 3.4 C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g 2013-11-02 02:38:21

    package config.io;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ConfigGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int ASSIGNMENT=4;
    public static final int BLOCK=5;
    public static final int COMMENT=6;
    public static final int CONFIG=7;
    public static final int EMPTYBLOCK=8;
    public static final int LETTER=9;
    public static final int NUMBER=10;
    public static final int STRING=11;
    public static final int SYMBOL=12;
    public static final int WS=13;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ConfigGrammarLexer() {} 
    public ConfigGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ConfigGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:6:7: ( '/' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:6:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:7:7: ( '//' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:7:9: '//'
            {
            match("//"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:8:7: ( '=' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:9:7: ( '{' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:9:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:10:7: ( '}' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:10:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:8: ( ( LETTER | NUMBER | SYMBOL | ' ' )* )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:10: ( LETTER | NUMBER | SYMBOL | ' ' )*
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:10: ( LETTER | NUMBER | SYMBOL | ' ' )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt1=2;
                    }
                    break;
                case '!':
                case '\"':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case ',':
                case '-':
                case '.':
                case ':':
                case '?':
                case '_':
                case '|':
                    {
                    alt1=3;
                    }
                    break;
                case ' ':
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:11: LETTER
            	    {
            	    mLETTER(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:20: NUMBER
            	    {
            	    mNUMBER(); 


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:29: SYMBOL
            	    {
            	    mSYMBOL(); 


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:38: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:62:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:66:2: ( '0' .. '9' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:2: ( '://' | '.' | '!' | '?' | '-' | '_' | ',' | '\\'' | '\"' | '%' | ':' | '(' | ')' | '|' | '&' | '*' )
            int alt2=16;
            switch ( input.LA(1) ) {
            case ':':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='/') ) {
                    alt2=1;
                }
                else {
                    alt2=11;
                }
                }
                break;
            case '.':
                {
                alt2=2;
                }
                break;
            case '!':
                {
                alt2=3;
                }
                break;
            case '?':
                {
                alt2=4;
                }
                break;
            case '-':
                {
                alt2=5;
                }
                break;
            case '_':
                {
                alt2=6;
                }
                break;
            case ',':
                {
                alt2=7;
                }
                break;
            case '\'':
                {
                alt2=8;
                }
                break;
            case '\"':
                {
                alt2=9;
                }
                break;
            case '%':
                {
                alt2=10;
                }
                break;
            case '(':
                {
                alt2=12;
                }
                break;
            case ')':
                {
                alt2=13;
                }
                break;
            case '|':
                {
                alt2=14;
                }
                break;
            case '&':
                {
                alt2=15;
                }
                break;
            case '*':
                {
                alt2=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:4: '://'
                    {
                    match("://"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:12: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:18: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:24: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:30: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:36: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:42: ','
                    {
                    match(','); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:48: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:55: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:61: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:67: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:73: '('
                    {
                    match('('); 

                    }
                    break;
                case 13 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:79: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 14 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:85: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:91: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:70:97: '*'
                    {
                    match('*'); 

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:73:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )* )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:73:9: ( ' ' | '\\t' | '\\r' | '\\n' )*
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:73:9: ( ' ' | '\\t' | '\\r' | '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | STRING | WS )
        int alt4=7;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:10: T__14
                {
                mT__14(); 


                }
                break;
            case 2 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:16: T__15
                {
                mT__15(); 


                }
                break;
            case 3 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:22: T__16
                {
                mT__16(); 


                }
                break;
            case 4 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:28: T__17
                {
                mT__17(); 


                }
                break;
            case 5 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:34: T__18
                {
                mT__18(); 


                }
                break;
            case 6 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:40: STRING
                {
                mSTRING(); 


                }
                break;
            case 7 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:47: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\5\1\11\4\uffff\1\5\3\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\11\1\57\4\uffff\1\11\3\uffff";
    static final String DFA4_maxS =
        "\1\175\1\57\4\uffff\1\40\3\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\2\1\1";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\7\2\uffff\1\7\22\uffff\1\6\16\uffff\1\1\15\uffff\1\2\75\uffff"+
            "\1\3\1\uffff\1\4",
            "\1\10",
            "",
            "",
            "",
            "",
            "\2\7\2\uffff\1\7\22\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | STRING | WS );";
        }
    }
 

}