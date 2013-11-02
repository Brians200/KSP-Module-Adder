// $ANTLR 3.4 C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g 2013-11-02 02:38:21

    package config.io;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ConfigGrammarParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "BLOCK", "COMMENT", "CONFIG", "EMPTYBLOCK", "LETTER", "NUMBER", "STRING", "SYMBOL", "WS", "'/'", "'//'", "'='", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "blockField", "config", "commentContent", "configField", 
    "emptyBlock", "block", "comment", "synpred1_ConfigGrammar", "assignment"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public ConfigGrammarParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public ConfigGrammarParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public ConfigGrammarParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return ConfigGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g"; }


    public static class config_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "config"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:1: config : ( ( configField )* -> ^( CONFIG ( configField )* ) ) ;
    public final ConfigGrammarParser.config_return config() throws RecognitionException {
        ConfigGrammarParser.config_return retval = new ConfigGrammarParser.config_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.configField_return configField1 =null;


        RewriteRuleSubtreeStream stream_configField=new RewriteRuleSubtreeStream(adaptor,"rule configField");
        try { dbg.enterRule(getGrammarFileName(), "config");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:8: ( ( ( configField )* -> ^( CONFIG ( configField )* ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            {
            dbg.location(22,10);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:11: ( configField )*
            {
            dbg.location(22,11);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:11: ( configField )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING||LA1_0==15) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:11: configField
            	    {
            	    dbg.location(22,11);
            	    pushFollow(FOLLOW_configField_in_config62);
            	    configField1=configField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_configField.add(configField1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: configField
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:27: -> ^( CONFIG ( configField )* )
            {
                dbg.location(22,30);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:30: ^( CONFIG ( configField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,32);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONFIG, "CONFIG")
                , root_1);

                dbg.location(22,39);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:39: ( configField )*
                while ( stream_configField.hasNext() ) {
                    dbg.location(22,39);
                    adaptor.addChild(root_1, stream_configField.nextTree());

                }
                stream_configField.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(23, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "config");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "config"


    public static class configField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configField"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:25:1: configField : ( block -> block | comment -> comment );
    public final ConfigGrammarParser.configField_return configField() throws RecognitionException {
        ConfigGrammarParser.configField_return retval = new ConfigGrammarParser.configField_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.block_return block2 =null;

        ConfigGrammarParser.comment_return comment3 =null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
        try { dbg.enterRule(getGrammarFileName(), "configField");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:2: ( block -> block | comment -> comment )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:4: block
                    {
                    dbg.location(26,4);
                    pushFollow(FOLLOW_block_in_configField88);
                    block2=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block2.getTree());

                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 26:14: -> block
                    {
                        dbg.location(26,17);
                        adaptor.addChild(root_0, stream_block.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:27:4: comment
                    {
                    dbg.location(27,4);
                    pushFollow(FOLLOW_comment_in_configField101);
                    comment3=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comment.add(comment3.getTree());

                    // AST REWRITE
                    // elements: comment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:16: -> comment
                    {
                        dbg.location(27,19);
                        adaptor.addChild(root_0, stream_comment.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(28, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "configField");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "configField"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:1: block : b1= STRING '{' ( blockField )* '}' -> ^( BLOCK $b1 ( blockField )* ) ;
    public final ConfigGrammarParser.block_return block() throws RecognitionException {
        ConfigGrammarParser.block_return retval = new ConfigGrammarParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token b1=null;
        Token char_literal4=null;
        Token char_literal6=null;
        ConfigGrammarParser.blockField_return blockField5 =null;


        Object b1_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_blockField=new RewriteRuleSubtreeStream(adaptor,"rule blockField");
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:7: (b1= STRING '{' ( blockField )* '}' -> ^( BLOCK $b1 ( blockField )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:9: b1= STRING '{' ( blockField )* '}'
            {
            dbg.location(30,11);
            b1=(Token)match(input,STRING,FOLLOW_STRING_in_block122); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(b1);

            dbg.location(30,19);
            char_literal4=(Token)match(input,17,FOLLOW_17_in_block124); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_17.add(char_literal4);

            dbg.location(30,23);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:23: ( blockField )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==STRING||LA3_0==15||LA3_0==17) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:23: blockField
            	    {
            	    dbg.location(30,23);
            	    pushFollow(FOLLOW_blockField_in_block126);
            	    blockField5=blockField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockField.add(blockField5.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(30,35);
            char_literal6=(Token)match(input,18,FOLLOW_18_in_block129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal6);


            // AST REWRITE
            // elements: b1, blockField
            // token labels: b1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_b1=new RewriteRuleTokenStream(adaptor,"token b1",b1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:40: -> ^( BLOCK $b1 ( blockField )* )
            {
                dbg.location(30,43);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:43: ^( BLOCK $b1 ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(30,45);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                dbg.location(30,52);
                adaptor.addChild(root_1, stream_b1.nextNode());
                dbg.location(30,55);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:55: ( blockField )*
                while ( stream_blockField.hasNext() ) {
                    dbg.location(30,55);
                    adaptor.addChild(root_1, stream_blockField.nextTree());

                }
                stream_blockField.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(31, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"


    public static class emptyBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "emptyBlock"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:33:1: emptyBlock : '{' ( blockField )* '}' -> ^( EMPTYBLOCK ( blockField )* ) ;
    public final ConfigGrammarParser.emptyBlock_return emptyBlock() throws RecognitionException {
        ConfigGrammarParser.emptyBlock_return retval = new ConfigGrammarParser.emptyBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal7=null;
        Token char_literal9=null;
        ConfigGrammarParser.blockField_return blockField8 =null;


        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_blockField=new RewriteRuleSubtreeStream(adaptor,"rule blockField");
        try { dbg.enterRule(getGrammarFileName(), "emptyBlock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:2: ( '{' ( blockField )* '}' -> ^( EMPTYBLOCK ( blockField )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:4: '{' ( blockField )* '}'
            {
            dbg.location(34,4);
            char_literal7=(Token)match(input,17,FOLLOW_17_in_emptyBlock155); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_17.add(char_literal7);

            dbg.location(34,8);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:8: ( blockField )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==STRING||LA4_0==15||LA4_0==17) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:8: blockField
            	    {
            	    dbg.location(34,8);
            	    pushFollow(FOLLOW_blockField_in_emptyBlock157);
            	    blockField8=blockField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockField.add(blockField8.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(34,20);
            char_literal9=(Token)match(input,18,FOLLOW_18_in_emptyBlock160); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(char_literal9);


            // AST REWRITE
            // elements: blockField
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:27: -> ^( EMPTYBLOCK ( blockField )* )
            {
                dbg.location(34,30);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:30: ^( EMPTYBLOCK ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(34,32);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EMPTYBLOCK, "EMPTYBLOCK")
                , root_1);

                dbg.location(34,43);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:43: ( blockField )*
                while ( stream_blockField.hasNext() ) {
                    dbg.location(34,43);
                    adaptor.addChild(root_1, stream_blockField.nextTree());

                }
                stream_blockField.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(35, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "emptyBlock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "emptyBlock"


    public static class blockField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockField"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:37:1: blockField : ( ( '{' )=> emptyBlock | block | comment | assignment -> ^( ASSIGNMENT assignment ) );
    public final ConfigGrammarParser.blockField_return blockField() throws RecognitionException {
        ConfigGrammarParser.blockField_return retval = new ConfigGrammarParser.blockField_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.emptyBlock_return emptyBlock10 =null;

        ConfigGrammarParser.block_return block11 =null;

        ConfigGrammarParser.comment_return comment12 =null;

        ConfigGrammarParser.assignment_return assignment13 =null;


        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try { dbg.enterRule(getGrammarFileName(), "blockField");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:2: ( ( '{' )=> emptyBlock | block | comment | assignment -> ^( ASSIGNMENT assignment ) )
            int alt5=4;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) && (synpred1_ConfigGrammar())) {
                alt5=1;
            }
            else if ( (LA5_0==STRING) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==17) ) {
                    alt5=2;
                }
                else if ( (LA5_2==16) ) {
                    alt5=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA5_0==15) ) {
                alt5=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:4: ( '{' )=> emptyBlock
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(38,13);
                    pushFollow(FOLLOW_emptyBlock_in_blockField190);
                    emptyBlock10=emptyBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyBlock10.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:39:4: block
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(39,4);
                    pushFollow(FOLLOW_block_in_blockField195);
                    block11=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block11.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:4: comment
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(40,4);
                    pushFollow(FOLLOW_comment_in_blockField200);
                    comment12=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment12.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:41:4: assignment
                    {
                    dbg.location(41,4);
                    pushFollow(FOLLOW_assignment_in_blockField211);
                    assignment13=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment.add(assignment13.getTree());

                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:18: -> ^( ASSIGNMENT assignment )
                    {
                        dbg.location(41,21);
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:41:21: ^( ASSIGNMENT assignment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(41,23);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                        , root_1);

                        dbg.location(41,34);
                        adaptor.addChild(root_1, stream_assignment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(42, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockField");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blockField"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:44:1: assignment : (a1= STRING '=' a2= STRING -> $a1 $a2) ( '/' a3= STRING -> $assignment '/' $a3)* ;
    public final ConfigGrammarParser.assignment_return assignment() throws RecognitionException {
        ConfigGrammarParser.assignment_return retval = new ConfigGrammarParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token char_literal14=null;
        Token char_literal15=null;

        Object a1_tree=null;
        Object a2_tree=null;
        Object a3_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:2: ( (a1= STRING '=' a2= STRING -> $a1 $a2) ( '/' a3= STRING -> $assignment '/' $a3)* )
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:4: (a1= STRING '=' a2= STRING -> $a1 $a2) ( '/' a3= STRING -> $assignment '/' $a3)*
            {
            dbg.location(45,4);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:4: (a1= STRING '=' a2= STRING -> $a1 $a2)
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:5: a1= STRING '=' a2= STRING
            {
            dbg.location(45,7);
            a1=(Token)match(input,STRING,FOLLOW_STRING_in_assignment237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(a1);

            dbg.location(45,15);
            char_literal14=(Token)match(input,16,FOLLOW_16_in_assignment239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_16.add(char_literal14);

            dbg.location(45,21);
            a2=(Token)match(input,STRING,FOLLOW_STRING_in_assignment243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(a2);


            // AST REWRITE
            // elements: a2, a1
            // token labels: a1, a2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_a1=new RewriteRuleTokenStream(adaptor,"token a1",a1);
            RewriteRuleTokenStream stream_a2=new RewriteRuleTokenStream(adaptor,"token a2",a2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:30: -> $a1 $a2
            {
                dbg.location(45,34);
                adaptor.addChild(root_0, stream_a1.nextNode());
                dbg.location(45,38);
                adaptor.addChild(root_0, stream_a2.nextNode());

            }


            retval.tree = root_0;
            }

            }

            dbg.location(45,43);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:43: ( '/' a3= STRING -> $assignment '/' $a3)*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:44: '/' a3= STRING
            	    {
            	    dbg.location(45,44);
            	    char_literal15=(Token)match(input,14,FOLLOW_14_in_assignment257); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_14.add(char_literal15);

            	    dbg.location(45,50);
            	    a3=(Token)match(input,STRING,FOLLOW_STRING_in_assignment261); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_STRING.add(a3);


            	    // AST REWRITE
            	    // elements: a3, assignment, 14
            	    // token labels: a3
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_a3=new RewriteRuleTokenStream(adaptor,"token a3",a3);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 45:58: -> $assignment '/' $a3
            	    {
            	        dbg.location(45,62);
            	        adaptor.addChild(root_0, stream_retval.nextTree());
            	        dbg.location(45,73);
            	        adaptor.addChild(root_0, 
            	        stream_14.nextNode()
            	        );
            	        dbg.location(45,78);
            	        adaptor.addChild(root_0, stream_a3.nextNode());

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(46, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignment"


    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comment"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:1: comment : ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) ) ;
    public final ConfigGrammarParser.comment_return comment() throws RecognitionException {
        ConfigGrammarParser.comment_return retval = new ConfigGrammarParser.comment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal16=null;
        ConfigGrammarParser.commentContent_return commentContent17 =null;


        Object string_literal16_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_commentContent=new RewriteRuleSubtreeStream(adaptor,"rule commentContent");
        try { dbg.enterRule(getGrammarFileName(), "comment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:9: ( ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:11: ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) )
            {
            dbg.location(48,11);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:11: ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:12: '//' ( commentContent )?
            {
            dbg.location(48,12);
            string_literal16=(Token)match(input,15,FOLLOW_15_in_comment287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_15.add(string_literal16);

            dbg.location(48,17);
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:17: ( commentContent )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt7=1;
                    }
                    break;
                case 14:
                case 18:
                    {
                    alt7=1;
                    }
                    break;
                case STRING:
                    {
                    alt7=1;
                    }
                    break;
            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:17: commentContent
                    {
                    dbg.location(48,17);
                    pushFollow(FOLLOW_commentContent_in_comment289);
                    commentContent17=commentContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commentContent.add(commentContent17.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            // AST REWRITE
            // elements: commentContent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:37: -> ^( COMMENT ( commentContent )? )
            {
                dbg.location(48,40);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:40: ^( COMMENT ( commentContent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(48,42);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMMENT, "COMMENT")
                , root_1);

                dbg.location(48,50);
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:50: ( commentContent )?
                if ( stream_commentContent.hasNext() ) {
                    dbg.location(48,50);
                    adaptor.addChild(root_1, stream_commentContent.nextTree());

                }
                stream_commentContent.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comment"


    public static class commentContent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commentContent"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:51:1: commentContent : ( '{' -> '{' | '}' -> '}' | (c1= STRING -> $c1) ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)* | ( '/' c1= STRING -> '/' $c1) ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)* );
    public final ConfigGrammarParser.commentContent_return commentContent() throws RecognitionException {
        ConfigGrammarParser.commentContent_return retval = new ConfigGrammarParser.commentContent_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c1=null;
        Token c2=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token char_literal24=null;

        Object c1_tree=null;
        Object c2_tree=null;
        Object char_literal18_tree=null;
        Object char_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal23_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try { dbg.enterRule(getGrammarFileName(), "commentContent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:52:2: ( '{' -> '{' | '}' -> '}' | (c1= STRING -> $c1) ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)* | ( '/' c1= STRING -> '/' $c1) ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)* )
            int alt12=4;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case STRING:
                {
                alt12=3;
                }
                break;
            case 14:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:52:4: '{'
                    {
                    dbg.location(52,4);
                    char_literal18=(Token)match(input,17,FOLLOW_17_in_commentContent320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_17.add(char_literal18);


                    // AST REWRITE
                    // elements: 17
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:15: -> '{'
                    {
                        dbg.location(52,19);
                        adaptor.addChild(root_0, 
                        stream_17.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:53:4: '}'
                    {
                    dbg.location(53,4);
                    char_literal19=(Token)match(input,18,FOLLOW_18_in_commentContent338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_18.add(char_literal19);


                    // AST REWRITE
                    // elements: 18
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:15: -> '}'
                    {
                        dbg.location(53,19);
                        adaptor.addChild(root_0, 
                        stream_18.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:4: (c1= STRING -> $c1) ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)*
                    {
                    dbg.location(54,4);
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:4: (c1= STRING -> $c1)
                    dbg.enterAlt(1);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:5: c1= STRING
                    {
                    dbg.location(54,7);
                    c1=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(c1);


                    // AST REWRITE
                    // elements: c1
                    // token labels: c1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:15: -> $c1
                    {
                        dbg.location(54,19);
                        adaptor.addChild(root_0, stream_c1.nextNode());

                    }


                    retval.tree = root_0;
                    }

                    }

                    dbg.location(54,24);
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:24: ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)*
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14||LA9_0==16) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:25: ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING
                    	    {
                    	    dbg.location(54,25);
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:25: ( '/' -> $commentContent '/' | '=' -> $commentContent '=' )
                    	    int alt8=2;
                    	    try { dbg.enterSubRule(8);
                    	    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==14) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==16) ) {
                    	        alt8=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 8, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;

                    	    }
                    	    } finally {dbg.exitDecision(8);}

                    	    switch (alt8) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:26: '/'
                    	            {
                    	            dbg.location(54,26);
                    	            char_literal20=(Token)match(input,14,FOLLOW_14_in_commentContent370); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_14.add(char_literal20);


                    	            // AST REWRITE
                    	            // elements: 14, commentContent
                    	            // token labels: 
                    	            // rule labels: retval
                    	            // token list labels: 
                    	            // rule list labels: 
                    	            // wildcard labels: 
                    	            if ( state.backtracking==0 ) {

                    	            retval.tree = root_0;
                    	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	            root_0 = (Object)adaptor.nil();
                    	            // 54:30: -> $commentContent '/'
                    	            {
                    	                dbg.location(54,34);
                    	                adaptor.addChild(root_0, stream_retval.nextTree());
                    	                dbg.location(54,49);
                    	                adaptor.addChild(root_0, 
                    	                stream_14.nextNode()
                    	                );

                    	            }


                    	            retval.tree = root_0;
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:54:55: '='
                    	            {
                    	            dbg.location(54,55);
                    	            char_literal21=(Token)match(input,16,FOLLOW_16_in_commentContent381); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_16.add(char_literal21);


                    	            // AST REWRITE
                    	            // elements: 16, commentContent
                    	            // token labels: 
                    	            // rule labels: retval
                    	            // token list labels: 
                    	            // rule list labels: 
                    	            // wildcard labels: 
                    	            if ( state.backtracking==0 ) {

                    	            retval.tree = root_0;
                    	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	            root_0 = (Object)adaptor.nil();
                    	            // 54:59: -> $commentContent '='
                    	            {
                    	                dbg.location(54,63);
                    	                adaptor.addChild(root_0, stream_retval.nextTree());
                    	                dbg.location(54,78);
                    	                adaptor.addChild(root_0, 
                    	                stream_16.nextNode()
                    	                );

                    	            }


                    	            retval.tree = root_0;
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(8);}

                    	    dbg.location(54,85);
                    	    c2=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent393); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_STRING.add(c2);


                    	    // AST REWRITE
                    	    // elements: c2, commentContent
                    	    // token labels: c2
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 54:94: -> $commentContent $c2
                    	    {
                    	        dbg.location(54,98);
                    	        adaptor.addChild(root_0, stream_retval.nextTree());
                    	        dbg.location(54,114);
                    	        adaptor.addChild(root_0, stream_c2.nextNode());

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(9);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:4: ( '/' c1= STRING -> '/' $c1) ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)*
                    {
                    dbg.location(55,4);
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:4: ( '/' c1= STRING -> '/' $c1)
                    dbg.enterAlt(1);

                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:5: '/' c1= STRING
                    {
                    dbg.location(55,5);
                    char_literal22=(Token)match(input,14,FOLLOW_14_in_commentContent410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_14.add(char_literal22);

                    dbg.location(55,11);
                    c1=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(c1);


                    // AST REWRITE
                    // elements: 14, c1
                    // token labels: c1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:19: -> '/' $c1
                    {
                        dbg.location(55,22);
                        adaptor.addChild(root_0, 
                        stream_14.nextNode()
                        );
                        dbg.location(55,27);
                        adaptor.addChild(root_0, stream_c1.nextNode());

                    }


                    retval.tree = root_0;
                    }

                    }

                    dbg.location(55,33);
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:33: ( ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING -> $commentContent $c2)*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14||LA11_0==16) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:34: ( '/' -> $commentContent '/' | '=' -> $commentContent '=' ) c2= STRING
                    	    {
                    	    dbg.location(55,34);
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:34: ( '/' -> $commentContent '/' | '=' -> $commentContent '=' )
                    	    int alt10=2;
                    	    try { dbg.enterSubRule(10);
                    	    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==14) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( (LA10_0==16) ) {
                    	        alt10=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 10, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;

                    	    }
                    	    } finally {dbg.exitDecision(10);}

                    	    switch (alt10) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:35: '/'
                    	            {
                    	            dbg.location(55,35);
                    	            char_literal23=(Token)match(input,14,FOLLOW_14_in_commentContent428); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_14.add(char_literal23);


                    	            // AST REWRITE
                    	            // elements: commentContent, 14
                    	            // token labels: 
                    	            // rule labels: retval
                    	            // token list labels: 
                    	            // rule list labels: 
                    	            // wildcard labels: 
                    	            if ( state.backtracking==0 ) {

                    	            retval.tree = root_0;
                    	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	            root_0 = (Object)adaptor.nil();
                    	            // 55:39: -> $commentContent '/'
                    	            {
                    	                dbg.location(55,43);
                    	                adaptor.addChild(root_0, stream_retval.nextTree());
                    	                dbg.location(55,58);
                    	                adaptor.addChild(root_0, 
                    	                stream_14.nextNode()
                    	                );

                    	            }


                    	            retval.tree = root_0;
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:64: '='
                    	            {
                    	            dbg.location(55,64);
                    	            char_literal24=(Token)match(input,16,FOLLOW_16_in_commentContent439); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_16.add(char_literal24);


                    	            // AST REWRITE
                    	            // elements: 16, commentContent
                    	            // token labels: 
                    	            // rule labels: retval
                    	            // token list labels: 
                    	            // rule list labels: 
                    	            // wildcard labels: 
                    	            if ( state.backtracking==0 ) {

                    	            retval.tree = root_0;
                    	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	            root_0 = (Object)adaptor.nil();
                    	            // 55:68: -> $commentContent '='
                    	            {
                    	                dbg.location(55,72);
                    	                adaptor.addChild(root_0, stream_retval.nextTree());
                    	                dbg.location(55,87);
                    	                adaptor.addChild(root_0, 
                    	                stream_16.nextNode()
                    	                );

                    	            }


                    	            retval.tree = root_0;
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(10);}

                    	    dbg.location(55,94);
                    	    c2=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent451); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_STRING.add(c2);


                    	    // AST REWRITE
                    	    // elements: commentContent, c2
                    	    // token labels: c2
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 55:102: -> $commentContent $c2
                    	    {
                    	        dbg.location(55,106);
                    	        adaptor.addChild(root_0, stream_retval.nextTree());
                    	        dbg.location(55,122);
                    	        adaptor.addChild(root_0, stream_c2.nextNode());

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(11);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(56, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "commentContent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "commentContent"

    // $ANTLR start synpred1_ConfigGrammar
    public final void synpred1_ConfigGrammar_fragment() throws RecognitionException {
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:4: ( '{' )
        dbg.enterAlt(1);

        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:5: '{'
        {
        dbg.location(38,5);
        match(input,17,FOLLOW_17_in_synpred1_ConfigGrammar185); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_ConfigGrammar

    // Delegated rules

    public final boolean synpred1_ConfigGrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_ConfigGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_configField_in_config62 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_block_in_configField88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_configField101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_block122 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_block124 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_blockField_in_block126 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_18_in_block129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_emptyBlock155 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_blockField_in_emptyBlock157 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_18_in_emptyBlock160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyBlock_in_blockField190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_blockField195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_blockField200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockField211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_assignment237 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assignment239 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_assignment243 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_assignment257 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_assignment261 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15_in_comment287 = new BitSet(new long[]{0x0000000000064802L});
    public static final BitSet FOLLOW_commentContent_in_comment289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_commentContent320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_commentContent338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_commentContent359 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_14_in_commentContent370 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16_in_commentContent381 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_commentContent393 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_14_in_commentContent410 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_commentContent414 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_14_in_commentContent428 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16_in_commentContent439 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_commentContent451 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_17_in_synpred1_ConfigGrammar185 = new BitSet(new long[]{0x0000000000000002L});

}