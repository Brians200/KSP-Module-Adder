// $ANTLR 3.4 C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g 2013-11-01 22:49:17

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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:1: config : ( ( configField )* -> ^( CONFIG ( configField )* ) ) ;
    public final ConfigGrammarParser.config_return config() throws RecognitionException {
        ConfigGrammarParser.config_return retval = new ConfigGrammarParser.config_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.configField_return configField1 =null;


        RewriteRuleSubtreeStream stream_configField=new RewriteRuleSubtreeStream(adaptor,"rule configField");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:8: ( ( ( configField )* -> ^( CONFIG ( configField )* ) ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:10: ( ( configField )* -> ^( CONFIG ( configField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:11: ( configField )*
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:11: ( configField )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==STRING||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:11: configField
            	    {
            	    pushFollow(FOLLOW_configField_in_config44);
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
            // 14:27: -> ^( CONFIG ( configField )* )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:30: ^( CONFIG ( configField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONFIG, "CONFIG")
                , root_1);

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:14:39: ( configField )*
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:17:1: configField : ( block -> block | comment -> comment );
    public final ConfigGrammarParser.configField_return configField() throws RecognitionException {
        ConfigGrammarParser.configField_return retval = new ConfigGrammarParser.configField_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ConfigGrammarParser.block_return block2 =null;

        ConfigGrammarParser.comment_return comment3 =null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:18:2: ( block -> block | comment -> comment )
            int alt2=2;
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

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:18:4: block
                    {
                    pushFollow(FOLLOW_block_in_configField70);
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
                    // 18:14: -> block
                    {
                        adaptor.addChild(root_0, stream_block.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:19:4: comment
                    {
                    pushFollow(FOLLOW_comment_in_configField83);
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
                    // 19:16: -> comment
                    {
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
        return retval;
    }
    // $ANTLR end "configField"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:1: block : b1= STRING '{' ( blockField )* '}' -> ^( BLOCK $b1 ( blockField )* ) ;
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
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:7: (b1= STRING '{' ( blockField )* '}' -> ^( BLOCK $b1 ( blockField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:9: b1= STRING '{' ( blockField )* '}'
            {
            b1=(Token)match(input,STRING,FOLLOW_STRING_in_block104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(b1);


            char_literal4=(Token)match(input,17,FOLLOW_17_in_block106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_17.add(char_literal4);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:23: ( blockField )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==STRING||LA3_0==15||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:23: blockField
            	    {
            	    pushFollow(FOLLOW_blockField_in_block108);
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


            char_literal6=(Token)match(input,18,FOLLOW_18_in_block111); if (state.failed) return retval; 
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
            // 22:40: -> ^( BLOCK $b1 ( blockField )* )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:43: ^( BLOCK $b1 ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_b1.nextNode());

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:22:55: ( blockField )*
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:25:1: emptyBlock : '{' ( blockField )* '}' -> ^( EMPTYBLOCK ( blockField )* ) ;
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
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:2: ( '{' ( blockField )* '}' -> ^( EMPTYBLOCK ( blockField )* ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:4: '{' ( blockField )* '}'
            {
            char_literal7=(Token)match(input,17,FOLLOW_17_in_emptyBlock137); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_17.add(char_literal7);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:8: ( blockField )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==STRING||LA4_0==15||LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:8: blockField
            	    {
            	    pushFollow(FOLLOW_blockField_in_emptyBlock139);
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


            char_literal9=(Token)match(input,18,FOLLOW_18_in_emptyBlock142); if (state.failed) return retval; 
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
            // 26:27: -> ^( EMPTYBLOCK ( blockField )* )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:30: ^( EMPTYBLOCK ( blockField )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EMPTYBLOCK, "EMPTYBLOCK")
                , root_1);

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:26:43: ( blockField )*
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:29:1: blockField : ( ( '{' )=> emptyBlock | block | comment | assignment -> ^( ASSIGNMENT assignment ) );
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
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:2: ( ( '{' )=> emptyBlock | block | comment | assignment -> ^( ASSIGNMENT assignment ) )
            int alt5=4;
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

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:4: ( '{' )=> emptyBlock
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_emptyBlock_in_blockField172);
                    emptyBlock10=emptyBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyBlock10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:31:4: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_blockField177);
                    block11=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block11.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:32:4: comment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_comment_in_blockField182);
                    comment12=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment12.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:33:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_blockField193);
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
                    // 33:18: -> ^( ASSIGNMENT assignment )
                    {
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:33:21: ^( ASSIGNMENT assignment )
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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:36:1: assignment : (a1= STRING '=' a2= STRING -> $a1 $a2) ( '/' a3= STRING -> $assignment '/' $a3)* ;
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

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:37:2: ( (a1= STRING '=' a2= STRING -> $a1 $a2) ( '/' a3= STRING -> $assignment '/' $a3)* )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:37:4: (a1= STRING '=' a2= STRING -> $a1 $a2) ( '/' a3= STRING -> $assignment '/' $a3)*
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:37:4: (a1= STRING '=' a2= STRING -> $a1 $a2)
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:37:5: a1= STRING '=' a2= STRING
            {
            a1=(Token)match(input,STRING,FOLLOW_STRING_in_assignment219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(a1);


            char_literal14=(Token)match(input,16,FOLLOW_16_in_assignment221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_16.add(char_literal14);


            a2=(Token)match(input,STRING,FOLLOW_STRING_in_assignment225); if (state.failed) return retval; 
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
            // 37:30: -> $a1 $a2
            {
                adaptor.addChild(root_0, stream_a1.nextNode());

                adaptor.addChild(root_0, stream_a2.nextNode());

            }


            retval.tree = root_0;
            }

            }


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:37:43: ( '/' a3= STRING -> $assignment '/' $a3)*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:37:44: '/' a3= STRING
            	    {
            	    char_literal15=(Token)match(input,14,FOLLOW_14_in_assignment239); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_14.add(char_literal15);


            	    a3=(Token)match(input,STRING,FOLLOW_STRING_in_assignment243); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_STRING.add(a3);


            	    // AST REWRITE
            	    // elements: assignment, 14, a3
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
            	    // 37:58: -> $assignment '/' $a3
            	    {
            	        adaptor.addChild(root_0, stream_retval.nextTree());

            	        adaptor.addChild(root_0, 
            	        stream_14.nextNode()
            	        );

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
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:1: comment : ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) ) ;
    public final ConfigGrammarParser.comment_return comment() throws RecognitionException {
        ConfigGrammarParser.comment_return retval = new ConfigGrammarParser.comment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal16=null;
        ConfigGrammarParser.commentContent_return commentContent17 =null;


        Object string_literal16_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_commentContent=new RewriteRuleSubtreeStream(adaptor,"rule commentContent");
        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:9: ( ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:11: ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) )
            {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:11: ( '//' ( commentContent )? -> ^( COMMENT ( commentContent )? ) )
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:12: '//' ( commentContent )?
            {
            string_literal16=(Token)match(input,15,FOLLOW_15_in_comment269); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_15.add(string_literal16);


            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:17: ( commentContent )?
            int alt7=2;
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

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:17: commentContent
                    {
                    pushFollow(FOLLOW_commentContent_in_comment271);
                    commentContent17=commentContent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commentContent.add(commentContent17.getTree());

                    }
                    break;

            }


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
            // 40:37: -> ^( COMMENT ( commentContent )? )
            {
                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:40: ^( COMMENT ( commentContent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMMENT, "COMMENT")
                , root_1);

                // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:40:50: ( commentContent )?
                if ( stream_commentContent.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "comment"


    public static class commentContent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commentContent"
    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:43:1: commentContent : ( '{' -> ^( '{' ) | '}' -> ^( '}' ) |c1= STRING (c2= ( ( '/' | '=' ) STRING ) )* -> ^( $c1 ( $c2)* ) |c1= ( '/' ) c2= STRING (c3= ( ( '/' | '=' ) STRING ) )* -> ^( $c2 ( $c2)* ) );
    public final ConfigGrammarParser.commentContent_return commentContent() throws RecognitionException {
        ConfigGrammarParser.commentContent_return retval = new ConfigGrammarParser.commentContent_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c1=null;
        Token c2=null;
        Token c3=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token STRING22=null;
        Token char_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token STRING26=null;

        Object c1_tree=null;
        Object c2_tree=null;
        Object c3_tree=null;
        Object char_literal18_tree=null;
        Object char_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object STRING22_tree=null;
        Object char_literal23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object STRING26_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:44:2: ( '{' -> ^( '{' ) | '}' -> ^( '}' ) |c1= STRING (c2= ( ( '/' | '=' ) STRING ) )* -> ^( $c1 ( $c2)* ) |c1= ( '/' ) c2= STRING (c3= ( ( '/' | '=' ) STRING ) )* -> ^( $c2 ( $c2)* ) )
            int alt12=4;
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

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:44:4: '{'
                    {
                    char_literal18=(Token)match(input,17,FOLLOW_17_in_commentContent302); if (state.failed) return retval; 
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
                    // 44:14: -> ^( '{' )
                    {
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:44:17: ^( '{' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_17.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:4: '}'
                    {
                    char_literal19=(Token)match(input,18,FOLLOW_18_in_commentContent321); if (state.failed) return retval; 
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
                    // 45:14: -> ^( '}' )
                    {
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:45:17: ^( '}' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_18.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:4: c1= STRING (c2= ( ( '/' | '=' ) STRING ) )*
                    {
                    c1=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(c1);


                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:16: (c2= ( ( '/' | '=' ) STRING ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14||LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:16: c2= ( ( '/' | '=' ) STRING )
                    	    {
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:17: ( ( '/' | '=' ) STRING )
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:18: ( '/' | '=' ) STRING
                    	    {
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:18: ( '/' | '=' )
                    	    int alt8=2;
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

                    	        throw nvae;

                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:19: '/'
                    	            {
                    	            char_literal20=(Token)match(input,14,FOLLOW_14_in_commentContent348); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_14.add(char_literal20);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:25: '='
                    	            {
                    	            char_literal21=(Token)match(input,16,FOLLOW_16_in_commentContent352); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_16.add(char_literal21);


                    	            }
                    	            break;

                    	    }


                    	    STRING22=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent355); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_STRING.add(STRING22);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: c1, c2
                    // token labels: c1, c2
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
                    RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:41: -> ^( $c1 ( $c2)* )
                    {
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:44: ^( $c1 ( $c2)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_c1.nextNode(), root_1);

                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:46:51: ( $c2)*
                        while ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_1, stream_c2.nextNode());

                        }
                        stream_c2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:4: c1= ( '/' ) c2= STRING (c3= ( ( '/' | '=' ) STRING ) )*
                    {
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:7: ( '/' )
                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:8: '/'
                    {
                    char_literal23=(Token)match(input,14,FOLLOW_14_in_commentContent378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_14.add(char_literal23);


                    }


                    c2=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(c2);


                    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:25: (c3= ( ( '/' | '=' ) STRING ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14||LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:25: c3= ( ( '/' | '=' ) STRING )
                    	    {
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:26: ( ( '/' | '=' ) STRING )
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:27: ( '/' | '=' ) STRING
                    	    {
                    	    // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:27: ( '/' | '=' )
                    	    int alt10=2;
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

                    	        throw nvae;

                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:28: '/'
                    	            {
                    	            char_literal24=(Token)match(input,14,FOLLOW_14_in_commentContent389); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_14.add(char_literal24);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:34: '='
                    	            {
                    	            char_literal25=(Token)match(input,16,FOLLOW_16_in_commentContent393); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_16.add(char_literal25);


                    	            }
                    	            break;

                    	    }


                    	    STRING26=(Token)match(input,STRING,FOLLOW_STRING_in_commentContent396); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_STRING.add(STRING26);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: c2, c2
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
                    // 47:49: -> ^( $c2 ( $c2)* )
                    {
                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:52: ^( $c2 ( $c2)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_c2.nextNode(), root_1);

                        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:47:59: ( $c2)*
                        while ( stream_c2.hasNext() ) {
                            adaptor.addChild(root_1, stream_c2.nextNode());

                        }
                        stream_c2.reset();

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
    // $ANTLR end "commentContent"

    // $ANTLR start synpred1_ConfigGrammar
    public final void synpred1_ConfigGrammar_fragment() throws RecognitionException {
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:4: ( '{' )
        // C:\\Users\\Brian\\workspace\\KSP-Module-Adder\\src\\ConfigGrammar.g:30:5: '{'
        {
        match(input,17,FOLLOW_17_in_synpred1_ConfigGrammar167); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_configField_in_config44 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_block_in_configField70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_configField83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_block104 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_block106 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_blockField_in_block108 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_18_in_block111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_emptyBlock137 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_blockField_in_emptyBlock139 = new BitSet(new long[]{0x0000000000068800L});
    public static final BitSet FOLLOW_18_in_emptyBlock142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyBlock_in_blockField172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_blockField177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_blockField182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_blockField193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_assignment219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assignment221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_assignment225 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_assignment239 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_assignment243 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15_in_comment269 = new BitSet(new long[]{0x0000000000064802L});
    public static final BitSet FOLLOW_commentContent_in_comment271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_commentContent302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_commentContent321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_commentContent342 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_14_in_commentContent348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16_in_commentContent352 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_commentContent355 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_14_in_commentContent378 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_commentContent383 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_14_in_commentContent389 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16_in_commentContent393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_STRING_in_commentContent396 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_17_in_synpred1_ConfigGrammar167 = new BitSet(new long[]{0x0000000000000002L});

}