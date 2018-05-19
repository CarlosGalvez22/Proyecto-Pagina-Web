// Generated from com\traductor\u005Cumg\TranslateCompi\Translate.g4 by ANTLR 4.5.1
package com.traductor.umg.TranslateCompi;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TranslateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TranslateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TranslateParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(TranslateParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#simple_presente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_presente(TranslateParser.Simple_presenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#present_continous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent_continous(TranslateParser.Present_continousContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#participle_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticiple_sentence(TranslateParser.Participle_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_sentence(TranslateParser.Aux_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#simple_presente_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_presente_neg(TranslateParser.Simple_presente_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#present_continous_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent_continous_neg(TranslateParser.Present_continous_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#participle_sentence_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticiple_sentence_neg(TranslateParser.Participle_sentence_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux_sentence_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_sentence_neg(TranslateParser.Aux_sentence_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#simple_presente_preg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_presente_preg(TranslateParser.Simple_presente_pregContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#present_continous_preg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent_continous_preg(TranslateParser.Present_continous_pregContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#participle_sentence_preg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticiple_sentence_preg(TranslateParser.Participle_sentence_pregContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_question(TranslateParser.Aux_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#simple_presente_pregunta_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_presente_pregunta_neg(TranslateParser.Simple_presente_pregunta_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#present_continous_preg_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent_continous_preg_neg(TranslateParser.Present_continous_preg_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#participle_sentence_preg_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParticiple_sentence_preg_neg(TranslateParser.Participle_sentence_preg_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux_question_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_question_neg(TranslateParser.Aux_question_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#punc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunc(TranslateParser.PuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_neg(TranslateParser.Aux_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux_have_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_have_neg(TranslateParser.Aux_have_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#auxdont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxdont(TranslateParser.AuxdontContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#auxdoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxdoes(TranslateParser.AuxdoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#adjetives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjetives(TranslateParser.AdjetivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#to_be_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_be_neg(TranslateParser.To_be_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#articles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticles(TranslateParser.ArticlesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#pastparticiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPastparticiple(TranslateParser.PastparticipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#nouns_sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNouns_sp(TranslateParser.Nouns_spContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#verbs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbs(TranslateParser.VerbsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#complement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplement(TranslateParser.ComplementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux_have}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_have(TranslateParser.Aux_haveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux(TranslateParser.AuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#personal_pronouns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonal_pronouns(TranslateParser.Personal_pronounsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#to_be}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_be(TranslateParser.To_beContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslateParser#verbsg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbsg(TranslateParser.VerbsgContext ctx);
}