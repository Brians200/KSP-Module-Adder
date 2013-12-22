// $ANTLR 3.4 C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g 2013-12-22 16:30:06

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "BLOCK", "COMMENT", "COMMENTT", "CONFIG", "EMPTYBLOCK", "MMREMOVE", "MMREMOVERULE", "STRING", "WS", "'='", "'{'", "'}'"
    };

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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:1: config : ( ( configField )* -> ^( CONFIG ( configField )* ) ) ;
    public final ConfigGrammarParser.config_return config() throws RecognitionException {
        ConfigGrammarParser.config_return retval = new ConfigGrammarParser.config_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.configField_return configField1 =null;


        RewriteRuleSubtreeStream stream_configField=new RewriteRuleSubtreeStream(adaptor,"rule configField");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:8: ( ( ( configField )* -> ^( CONFIG ( configField )* ) ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:11: ( configField )*
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:11: ( configField )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMENTT||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:11: configField
            	    {
            	    pushFollow(FOLLOW_configField_in_config66);
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
            // 23:27: -> ^( CONFIG ( configField )* )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:30: ^( CONFIG ( configField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONFIG, "CONFIG")
                , root_1);

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:23:39: ( configField )*
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:1: configField : ( comment -> comment | block -> block | assignment -> ^( ASSIGNMENT assignment ) );
    public final ConfigGrammarParser.configField_return configField() throws RecognitionException {
        ConfigGrammarParser.configField_return retval = new ConfigGrammarParser.configField_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.comment_return comment2 =null;

        ConfigGrammarParser.block_return block3 =null;

        ConfigGrammarParser.assignment_return assignment4 =null;


        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:27:2: ( comment -> comment | block -> block | assignment -> ^( ASSIGNMENT assignment ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==COMMENTT) ) {
                alt2=1;
            }
            else if ( (LA2_0==STRING) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==15) ) {
                    alt2=2;
                }
                else if ( (LA2_2==14) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:27:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_configField92);
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
                    // 27:16: -> comment
                    {
                        adaptor.addChild(root_0, stream_comment.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:28:4: block
                    {
                    pushFollow(FOLLOW_block_in_configField105);
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
                    // 28:14: -> block
                    {
                        adaptor.addChild(root_0, stream_block.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:29:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_configField118);
                    assignment4=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment.add(assignment4.getTree());

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
                    // 29:18: -> ^( ASSIGNMENT assignment )
                    {
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:29:21: ^( ASSIGNMENT assignment )
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
    // $ANTLR end "configField"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:1: block : b1= STRING '{' ( blockField )* '}' -> ^( BLOCK $b1 ( blockField )* ) ;
    public final ConfigGrammarParser.block_return block() throws RecognitionException {
        ConfigGrammarParser.block_return retval = new ConfigGrammarParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token b1=null;
        Token char_literal5=null;
        Token char_literal7=null;
        ConfigGrammarParser.blockField_return blockField6 =null;


        Object b1_tree=null;
        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_blockField=new RewriteRuleSubtreeStream(adaptor,"rule blockField");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:7: (b1= STRING '{' ( blockField )* '}' -> ^( BLOCK $b1 ( blockField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:9: b1= STRING '{' ( blockField )* '}'
            {
            b1=(Token)match(input,STRING,FOLLOW_STRING_in_block141); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(b1);


            char_literal5=(Token)match(input,15,FOLLOW_15_in_block143); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_15.add(char_literal5);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:23: ( blockField )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMENTT||LA3_0==MMREMOVE||LA3_0==STRING||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:23: blockField
            	    {
            	    pushFollow(FOLLOW_blockField_in_block145);
            	    blockField6=blockField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockField.add(blockField6.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            char_literal7=(Token)match(input,16,FOLLOW_16_in_block148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_16.add(char_literal7);


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
            // 32:40: -> ^( BLOCK $b1 ( blockField )* )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:43: ^( BLOCK $b1 ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_b1.nextNode());

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:55: ( blockField )*
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:35:1: emptyBlock : '{' ( blockField )* '}' -> ^( EMPTYBLOCK ( blockField )* ) ;
    public final ConfigGrammarParser.emptyBlock_return emptyBlock() throws RecognitionException {
        ConfigGrammarParser.emptyBlock_return retval = new ConfigGrammarParser.emptyBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        ConfigGrammarParser.blockField_return blockField9 =null;


        Object char_literal8_tree=null;
        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_blockField=new RewriteRuleSubtreeStream(adaptor,"rule blockField");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:36:2: ( '{' ( blockField )* '}' -> ^( EMPTYBLOCK ( blockField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:36:4: '{' ( blockField )* '}'
            {
            char_literal8=(Token)match(input,15,FOLLOW_15_in_emptyBlock174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_15.add(char_literal8);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:36:8: ( blockField )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMENTT||LA4_0==MMREMOVE||LA4_0==STRING||LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:36:8: blockField
            	    {
            	    pushFollow(FOLLOW_blockField_in_emptyBlock176);
            	    blockField9=blockField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockField.add(blockField9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            char_literal10=(Token)match(input,16,FOLLOW_16_in_emptyBlock179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_16.add(char_literal10);


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
            // 36:27: -> ^( EMPTYBLOCK ( blockField )* )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:36:30: ^( EMPTYBLOCK ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EMPTYBLOCK, "EMPTYBLOCK")
                , root_1);

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:36:43: ( blockField )*
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:39:1: blockField : ( mmRemoveRule | ( '{' )=> emptyBlock | block | comment | assignment -> ^( ASSIGNMENT assignment ) );
    public final ConfigGrammarParser.blockField_return blockField() throws RecognitionException {
        ConfigGrammarParser.blockField_return retval = new ConfigGrammarParser.blockField_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.mmRemoveRule_return mmRemoveRule11 =null;

        ConfigGrammarParser.emptyBlock_return emptyBlock12 =null;

        ConfigGrammarParser.block_return block13 =null;

        ConfigGrammarParser.comment_return comment14 =null;

        ConfigGrammarParser.assignment_return assignment15 =null;


        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:2: ( mmRemoveRule | ( '{' )=> emptyBlock | block | comment | assignment -> ^( ASSIGNMENT assignment ) )
            int alt5=5;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MMREMOVE) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) && (synpred1_ConfigGrammar())) {
                alt5=2;
            }
            else if ( (LA5_0==STRING) ) {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==15) ) {
                    alt5=3;
                }
                else if ( (LA5_3==14) ) {
                    alt5=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==COMMENTT) ) {
                alt5=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:4: mmRemoveRule
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_mmRemoveRule_in_blockField203);
                    mmRemoveRule11=mmRemoveRule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mmRemoveRule11.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:41:4: ( '{' )=> emptyBlock
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_emptyBlock_in_blockField214);
                    emptyBlock12=emptyBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyBlock12.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:42:4: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_blockField219);
                    block13=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block13.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:43:4: comment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_comment_in_blockField224);
                    comment14=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment14.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:44:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_blockField235);
                    assignment15=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment.add(assignment15.getTree());

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
                    // 44:18: -> ^( ASSIGNMENT assignment )
                    {
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:44:21: ^( ASSIGNMENT assignment )
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


    public static class mmRemoveRule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mmRemoveRule"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:1: mmRemoveRule : MMREMOVE -> ^( MMREMOVERULE MMREMOVE ) ;
    public final ConfigGrammarParser.mmRemoveRule_return mmRemoveRule() throws RecognitionException {
        ConfigGrammarParser.mmRemoveRule_return retval = new ConfigGrammarParser.mmRemoveRule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MMREMOVE16=null;

        Object MMREMOVE16_tree=null;
        RewriteRuleTokenStream stream_MMREMOVE=new RewriteRuleTokenStream(adaptor,"token MMREMOVE");

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:2: ( MMREMOVE -> ^( MMREMOVERULE MMREMOVE ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:4: MMREMOVE
            {
            MMREMOVE16=(Token)match(input,MMREMOVE,FOLLOW_MMREMOVE_in_mmRemoveRule258); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MMREMOVE.add(MMREMOVE16);


            // AST REWRITE
            // elements: MMREMOVE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:16: -> ^( MMREMOVERULE MMREMOVE )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:48:19: ^( MMREMOVERULE MMREMOVE )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MMREMOVERULE, "MMREMOVERULE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_MMREMOVE.nextNode()
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
    // $ANTLR end "mmRemoveRule"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:51:1: assignment : (a1= STRING '=' a2= STRING -> $a1 $a2) ;
    public final ConfigGrammarParser.assignment_return assignment() throws RecognitionException {
        ConfigGrammarParser.assignment_return retval = new ConfigGrammarParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a1=null;
        Token a2=null;
        Token char_literal17=null;

        Object a1_tree=null;
        Object a2_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:52:2: ( (a1= STRING '=' a2= STRING -> $a1 $a2) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:52:4: (a1= STRING '=' a2= STRING -> $a1 $a2)
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:52:4: (a1= STRING '=' a2= STRING -> $a1 $a2)
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:52:5: a1= STRING '=' a2= STRING
            {
            a1=(Token)match(input,STRING,FOLLOW_STRING_in_assignment284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(a1);


            char_literal17=(Token)match(input,14,FOLLOW_14_in_assignment286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_14.add(char_literal17);


            a2=(Token)match(input,STRING,FOLLOW_STRING_in_assignment290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(a2);


            // AST REWRITE
            // elements: a1, a2
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
            // 52:30: -> $a1 $a2
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:1: comment : COMMENTT -> ^( COMMENT COMMENTT ) ;
    public final ConfigGrammarParser.comment_return comment() throws RecognitionException {
        ConfigGrammarParser.comment_return retval = new ConfigGrammarParser.comment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMENTT18=null;

        Object COMMENTT18_tree=null;
        RewriteRuleTokenStream stream_COMMENTT=new RewriteRuleTokenStream(adaptor,"token COMMENTT");

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:9: ( COMMENTT -> ^( COMMENT COMMENTT ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:11: COMMENTT
            {
            COMMENTT18=(Token)match(input,COMMENTT,FOLLOW_COMMENTT_in_comment312); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMENTT.add(COMMENTT18);


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
            // 55:24: -> ^( COMMENT COMMENTT )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:55:27: ^( COMMENT COMMENTT )
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
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:41:4: ( '{' )
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:41:5: '{'
        {
        match(input,15,FOLLOW_15_in_synpred1_ConfigGrammar209); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_configField_in_config66 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_comment_in_configField92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_configField105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_configField118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_block141 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_block143 = new BitSet(new long[]{0x0000000000019480L});
    public static final BitSet FOLLOW_blockField_in_block145 = new BitSet(new long[]{0x0000000000019480L});
    public static final BitSet FOLLOW_16_in_block148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_emptyBlock174 = new BitSet(new long[]{0x0000000000019480L});
    public static final BitSet FOLLOW_blockField_in_emptyBlock176 = new BitSet(new long[]{0x0000000000019480L});
    public static final BitSet FOLLOW_16_in_emptyBlock179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mmRemoveRule_in_blockField203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyBlock_in_blockField214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_blockField219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_blockField224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockField235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MMREMOVE_in_mmRemoveRule258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_assignment284 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_assignment286 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_STRING_in_assignment290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENTT_in_comment312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_ConfigGrammar209 = new BitSet(new long[]{0x0000000000000002L});

}