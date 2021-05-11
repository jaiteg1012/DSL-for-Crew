import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class AntlrToExpression extends GrammarBaseVisitor<Expression> {
    private HashSet<String> variables;
    public ArrayList<String> errors;

    public AntlrToExpression(ArrayList<String> errors) {
        variables = new HashSet<>();
        this.errors = errors;
    }

    @Override
    public Expression visitValue_expr_union(GrammarParser.Value_expr_unionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "value");
    }


    @Override
    public Expression visitValue_expr_single_set(GrammarParser.Value_expr_single_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.single_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.single_set().getChild(i).getText());
        }
        return new SetObject(values, "value");
    }

    @Override
    public Expression visitSuit_expr_suit_set(GrammarParser.Suit_expr_suit_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.suit_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.suit_set().getChild(i).getText());
        }
        return new SetObject(values, "suit");
    }

    @Override
    public Expression visitSuit_expr_union(GrammarParser.Suit_expr_unionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "suit");
    }

    @Override
    public Expression visitSuit_expr_intersect(GrammarParser.Suit_expr_intersectContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "suit");
    }

    @Override
    public Expression visitSuit_expr_complement(GrammarParser.Suit_expr_complementContext ctx) {
        Expression right = visit(ctx.getChild(1));
        return new SetOperation(null, right, ctx.getChild(0).getText(), "suit");
    }

    @Override
    public Expression visitSuit_expr_paranthesis(GrammarParser.Suit_expr_paranthesisContext ctx) {
        return visit(ctx.getChild(1));
    }


    @Override
    public Expression visitValue_expr_single_interval(GrammarParser.Value_expr_single_intervalContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 1; i < 4; i++) {
            values.add(ctx.single_interval().getChild(i).getText());
        }
        return new SetObject(values, "value");
    }

    @Override
    public Expression visitCard_expr_card_spec(GrammarParser.Card_expr_card_specContext ctx) {
        Expression suit;
        Expression value;
        if (ctx.card_spec().suit_expr() != null) {
            suit = visit(ctx.card_spec().suit_expr());
        } else {
            suit = new SetObject(new ArrayList<String>(Arrays.asList("B", "G", "P", "R", "Y")), "suit");
        }

        if (ctx.card_spec().value_expr() != null) {
            value = visit(ctx.card_spec().value_expr());
        } else {
            value = new SetObject(new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9")), "value");
        }
        return new CardSpec(suit, value);
    }

    @Override
    public Expression visitCard_expr_paranthesis(GrammarParser.Card_expr_paranthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Expression visitCard_expr_intersect(GrammarParser.Card_expr_intersectContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "card");
    }

    @Override
    public Expression visitCard_expr_complement(GrammarParser.Card_expr_complementContext ctx) {
        Expression right = visit(ctx.getChild(1));
        return new SetOperation(null, right, ctx.getChild(0).getText(), "card");
    }

    @Override
    public Expression visitCard_expr_union(GrammarParser.Card_expr_unionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "card");
    }

    @Override
    public Expression visitTrick_expr_trick_set(GrammarParser.Trick_expr_trick_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.trick_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.trick_set().getChild(i).getText());
        }
        return new SetObject(values, "trick");
    }

    public Expression visitTrick_expr_single_set(GrammarParser.Trick_expr_single_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.single_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.single_set().getChild(i).getText());
        }
        return new SetObject(values, "trick");
    }

    @Override
    public Expression visitTrick_expr_multi_interval(GrammarParser.Trick_expr_multi_intervalContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 1; i < 4; i++) {
            values.add(ctx.multi_interval().getChild(i).getText());
        }
        return new SetObject(values, "trick");
    }

    @Override
    public Expression visitTrick_expr_complement(GrammarParser.Trick_expr_complementContext ctx) {
        Expression right = visit(ctx.getChild(1));
        return new SetOperation(null, right, ctx.getChild(0).getText(), "trick");
    }

    @Override
    public Expression visitTrick_expr_single_interval(GrammarParser.Trick_expr_single_intervalContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 1; i < 4; i++) {
            values.add(ctx.single_interval().getChild(i).getText());
        }
        return new SetObject(values, "trick");
    }

    @Override
    public Expression visitTrick_expr_multi_set(GrammarParser.Trick_expr_multi_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.multi_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.multi_set().getChild(i).getText());
        }
        return new SetObject(values, "trick");
    }

    @Override
    public Expression visitTrick_expr_paranthesis(GrammarParser.Trick_expr_paranthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Expression visitTrick_expr_union(GrammarParser.Trick_expr_unionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "trick");
    }

    @Override
    public Expression visitTrick_expr_intersect(GrammarParser.Trick_expr_intersectContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "trick");
    }


    @Override
    public Expression visitValue_expr_complement(GrammarParser.Value_expr_complementContext ctx) {
        Expression right = visit(ctx.getChild(1));
        return new SetOperation(null, right, ctx.getChild(0).getText(), "value");
    }

    @Override
    public Expression visitPlayer_expr_intersect(GrammarParser.Player_expr_intersectContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "player");
    }

    @Override
    public Expression visitPlayer_expr_player_set(GrammarParser.Player_expr_player_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.player_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.player_set().getChild(i).getText());
        }
        return new SetObject(values, "player");
    }

    @Override
    public Expression visitPlayer_expr_union(GrammarParser.Player_expr_unionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "player");
    }

