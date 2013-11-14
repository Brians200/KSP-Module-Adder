// $ANTLR 3.4 C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g 2013-11-13 16:13:45

    package config.io;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ConfigGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ASSIGNMENT=4;
    public static final int BLOCK=5;
    public static final int COMMENT=6;
    public static final int COMMENTT=7;
    public static final int CONFIG=8;
    public static final int EMPTYBLOCK=9;
    public static final int STRING=10;
    public static final int WS=11;

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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:6:7: ( '=' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:6:9: '='
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:7:7: ( '{' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:7:9: '{'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:8:7: ( '}' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:8:9: '}'
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
    // $ANTLR end "T__14"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:51:8: ( (~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' ) )+ )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:51:10: (~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' ) )+
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:51:10: (~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\b')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '<')||(LA1_0 >= '>' && LA1_0 <= 'z')||LA1_0=='|'||(LA1_0 >= '~' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:51:10: ~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '<')||(input.LA(1) >= '>' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

    // $ANTLR start "COMMENTT"
    public final void mCOMMENTT() throws RecognitionException {
        try {
            int _type = COMMENTT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:5: ( ( ' ' | '\\t' )* '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:9: ( ' ' | '\\t' )* '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:9: ( ' ' | '\\t' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    break loop2;
                }
            } while (true);


            match("//"); 



            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:28: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:42: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:42: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENTT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:58:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:8: ( T__12 | T__13 | T__14 | STRING | COMMENTT | WS )
        int alt6=6;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:28: STRING
                {
                mSTRING(); 


                }
                break;
            case 5 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:35: COMMENTT
                {
                mCOMMENTT(); 


                }
                break;
            case 6 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:44: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\4\uffff\2\7\1\10\2\uffff\1\7\1\uffff\1\7";
    static final String DFA6_eofS =
        "\14\uffff";
    static final String DFA6_minS =
        "\1\0\3\uffff\1\11\1\57\1\11\2\uffff\1\0\1\uffff\1\0";
    static final String DFA6_maxS =
        "\1\uffff\3\uffff\3\57\2\uffff\1\uffff\1\uffff\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\4\1\6\1\uffff\1\5\1\uffff";
    static final String DFA6_specialS =
        "\1\1\10\uffff\1\0\1\uffff\1\2}>";
    static final String[] DFA6_transitionS = {
            "\11\7\1\6\1\10\2\7\1\10\22\7\1\4\16\7\1\5\15\7\1\1\75\7\1\2"+
            "\1\7\1\3\uff82\7",
            "",
            "",
            "",
            "\1\6\1\10\2\uffff\1\10\22\uffff\1\4\16\uffff\1\5",
            "\1\11",
            "\1\6\26\uffff\1\6\16\uffff\1\12",
            "",
            "",
            "\11\13\2\12\2\13\1\12\57\13\1\12\75\13\1\12\1\13\1\12\uff82"+
            "\13",
            "",
            "\11\13\2\12\2\13\1\12\57\13\1\12\75\13\1\12\1\13\1\12\uff82"+
            "\13"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | STRING | COMMENTT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_9 = input.LA(1);

                        s = -1;
                        if ( ((LA6_9 >= '\u0000' && LA6_9 <= '\b')||(LA6_9 >= '\u000B' && LA6_9 <= '\f')||(LA6_9 >= '\u000E' && LA6_9 <= '<')||(LA6_9 >= '>' && LA6_9 <= 'z')||LA6_9=='|'||(LA6_9 >= '~' && LA6_9 <= '\uFFFF')) ) {s = 11;}

                        else if ( ((LA6_9 >= '\t' && LA6_9 <= '\n')||LA6_9=='\r'||LA6_9=='='||LA6_9=='{'||LA6_9=='}') ) {s = 10;}

                        else s = 7;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='=') ) {s = 1;}

                        else if ( (LA6_0=='{') ) {s = 2;}

                        else if ( (LA6_0=='}') ) {s = 3;}

                        else if ( (LA6_0==' ') ) {s = 4;}

                        else if ( (LA6_0=='/') ) {s = 5;}

                        else if ( (LA6_0=='\t') ) {s = 6;}

                        else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\b')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\u001F')||(LA6_0 >= '!' && LA6_0 <= '.')||(LA6_0 >= '0' && LA6_0 <= '<')||(LA6_0 >= '>' && LA6_0 <= 'z')||LA6_0=='|'||(LA6_0 >= '~' && LA6_0 <= '\uFFFF')) ) {s = 7;}

                        else if ( (LA6_0=='\n'||LA6_0=='\r') ) {s = 8;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA6_11 = input.LA(1);

                        s = -1;
                        if ( ((LA6_11 >= '\t' && LA6_11 <= '\n')||LA6_11=='\r'||LA6_11=='='||LA6_11=='{'||LA6_11=='}') ) {s = 10;}

                        else if ( ((LA6_11 >= '\u0000' && LA6_11 <= '\b')||(LA6_11 >= '\u000B' && LA6_11 <= '\f')||(LA6_11 >= '\u000E' && LA6_11 <= '<')||(LA6_11 >= '>' && LA6_11 <= 'z')||LA6_11=='|'||(LA6_11 >= '~' && LA6_11 <= '\uFFFF')) ) {s = 11;}

                        else s = 7;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}