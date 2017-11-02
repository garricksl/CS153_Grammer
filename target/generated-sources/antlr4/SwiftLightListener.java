// Generated from SwiftLight.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwiftLightParser}.
 */
public interface SwiftLightListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwiftLightParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SwiftLightParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftLightParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SwiftLightParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftLightParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SwiftLightParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftLightParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SwiftLightParser.ExprContext ctx);
}