//    @Override
//    public Expression visitPlayer_expr_complement(GrammarParser.Player_expr_complementContext ctx) {
//        Expression right = visit(ctx.getChild(1));
//        return new SetOperation(null, right, ctx.getChild(0).getText());
//    }

    @Override
    public Expression visitPlayer_expr_card_expr(GrammarParser.Player_expr_card_exprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitToken_expr_single_set(GrammarParser.Token_expr_single_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.single_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.single_set().getChild(i).getText());
        }
        return new SetObject(values, "token");
    }

    @Override
    public Expression visitToken_expr_intersect(GrammarParser.Token_expr_intersectContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "token");
    }

    @Override
    public Expression visitToken_expr_single_interval(GrammarParser.Token_expr_single_intervalContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 1; i < 4; i++) {
            values.add(ctx.single_interval().getChild(i).getText());
        }
        return new SetObject(values, "token");
    }

    @Override
    public Expression visitToken_expr_paranthesis(GrammarParser.Token_expr_paranthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

//    @Override
//    public Expression visitToken_expr_complement(GrammarParser.Token_expr_complementContext ctx) {
//        Expression right = visit(ctx.getChild(1));
//        return new SetOperation(null, right, ctx.getChild(0).getText());
//    }


    @Override
    public Expression visitValue_expr_paranthesis(GrammarParser.Value_expr_paranthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Expression visitToken_expr_multi_set(GrammarParser.Token_expr_multi_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.multi_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.multi_set().getChild(i).getText());
        }
        return new SetObject(values, "token");
    }

    @Override
    public Expression visitToken_expr_trick_set(GrammarParser.Token_expr_trick_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.trick_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.trick_set().getChild(i).getText());
        }
        return new SetObject(values, "token");
    }

    @Override
    public Expression visitToken_expr_token_set(GrammarParser.Token_expr_token_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.token_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.token_set().getChild(i).getText());
        }
        return new SetObject(values, "token");
    }

    @Override
    public Expression visitToken_expr_union(GrammarParser.Token_expr_unionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "token");
    }

    @Override
    public Expression visitToken_expr_multi_interval(GrammarParser.Token_expr_multi_intervalContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        for (int i = 1; i < 4; i++) {
            values.add(ctx.multi_interval().getChild(i).getText());
        }
        return new SetObject(values, "token");
    }

