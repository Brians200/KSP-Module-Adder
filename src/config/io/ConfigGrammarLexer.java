// $ANTLR 3.4 C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g 2013-12-22 15:04:06

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
    public static final int ASSIGNMENT=4;
    public static final int BLOCK=5;
    public static final int COMMENT=6;
    public static final int COMMENTT=7;
    public static final int CONFIG=8;
    public static final int EMPTYBLOCK=9;
    public static final int MMREMOVE=10;
    public static final int MMREMOVERULE=11;
    public static final int STRING=12;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "MMREMOVE"
    public final void mMMREMOVE() throws RecognitionException {
        try {
            int _type = MMREMOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:57:2: ( '!' (~ ( '\\n' | '\\r' | '{' | '!' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:57:4: '!' (~ ( '\\n' | '\\r' | '{' | '!' ) )* ( '\\r' )? '\\n'
            {
            match('!'); 

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:57:8: (~ ( '\\n' | '\\r' | '{' | '!' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= ' ')||(LA1_0 >= '\"' && LA1_0 <= 'z')||(LA1_0 >= '|' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= ' ')||(input.LA(1) >= '\"' && input.LA(1) <= 'z')||(input.LA(1) >= '|' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:57:32: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:57:32: '\\r'
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
    // $ANTLR end "MMREMOVE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:60:8: ( (~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' ) )+ )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:60:10: (~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' ) )+
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:60:10: (~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\b')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '<')||(LA3_0 >= '>' && LA3_0 <= 'z')||LA3_0=='|'||(LA3_0 >= '~' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:60:10: ~ ( '\\n' | '\\r' | '\\t' | '//' | '=' | '{' | '}' )
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:64:5: ( ( ' ' | '\\t' )* '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:64:9: ( ' ' | '\\t' )* '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:64:9: ( ' ' | '\\t' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
                }
            } while (true);


            match("//"); 



            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:64:28: (~ ( '\\n' | '\\r' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
                }
            } while (true);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:64:42: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:64:42: '\\r'
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
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:67:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:67:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:67:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:8: ( T__14 | T__15 | T__16 | MMREMOVE | STRING | COMMENTT | WS )
        int alt8=7;
        alt8 = dfa8.predict(input);
        switch (alt8) {
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
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:28: MMREMOVE
                {
                mMMREMOVE(); 


                }
                break;
            case 5 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:37: STRING
                {
                mSTRING(); 


                }
                break;
            case 6 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:44: COMMENTT
                {
                mCOMMENTT(); 


                }
                break;
            case 7 :
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:1:53: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff\3\10\1\11\2\uffff\1\10\1\uffff\1\10\1\uffff\1\10";
    static final String DFA8_eofS =
        "\17\uffff";
    static final String DFA8_minS =
        "\1\0\3\uffff\1\0\1\11\1\57\1\11\2\uffff\1\0\1\uffff\1\0\1\uffff"+
        "\1\0";
    static final String DFA8_maxS =
        "\1\uffff\3\uffff\1\uffff\3\57\2\uffff\1\uffff\1\uffff\1\uffff\1"+
        "\uffff\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\4\uffff\1\5\1\7\1\uffff\1\4\1\uffff\1\6\1\uffff";
    static final String DFA8_specialS =
        "\1\4\3\uffff\1\1\5\uffff\1\0\1\uffff\1\3\1\uffff\1\2}>";
    static final String[] DFA8_transitionS = {
            "\11\10\1\7\1\11\2\10\1\11\22\10\1\5\1\4\15\10\1\6\15\10\1\1"+
            "\75\10\1\2\1\10\1\3\uff82\10",
            "",
            "",
            "",
            "\11\12\2\13\2\12\1\13\23\12\1\uffff\33\12\1\13\75\12\1\uffff"+
            "\1\12\1\13\uff82\12",
            "\1\7\1\11\2\uffff\1\11\22\uffff\1\5\16\uffff\1\6",
            "\1\14",
            "\1\7\26\uffff\1\7\16\uffff\1\15",
            "",
            "",
            "\11\12\2\13\2\12\1\13\23\12\1\uffff\33\12\1\13\75\12\1\uffff"+
            "\1\12\1\13\uff82\12",
            "",
            "\11\16\2\15\2\16\1\15\57\16\1\15\75\16\1\15\1\16\1\15\uff82"+
            "\16",
            "",
            "\11\16\2\15\2\16\1\15\57\16\1\15\75\16\1\15\1\16\1\15\uff82"+
            "\16"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | MMREMOVE | STRING | COMMENTT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_10 = input.LA(1);

                        s = -1;
                        if ( ((LA8_10 >= '\t' && LA8_10 <= '\n')||LA8_10=='\r'||LA8_10=='='||LA8_10=='}') ) {s = 11;}

                        else if ( ((LA8_10 >= '\u0000' && LA8_10 <= '\b')||(LA8_10 >= '\u000B' && LA8_10 <= '\f')||(LA8_10 >= '\u000E' && LA8_10 <= ' ')||(LA8_10 >= '\"' && LA8_10 <= '<')||(LA8_10 >= '>' && LA8_10 <= 'z')||LA8_10=='|'||(LA8_10 >= '~' && LA8_10 <= '\uFFFF')) ) {s = 10;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA8_4 = input.LA(1);

                        s = -1;
                        if ( ((LA8_4 >= '\u0000' && LA8_4 <= '\b')||(LA8_4 >= '\u000B' && LA8_4 <= '\f')||(LA8_4 >= '\u000E' && LA8_4 <= ' ')||(LA8_4 >= '\"' && LA8_4 <= '<')||(LA8_4 >= '>' && LA8_4 <= 'z')||LA8_4=='|'||(LA8_4 >= '~' && LA8_4 <= '\uFFFF')) ) {s = 10;}

                        else if ( ((LA8_4 >= '\t' && LA8_4 <= '\n')||LA8_4=='\r'||LA8_4=='='||LA8_4=='}') ) {s = 11;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA8_14 = input.LA(1);

                        s = -1;
                        if ( ((LA8_14 >= '\t' && LA8_14 <= '\n')||LA8_14=='\r'||LA8_14=='='||LA8_14=='{'||LA8_14=='}') ) {s = 13;}

                        else if ( ((LA8_14 >= '\u0000' && LA8_14 <= '\b')||(LA8_14 >= '\u000B' && LA8_14 <= '\f')||(LA8_14 >= '\u000E' && LA8_14 <= '<')||(LA8_14 >= '>' && LA8_14 <= 'z')||LA8_14=='|'||(LA8_14 >= '~' && LA8_14 <= '\uFFFF')) ) {s = 14;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA8_12 = input.LA(1);

                        s = -1;
                        if ( ((LA8_12 >= '\u0000' && LA8_12 <= '\b')||(LA8_12 >= '\u000B' && LA8_12 <= '\f')||(LA8_12 >= '\u000E' && LA8_12 <= '<')||(LA8_12 >= '>' && LA8_12 <= 'z')||LA8_12=='|'||(LA8_12 >= '~' && LA8_12 <= '\uFFFF')) ) {s = 14;}

                        else if ( ((LA8_12 >= '\t' && LA8_12 <= '\n')||LA8_12=='\r'||LA8_12=='='||LA8_12=='{'||LA8_12=='}') ) {s = 13;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='=') ) {s = 1;}

                        else if ( (LA8_0=='{') ) {s = 2;}

                        else if ( (LA8_0=='}') ) {s = 3;}

                        else if ( (LA8_0=='!') ) {s = 4;}

                        else if ( (LA8_0==' ') ) {s = 5;}

                        else if ( (LA8_0=='/') ) {s = 6;}

                        else if ( (LA8_0=='\t') ) {s = 7;}

                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\b')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\u001F')||(LA8_0 >= '\"' && LA8_0 <= '.')||(LA8_0 >= '0' && LA8_0 <= '<')||(LA8_0 >= '>' && LA8_0 <= 'z')||LA8_0=='|'||(LA8_0 >= '~' && LA8_0 <= '\uFFFF')) ) {s = 8;}

                        else if ( (LA8_0=='\n'||LA8_0=='\r') ) {s = 9;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}