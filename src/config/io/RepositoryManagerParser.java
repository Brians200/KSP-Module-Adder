// $ANTLR 3.4 C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g 2013-11-28 00:22:58



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class RepositoryManagerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CERT_END", "CERT_HEADER", "CHALLENGE_END", "CHALLENGE_HEADER", "CREDENTIAL_END", "CREDENTIAL_HEADER", "NOT_AFTER", "NOT_BEFORE", "NUM", "PUBLIC_KEY_END", "PUBLIC_KEY_HEADER", "REPLY_END", "REPLY_HEADER", "REQUEST_END", "REQUEST_HEADER", "RESPONSE_END", "RESPONSE_HEADER", "SIGNATURE_END", "SIGNATURE_HEADER", "TEXT", "VALIDITY_END", "VALIDITY_HEADER", "WS", "'('", "')'", "','", "'.'", "':-'", "'datime'", "'request'", "'says'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public RepositoryManagerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RepositoryManagerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return RepositoryManagerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g"; }


    public static class credential_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "credential"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:11:1: credential : CREDENTIAL_HEADER public_key ( certificate )* CREDENTIAL_END -> ^( CREDENTIAL_HEADER CREDENTIAL_END ) ;
    public final RepositoryManagerParser.credential_return credential() throws RecognitionException {
        RepositoryManagerParser.credential_return retval = new RepositoryManagerParser.credential_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREDENTIAL_HEADER1=null;
        Token CREDENTIAL_END4=null;
        RepositoryManagerParser.public_key_return public_key2 =null;

        RepositoryManagerParser.certificate_return certificate3 =null;


        Object CREDENTIAL_HEADER1_tree=null;
        Object CREDENTIAL_END4_tree=null;
        RewriteRuleTokenStream stream_CREDENTIAL_HEADER=new RewriteRuleTokenStream(adaptor,"token CREDENTIAL_HEADER");
        RewriteRuleTokenStream stream_CREDENTIAL_END=new RewriteRuleTokenStream(adaptor,"token CREDENTIAL_END");
        RewriteRuleSubtreeStream stream_certificate=new RewriteRuleSubtreeStream(adaptor,"rule certificate");
        RewriteRuleSubtreeStream stream_public_key=new RewriteRuleSubtreeStream(adaptor,"rule public_key");
        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:12:2: ( CREDENTIAL_HEADER public_key ( certificate )* CREDENTIAL_END -> ^( CREDENTIAL_HEADER CREDENTIAL_END ) )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:12:4: CREDENTIAL_HEADER public_key ( certificate )* CREDENTIAL_END
            {
            CREDENTIAL_HEADER1=(Token)match(input,CREDENTIAL_HEADER,FOLLOW_CREDENTIAL_HEADER_in_credential37);  
            stream_CREDENTIAL_HEADER.add(CREDENTIAL_HEADER1);


            pushFollow(FOLLOW_public_key_in_credential39);
            public_key2=public_key();

            state._fsp--;

            stream_public_key.add(public_key2.getTree());

            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:12:33: ( certificate )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CERT_HEADER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:12:33: certificate
            	    {
            	    pushFollow(FOLLOW_certificate_in_credential41);
            	    certificate3=certificate();

            	    state._fsp--;

            	    stream_certificate.add(certificate3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            CREDENTIAL_END4=(Token)match(input,CREDENTIAL_END,FOLLOW_CREDENTIAL_END_in_credential44);  
            stream_CREDENTIAL_END.add(CREDENTIAL_END4);


            // AST REWRITE
            // elements: CREDENTIAL_END, CREDENTIAL_HEADER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 12:63: -> ^( CREDENTIAL_HEADER CREDENTIAL_END )
            {
                // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:12:66: ^( CREDENTIAL_HEADER CREDENTIAL_END )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CREDENTIAL_HEADER.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_CREDENTIAL_END.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "credential"


    public static class public_key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "public_key"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:14:1: public_key : PUBLIC_KEY_HEADER base64 PUBLIC_KEY_END ;
    public final RepositoryManagerParser.public_key_return public_key() throws RecognitionException {
        RepositoryManagerParser.public_key_return retval = new RepositoryManagerParser.public_key_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PUBLIC_KEY_HEADER5=null;
        Token PUBLIC_KEY_END7=null;
        RepositoryManagerParser.base64_return base646 =null;


        Object PUBLIC_KEY_HEADER5_tree=null;
        Object PUBLIC_KEY_END7_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:15:2: ( PUBLIC_KEY_HEADER base64 PUBLIC_KEY_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:15:4: PUBLIC_KEY_HEADER base64 PUBLIC_KEY_END
            {
            root_0 = (Object)adaptor.nil();


            PUBLIC_KEY_HEADER5=(Token)match(input,PUBLIC_KEY_HEADER,FOLLOW_PUBLIC_KEY_HEADER_in_public_key64); 
            PUBLIC_KEY_HEADER5_tree = 
            (Object)adaptor.create(PUBLIC_KEY_HEADER5)
            ;
            adaptor.addChild(root_0, PUBLIC_KEY_HEADER5_tree);


            pushFollow(FOLLOW_base64_in_public_key66);
            base646=base64();

            state._fsp--;

            adaptor.addChild(root_0, base646.getTree());

            PUBLIC_KEY_END7=(Token)match(input,PUBLIC_KEY_END,FOLLOW_PUBLIC_KEY_END_in_public_key68); 
            PUBLIC_KEY_END7_tree = 
            (Object)adaptor.create(PUBLIC_KEY_END7)
            ;
            adaptor.addChild(root_0, PUBLIC_KEY_END7_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "public_key"


    public static class signature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signature"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:17:1: signature : SIGNATURE_HEADER base64 SIGNATURE_END ;
    public final RepositoryManagerParser.signature_return signature() throws RecognitionException {
        RepositoryManagerParser.signature_return retval = new RepositoryManagerParser.signature_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SIGNATURE_HEADER8=null;
        Token SIGNATURE_END10=null;
        RepositoryManagerParser.base64_return base649 =null;


        Object SIGNATURE_HEADER8_tree=null;
        Object SIGNATURE_END10_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:18:2: ( SIGNATURE_HEADER base64 SIGNATURE_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:18:4: SIGNATURE_HEADER base64 SIGNATURE_END
            {
            root_0 = (Object)adaptor.nil();


            SIGNATURE_HEADER8=(Token)match(input,SIGNATURE_HEADER,FOLLOW_SIGNATURE_HEADER_in_signature78); 
            SIGNATURE_HEADER8_tree = 
            (Object)adaptor.create(SIGNATURE_HEADER8)
            ;
            adaptor.addChild(root_0, SIGNATURE_HEADER8_tree);


            pushFollow(FOLLOW_base64_in_signature80);
            base649=base64();

            state._fsp--;

            adaptor.addChild(root_0, base649.getTree());

            SIGNATURE_END10=(Token)match(input,SIGNATURE_END,FOLLOW_SIGNATURE_END_in_signature82); 
            SIGNATURE_END10_tree = 
            (Object)adaptor.create(SIGNATURE_END10)
            ;
            adaptor.addChild(root_0, SIGNATURE_END10_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signature"


    public static class validity_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "validity"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:20:1: validity : VALIDITY_HEADER NOT_BEFORE time_tuple NOT_AFTER time_tuple VALIDITY_END ;
    public final RepositoryManagerParser.validity_return validity() throws RecognitionException {
        RepositoryManagerParser.validity_return retval = new RepositoryManagerParser.validity_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VALIDITY_HEADER11=null;
        Token NOT_BEFORE12=null;
        Token NOT_AFTER14=null;
        Token VALIDITY_END16=null;
        RepositoryManagerParser.time_tuple_return time_tuple13 =null;

        RepositoryManagerParser.time_tuple_return time_tuple15 =null;


        Object VALIDITY_HEADER11_tree=null;
        Object NOT_BEFORE12_tree=null;
        Object NOT_AFTER14_tree=null;
        Object VALIDITY_END16_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:21:2: ( VALIDITY_HEADER NOT_BEFORE time_tuple NOT_AFTER time_tuple VALIDITY_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:21:4: VALIDITY_HEADER NOT_BEFORE time_tuple NOT_AFTER time_tuple VALIDITY_END
            {
            root_0 = (Object)adaptor.nil();


            VALIDITY_HEADER11=(Token)match(input,VALIDITY_HEADER,FOLLOW_VALIDITY_HEADER_in_validity92); 
            VALIDITY_HEADER11_tree = 
            (Object)adaptor.create(VALIDITY_HEADER11)
            ;
            adaptor.addChild(root_0, VALIDITY_HEADER11_tree);


            NOT_BEFORE12=(Token)match(input,NOT_BEFORE,FOLLOW_NOT_BEFORE_in_validity94); 
            NOT_BEFORE12_tree = 
            (Object)adaptor.create(NOT_BEFORE12)
            ;
            adaptor.addChild(root_0, NOT_BEFORE12_tree);


            pushFollow(FOLLOW_time_tuple_in_validity96);
            time_tuple13=time_tuple();

            state._fsp--;

            adaptor.addChild(root_0, time_tuple13.getTree());

            NOT_AFTER14=(Token)match(input,NOT_AFTER,FOLLOW_NOT_AFTER_in_validity98); 
            NOT_AFTER14_tree = 
            (Object)adaptor.create(NOT_AFTER14)
            ;
            adaptor.addChild(root_0, NOT_AFTER14_tree);


            pushFollow(FOLLOW_time_tuple_in_validity100);
            time_tuple15=time_tuple();

            state._fsp--;

            adaptor.addChild(root_0, time_tuple15.getTree());

            VALIDITY_END16=(Token)match(input,VALIDITY_END,FOLLOW_VALIDITY_END_in_validity102); 
            VALIDITY_END16_tree = 
            (Object)adaptor.create(VALIDITY_END16)
            ;
            adaptor.addChild(root_0, VALIDITY_END16_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "validity"


    public static class time_tuple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time_tuple"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:23:1: time_tuple : 'datime' '(' num ',' num ',' num ',' num ',' num ',' num ')' '.' ;
    public final RepositoryManagerParser.time_tuple_return time_tuple() throws RecognitionException {
        RepositoryManagerParser.time_tuple_return retval = new RepositoryManagerParser.time_tuple_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal30=null;
        Token char_literal31=null;
        RepositoryManagerParser.num_return num19 =null;

        RepositoryManagerParser.num_return num21 =null;

        RepositoryManagerParser.num_return num23 =null;

        RepositoryManagerParser.num_return num25 =null;

        RepositoryManagerParser.num_return num27 =null;

        RepositoryManagerParser.num_return num29 =null;


        Object string_literal17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:24:2: ( 'datime' '(' num ',' num ',' num ',' num ',' num ',' num ')' '.' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:24:4: 'datime' '(' num ',' num ',' num ',' num ',' num ',' num ')' '.'
            {
            root_0 = (Object)adaptor.nil();


            string_literal17=(Token)match(input,32,FOLLOW_32_in_time_tuple112); 
            string_literal17_tree = 
            (Object)adaptor.create(string_literal17)
            ;
            adaptor.addChild(root_0, string_literal17_tree);


            char_literal18=(Token)match(input,27,FOLLOW_27_in_time_tuple114); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);


            pushFollow(FOLLOW_num_in_time_tuple116);
            num19=num();

            state._fsp--;

            adaptor.addChild(root_0, num19.getTree());

            char_literal20=(Token)match(input,29,FOLLOW_29_in_time_tuple118); 
            char_literal20_tree = 
            (Object)adaptor.create(char_literal20)
            ;
            adaptor.addChild(root_0, char_literal20_tree);


            pushFollow(FOLLOW_num_in_time_tuple120);
            num21=num();

            state._fsp--;

            adaptor.addChild(root_0, num21.getTree());

            char_literal22=(Token)match(input,29,FOLLOW_29_in_time_tuple122); 
            char_literal22_tree = 
            (Object)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);


            pushFollow(FOLLOW_num_in_time_tuple124);
            num23=num();

            state._fsp--;

            adaptor.addChild(root_0, num23.getTree());

            char_literal24=(Token)match(input,29,FOLLOW_29_in_time_tuple126); 
            char_literal24_tree = 
            (Object)adaptor.create(char_literal24)
            ;
            adaptor.addChild(root_0, char_literal24_tree);


            pushFollow(FOLLOW_num_in_time_tuple128);
            num25=num();

            state._fsp--;

            adaptor.addChild(root_0, num25.getTree());

            char_literal26=(Token)match(input,29,FOLLOW_29_in_time_tuple130); 
            char_literal26_tree = 
            (Object)adaptor.create(char_literal26)
            ;
            adaptor.addChild(root_0, char_literal26_tree);


            pushFollow(FOLLOW_num_in_time_tuple132);
            num27=num();

            state._fsp--;

            adaptor.addChild(root_0, num27.getTree());

            char_literal28=(Token)match(input,29,FOLLOW_29_in_time_tuple134); 
            char_literal28_tree = 
            (Object)adaptor.create(char_literal28)
            ;
            adaptor.addChild(root_0, char_literal28_tree);


            pushFollow(FOLLOW_num_in_time_tuple136);
            num29=num();

            state._fsp--;

            adaptor.addChild(root_0, num29.getTree());

            char_literal30=(Token)match(input,28,FOLLOW_28_in_time_tuple138); 
            char_literal30_tree = 
            (Object)adaptor.create(char_literal30)
            ;
            adaptor.addChild(root_0, char_literal30_tree);


            char_literal31=(Token)match(input,30,FOLLOW_30_in_time_tuple141); 
            char_literal31_tree = 
            (Object)adaptor.create(char_literal31)
            ;
            adaptor.addChild(root_0, char_literal31_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "time_tuple"


    public static class certificate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "certificate"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:26:1: certificate : CERT_HEADER ( clause )+ validity public_key signature CERT_END ;
    public final RepositoryManagerParser.certificate_return certificate() throws RecognitionException {
        RepositoryManagerParser.certificate_return retval = new RepositoryManagerParser.certificate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CERT_HEADER32=null;
        Token CERT_END37=null;
        RepositoryManagerParser.clause_return clause33 =null;

        RepositoryManagerParser.validity_return validity34 =null;

        RepositoryManagerParser.public_key_return public_key35 =null;

        RepositoryManagerParser.signature_return signature36 =null;


        Object CERT_HEADER32_tree=null;
        Object CERT_END37_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:27:2: ( CERT_HEADER ( clause )+ validity public_key signature CERT_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:27:4: CERT_HEADER ( clause )+ validity public_key signature CERT_END
            {
            root_0 = (Object)adaptor.nil();


            CERT_HEADER32=(Token)match(input,CERT_HEADER,FOLLOW_CERT_HEADER_in_certificate151); 
            CERT_HEADER32_tree = 
            (Object)adaptor.create(CERT_HEADER32)
            ;
            adaptor.addChild(root_0, CERT_HEADER32_tree);


            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:27:16: ( clause )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TEXT||LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:27:16: clause
            	    {
            	    pushFollow(FOLLOW_clause_in_certificate153);
            	    clause33=clause();

            	    state._fsp--;

            	    adaptor.addChild(root_0, clause33.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            pushFollow(FOLLOW_validity_in_certificate156);
            validity34=validity();

            state._fsp--;

            adaptor.addChild(root_0, validity34.getTree());

            pushFollow(FOLLOW_public_key_in_certificate158);
            public_key35=public_key();

            state._fsp--;

            adaptor.addChild(root_0, public_key35.getTree());

            pushFollow(FOLLOW_signature_in_certificate160);
            signature36=signature();

            state._fsp--;

            adaptor.addChild(root_0, signature36.getTree());

            CERT_END37=(Token)match(input,CERT_END,FOLLOW_CERT_END_in_certificate162); 
            CERT_END37_tree = 
            (Object)adaptor.create(CERT_END37)
            ;
            adaptor.addChild(root_0, CERT_END37_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "certificate"


    public static class clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clause"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:29:1: clause : ( literal '.' | literal ':-' literal ( ',' literal )* '.' );
    public final RepositoryManagerParser.clause_return clause() throws RecognitionException {
        RepositoryManagerParser.clause_return retval = new RepositoryManagerParser.clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal39=null;
        Token string_literal41=null;
        Token char_literal43=null;
        Token char_literal45=null;
        RepositoryManagerParser.literal_return literal38 =null;

        RepositoryManagerParser.literal_return literal40 =null;

        RepositoryManagerParser.literal_return literal42 =null;

        RepositoryManagerParser.literal_return literal44 =null;


        Object char_literal39_tree=null;
        Object string_literal41_tree=null;
        Object char_literal43_tree=null;
        Object char_literal45_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:30:2: ( literal '.' | literal ':-' literal ( ',' literal )* '.' )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:30:4: literal '.'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_clause172);
                    literal38=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal38.getTree());

                    char_literal39=(Token)match(input,30,FOLLOW_30_in_clause174); 
                    char_literal39_tree = 
                    (Object)adaptor.create(char_literal39)
                    ;
                    adaptor.addChild(root_0, char_literal39_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:31:4: literal ':-' literal ( ',' literal )* '.'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_clause179);
                    literal40=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal40.getTree());

                    string_literal41=(Token)match(input,31,FOLLOW_31_in_clause181); 
                    string_literal41_tree = 
                    (Object)adaptor.create(string_literal41)
                    ;
                    adaptor.addChild(root_0, string_literal41_tree);


                    pushFollow(FOLLOW_literal_in_clause183);
                    literal42=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal42.getTree());

                    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:32:4: ( ',' literal )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==29) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:32:6: ',' literal
                    	    {
                    	    char_literal43=(Token)match(input,29,FOLLOW_29_in_clause190); 
                    	    char_literal43_tree = 
                    	    (Object)adaptor.create(char_literal43)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal43_tree);


                    	    pushFollow(FOLLOW_literal_in_clause192);
                    	    literal44=literal();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, literal44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    char_literal45=(Token)match(input,30,FOLLOW_30_in_clause196); 
                    char_literal45_tree = 
                    (Object)adaptor.create(char_literal45)
                    ;
                    adaptor.addChild(root_0, char_literal45_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "clause"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:34:1: literal : ( predicate | 'says' '(' text ',' predicate ')' );
    public final RepositoryManagerParser.literal_return literal() throws RecognitionException {
        RepositoryManagerParser.literal_return retval = new RepositoryManagerParser.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal47=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        RepositoryManagerParser.predicate_return predicate46 =null;

        RepositoryManagerParser.text_return text49 =null;

        RepositoryManagerParser.predicate_return predicate51 =null;


        Object string_literal47_tree=null;
        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        Object char_literal52_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:35:2: ( predicate | 'says' '(' text ',' predicate ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==TEXT) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:35:4: predicate
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_predicate_in_literal206);
                    predicate46=predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate46.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:36:4: 'says' '(' text ',' predicate ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal47=(Token)match(input,34,FOLLOW_34_in_literal211); 
                    string_literal47_tree = 
                    (Object)adaptor.create(string_literal47)
                    ;
                    adaptor.addChild(root_0, string_literal47_tree);


                    char_literal48=(Token)match(input,27,FOLLOW_27_in_literal213); 
                    char_literal48_tree = 
                    (Object)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);


                    pushFollow(FOLLOW_text_in_literal215);
                    text49=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text49.getTree());

                    char_literal50=(Token)match(input,29,FOLLOW_29_in_literal217); 
                    char_literal50_tree = 
                    (Object)adaptor.create(char_literal50)
                    ;
                    adaptor.addChild(root_0, char_literal50_tree);


                    pushFollow(FOLLOW_predicate_in_literal219);
                    predicate51=predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, predicate51.getTree());

                    char_literal52=(Token)match(input,28,FOLLOW_28_in_literal221); 
                    char_literal52_tree = 
                    (Object)adaptor.create(char_literal52)
                    ;
                    adaptor.addChild(root_0, char_literal52_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:38:1: predicate : text '(' text ( ',' text )* ')' ;
    public final RepositoryManagerParser.predicate_return predicate() throws RecognitionException {
        RepositoryManagerParser.predicate_return retval = new RepositoryManagerParser.predicate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal54=null;
        Token char_literal56=null;
        Token char_literal58=null;
        RepositoryManagerParser.text_return text53 =null;

        RepositoryManagerParser.text_return text55 =null;

        RepositoryManagerParser.text_return text57 =null;


        Object char_literal54_tree=null;
        Object char_literal56_tree=null;
        Object char_literal58_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:39:2: ( text '(' text ( ',' text )* ')' )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:39:4: text '(' text ( ',' text )* ')'
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_text_in_predicate231);
            text53=text();

            state._fsp--;

            adaptor.addChild(root_0, text53.getTree());

            char_literal54=(Token)match(input,27,FOLLOW_27_in_predicate234); 
            char_literal54_tree = 
            (Object)adaptor.create(char_literal54)
            ;
            adaptor.addChild(root_0, char_literal54_tree);


            pushFollow(FOLLOW_text_in_predicate236);
            text55=text();

            state._fsp--;

            adaptor.addChild(root_0, text55.getTree());

            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:40:3: ( ',' text )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:40:5: ',' text
            	    {
            	    char_literal56=(Token)match(input,29,FOLLOW_29_in_predicate242); 
            	    char_literal56_tree = 
            	    (Object)adaptor.create(char_literal56)
            	    ;
            	    adaptor.addChild(root_0, char_literal56_tree);


            	    pushFollow(FOLLOW_text_in_predicate243);
            	    text57=text();

            	    state._fsp--;

            	    adaptor.addChild(root_0, text57.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            char_literal58=(Token)match(input,28,FOLLOW_28_in_predicate247); 
            char_literal58_tree = 
            (Object)adaptor.create(char_literal58)
            ;
            adaptor.addChild(root_0, char_literal58_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicate"


    public static class challenge_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "challenge"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:42:1: challenge : CHALLENGE_HEADER text CHALLENGE_END ;
    public final RepositoryManagerParser.challenge_return challenge() throws RecognitionException {
        RepositoryManagerParser.challenge_return retval = new RepositoryManagerParser.challenge_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHALLENGE_HEADER59=null;
        Token CHALLENGE_END61=null;
        RepositoryManagerParser.text_return text60 =null;


        Object CHALLENGE_HEADER59_tree=null;
        Object CHALLENGE_END61_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:43:2: ( CHALLENGE_HEADER text CHALLENGE_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:43:4: CHALLENGE_HEADER text CHALLENGE_END
            {
            root_0 = (Object)adaptor.nil();


            CHALLENGE_HEADER59=(Token)match(input,CHALLENGE_HEADER,FOLLOW_CHALLENGE_HEADER_in_challenge257); 
            CHALLENGE_HEADER59_tree = 
            (Object)adaptor.create(CHALLENGE_HEADER59)
            ;
            adaptor.addChild(root_0, CHALLENGE_HEADER59_tree);


            pushFollow(FOLLOW_text_in_challenge259);
            text60=text();

            state._fsp--;

            adaptor.addChild(root_0, text60.getTree());

            CHALLENGE_END61=(Token)match(input,CHALLENGE_END,FOLLOW_CHALLENGE_END_in_challenge261); 
            CHALLENGE_END61_tree = 
            (Object)adaptor.create(CHALLENGE_END61)
            ;
            adaptor.addChild(root_0, CHALLENGE_END61_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "challenge"


    public static class response_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "response"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:45:1: response : RESPONSE_HEADER base64 RESPONSE_END ;
    public final RepositoryManagerParser.response_return response() throws RecognitionException {
        RepositoryManagerParser.response_return retval = new RepositoryManagerParser.response_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RESPONSE_HEADER62=null;
        Token RESPONSE_END64=null;
        RepositoryManagerParser.base64_return base6463 =null;


        Object RESPONSE_HEADER62_tree=null;
        Object RESPONSE_END64_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:46:2: ( RESPONSE_HEADER base64 RESPONSE_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:46:4: RESPONSE_HEADER base64 RESPONSE_END
            {
            root_0 = (Object)adaptor.nil();


            RESPONSE_HEADER62=(Token)match(input,RESPONSE_HEADER,FOLLOW_RESPONSE_HEADER_in_response276); 
            RESPONSE_HEADER62_tree = 
            (Object)adaptor.create(RESPONSE_HEADER62)
            ;
            adaptor.addChild(root_0, RESPONSE_HEADER62_tree);


            pushFollow(FOLLOW_base64_in_response278);
            base6463=base64();

            state._fsp--;

            adaptor.addChild(root_0, base6463.getTree());

            RESPONSE_END64=(Token)match(input,RESPONSE_END,FOLLOW_RESPONSE_END_in_response280); 
            RESPONSE_END64_tree = 
            (Object)adaptor.create(RESPONSE_END64)
            ;
            adaptor.addChild(root_0, RESPONSE_END64_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "response"


    public static class request_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "request"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:48:1: request : REQUEST_HEADER 'request' '(' op ',' text ')' REQUEST_END ;
    public final RepositoryManagerParser.request_return request() throws RecognitionException {
        RepositoryManagerParser.request_return retval = new RepositoryManagerParser.request_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REQUEST_HEADER65=null;
        Token string_literal66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token REQUEST_END72=null;
        RepositoryManagerParser.op_return op68 =null;

        RepositoryManagerParser.text_return text70 =null;


        Object REQUEST_HEADER65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object REQUEST_END72_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:49:2: ( REQUEST_HEADER 'request' '(' op ',' text ')' REQUEST_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:49:4: REQUEST_HEADER 'request' '(' op ',' text ')' REQUEST_END
            {
            root_0 = (Object)adaptor.nil();


            REQUEST_HEADER65=(Token)match(input,REQUEST_HEADER,FOLLOW_REQUEST_HEADER_in_request293); 
            REQUEST_HEADER65_tree = 
            (Object)adaptor.create(REQUEST_HEADER65)
            ;
            adaptor.addChild(root_0, REQUEST_HEADER65_tree);


            string_literal66=(Token)match(input,33,FOLLOW_33_in_request295); 
            string_literal66_tree = 
            (Object)adaptor.create(string_literal66)
            ;
            adaptor.addChild(root_0, string_literal66_tree);


            char_literal67=(Token)match(input,27,FOLLOW_27_in_request297); 
            char_literal67_tree = 
            (Object)adaptor.create(char_literal67)
            ;
            adaptor.addChild(root_0, char_literal67_tree);


            pushFollow(FOLLOW_op_in_request299);
            op68=op();

            state._fsp--;

            adaptor.addChild(root_0, op68.getTree());

            char_literal69=(Token)match(input,29,FOLLOW_29_in_request301); 
            char_literal69_tree = 
            (Object)adaptor.create(char_literal69)
            ;
            adaptor.addChild(root_0, char_literal69_tree);


            pushFollow(FOLLOW_text_in_request303);
            text70=text();

            state._fsp--;

            adaptor.addChild(root_0, text70.getTree());

            char_literal71=(Token)match(input,28,FOLLOW_28_in_request305); 
            char_literal71_tree = 
            (Object)adaptor.create(char_literal71)
            ;
            adaptor.addChild(root_0, char_literal71_tree);


            REQUEST_END72=(Token)match(input,REQUEST_END,FOLLOW_REQUEST_END_in_request307); 
            REQUEST_END72_tree = 
            (Object)adaptor.create(REQUEST_END72)
            ;
            adaptor.addChild(root_0, REQUEST_END72_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "request"


    public static class op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:51:1: op : text ;
    public final RepositoryManagerParser.op_return op() throws RecognitionException {
        RepositoryManagerParser.op_return retval = new RepositoryManagerParser.op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RepositoryManagerParser.text_return text73 =null;



        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:52:5: ( text )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:52:7: text
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_text_in_op322);
            text73=text();

            state._fsp--;

            adaptor.addChild(root_0, text73.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op"


    public static class reply_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reply"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:54:1: reply : REPLY_HEADER result REPLY_END ;
    public final RepositoryManagerParser.reply_return reply() throws RecognitionException {
        RepositoryManagerParser.reply_return retval = new RepositoryManagerParser.reply_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REPLY_HEADER74=null;
        Token REPLY_END76=null;
        RepositoryManagerParser.result_return result75 =null;


        Object REPLY_HEADER74_tree=null;
        Object REPLY_END76_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:55:5: ( REPLY_HEADER result REPLY_END )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:55:7: REPLY_HEADER result REPLY_END
            {
            root_0 = (Object)adaptor.nil();


            REPLY_HEADER74=(Token)match(input,REPLY_HEADER,FOLLOW_REPLY_HEADER_in_reply338); 
            REPLY_HEADER74_tree = 
            (Object)adaptor.create(REPLY_HEADER74)
            ;
            adaptor.addChild(root_0, REPLY_HEADER74_tree);


            pushFollow(FOLLOW_result_in_reply340);
            result75=result();

            state._fsp--;

            adaptor.addChild(root_0, result75.getTree());

            REPLY_END76=(Token)match(input,REPLY_END,FOLLOW_REPLY_END_in_reply342); 
            REPLY_END76_tree = 
            (Object)adaptor.create(REPLY_END76)
            ;
            adaptor.addChild(root_0, REPLY_END76_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "reply"


    public static class result_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "result"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:57:1: result : text ;
    public final RepositoryManagerParser.result_return result() throws RecognitionException {
        RepositoryManagerParser.result_return retval = new RepositoryManagerParser.result_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RepositoryManagerParser.text_return text77 =null;



        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:58:5: ( text )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:58:7: text
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_text_in_result360);
            text77=text();

            state._fsp--;

            adaptor.addChild(root_0, text77.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "result"


    public static class text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "text"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:60:1: text : TEXT ;
    public final RepositoryManagerParser.text_return text() throws RecognitionException {
        RepositoryManagerParser.text_return retval = new RepositoryManagerParser.text_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT78=null;

        Object TEXT78_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:61:2: ( TEXT )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:61:4: TEXT
            {
            root_0 = (Object)adaptor.nil();


            TEXT78=(Token)match(input,TEXT,FOLLOW_TEXT_in_text375); 
            TEXT78_tree = 
            (Object)adaptor.create(TEXT78)
            ;
            adaptor.addChild(root_0, TEXT78_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "text"


    public static class base64_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base64"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:63:1: base64 : ( text )+ ;
    public final RepositoryManagerParser.base64_return base64() throws RecognitionException {
        RepositoryManagerParser.base64_return retval = new RepositoryManagerParser.base64_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RepositoryManagerParser.text_return text79 =null;



        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:64:2: ( ( text )+ )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:64:4: ( text )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:64:4: ( text )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TEXT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:64:4: text
            	    {
            	    pushFollow(FOLLOW_text_in_base64385);
            	    text79=text();

            	    state._fsp--;

            	    adaptor.addChild(root_0, text79.getTree());

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


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base64"


    public static class num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num"
    // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:66:1: num : NUM ;
    public final RepositoryManagerParser.num_return num() throws RecognitionException {
        RepositoryManagerParser.num_return retval = new RepositoryManagerParser.num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM80=null;

        Object NUM80_tree=null;

        try {
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:67:2: ( NUM )
            // C:\\Users\\Brian\\workspace751\\Project 5\\src\\RepositoryManager.g:67:4: NUM
            {
            root_0 = (Object)adaptor.nil();


            NUM80=(Token)match(input,NUM,FOLLOW_NUM_in_num396); 
            NUM80_tree = 
            (Object)adaptor.create(NUM80)
            ;
            adaptor.addChild(root_0, NUM80_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\24\uffff";
    static final String DFA4_eofS =
        "\24\uffff";
    static final String DFA4_minS =
        "\1\27\2\33\2\27\1\34\1\35\1\27\1\36\1\27\1\34\2\uffff\1\33\1\27"+
        "\1\34\1\27\2\34\1\36";
    static final String DFA4_maxS =
        "\1\42\2\33\2\27\2\35\1\27\1\37\1\27\1\35\2\uffff\1\33\1\27\1\35"+
        "\1\27\1\34\1\35\1\37";
    static final String DFA4_acceptS =
        "\13\uffff\1\1\1\2\7\uffff";
    static final String DFA4_specialS =
        "\24\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\1\7",
            "\1\11",
            "\1\12",
            "\1\13\1\14",
            "\1\15",
            "\1\10\1\7",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\21\1\20",
            "\1\22",
            "\1\23",
            "\1\21\1\20",
            "\1\13\1\14"
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
            return "29:1: clause : ( literal '.' | literal ':-' literal ( ',' literal )* '.' );";
        }
    }
 

    public static final BitSet FOLLOW_CREDENTIAL_HEADER_in_credential37 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_public_key_in_credential39 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_certificate_in_credential41 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_CREDENTIAL_END_in_credential44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_KEY_HEADER_in_public_key64 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_base64_in_public_key66 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_PUBLIC_KEY_END_in_public_key68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNATURE_HEADER_in_signature78 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_base64_in_signature80 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SIGNATURE_END_in_signature82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDITY_HEADER_in_validity92 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NOT_BEFORE_in_validity94 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_time_tuple_in_validity96 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NOT_AFTER_in_validity98 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_time_tuple_in_validity100 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_VALIDITY_END_in_validity102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_time_tuple112 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_time_tuple114 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_num_in_time_tuple116 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_time_tuple118 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_num_in_time_tuple120 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_time_tuple122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_num_in_time_tuple124 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_time_tuple126 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_num_in_time_tuple128 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_time_tuple130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_num_in_time_tuple132 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_time_tuple134 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_num_in_time_tuple136 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_time_tuple138 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_time_tuple141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CERT_HEADER_in_certificate151 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_clause_in_certificate153 = new BitSet(new long[]{0x0000000402800000L});
    public static final BitSet FOLLOW_validity_in_certificate156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_public_key_in_certificate158 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_signature_in_certificate160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CERT_END_in_certificate162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_clause172 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_clause174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_clause179 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_clause181 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_literal_in_clause183 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_clause190 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_literal_in_clause192 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_clause196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_literal206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_literal211 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_literal213 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_text_in_literal215 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_literal217 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_predicate_in_literal219 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_literal221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_predicate231 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_predicate234 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_text_in_predicate236 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_predicate242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_text_in_predicate243 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_predicate247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHALLENGE_HEADER_in_challenge257 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_text_in_challenge259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHALLENGE_END_in_challenge261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESPONSE_HEADER_in_response276 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_base64_in_response278 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RESPONSE_END_in_response280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUEST_HEADER_in_request293 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_request295 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_request297 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_op_in_request299 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_request301 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_text_in_request303 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_request305 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_REQUEST_END_in_request307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_op322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPLY_HEADER_in_reply338 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_result_in_reply340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_REPLY_END_in_reply342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_result360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_text375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_base64385 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NUM_in_num396 = new BitSet(new long[]{0x0000000000000002L});

}