//    @Override
//    public Expression visitRule_trick(GrammarParser.Rule_trickContext ctx) {
//        Expression trick = null;
//        Expression cards = null;
//        String operation = ctx.getChild(2).getText();
//        int any = -1;
//        boolean ordered = false;
//        Expression players = null;
//        boolean playersAll = false;
//        boolean all = false;
//        int playersAny = -1;
//
//        if (ctx.ORDER() != null) {
//            ordered = true;
//        }
//
//        if (ctx.card_expr() != null) {
//            cards = visit(ctx.card_expr());
//        }
//
//        if (ctx.trick_expr() != null) {
//            trick = visit(ctx.trick_expr());
//        } else if (ctx.any(0) != null) {
//            any = Integer.parseInt(ctx.any(0).getChild(1).getText());
//        } else {
//            all = true;
//        }
//
//        if (ctx.player_expr() != null) {
//            players = visit(ctx.player_expr());
//        } else if (ctx.any(1) != null) {
//            playersAny = Integer.parseInt(ctx.any(1).getChild(1).getText());
//        } else if (ctx.ALL(1) != null) {
//            playersAll = true;
//        }
//        return new TrickRule(operation, any, all, trick, ordered, cards, players, playersAny, playersAll);
//
//    }
//
//    @Override
//    public Expression visitRule_card(GrammarParser.Rule_cardContext ctx) {
//        Expression cards = visit(ctx.card_expr());
//        Expression tricks = null;
//        String operation = ctx.getChild(2).getText();
//        boolean ordered = false;
//        int any = -1;
//        int playersAny = -1;
//        Expression players = null;
//        boolean playersAll = false;
//        if (ctx.trick_expr() != null) {
//            tricks = visit(ctx.trick_expr());
//        }
//        if (ctx.ORDER() != null) {
//            ordered = true;
//        }
//        if (ctx.any(0) != null) {
//            any = Integer.parseInt(ctx.any(0).getChild(1).getText());
//        }
//        if (ctx.player_expr() != null) {
//            players = visit(ctx.player_expr());
//        } else if (ctx.any(1) != null) {
//            playersAny = Integer.parseInt(ctx.any(1).getChild(1).getText());
//        } else if (ctx.ALL() != null) {
//            playersAll = true;
//        }
//        return new CardRule(operation, any, cards, ordered, tricks, players, playersAny, playersAll);
//    }
//
//    @Override
//    public Expression visitRule_win(GrammarParser.Rule_winContext ctx) {
//        Expression equation = visit(ctx.equation());
//        String equality = ctx.getChild(3).getText();
//        Expression players = null;
//        int playersAny = -1;
//        if (ctx.player_expr() != null) {
//            players = visit(ctx.player_expr());
//        } else if (ctx.any() != null) {
//            playersAny = Integer.parseInt(ctx.any().getChild(1).getText());
//        }
//        return new WinsRule(equality, equation, players, playersAny);
//    }
//
//    @Override
//    public Expression visitRule_com(GrammarParser.Rule_comContext ctx) {
//        Expression tricks = null;
//        Expression players = null;
//        String operation = ctx.getChild(2).getText();
//        int playersAny = -1;
//        boolean playersAll = false;
//        if (ctx.trick_expr() != null) {
//            tricks = visit(ctx.trick_expr());
//        }
//        if (ctx.player_expr() != null) {
//            players = visit(ctx.player_expr());
//        } else if (ctx.any() != null) {
//            playersAny = Integer.parseInt(ctx.any().getChild(1).getText());
//        } else {
//            playersAll = true;
//        }
//
//        return new CommunicationRule(operation, tricks, players, playersAny, playersAll);
//    }
//
//    @Override
//    public Expression visitRule_draw(GrammarParser.Rule_drawContext ctx) {
//        Expression tricks = null;
//        if (ctx.trick_expr() != null) {
//            tricks = visit(ctx.trick_expr());
//        }
//        String operation = ctx.getChild(2).getText();
//        return new DrawCardRule(operation, tricks);
//    }


    @Override
    public Expression visitValue_expr_intersect(GrammarParser.Value_expr_intersectContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new SetOperation(left, right, ctx.getChild(1).getText(), "value");
    }

    @Override
    public Expression visitCard_expr_card_set(GrammarParser.Card_expr_card_setContext ctx) {
        ArrayList<String> values = new ArrayList<String>();
        int length = ctx.card_set().getChildCount();
        for (int i = 1; i < length - 1; i++) {
            values.add(ctx.card_set().getChild(i).getText());
        }
        return new SetObject(values, "card");
    }

    public Expression var_handler(String var_name, int line, int pos, String type) {
        if (!variables.contains(var_name)) {
            errors.add("Error: variable " + var_name + " undefined (line: " + line + ", position: " + pos + ")");
        }
        return new Var(var_name, type);
    }

    @Override
    public Expression visitSuit_expr_var(GrammarParser.Suit_expr_varContext ctx) {
        String var_name = ctx.getChild(0).getText();
        int line = ctx.VAR().getSymbol().getLine();
        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
        return var_handler(var_name, line, pos, "suit");
    }

    @Override
    public Expression visitValue_expr_var(GrammarParser.Value_expr_varContext ctx) {
        String var_name = ctx.getChild(0).getText();
        int line = ctx.VAR().getSymbol().getLine();
        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
        return var_handler(var_name, line, pos, "value");
    }

    @Override
    public Expression visitCard_expr_var(GrammarParser.Card_expr_varContext ctx) {
        String var_name = ctx.getChild(0).getText();
        int line = ctx.VAR().getSymbol().getLine();
        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
        return var_handler(var_name, line, pos, "card");
    }

    public Expression visitEq_var(GrammarParser.Eq_varContext ctx) {
        String var_name = ctx.getChild(0).getText();
        int line = ctx.VAR().getSymbol().getLine();
        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
        return var_handler(var_name, line, pos, "num");
    }

    @Override
    public Expression visitTrick_expr_var(GrammarParser.Trick_expr_varContext ctx) {
        String var_name = ctx.getChild(0).getText();
        int line = ctx.VAR().getSymbol().getLine();
        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
        return var_handler(var_name, line, pos, "trick-value");
    }

    @Override
    public Expression visitPlayer_expr_variable(GrammarParser.Player_expr_variableContext ctx) {
        String var_name = ctx.getChild(0).getText();
        int line = ctx.VAR().getSymbol().getLine();
        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
        return var_handler(var_name, line, pos, "player-card");
    }

    @Override
    public Expression visitToken_expr_variable(GrammarParser.Token_expr_variableContext ctx) {
        String var_name = ctx.getChild(0).getText();
        int line = ctx.VAR().getSymbol().getLine();
        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
        return var_handler(var_name, line, pos, "token-value-trick");
    }

