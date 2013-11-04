// $ANTLR 3.4 C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g 2013-11-04 01:42:39

    package config.io;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ConfigGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "BLOCK", "COMMENT", "COMMENTT", "CONFIG", "EMPTYBLOCK", "STRING", "WS", "'='", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ConfigGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ConfigGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
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
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:8: ( ( ( configField )* -> ^( CONFIG ( configField )* ) ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:11: ( configField )*
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:11: ( configField )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMENTT||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:11: configField
            	    {
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
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:30: ^( CONFIG ( configField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONFIG, "CONFIG")
                , root_1);

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:39: ( configField )*
                while ( stream_configField.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "config"


    public static class configField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "configField"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:25:1: configField : ( comment -> comment | block -> block );
    public final ConfigGrammarParser.configField_return configField() throws RecognitionException {
        ConfigGrammarParser.configField_return retval = new ConfigGrammarParser.configField_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.comment_return comment2 =null;

        ConfigGrammarParser.block_return block3 =null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:2: ( comment -> comment | block -> block )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==COMMENTT) ) {
                alt2=1;
            }
            else if ( (LA2_0==STRING) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_configField88);
                    comment2=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comment.add(comment2.getTree());

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
                    // 26:16: -> comment
                    {
                        adaptor.addChild(root_0, stream_comment.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:27:4: block
                    {
                    pushFollow(FOLLOW_block_in_configField101);
                    block3=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block3.getTree());

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
                    // 27:14: -> block
                    {
                        adaptor.addChild(root_0, stream_block.nextTree());

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
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_blockField=new RewriteRuleSubtreeStream(adaptor,"rule blockField");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:7: (b1= STRING '{' ( blockField )* '}' -> ^( BLOCK $b1 ( blockField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:9: b1= STRING '{' ( blockField )* '}'
            {
            b1=(Token)match(input,STRING,FOLLOW_STRING_in_block121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(b1);


            char_literal4=(Token)match(input,13,FOLLOW_13_in_block123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_13.add(char_literal4);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:23: ( blockField )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMENTT||LA3_0==STRING||LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:23: blockField
            	    {
            	    pushFollow(FOLLOW_blockField_in_block125);
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


            char_literal6=(Token)match(input,14,FOLLOW_14_in_block128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_14.add(char_literal6);


            // AST REWRITE
            // elements: blockField, b1
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
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:43: ^( BLOCK $b1 ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_b1.nextNode());

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:55: ( blockField )*
                while ( stream_blockField.hasNext() ) {
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
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_blockField=new RewriteRuleSubtreeStream(adaptor,"rule blockField");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:2: ( '{' ( blockField )* '}' -> ^( EMPTYBLOCK ( blockField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:4: '{' ( blockField )* '}'
            {
            char_literal7=(Token)match(input,13,FOLLOW_13_in_emptyBlock154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_13.add(char_literal7);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:8: ( blockField )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMENTT||LA4_0==STRING||LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:8: blockField
            	    {
            	    pushFollow(FOLLOW_blockField_in_emptyBlock156);
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


            char_literal9=(Token)match(input,14,FOLLOW_14_in_emptyBlock159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_14.add(char_literal9);


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
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:30: ^( EMPTYBLOCK ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EMPTYBLOCK, "EMPTYBLOCK")
                , root_1);

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:34:43: ( blockField )*
                while ( stream_blockField.hasNext() ) {
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
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:2: ( ( '{' )=> emptyBlock | block | comment | assignment -> ^( ASSIGNMENT assignment ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) && (synpred1_ConfigGrammar())) {
                alt5=1;
            }
            else if ( (LA5_0==STRING) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==13) ) {
                    alt5=2;
                }
                else if ( (LA5_2==12) ) {
                    alt5=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==COMMENTT) ) {
                alt5=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:4: ( '{' )=> emptyBlock
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_emptyBlock_in_blockField189);
                    emptyBlock10=emptyBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyBlock10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:39:4: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_blockField194);
                    block11=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block11.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:4: comment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_comment_in_blockField199);
                    comment12=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment12.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:41:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_blockField210);
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
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:41:21: ^( ASSIGNMENT assignment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                        , root_1);

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
        return retval;
    }
    // $ANTLR end "blockField"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:44:1: assignment : (a1= STRING '=' a2= STRING -> $a1 $a2) ;
    public final ConfigGrammarParser.assignment_return assignment() throws RecognitionException {
        ConfigGrammarParser.assignment_return retval = new ConfigGrammarParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a1=null;
        Token a2=null;
        Token char_literal14=null;

        Object a1_tree=null;
        Object a2_tree=null;
        Object char_literal14_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:2: ( (a1= STRING '=' a2= STRING -> $a1 $a2) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:4: (a1= STRING '=' a2= STRING -> $a1 $a2)
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:4: (a1= STRING '=' a2= STRING -> $a1 $a2)
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:5: a1= STRING '=' a2= STRING
            {
            a1=(Token)match(input,STRING,FOLLOW_STRING_in_assignment236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(a1);


            char_literal14=(Token)match(input,12,FOLLOW_12_in_assignment238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_12.add(char_literal14);


            a2=(Token)match(input,STRING,FOLLOW_STRING_in_assignment242); if (state.failed) return retval; 
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
                adaptor.addChild(root_0, stream_a1.nextNode());

                adaptor.addChild(root_0, stream_a2.nextNode());

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
        return retval;
    }
    // $ANTLR end "assignment"


    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comment"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:1: comment : COMMENTT -> ^( COMMENT COMMENTT ) ;
    public final ConfigGrammarParser.comment_return comment() throws RecognitionException {
        ConfigGrammarParser.comment_return retval = new ConfigGrammarParser.comment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMENTT15=null;

        Object COMMENTT15_tree=null;
        RewriteRuleTokenStream stream_COMMENTT=new RewriteRuleTokenStream(adaptor,"token COMMENTT");

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:9: ( COMMENTT -> ^( COMMENT COMMENTT ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:11: COMMENTT
            {
            COMMENTT15=(Token)match(input,COMMENTT,FOLLOW_COMMENTT_in_comment265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMENTT.add(COMMENTT15);


            // AST REWRITE
            // elements: COMMENTT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:24: -> ^( COMMENT COMMENTT )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:27: ^( COMMENT COMMENTT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMMENT, "COMMENT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_COMMENTT.nextNode()
                );

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
        return retval;
    }
    // $ANTLR end "comment"

    // $ANTLR start synpred1_ConfigGrammar
    public final void synpred1_ConfigGrammar_fragment() throws RecognitionException {
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:4: ( '{' )
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:38:5: '{'
        {
        match(input,13,FOLLOW_13_in_synpred1_ConfigGrammar184); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_ConfigGrammar

    // Delegated rules

    public final boolean synpred1_ConfigGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ConfigGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_configField_in_config62 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_comment_in_configField88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_configField101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_block121 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_block123 = new BitSet(new long[]{0x0000000000006480L});
    public static final BitSet FOLLOW_blockField_in_block125 = new BitSet(new long[]{0x0000000000006480L});
    public static final BitSet FOLLOW_14_in_block128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_emptyBlock154 = new BitSet(new long[]{0x0000000000006480L});
    public static final BitSet FOLLOW_blockField_in_emptyBlock156 = new BitSet(new long[]{0x0000000000006480L});
    public static final BitSet FOLLOW_14_in_emptyBlock159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyBlock_in_blockField189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_blockField194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_blockField199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockField210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_assignment236 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assignment238 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_assignment242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENTT_in_comment265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred1_ConfigGrammar184 = new BitSet(new long[]{0x0000000000000002L});

}