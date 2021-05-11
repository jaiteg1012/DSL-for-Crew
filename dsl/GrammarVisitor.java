// Generated from Grammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#single_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_interval(GrammarParser.Single_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multi_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_interval(GrammarParser.Multi_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#single_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_set(GrammarParser.Single_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multi_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_set(GrammarParser.Multi_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#trick_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_set(GrammarParser.Trick_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#suit_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit_set(GrammarParser.Suit_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#card_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_set(GrammarParser.Card_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#player_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer_set(GrammarParser.Player_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#token_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_set(GrammarParser.Token_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(GrammarParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tasks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTasks(GrammarParser.TasksContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#d_t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_t(GrammarParser.D_tContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#distribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistribution(GrammarParser.DistributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#players}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayers(GrammarParser.PlayersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#constratints_distribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstratints_distribution(GrammarParser.Constratints_distributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_MaxWins}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_MaxWins(GrammarParser.Eq_MaxWinsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_MinWins}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_MinWins(GrammarParser.Eq_MinWinsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_MultiDigit}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_MultiDigit(GrammarParser.Eq_MultiDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_Subtract}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_Subtract(GrammarParser.Eq_SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_var}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_var(GrammarParser.Eq_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_SingleDigit}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_SingleDigit(GrammarParser.Eq_SingleDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_Add}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_Add(GrammarParser.Eq_AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq_Paranthesis}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_Paranthesis(GrammarParser.Eq_ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suit_expr_suit_set}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit_expr_suit_set(GrammarParser.Suit_expr_suit_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suit_expr_union}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit_expr_union(GrammarParser.Suit_expr_unionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suit_expr_var}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit_expr_var(GrammarParser.Suit_expr_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suit_expr_intersect}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit_expr_intersect(GrammarParser.Suit_expr_intersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suit_expr_complement}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit_expr_complement(GrammarParser.Suit_expr_complementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suit_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuit_expr_paranthesis(GrammarParser.Suit_expr_paranthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_expr_union}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr_union(GrammarParser.Value_expr_unionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_expr_single_set}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr_single_set(GrammarParser.Value_expr_single_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr_single_interval(GrammarParser.Value_expr_single_intervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_expr_complement}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr_complement(GrammarParser.Value_expr_complementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr_paranthesis(GrammarParser.Value_expr_paranthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_expr_intersect}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr_intersect(GrammarParser.Value_expr_intersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Value_expr_var}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expr_var(GrammarParser.Value_expr_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#card_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_spec(GrammarParser.Card_specContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Card_expr_var}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_expr_var(GrammarParser.Card_expr_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Card_expr_card_spec}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_expr_card_spec(GrammarParser.Card_expr_card_specContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Card_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_expr_paranthesis(GrammarParser.Card_expr_paranthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Card_expr_intersect}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_expr_intersect(GrammarParser.Card_expr_intersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Card_expr_card_set}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_expr_card_set(GrammarParser.Card_expr_card_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Card_expr_complement}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_expr_complement(GrammarParser.Card_expr_complementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Card_expr_union}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_expr_union(GrammarParser.Card_expr_unionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_var}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_var(GrammarParser.Trick_expr_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_trick_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_trick_set(GrammarParser.Trick_expr_trick_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_single_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_single_set(GrammarParser.Trick_expr_single_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_multi_interval}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_multi_interval(GrammarParser.Trick_expr_multi_intervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_complement}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_complement(GrammarParser.Trick_expr_complementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_single_interval(GrammarParser.Trick_expr_single_intervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_multi_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_multi_set(GrammarParser.Trick_expr_multi_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_paranthesis(GrammarParser.Trick_expr_paranthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_union}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_union(GrammarParser.Trick_expr_unionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Trick_expr_intersect}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrick_expr_intersect(GrammarParser.Trick_expr_intersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Player_expr_variable}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer_expr_variable(GrammarParser.Player_expr_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Player_expr_intersect}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer_expr_intersect(GrammarParser.Player_expr_intersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Player_expr_player_set}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer_expr_player_set(GrammarParser.Player_expr_player_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Player_expr_union}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer_expr_union(GrammarParser.Player_expr_unionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Player_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer_expr_paranthesis(GrammarParser.Player_expr_paranthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Player_expr_card_expr}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer_expr_card_expr(GrammarParser.Player_expr_card_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_single_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_single_set(GrammarParser.Token_expr_single_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_intersect}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_intersect(GrammarParser.Token_expr_intersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_single_interval(GrammarParser.Token_expr_single_intervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_trick_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_trick_set(GrammarParser.Token_expr_trick_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_paranthesis(GrammarParser.Token_expr_paranthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_multi_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_multi_set(GrammarParser.Token_expr_multi_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_token_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_token_set(GrammarParser.Token_expr_token_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_union}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_union(GrammarParser.Token_expr_unionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_variable}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_variable(GrammarParser.Token_expr_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Token_expr_multi_interval}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_expr_multi_interval(GrammarParser.Token_expr_multi_intervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WT_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWT_Rule(GrammarParser.WT_RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DWT_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDWT_Rule(GrammarParser.DWT_RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WC_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWC_Rule(GrammarParser.WC_RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DWC_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDWC_Rule(GrammarParser.DWC_RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WR_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWR_rule(GrammarParser.WR_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COM_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOM_rule(GrammarParser.COM_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DC_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDC_rule(GrammarParser.DC_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#nSwap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNSwap(GrammarParser.NSwapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#nSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNSwitch(GrammarParser.NSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens(GrammarParser.TokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#mission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMission(GrammarParser.MissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(GrammarParser.Var_decContext ctx);
}