//    @Override
//    public Expression visitRule_var(GrammarParser.Rule_varContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        int line = ctx.VAR().getSymbol().getLine();
//        int pos = ctx.VAR().getSymbol().getCharPositionInLine() + 1;
//        return var_handler(var_name, line, pos, "rule");
//    }

    @Override
    public Expression visitVar_dec(GrammarParser.Var_decContext ctx) {
        String var_name = ctx.getChild(0).getText();
        Expression var_contents;
        String var_type;
        if (ctx.VAR(1) != null) {
            int line = ctx.VAR(1).getSymbol().getLine();
            int pos = ctx.VAR(1).getSymbol().getCharPositionInLine() + 1;
            if (!variables.contains(ctx.VAR(1).getText())) {
                errors.add("Error: variable " + ctx.VAR(1).getText() + " undefined (line: " + line + ", position: " + pos + ")");
            }
            return new VarDeclaration(ctx.getChild(0).getText(), "var", new Var(ctx.VAR(1).getText(), "lookup"));

        } else if (ctx.value_expr() != null) {
            var_type = "value";
        } else if (ctx.suit_expr() != null) {
            var_type = "suit";
        } else if (ctx.card_expr() != null) {
            var_type = "card";
        } else if (ctx.trick_expr() != null) {
            var_type = "trick";
        } else if (ctx.token_expr() != null) {
            var_type = "token";
        } else if (ctx.player_expr() != null) {
            var_type = "player";
        } else {
            var_type = "equation";
        }
        var_contents = visit(ctx.getChild(2));
        variables.add(var_name);
        return new VarDeclaration(var_name, var_type, var_contents);
    }


//    @Override
//    public Expression visitVal_dec(GrammarParser.Val_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "value";
//        Expression var_contents = visit(ctx.getChild(2));
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }
//
//
//    @Override
//    public Expression visitRule_dec(GrammarParser.Rule_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "rule";
//        Expression var_contents = visit(ctx.getChild(2));
//        variables.add(var_name);
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }
//
//
//    @Override
//    public Expression visitSuit_dec(GrammarParser.Suit_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "suit";
//        Expression var_contents = visit(ctx.getChild(2));
//        variables.add(var_name);
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }
//
//
//    @Override
//    public Expression visitCard_dec(GrammarParser.Card_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "card";
//        Expression var_contents = visit(ctx.getChild(2));
//        variables.add(var_name);
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }
//
//
//    @Override
//    public Expression visitTrick_dec(GrammarParser.Trick_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "trick";
//        Expression var_contents = visit(ctx.getChild(2));
//        variables.add(var_name);
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }
//
//
//    @Override
//    public Expression visitToken_dec(GrammarParser.Token_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "token";
//        Expression var_contents = visit(ctx.getChild(2));
//        variables.add(var_name);
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }
//
//    public Expression visitNum_dec(GrammarParser.Num_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "num";
//        Expression var_contents = visit(ctx.getChild(2));
//        variables.add(var_name);
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }
//
//
//    @Override
//    public Expression visitPlayer_dec(GrammarParser.Player_decContext ctx) {
//        String var_name = ctx.getChild(0).getText();
//        String var_type = "player";
//        Expression var_contents = visit(ctx.getChild(2));
//        variables.add(var_name);
//        return new VarDeclaration(var_name, var_type, var_contents);
//    }

