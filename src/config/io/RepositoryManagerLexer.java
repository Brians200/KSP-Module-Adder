// $ANTLR 3.4 C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g 2013-11-28 00:22:58



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RepositoryManagerLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int CERT_END=4;
    public static final int CERT_HEADER=5;
    public static final int CHALLENGE_END=6;
    public static final int CHALLENGE_HEADER=7;
    public static final int CREDENTIAL_END=8;
    public static final int CREDENTIAL_HEADER=9;
    public static final int NOT_AFTER=10;
    public static final int NOT_BEFORE=11;
    public static final int NUM=12;
    public static final int PUBLIC_KEY_END=13;
    public static final int PUBLIC_KEY_HEADER=14;
    public static final int REPLY_END=15;
    public static final int REPLY_HEADER=16;
    public static final int REQUEST_END=17;
    public static final int REQUEST_HEADER=18;
    public static final int RESPONSE_END=19;
    public static final int RESPONSE_HEADER=20;
    public static final int SIGNATURE_END=21;
    public static final int SIGNATURE_HEADER=22;
    public static final int TEXT=23;
    public static final int VALIDITY_END=24;
    public static final int VALIDITY_HEADER=25;
    public static final int WS=26;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RepositoryManagerLexer() {} 
    public RepositoryManagerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RepositoryManagerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:5:7: ( '(' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:5:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:6:7: ( ')' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:6:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:7:7: ( ',' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:8:7: ( '.' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:8:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:9:7: ( ':-' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:9:9: ':-'
            {
            match(":-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:10:7: ( 'datime' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:10:9: 'datime'
            {
            match("datime"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:11:7: ( 'request' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:11:9: 'request'
            {
            match("request"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:12:7: ( 'says' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:12:9: 'says'
            {
            match("says"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:69:9: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:69:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:69:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel=99;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:72:5: ( ( '0' .. '9' )* )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:72:8: ( '0' .. '9' )*
            {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:72:8: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:
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
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "NUM"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:75:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '+' | '=' | '_' | '-' | ':' )* )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:75:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '+' | '=' | '_' | '-' | ':' )*
            {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:75:8: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '+' | '=' | '_' | '-' | ':' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='+'||LA3_0=='-'||(LA3_0 >= '/' && LA3_0 <= ':')||LA3_0=='='||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:
            	    {
            	    if ( input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1) >= '/' && input.LA(1) <= ':')||input.LA(1)=='='||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "CREDENTIAL_HEADER"
    public final void mCREDENTIAL_HEADER() throws RecognitionException {
        try {
            int _type = CREDENTIAL_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:78:18: ( '-----BEGIN MPKI CREDENTIAL-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:78:19: '-----BEGIN MPKI CREDENTIAL-----'
            {
            match("-----BEGIN MPKI CREDENTIAL-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREDENTIAL_HEADER"

    // $ANTLR start "CREDENTIAL_END"
    public final void mCREDENTIAL_END() throws RecognitionException {
        try {
            int _type = CREDENTIAL_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:79:15: ( '-----END MPKI CREDENTIAL-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:79:16: '-----END MPKI CREDENTIAL-----'
            {
            match("-----END MPKI CREDENTIAL-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREDENTIAL_END"

    // $ANTLR start "PUBLIC_KEY_HEADER"
    public final void mPUBLIC_KEY_HEADER() throws RecognitionException {
        try {
            int _type = PUBLIC_KEY_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:80:18: ( '-----BEGIN PUBLIC KEY-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:80:19: '-----BEGIN PUBLIC KEY-----'
            {
            match("-----BEGIN PUBLIC KEY-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC_KEY_HEADER"

    // $ANTLR start "PUBLIC_KEY_END"
    public final void mPUBLIC_KEY_END() throws RecognitionException {
        try {
            int _type = PUBLIC_KEY_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:81:15: ( '-----END PUBLIC KEY-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:81:16: '-----END PUBLIC KEY-----'
            {
            match("-----END PUBLIC KEY-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC_KEY_END"

    // $ANTLR start "SIGNATURE_HEADER"
    public final void mSIGNATURE_HEADER() throws RecognitionException {
        try {
            int _type = SIGNATURE_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:82:17: ( '-----BEGIN SIGNATURE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:82:18: '-----BEGIN SIGNATURE-----'
            {
            match("-----BEGIN SIGNATURE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGNATURE_HEADER"

    // $ANTLR start "SIGNATURE_END"
    public final void mSIGNATURE_END() throws RecognitionException {
        try {
            int _type = SIGNATURE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:83:14: ( '-----END SIGNATURE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:83:15: '-----END SIGNATURE-----'
            {
            match("-----END SIGNATURE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGNATURE_END"

    // $ANTLR start "VALIDITY_HEADER"
    public final void mVALIDITY_HEADER() throws RecognitionException {
        try {
            int _type = VALIDITY_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:84:16: ( '-----BEGIN VALIDITY-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:84:17: '-----BEGIN VALIDITY-----'
            {
            match("-----BEGIN VALIDITY-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALIDITY_HEADER"

    // $ANTLR start "VALIDITY_END"
    public final void mVALIDITY_END() throws RecognitionException {
        try {
            int _type = VALIDITY_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:85:13: ( '-----END VALIDITY-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:85:14: '-----END VALIDITY-----'
            {
            match("-----END VALIDITY-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALIDITY_END"

    // $ANTLR start "CERT_HEADER"
    public final void mCERT_HEADER() throws RecognitionException {
        try {
            int _type = CERT_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:86:12: ( '-----BEGIN MPKI CERTIFICATE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:86:13: '-----BEGIN MPKI CERTIFICATE-----'
            {
            match("-----BEGIN MPKI CERTIFICATE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CERT_HEADER"

    // $ANTLR start "CERT_END"
    public final void mCERT_END() throws RecognitionException {
        try {
            int _type = CERT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:87:9: ( '-----END MPKI CERTIFICATE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:87:10: '-----END MPKI CERTIFICATE-----'
            {
            match("-----END MPKI CERTIFICATE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CERT_END"

    // $ANTLR start "CHALLENGE_HEADER"
    public final void mCHALLENGE_HEADER() throws RecognitionException {
        try {
            int _type = CHALLENGE_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:88:17: ( '-----BEGIN MPKI CHALLENGE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:88:18: '-----BEGIN MPKI CHALLENGE-----'
            {
            match("-----BEGIN MPKI CHALLENGE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHALLENGE_HEADER"

    // $ANTLR start "CHALLENGE_END"
    public final void mCHALLENGE_END() throws RecognitionException {
        try {
            int _type = CHALLENGE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:89:14: ( '-----END MPKI CHALLENGE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:89:15: '-----END MPKI CHALLENGE-----'
            {
            match("-----END MPKI CHALLENGE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHALLENGE_END"

    // $ANTLR start "RESPONSE_HEADER"
    public final void mRESPONSE_HEADER() throws RecognitionException {
        try {
            int _type = RESPONSE_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:90:16: ( '-----BEGIN MPKI CHALLENGE RESPONSE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:90:17: '-----BEGIN MPKI CHALLENGE RESPONSE-----'
            {
            match("-----BEGIN MPKI CHALLENGE RESPONSE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESPONSE_HEADER"

    // $ANTLR start "RESPONSE_END"
    public final void mRESPONSE_END() throws RecognitionException {
        try {
            int _type = RESPONSE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:91:13: ( '-----END MPKI CHALLENGE RESPONSE-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:91:14: '-----END MPKI CHALLENGE RESPONSE-----'
            {
            match("-----END MPKI CHALLENGE RESPONSE-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESPONSE_END"

    // $ANTLR start "REQUEST_HEADER"
    public final void mREQUEST_HEADER() throws RecognitionException {
        try {
            int _type = REQUEST_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:92:15: ( '-----BEGIN REPOSITORY CLIENT REQUEST-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:92:16: '-----BEGIN REPOSITORY CLIENT REQUEST-----'
            {
            match("-----BEGIN REPOSITORY CLIENT REQUEST-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REQUEST_HEADER"

    // $ANTLR start "REQUEST_END"
    public final void mREQUEST_END() throws RecognitionException {
        try {
            int _type = REQUEST_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:93:12: ( '-----END REPOSITORY CLIENT REQUEST-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:93:13: '-----END REPOSITORY CLIENT REQUEST-----'
            {
            match("-----END REPOSITORY CLIENT REQUEST-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REQUEST_END"

    // $ANTLR start "REPLY_HEADER"
    public final void mREPLY_HEADER() throws RecognitionException {
        try {
            int _type = REPLY_HEADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:94:13: ( '-----BEGIN REPOSITORY SERVER REPLY-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:94:14: '-----BEGIN REPOSITORY SERVER REPLY-----'
            {
            match("-----BEGIN REPOSITORY SERVER REPLY-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPLY_HEADER"

    // $ANTLR start "REPLY_END"
    public final void mREPLY_END() throws RecognitionException {
        try {
            int _type = REPLY_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:95:10: ( '-----END REPOSITORY SERVER REPLY-----' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:95:11: '-----END REPOSITORY SERVER REPLY-----'
            {
            match("-----END REPOSITORY SERVER REPLY-----"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPLY_END"

    // $ANTLR start "NOT_BEFORE"
    public final void mNOT_BEFORE() throws RecognitionException {
        try {
            int _type = NOT_BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:97:2: ( 'Not before:' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:97:4: 'Not before:'
            {
            match("Not before:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_BEFORE"

    // $ANTLR start "NOT_AFTER"
    public final void mNOT_AFTER() throws RecognitionException {
        try {
            int _type = NOT_AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:99:2: ( 'Not after:' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:99:4: 'Not after:'
            {
            match("Not after:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_AFTER"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | WS | NUM | TEXT | CREDENTIAL_HEADER | CREDENTIAL_END | PUBLIC_KEY_HEADER | PUBLIC_KEY_END | SIGNATURE_HEADER | SIGNATURE_END | VALIDITY_HEADER | VALIDITY_END | CERT_HEADER | CERT_END | CHALLENGE_HEADER | CHALLENGE_END | RESPONSE_HEADER | RESPONSE_END | REQUEST_HEADER | REQUEST_END | REPLY_HEADER | REPLY_END | NOT_BEFORE | NOT_AFTER )
        int alt4=31;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:10: T__27
                {
                mT__27(); 


                }
                break;
            case 2 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:16: T__28
                {
                mT__28(); 


                }
                break;
            case 3 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:22: T__29
                {
                mT__29(); 


                }
                break;
            case 4 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:28: T__30
                {
                mT__30(); 


                }
                break;
            case 5 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:34: T__31
                {
                mT__31(); 


                }
                break;
            case 6 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:40: T__32
                {
                mT__32(); 


                }
                break;
            case 7 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:46: T__33
                {
                mT__33(); 


                }
                break;
            case 8 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:52: T__34
                {
                mT__34(); 


                }
                break;
            case 9 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:58: WS
                {
                mWS(); 


                }
                break;
            case 10 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:61: NUM
                {
                mNUM(); 


                }
                break;
            case 11 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:65: TEXT
                {
                mTEXT(); 


                }
                break;
            case 12 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:70: CREDENTIAL_HEADER
                {
                mCREDENTIAL_HEADER(); 


                }
                break;
            case 13 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:88: CREDENTIAL_END
                {
                mCREDENTIAL_END(); 


                }
                break;
            case 14 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:103: PUBLIC_KEY_HEADER
                {
                mPUBLIC_KEY_HEADER(); 


                }
                break;
            case 15 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:121: PUBLIC_KEY_END
                {
                mPUBLIC_KEY_END(); 


                }
                break;
            case 16 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:136: SIGNATURE_HEADER
                {
                mSIGNATURE_HEADER(); 


                }
                break;
            case 17 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:153: SIGNATURE_END
                {
                mSIGNATURE_END(); 


                }
                break;
            case 18 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:167: VALIDITY_HEADER
                {
                mVALIDITY_HEADER(); 


                }
                break;
            case 19 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:183: VALIDITY_END
                {
                mVALIDITY_END(); 


                }
                break;
            case 20 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:196: CERT_HEADER
                {
                mCERT_HEADER(); 


                }
                break;
            case 21 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:208: CERT_END
                {
                mCERT_END(); 


                }
                break;
            case 22 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:217: CHALLENGE_HEADER
                {
                mCHALLENGE_HEADER(); 


                }
                break;
            case 23 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:234: CHALLENGE_END
                {
                mCHALLENGE_END(); 


                }
                break;
            case 24 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:248: RESPONSE_HEADER
                {
                mRESPONSE_HEADER(); 


                }
                break;
            case 25 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:264: RESPONSE_END
                {
                mRESPONSE_END(); 


                }
                break;
            case 26 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:277: REQUEST_HEADER
                {
                mREQUEST_HEADER(); 


                }
                break;
            case 27 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:292: REQUEST_END
                {
                mREQUEST_END(); 


                }
                break;
            case 28 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:304: REPLY_HEADER
                {
                mREPLY_HEADER(); 


                }
                break;
            case 29 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:317: REPLY_END
                {
                mREPLY_END(); 


                }
                break;
            case 30 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:327: NOT_BEFORE
                {
                mNOT_BEFORE(); 


                }
                break;
            case 31 :
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:1:338: NOT_AFTER
                {
                mNOT_AFTER(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\13\4\uffff\4\16\1\uffff\1\13\1\uffff\2\16\1\uffff\1\25\5\16\1"+
        "\uffff\7\16\1\42\1\16\1\uffff\2\16\1\uffff\1\16\2\uffff\1\52\3\16"+
        "\1\uffff\1\56\2\16\1\uffff\3\16\1\uffff\1\16\105\uffff";
    static final String DFA4_eofS =
        "\171\uffff";
    static final String DFA4_minS =
        "\1\11\4\uffff\1\55\1\141\1\145\1\141\1\uffff\1\53\1\uffff\1\55\1"+
        "\157\1\uffff\1\53\1\164\1\161\1\171\1\55\1\164\1\uffff\1\151\1\165"+
        "\1\163\1\55\1\40\1\155\1\145\1\53\1\55\1\141\1\145\1\163\1\uffff"+
        "\1\102\2\uffff\1\53\1\164\1\105\1\116\1\uffff\1\53\1\107\1\104\1"+
        "\uffff\1\111\1\40\1\116\1\115\1\40\1\120\3\uffff\1\105\1\115\1\113"+
        "\2\120\3\uffff\1\105\1\111\1\117\1\113\1\120\1\40\1\123\1\111\1"+
        "\117\1\103\1\111\1\40\1\123\1\105\1\124\1\103\1\111\2\uffff\1\101"+
        "\1\117\1\105\1\124\1\114\1\122\2\uffff\1\101\1\117\1\114\1\131\1"+
        "\114\1\122\1\105\1\40\1\114\1\131\1\116\1\103\1\105\1\40\1\107\2"+
        "\uffff\1\116\1\103\1\105\1\107\2\uffff\1\40\1\105\2\uffff\1\40\2"+
        "\uffff";
    static final String DFA4_maxS =
        "\1\172\4\uffff\1\55\1\141\1\145\1\141\1\uffff\1\172\1\uffff\1\55"+
        "\1\157\1\uffff\1\172\1\164\1\161\1\171\1\55\1\164\1\uffff\1\151"+
        "\1\165\1\163\1\55\1\40\1\155\1\145\1\172\1\55\1\142\1\145\1\163"+
        "\1\uffff\1\105\2\uffff\1\172\1\164\1\105\1\116\1\uffff\1\172\1\107"+
        "\1\104\1\uffff\1\111\1\40\1\116\1\126\1\40\1\120\3\uffff\1\105\1"+
        "\126\1\113\2\120\3\uffff\1\105\1\111\1\117\1\113\1\120\1\40\1\123"+
        "\1\111\1\117\1\103\1\111\1\40\1\123\1\122\1\124\1\103\1\111\2\uffff"+
        "\1\101\1\117\1\122\1\124\1\114\1\122\2\uffff\1\101\1\117\1\114\1"+
        "\131\1\114\1\122\1\105\1\40\1\114\1\131\1\116\1\123\1\105\1\40\1"+
        "\107\2\uffff\1\116\1\123\1\105\1\107\2\uffff\1\55\1\105\2\uffff"+
        "\1\55\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\4\uffff\1\11\1\uffff\1\12\2\uffff\1\13"+
        "\6\uffff\1\5\14\uffff\1\10\1\uffff\1\36\1\37\4\uffff\1\6\3\uffff"+
        "\1\7\6\uffff\1\17\1\21\1\23\5\uffff\1\16\1\20\1\22\21\uffff\1\15"+
        "\1\25\6\uffff\1\14\1\24\17\uffff\1\33\1\35\4\uffff\1\32\1\34\2\uffff"+
        "\1\27\1\31\1\uffff\1\26\1\30";
    static final String DFA4_specialS =
        "\171\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\7\uffff\1\1\1\2\1\uffff\1\16"+
            "\1\3\1\14\1\4\1\16\12\12\1\5\2\uffff\1\16\3\uffff\15\16\1\15"+
            "\14\16\4\uffff\1\16\1\uffff\3\16\1\6\15\16\1\7\1\10\7\16",
            "",
            "",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "",
            "\1\16\1\uffff\1\16\1\uffff\1\16\12\12\1\16\2\uffff\1\16\3\uffff"+
            "\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\23",
            "\1\24",
            "",
            "\1\16\1\uffff\1\16\1\uffff\14\16\2\uffff\1\16\3\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\16\1\uffff\1\16\1\uffff\14\16\2\uffff\1\16\3\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\43",
            "\1\45\1\44",
            "\1\46",
            "\1\47",
            "",
            "\1\50\2\uffff\1\51",
            "",
            "",
            "\1\16\1\uffff\1\16\1\uffff\14\16\2\uffff\1\16\3\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\16\1\uffff\1\16\1\uffff\14\16\2\uffff\1\16\3\uffff\32\16"+
            "\4\uffff\1\16\1\uffff\32\16",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\2\uffff\1\65\1\uffff\1\70\1\66\2\uffff\1\67",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "\1\73",
            "\1\74\2\uffff\1\75\1\uffff\1\100\1\76\2\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\122\2\uffff\1\123\11\uffff\1\121",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\132\2\uffff\1\133\11\uffff\1\131",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\17\uffff\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\1\157",
            "\1\160\17\uffff\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "\1\165\14\uffff\1\164",
            "\1\166",
            "",
            "",
            "\1\170\14\uffff\1\167",
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
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | WS | NUM | TEXT | CREDENTIAL_HEADER | CREDENTIAL_END | PUBLIC_KEY_HEADER | PUBLIC_KEY_END | SIGNATURE_HEADER | SIGNATURE_END | VALIDITY_HEADER | VALIDITY_END | CERT_HEADER | CERT_END | CHALLENGE_HEADER | CHALLENGE_END | RESPONSE_HEADER | RESPONSE_END | REQUEST_HEADER | REQUEST_END | REPLY_HEADER | REPLY_END | NOT_BEFORE | NOT_AFTER );";
        }
    }
 

}