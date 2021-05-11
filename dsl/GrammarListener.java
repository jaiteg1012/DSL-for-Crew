// Generated from Grammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#single_interval}.
	 * @param ctx the parse tree
	 */
	void enterSingle_interval(GrammarParser.Single_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#single_interval}.
	 * @param ctx the parse tree
	 */
	void exitSingle_interval(GrammarParser.Single_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multi_interval}.
	 * @param ctx the parse tree
	 */
	void enterMulti_interval(GrammarParser.Multi_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multi_interval}.
	 * @param ctx the parse tree
	 */
	void exitMulti_interval(GrammarParser.Multi_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#single_set}.
	 * @param ctx the parse tree
	 */
	void enterSingle_set(GrammarParser.Single_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#single_set}.
	 * @param ctx the parse tree
	 */
	void exitSingle_set(GrammarParser.Single_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multi_set}.
	 * @param ctx the parse tree
	 */
	void enterMulti_set(GrammarParser.Multi_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multi_set}.
	 * @param ctx the parse tree
	 */
	void exitMulti_set(GrammarParser.Multi_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#trick_set}.
	 * @param ctx the parse tree
	 */
	void enterTrick_set(GrammarParser.Trick_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#trick_set}.
	 * @param ctx the parse tree
	 */
	void exitTrick_set(GrammarParser.Trick_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#suit_set}.
	 * @param ctx the parse tree
	 */
	void enterSuit_set(GrammarParser.Suit_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#suit_set}.
	 * @param ctx the parse tree
	 */
	void exitSuit_set(GrammarParser.Suit_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#card_set}.
	 * @param ctx the parse tree
	 */
	void enterCard_set(GrammarParser.Card_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#card_set}.
	 * @param ctx the parse tree
	 */
	void exitCard_set(GrammarParser.Card_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#player_set}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_set(GrammarParser.Player_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#player_set}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_set(GrammarParser.Player_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token_set}.
	 * @param ctx the parse tree
	 */
	void enterToken_set(GrammarParser.Token_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token_set}.
	 * @param ctx the parse tree
	 */
	void exitToken_set(GrammarParser.Token_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(GrammarParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(GrammarParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tasks}.
	 * @param ctx the parse tree
	 */
	void enterTasks(GrammarParser.TasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tasks}.
	 * @param ctx the parse tree
	 */
	void exitTasks(GrammarParser.TasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#d_t}.
	 * @param ctx the parse tree
	 */
	void enterD_t(GrammarParser.D_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#d_t}.
	 * @param ctx the parse tree
	 */
	void exitD_t(GrammarParser.D_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#distribution}.
	 * @param ctx the parse tree
	 */
	void enterDistribution(GrammarParser.DistributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#distribution}.
	 * @param ctx the parse tree
	 */
	void exitDistribution(GrammarParser.DistributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#players}.
	 * @param ctx the parse tree
	 */
	void enterPlayers(GrammarParser.PlayersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#players}.
	 * @param ctx the parse tree
	 */
	void exitPlayers(GrammarParser.PlayersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constratints_distribution}.
	 * @param ctx the parse tree
	 */
	void enterConstratints_distribution(GrammarParser.Constratints_distributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constratints_distribution}.
	 * @param ctx the parse tree
	 */
	void exitConstratints_distribution(GrammarParser.Constratints_distributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_MaxWins}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_MaxWins(GrammarParser.Eq_MaxWinsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_MaxWins}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_MaxWins(GrammarParser.Eq_MaxWinsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_MinWins}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_MinWins(GrammarParser.Eq_MinWinsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_MinWins}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_MinWins(GrammarParser.Eq_MinWinsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_MultiDigit}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_MultiDigit(GrammarParser.Eq_MultiDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_MultiDigit}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_MultiDigit(GrammarParser.Eq_MultiDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_Subtract}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_Subtract(GrammarParser.Eq_SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_Subtract}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_Subtract(GrammarParser.Eq_SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_var}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_var(GrammarParser.Eq_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_var}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_var(GrammarParser.Eq_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_SingleDigit}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_SingleDigit(GrammarParser.Eq_SingleDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_SingleDigit}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_SingleDigit(GrammarParser.Eq_SingleDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_Add}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_Add(GrammarParser.Eq_AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_Add}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_Add(GrammarParser.Eq_AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq_Paranthesis}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEq_Paranthesis(GrammarParser.Eq_ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq_Paranthesis}
	 * labeled alternative in {@link GrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEq_Paranthesis(GrammarParser.Eq_ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suit_expr_suit_set}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void enterSuit_expr_suit_set(GrammarParser.Suit_expr_suit_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suit_expr_suit_set}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void exitSuit_expr_suit_set(GrammarParser.Suit_expr_suit_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suit_expr_union}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void enterSuit_expr_union(GrammarParser.Suit_expr_unionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suit_expr_union}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void exitSuit_expr_union(GrammarParser.Suit_expr_unionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suit_expr_var}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void enterSuit_expr_var(GrammarParser.Suit_expr_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suit_expr_var}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void exitSuit_expr_var(GrammarParser.Suit_expr_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suit_expr_intersect}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void enterSuit_expr_intersect(GrammarParser.Suit_expr_intersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suit_expr_intersect}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void exitSuit_expr_intersect(GrammarParser.Suit_expr_intersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suit_expr_complement}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void enterSuit_expr_complement(GrammarParser.Suit_expr_complementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suit_expr_complement}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void exitSuit_expr_complement(GrammarParser.Suit_expr_complementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suit_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void enterSuit_expr_paranthesis(GrammarParser.Suit_expr_paranthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suit_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#suit_expr}.
	 * @param ctx the parse tree
	 */
	void exitSuit_expr_paranthesis(GrammarParser.Suit_expr_paranthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_expr_union}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr_union(GrammarParser.Value_expr_unionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_expr_union}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr_union(GrammarParser.Value_expr_unionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_expr_single_set}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr_single_set(GrammarParser.Value_expr_single_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_expr_single_set}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr_single_set(GrammarParser.Value_expr_single_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr_single_interval(GrammarParser.Value_expr_single_intervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr_single_interval(GrammarParser.Value_expr_single_intervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_expr_complement}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr_complement(GrammarParser.Value_expr_complementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_expr_complement}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr_complement(GrammarParser.Value_expr_complementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr_paranthesis(GrammarParser.Value_expr_paranthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr_paranthesis(GrammarParser.Value_expr_paranthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_expr_intersect}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr_intersect(GrammarParser.Value_expr_intersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_expr_intersect}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr_intersect(GrammarParser.Value_expr_intersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Value_expr_var}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterValue_expr_var(GrammarParser.Value_expr_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Value_expr_var}
	 * labeled alternative in {@link GrammarParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitValue_expr_var(GrammarParser.Value_expr_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#card_spec}.
	 * @param ctx the parse tree
	 */
	void enterCard_spec(GrammarParser.Card_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#card_spec}.
	 * @param ctx the parse tree
	 */
	void exitCard_spec(GrammarParser.Card_specContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Card_expr_var}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void enterCard_expr_var(GrammarParser.Card_expr_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Card_expr_var}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void exitCard_expr_var(GrammarParser.Card_expr_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Card_expr_card_spec}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void enterCard_expr_card_spec(GrammarParser.Card_expr_card_specContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Card_expr_card_spec}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void exitCard_expr_card_spec(GrammarParser.Card_expr_card_specContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Card_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void enterCard_expr_paranthesis(GrammarParser.Card_expr_paranthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Card_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void exitCard_expr_paranthesis(GrammarParser.Card_expr_paranthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Card_expr_intersect}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void enterCard_expr_intersect(GrammarParser.Card_expr_intersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Card_expr_intersect}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void exitCard_expr_intersect(GrammarParser.Card_expr_intersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Card_expr_card_set}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void enterCard_expr_card_set(GrammarParser.Card_expr_card_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Card_expr_card_set}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void exitCard_expr_card_set(GrammarParser.Card_expr_card_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Card_expr_complement}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void enterCard_expr_complement(GrammarParser.Card_expr_complementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Card_expr_complement}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void exitCard_expr_complement(GrammarParser.Card_expr_complementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Card_expr_union}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void enterCard_expr_union(GrammarParser.Card_expr_unionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Card_expr_union}
	 * labeled alternative in {@link GrammarParser#card_expr}.
	 * @param ctx the parse tree
	 */
	void exitCard_expr_union(GrammarParser.Card_expr_unionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_var}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_var(GrammarParser.Trick_expr_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_var}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_var(GrammarParser.Trick_expr_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_trick_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_trick_set(GrammarParser.Trick_expr_trick_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_trick_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_trick_set(GrammarParser.Trick_expr_trick_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_single_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_single_set(GrammarParser.Trick_expr_single_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_single_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_single_set(GrammarParser.Trick_expr_single_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_multi_interval}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_multi_interval(GrammarParser.Trick_expr_multi_intervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_multi_interval}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_multi_interval(GrammarParser.Trick_expr_multi_intervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_complement}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_complement(GrammarParser.Trick_expr_complementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_complement}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_complement(GrammarParser.Trick_expr_complementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_single_interval(GrammarParser.Trick_expr_single_intervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_single_interval(GrammarParser.Trick_expr_single_intervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_multi_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_multi_set(GrammarParser.Trick_expr_multi_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_multi_set}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_multi_set(GrammarParser.Trick_expr_multi_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_paranthesis(GrammarParser.Trick_expr_paranthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_paranthesis(GrammarParser.Trick_expr_paranthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_union}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_union(GrammarParser.Trick_expr_unionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_union}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_union(GrammarParser.Trick_expr_unionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Trick_expr_intersect}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrick_expr_intersect(GrammarParser.Trick_expr_intersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Trick_expr_intersect}
	 * labeled alternative in {@link GrammarParser#trick_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrick_expr_intersect(GrammarParser.Trick_expr_intersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Player_expr_variable}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_expr_variable(GrammarParser.Player_expr_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Player_expr_variable}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_expr_variable(GrammarParser.Player_expr_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Player_expr_intersect}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_expr_intersect(GrammarParser.Player_expr_intersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Player_expr_intersect}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_expr_intersect(GrammarParser.Player_expr_intersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Player_expr_player_set}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_expr_player_set(GrammarParser.Player_expr_player_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Player_expr_player_set}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_expr_player_set(GrammarParser.Player_expr_player_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Player_expr_union}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_expr_union(GrammarParser.Player_expr_unionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Player_expr_union}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_expr_union(GrammarParser.Player_expr_unionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Player_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_expr_paranthesis(GrammarParser.Player_expr_paranthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Player_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_expr_paranthesis(GrammarParser.Player_expr_paranthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Player_expr_card_expr}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_expr_card_expr(GrammarParser.Player_expr_card_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Player_expr_card_expr}
	 * labeled alternative in {@link GrammarParser#player_expr}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_expr_card_expr(GrammarParser.Player_expr_card_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_single_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_single_set(GrammarParser.Token_expr_single_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_single_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_single_set(GrammarParser.Token_expr_single_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_intersect}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_intersect(GrammarParser.Token_expr_intersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_intersect}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_intersect(GrammarParser.Token_expr_intersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_single_interval(GrammarParser.Token_expr_single_intervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_single_interval}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_single_interval(GrammarParser.Token_expr_single_intervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_trick_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_trick_set(GrammarParser.Token_expr_trick_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_trick_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_trick_set(GrammarParser.Token_expr_trick_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_paranthesis(GrammarParser.Token_expr_paranthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_paranthesis}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_paranthesis(GrammarParser.Token_expr_paranthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_multi_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_multi_set(GrammarParser.Token_expr_multi_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_multi_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_multi_set(GrammarParser.Token_expr_multi_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_token_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_token_set(GrammarParser.Token_expr_token_setContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_token_set}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_token_set(GrammarParser.Token_expr_token_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_union}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_union(GrammarParser.Token_expr_unionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_union}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_union(GrammarParser.Token_expr_unionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_variable}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_variable(GrammarParser.Token_expr_variableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_variable}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_variable(GrammarParser.Token_expr_variableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Token_expr_multi_interval}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void enterToken_expr_multi_interval(GrammarParser.Token_expr_multi_intervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Token_expr_multi_interval}
	 * labeled alternative in {@link GrammarParser#token_expr}.
	 * @param ctx the parse tree
	 */
	void exitToken_expr_multi_interval(GrammarParser.Token_expr_multi_intervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WT_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterWT_Rule(GrammarParser.WT_RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WT_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitWT_Rule(GrammarParser.WT_RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DWT_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterDWT_Rule(GrammarParser.DWT_RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DWT_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitDWT_Rule(GrammarParser.DWT_RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WC_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterWC_Rule(GrammarParser.WC_RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WC_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitWC_Rule(GrammarParser.WC_RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DWC_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterDWC_Rule(GrammarParser.DWC_RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DWC_Rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitDWC_Rule(GrammarParser.DWC_RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WR_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterWR_rule(GrammarParser.WR_ruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WR_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitWR_rule(GrammarParser.WR_ruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COM_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterCOM_rule(GrammarParser.COM_ruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COM_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitCOM_rule(GrammarParser.COM_ruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DC_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterDC_rule(GrammarParser.DC_ruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DC_rule}
	 * labeled alternative in {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitDC_rule(GrammarParser.DC_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nSwap}.
	 * @param ctx the parse tree
	 */
	void enterNSwap(GrammarParser.NSwapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nSwap}.
	 * @param ctx the parse tree
	 */
	void exitNSwap(GrammarParser.NSwapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nSwitch}.
	 * @param ctx the parse tree
	 */
	void enterNSwitch(GrammarParser.NSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nSwitch}.
	 * @param ctx the parse tree
	 */
	void exitNSwitch(GrammarParser.NSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tokens}.
	 * @param ctx the parse tree
	 */
	void enterTokens(GrammarParser.TokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tokens}.
	 * @param ctx the parse tree
	 */
	void exitTokens(GrammarParser.TokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mission}.
	 * @param ctx the parse tree
	 */
	void enterMission(GrammarParser.MissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mission}.
	 * @param ctx the parse tree
	 */
	void exitMission(GrammarParser.MissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(GrammarParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(GrammarParser.Var_decContext ctx);
}