//    @Override
//    public Expression visitTuple(GrammarParser.TupleContext ctx) { // do any!!!!!!!!!!!!!!!!!
//        Expression rule = visit(ctx.rules());
//        if (ctx.any() != null) {
//            int any = Integer.parseInt(ctx.any().getChild(1).getText());
//            return new Tuple(rule, any);
//        } else if (ctx.ALL() != null) {
//            return new Tuple(rule, "all");
//        } else {
//            Expression players = visit(ctx.player_expr());
//            return new Tuple(rule, players);
//        }
//    }

    @Override
    public Expression visitMission(GrammarParser.MissionContext ctx) {
        // take care of rules
        int tasks = Integer.parseInt(ctx.tasks().getChild(2).getText());
        int players = Integer.parseInt(ctx.players().getChild(2).getText());
        Expression tokens = null;
        if (ctx.tokens() != null) {
            tokens = visit(ctx.tokens().token_expr());
        }
        int nSwap;
        int nSwitch;

        if (ctx.tokens() != null && ctx.tokens().nSwap() != null) {
            nSwap = Integer.parseInt(ctx.tokens().nSwap().getChild(2).getText());
        } else {
            nSwap = 0;
        }
        if (ctx.tokens() != null && ctx.tokens().nSwitch() != null) {
            nSwitch = Integer.parseInt(ctx.tokens().nSwitch().getChild(2).getText());
        } else {
            nSwitch = 0;
        }
        String distress_signal = ctx.d_t().getChild(2).getText();
        String distribution = ctx.distribution().getChild(2).getText();
        String constraints_distribution = ctx.constratints_distribution().getChild(2).getText();

        ArrayList<Expression> rules = new ArrayList<>();
        if (ctx.rules() != null) {
            for (int i = 0; i < ctx.rules().size(); i++) {
                rules.add(visit(ctx.rules(i)));
            }
        }

        return new Mission(tasks, players, nSwap, nSwitch, tokens, distress_signal, distribution, constraints_distribution, rules);


    }

    @Override
    public Expression visitEq_MultiDigit(GrammarParser.Eq_MultiDigitContext ctx) {
        return new Num(ctx.getChild(0).getText());
    }

    @Override
    public Expression visitEq_SingleDigit(GrammarParser.Eq_SingleDigitContext ctx) {
        return new Num(ctx.getChild(0).getText());
    }

    @Override
    public Expression visitEq_Add(GrammarParser.Eq_AddContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Equation(left, ctx.getChild(1).getText(), right);
    }

    @Override
    public Expression visitEq_Subtract(GrammarParser.Eq_SubtractContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Equation(left, ctx.getChild(1).getText(), right);
    }

    @Override
    public Expression visitEq_Paranthesis(GrammarParser.Eq_ParanthesisContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Expression visitEq_MaxWins(GrammarParser.Eq_MaxWinsContext ctx) {
        return new Var("maxWins", "win");
    }

    @Override
    public Expression visitEq_MinWins(GrammarParser.Eq_MinWinsContext ctx) {
        return new Var("minWins", "win");

    }


    @Override
    public Expression visitWT_Rule(GrammarParser.WT_RuleContext ctx) {
        int any = -1;
        boolean All = false;
        Expression tricks = null;
        boolean ordered = false;
        Expression cards = null;
        Expression players = null;
        int playerAny = -1;


        if (ctx.trickAny != null) {
            any = Integer.parseInt(ctx.trickAny.getChild(1).getText());
        }
        if (ctx.ALL() != null) {
            All = true;
        }
        if (ctx.trick_expr() != null) {
            tricks = visit(ctx.trick_expr());
        }
        if (ctx.ORDER() != null) {
            ordered = true;
        }
        if (ctx.card_expr() != null) {
            cards = visit(ctx.card_expr());
        }
        if (ctx.player_expr() != null) {
            players = visit(ctx.player_expr());
        } else if (ctx.playerAny != null) {
            playerAny = Integer.parseInt(ctx.playerAny.getChild(1).getText());
        }
        return new WT(any, All, tricks, ordered, cards, players, playerAny);
    }


    @Override
    public Expression visitDWT_Rule(GrammarParser.DWT_RuleContext ctx) {
        Expression tricks = null;
        Expression players = null;
        Expression cards = null;
        int playerAny = -1;
        if (ctx.trick_expr() != null) {
            tricks = visit(ctx.trick_expr());
        }

        if (ctx.player_expr() != null) {
            players = visit(ctx.player_expr());
        }
        if (ctx.any() != null) {
            playerAny = Integer.parseInt(ctx.any().getChild(1).getText());
        }
        if (ctx.card_expr() != null) {
            cards = visit(ctx.card_expr());
        }

        return new DWT(tricks, cards, playerAny, players);
    }


    @Override
    public Expression visitWC_Rule(GrammarParser.WC_RuleContext ctx) {
        int any = -1;
        boolean All = false;
        Expression tricks = null;
        Expression cards = null;
        Expression players = null;
        int playerAny = -1;

        if (ctx.cardAny != null) {
            any = Integer.parseInt(ctx.cardAny.getChild(1).getText());
        }

        if (ctx.trick_expr() != null) {
            tricks = visit(ctx.trick_expr());
        }

        if (ctx.card_expr() != null) {
            cards = visit(ctx.card_expr());
        }
        if (ctx.player_expr() != null) {
            players = visit(ctx.player_expr());
        } else if (ctx.playerAny != null) {
            playerAny = Integer.parseInt(ctx.playerAny.getChild(1).getText());
        }
        return new WC(any, cards, tricks, players, playerAny);
    }


    @Override
    public Expression visitDWC_Rule(GrammarParser.DWC_RuleContext ctx) {
        Expression players = null;
        int playerAny = -1;
        Expression cards = visit(ctx.card_expr());
        Expression tricks = null;

        if (ctx.trick_expr() != null) {
            tricks = visit(ctx.trick_expr());
        }
        if (ctx.player_expr() != null) {
            players = visit(ctx.player_expr());
        } else if (ctx.any() != null) {
            playerAny = Integer.parseInt(ctx.any().getChild(1).getText());
        }
        return new DWC(cards, tricks, players, playerAny);
    }


    @Override
    public Expression visitWR_rule(GrammarParser.WR_ruleContext ctx) {
        Expression equation = visit(ctx.equation());
        String equality = ctx.getChild(3).getText();
        Expression players = null;
        int playersAny = -1;
        if (ctx.player_expr() != null) {
            players = visit(ctx.player_expr());
        } else if (ctx.any() != null) {
            playersAny = Integer.parseInt(ctx.any().getChild(1).getText());
        }
        return new WR(equality, equation, players, playersAny);
    }


    @Override
    public Expression visitCOM_rule(GrammarParser.COM_ruleContext ctx) {
        Expression tricks = null;
        Expression players = null;
        String operation = ctx.getChild(0).getText();
        int playersAny = -1;

        if (ctx.trick_expr() != null) {
            tricks = visit(ctx.trick_expr());
        }
        if (ctx.player_expr() != null) {
            players = visit(ctx.player_expr());
        } else if (ctx.any() != null) {
            playersAny = Integer.parseInt(ctx.any().getChild(1).getText());
        }
        return new CommunicationRule(operation, tricks, players, playersAny);

    }


    @Override
    public Expression visitDC_rule(GrammarParser.DC_ruleContext ctx) {
        Expression tricks = null;
        if (ctx.trick_expr() != null) {
            tricks = visit(ctx.trick_expr());
        }
        String operation = ctx.getChild(0).getText();
        return new DrawCardRule(operation, tricks);
    }


}

