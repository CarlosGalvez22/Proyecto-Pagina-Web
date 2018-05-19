// Generated from com\traductor\u005Cumg\TranslateCompi\Translate.g4 by ANTLR 4.5.1
package com.traductor.umg.TranslateCompi;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TranslateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DO=1, DOES=2, WOULD=3, CAN=4, SHOULD=5, HAVE=6, HAS=7, AUXDONT=8, WOULDNT=9, 
		CANT=10, SHOULDNT=11, AUXHAVE=12, ABSTRACT_NOUNS=13, CONCRETE_NOUNS=14, 
		COMMON_NOUNS=15, PLACES_NOUNS=16, UNCOUNTABLE_NOUNS=17, ADJETIVES=18, 
		POSSESIVE_ADJ=19, DEMOSTRATIVE_ADJ=20, CALIFICATIVES_CMN_ADJ=21, CALIFICATIVES_COLOR_ADJ=22, 
		CALIFICATIVES_CONDITION_ADJ=23, CALIFICATIVES_PERSONALITY_POSITIVE_ADJ=24, 
		CALIFICATIVES_PERSONALITY_NEGATIVE_ADJ=25, CALIFICATIVES_SHAPE_ADJ=26, 
		CALIFICATIVES_SIZE_ADJ=27, CALIFICATIVES_SOUND_ADJ=28, CALIFICATIVES_TIME_ADJ=29, 
		CALIFICATIVES_TASTETOUCH_ADJ=30, CALIFICATIVES_TOUCH_ADJ=31, CALIFICATIVES_QUANTITY_ADJ=32, 
		ORDINAL_NUMBERS=33, CARDINAL_NUMBERS=34, UNDEFINED_ADJ=35, DEFINED_ARTICLE=36, 
		UNDEFINED_ARTICLE=37, PERSONAL_PRONOUNS=38, DEMOSTRATIVES_PRONOUNS=39, 
		INTERROGATIVE_PRONOUNS=40, REGULAR_VERBS=41, IRREGULAR_VERBS=42, PAST_PARTICIPLE_VERBS_IRREGULAR=43, 
		PAST_PARTICIPLE_REGULAR_VERBS=44, ADVERBS_TIME=45, ADVERBS_PLACE=46, ADVERBS_QUANTITY=47, 
		ADVERBS_MODE=48, AFFIRMATIVE_ADVERBS=49, NEGATIVE_ADVERBS=50, ADVERBS_DOUBT=51, 
		GERUNDS=52, PREPOSITIONS=53, VERB_TO_BE=54, VERB_TO_BE_NEG=55, CONJUNCTIONS=56, 
		CONJUNCTIONS_COPU=57, CONJUNTIONS_ADVER=58, CONJUNTIONS_DIST=59, CONJUNTIONS_EXPLI=60, 
		CONJUNCTIONS_SUB=61, COORDINATING_CONJUNCTIONS=62, CONJUNCTIONS_CON=63, 
		CONJUNCTIONS_CAS=64, CONJUNCTIONS_CONSE=65, CONJUNCTIONS_COMP=66, CONJUNCTIONS_FIN=67, 
		INTERJECTION=68, CONTRACTION=69, PUNCTUATION_SIGNS=70, WS=71;
	public static final int
		RULE_body = 0, RULE_simple_presente = 1, RULE_present_continous = 2, RULE_participle_sentence = 3, 
		RULE_aux_sentence = 4, RULE_simple_presente_neg = 5, RULE_present_continous_neg = 6, 
		RULE_participle_sentence_neg = 7, RULE_aux_sentence_neg = 8, RULE_simple_presente_preg = 9, 
		RULE_present_continous_preg = 10, RULE_participle_sentence_preg = 11, 
		RULE_aux_question = 12, RULE_simple_presente_pregunta_neg = 13, RULE_present_continous_preg_neg = 14, 
		RULE_participle_sentence_preg_neg = 15, RULE_aux_question_neg = 16, RULE_punc = 17, 
		RULE_aux_neg = 18, RULE_aux_have_neg = 19, RULE_auxdont = 20, RULE_auxdoes = 21, 
		RULE_adjetives = 22, RULE_to_be_neg = 23, RULE_articles = 24, RULE_pastparticiple = 25, 
		RULE_nouns_sp = 26, RULE_verbs = 27, RULE_complement = 28, RULE_aux_have = 29, 
		RULE_aux = 30, RULE_personal_pronouns = 31, RULE_to_be = 32, RULE_verbsg = 33;
	public static final String[] ruleNames = {
		"body", "simple_presente", "present_continous", "participle_sentence", 
		"aux_sentence", "simple_presente_neg", "present_continous_neg", "participle_sentence_neg", 
		"aux_sentence_neg", "simple_presente_preg", "present_continous_preg", 
		"participle_sentence_preg", "aux_question", "simple_presente_pregunta_neg", 
		"present_continous_preg_neg", "participle_sentence_preg_neg", "aux_question_neg", 
		"punc", "aux_neg", "aux_have_neg", "auxdont", "auxdoes", "adjetives", 
		"to_be_neg", "articles", "pastparticiple", "nouns_sp", "verbs", "complement", 
		"aux_have", "aux", "personal_pronouns", "to_be", "verbsg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'do'", "'does'", "'would'", "'can'", "'should'", "'have'", "'has'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'the'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DO", "DOES", "WOULD", "CAN", "SHOULD", "HAVE", "HAS", "AUXDONT", 
		"WOULDNT", "CANT", "SHOULDNT", "AUXHAVE", "ABSTRACT_NOUNS", "CONCRETE_NOUNS", 
		"COMMON_NOUNS", "PLACES_NOUNS", "UNCOUNTABLE_NOUNS", "ADJETIVES", "POSSESIVE_ADJ", 
		"DEMOSTRATIVE_ADJ", "CALIFICATIVES_CMN_ADJ", "CALIFICATIVES_COLOR_ADJ", 
		"CALIFICATIVES_CONDITION_ADJ", "CALIFICATIVES_PERSONALITY_POSITIVE_ADJ", 
		"CALIFICATIVES_PERSONALITY_NEGATIVE_ADJ", "CALIFICATIVES_SHAPE_ADJ", "CALIFICATIVES_SIZE_ADJ", 
		"CALIFICATIVES_SOUND_ADJ", "CALIFICATIVES_TIME_ADJ", "CALIFICATIVES_TASTETOUCH_ADJ", 
		"CALIFICATIVES_TOUCH_ADJ", "CALIFICATIVES_QUANTITY_ADJ", "ORDINAL_NUMBERS", 
		"CARDINAL_NUMBERS", "UNDEFINED_ADJ", "DEFINED_ARTICLE", "UNDEFINED_ARTICLE", 
		"PERSONAL_PRONOUNS", "DEMOSTRATIVES_PRONOUNS", "INTERROGATIVE_PRONOUNS", 
		"REGULAR_VERBS", "IRREGULAR_VERBS", "PAST_PARTICIPLE_VERBS_IRREGULAR", 
		"PAST_PARTICIPLE_REGULAR_VERBS", "ADVERBS_TIME", "ADVERBS_PLACE", "ADVERBS_QUANTITY", 
		"ADVERBS_MODE", "AFFIRMATIVE_ADVERBS", "NEGATIVE_ADVERBS", "ADVERBS_DOUBT", 
		"GERUNDS", "PREPOSITIONS", "VERB_TO_BE", "VERB_TO_BE_NEG", "CONJUNCTIONS", 
		"CONJUNCTIONS_COPU", "CONJUNTIONS_ADVER", "CONJUNTIONS_DIST", "CONJUNTIONS_EXPLI", 
		"CONJUNCTIONS_SUB", "COORDINATING_CONJUNCTIONS", "CONJUNCTIONS_CON", "CONJUNCTIONS_CAS", 
		"CONJUNCTIONS_CONSE", "CONJUNCTIONS_COMP", "CONJUNCTIONS_FIN", "INTERJECTION", 
		"CONTRACTION", "PUNCTUATION_SIGNS", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Translate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TranslateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BodyContext extends ParserRuleContext {
		public Simple_presenteContext simple_presente() {
			return getRuleContext(Simple_presenteContext.class,0);
		}
		public Present_continousContext present_continous() {
			return getRuleContext(Present_continousContext.class,0);
		}
		public Aux_sentenceContext aux_sentence() {
			return getRuleContext(Aux_sentenceContext.class,0);
		}
		public Participle_sentenceContext participle_sentence() {
			return getRuleContext(Participle_sentenceContext.class,0);
		}
		public Simple_presente_negContext simple_presente_neg() {
			return getRuleContext(Simple_presente_negContext.class,0);
		}
		public Present_continous_negContext present_continous_neg() {
			return getRuleContext(Present_continous_negContext.class,0);
		}
		public Participle_sentence_negContext participle_sentence_neg() {
			return getRuleContext(Participle_sentence_negContext.class,0);
		}
		public Aux_sentence_negContext aux_sentence_neg() {
			return getRuleContext(Aux_sentence_negContext.class,0);
		}
		public Simple_presente_pregunta_negContext simple_presente_pregunta_neg() {
			return getRuleContext(Simple_presente_pregunta_negContext.class,0);
		}
		public Simple_presente_pregContext simple_presente_preg() {
			return getRuleContext(Simple_presente_pregContext.class,0);
		}
		public Present_continous_pregContext present_continous_preg() {
			return getRuleContext(Present_continous_pregContext.class,0);
		}
		public Aux_question_negContext aux_question_neg() {
			return getRuleContext(Aux_question_negContext.class,0);
		}
		public Participle_sentence_preg_negContext participle_sentence_preg_neg() {
			return getRuleContext(Participle_sentence_preg_negContext.class,0);
		}
		public Present_continous_preg_negContext present_continous_preg_neg() {
			return getRuleContext(Present_continous_preg_negContext.class,0);
		}
		public Aux_questionContext aux_question() {
			return getRuleContext(Aux_questionContext.class,0);
		}
		public Participle_sentence_pregContext participle_sentence_preg() {
			return getRuleContext(Participle_sentence_pregContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_body);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				simple_presente();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				present_continous();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				aux_sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				participle_sentence();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				simple_presente_neg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				present_continous_neg();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				participle_sentence_neg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				aux_sentence_neg();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				simple_presente_pregunta_neg();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				simple_presente_preg();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
				present_continous_preg();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(79);
				aux_question_neg();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(80);
				participle_sentence_preg_neg();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(81);
				present_continous_preg_neg();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(82);
				aux_question();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(83);
				participle_sentence_preg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_presenteContext extends ParserRuleContext {
		public TerminalNode DEMOSTRATIVE_ADJ() { return getToken(TranslateParser.DEMOSTRATIVE_ADJ, 0); }
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public Simple_presenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_presente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterSimple_presente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitSimple_presente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitSimple_presente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_presenteContext simple_presente() throws RecognitionException {
		Simple_presenteContext _localctx = new Simple_presenteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_presente);
		int _la;
		try {
			setState(109);
			switch (_input.LA(1)) {
			case DEMOSTRATIVE_ADJ:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(DEMOSTRATIVE_ADJ);
				setState(87);
				nouns_sp();
				setState(88);
				verbs();
				setState(90);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(89);
					complement();
					}
				}

				}
				break;
			case DEFINED_ARTICLE:
			case UNDEFINED_ARTICLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				articles();
				setState(93);
				nouns_sp();
				setState(94);
				verbs();
				setState(96);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(95);
					complement();
					}
				}

				}
				break;
			case POSSESIVE_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(POSSESIVE_ADJ);
				setState(99);
				nouns_sp();
				setState(100);
				verbs();
				setState(102);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(101);
					complement();
					}
				}

				}
				break;
			case PERSONAL_PRONOUNS:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				personal_pronouns();
				setState(105);
				verbs();
				setState(107);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(106);
					complement();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Present_continousContext extends ParserRuleContext {
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public To_beContext to_be() {
			return getRuleContext(To_beContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode UNDEFINED_ARTICLE() { return getToken(TranslateParser.UNDEFINED_ARTICLE, 0); }
		public TerminalNode CONCRETE_NOUNS() { return getToken(TranslateParser.CONCRETE_NOUNS, 0); }
		public AdjetivesContext adjetives() {
			return getRuleContext(AdjetivesContext.class,0);
		}
		public TerminalNode ADJETIVES() { return getToken(TranslateParser.ADJETIVES, 0); }
		public Present_continousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present_continous; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterPresent_continous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitPresent_continous(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitPresent_continous(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Present_continousContext present_continous() throws RecognitionException {
		Present_continousContext _localctx = new Present_continousContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_present_continous);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				personal_pronouns();
				setState(112);
				to_be();
				setState(113);
				verbsg();
				setState(115);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(114);
					complement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				articles();
				setState(118);
				nouns_sp();
				setState(119);
				to_be();
				setState(120);
				verbsg();
				setState(122);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(121);
					complement();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(POSSESIVE_ADJ);
				setState(125);
				nouns_sp();
				setState(126);
				to_be();
				setState(127);
				verbsg();
				setState(129);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(128);
					complement();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				personal_pronouns();
				setState(132);
				to_be();
				setState(133);
				match(UNDEFINED_ARTICLE);
				setState(134);
				match(CONCRETE_NOUNS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				personal_pronouns();
				setState(137);
				to_be();
				setState(138);
				adjetives();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				articles();
				setState(141);
				nouns_sp();
				setState(142);
				to_be();
				setState(143);
				adjetives();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(POSSESIVE_ADJ);
				setState(146);
				nouns_sp();
				setState(147);
				to_be();
				setState(148);
				adjetives();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				articles();
				setState(151);
				nouns_sp();
				setState(152);
				to_be();
				setState(153);
				verbsg();
				setState(154);
				match(ADJETIVES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(156);
				match(POSSESIVE_ADJ);
				setState(157);
				nouns_sp();
				setState(158);
				to_be();
				setState(159);
				verbsg();
				setState(160);
				match(ADJETIVES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Participle_sentenceContext extends ParserRuleContext {
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public Aux_haveContext aux_have() {
			return getRuleContext(Aux_haveContext.class,0);
		}
		public PastparticipleContext pastparticiple() {
			return getRuleContext(PastparticipleContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(TranslateParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public Participle_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participle_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterParticiple_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitParticiple_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitParticiple_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Participle_sentenceContext participle_sentence() throws RecognitionException {
		Participle_sentenceContext _localctx = new Participle_sentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_participle_sentence);
		int _la;
		try {
			setState(193);
			switch (_input.LA(1)) {
			case PERSONAL_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				personal_pronouns();
				setState(165);
				aux_have();
				setState(166);
				pastparticiple();
				setState(168);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(167);
					verbsg();
					}
				}

				setState(171);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(170);
					complement();
					}
				}

				}
				break;
			case DEFINED_ARTICLE:
			case UNDEFINED_ARTICLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				articles();
				setState(174);
				nouns_sp();
				setState(175);
				aux_have();
				setState(176);
				pastparticiple();
				setState(178);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(177);
					verbsg();
					}
				}

				setState(181);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(180);
					complement();
					}
				}

				}
				break;
			case POSSESIVE_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(POSSESIVE_ADJ);
				setState(184);
				nouns_sp();
				setState(185);
				aux_have();
				setState(186);
				match(PAST_PARTICIPLE_VERBS_IRREGULAR);
				setState(188);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(187);
					verbsg();
					}
				}

				setState(191);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(190);
					complement();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_sentenceContext extends ParserRuleContext {
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public AuxContext aux() {
			return getRuleContext(AuxContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Aux_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux_sentenceContext aux_sentence() throws RecognitionException {
		Aux_sentenceContext _localctx = new Aux_sentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aux_sentence);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case PERSONAL_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				personal_pronouns();
				setState(196);
				aux();
				setState(197);
				verbs();
				}
				break;
			case DEFINED_ARTICLE:
			case UNDEFINED_ARTICLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				articles();
				setState(200);
				nouns_sp();
				setState(201);
				aux();
				setState(202);
				verbs();
				}
				break;
			case POSSESIVE_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(POSSESIVE_ADJ);
				setState(205);
				nouns_sp();
				setState(206);
				aux();
				setState(207);
				verbs();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_presente_negContext extends ParserRuleContext {
		public TerminalNode DEMOSTRATIVE_ADJ() { return getToken(TranslateParser.DEMOSTRATIVE_ADJ, 0); }
		public List<Nouns_spContext> nouns_sp() {
			return getRuleContexts(Nouns_spContext.class);
		}
		public Nouns_spContext nouns_sp(int i) {
			return getRuleContext(Nouns_spContext.class,i);
		}
		public List<AuxdontContext> auxdont() {
			return getRuleContexts(AuxdontContext.class);
		}
		public AuxdontContext auxdont(int i) {
			return getRuleContext(AuxdontContext.class,i);
		}
		public List<VerbsContext> verbs() {
			return getRuleContexts(VerbsContext.class);
		}
		public VerbsContext verbs(int i) {
			return getRuleContext(VerbsContext.class,i);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public List<ComplementContext> complement() {
			return getRuleContexts(ComplementContext.class);
		}
		public ComplementContext complement(int i) {
			return getRuleContext(ComplementContext.class,i);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public Simple_presente_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_presente_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterSimple_presente_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitSimple_presente_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitSimple_presente_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_presente_negContext simple_presente_neg() throws RecognitionException {
		Simple_presente_negContext _localctx = new Simple_presente_negContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_presente_neg);
		int _la;
		try {
			setState(238);
			switch (_input.LA(1)) {
			case DEMOSTRATIVE_ADJ:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(DEMOSTRATIVE_ADJ);
				setState(212);
				nouns_sp();
				setState(213);
				auxdont();
				setState(214);
				verbs();
				setState(216);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(215);
					complement();
					}
				}

				setState(218);
				articles();
				setState(219);
				nouns_sp();
				setState(220);
				auxdont();
				setState(221);
				verbs();
				setState(223);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(222);
					complement();
					}
				}

				}
				break;
			case POSSESIVE_ADJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(POSSESIVE_ADJ);
				setState(226);
				nouns_sp();
				setState(227);
				auxdont();
				setState(228);
				verbs();
				setState(230);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(229);
					complement();
					}
				}

				}
				break;
			case PERSONAL_PRONOUNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				personal_pronouns();
				setState(233);
				auxdont();
				setState(234);
				verbs();
				setState(236);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(235);
					complement();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Present_continous_negContext extends ParserRuleContext {
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public To_be_negContext to_be_neg() {
			return getRuleContext(To_be_negContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode UNDEFINED_ARTICLE() { return getToken(TranslateParser.UNDEFINED_ARTICLE, 0); }
		public TerminalNode CONCRETE_NOUNS() { return getToken(TranslateParser.CONCRETE_NOUNS, 0); }
		public AdjetivesContext adjetives() {
			return getRuleContext(AdjetivesContext.class,0);
		}
		public TerminalNode ADJETIVES() { return getToken(TranslateParser.ADJETIVES, 0); }
		public Present_continous_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present_continous_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterPresent_continous_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitPresent_continous_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitPresent_continous_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Present_continous_negContext present_continous_neg() throws RecognitionException {
		Present_continous_negContext _localctx = new Present_continous_negContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_present_continous_neg);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				personal_pronouns();
				setState(241);
				to_be_neg();
				setState(242);
				verbsg();
				setState(244);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(243);
					complement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				articles();
				setState(247);
				nouns_sp();
				setState(248);
				to_be_neg();
				setState(249);
				verbsg();
				setState(251);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(250);
					complement();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(POSSESIVE_ADJ);
				setState(254);
				nouns_sp();
				setState(255);
				to_be_neg();
				setState(256);
				verbsg();
				setState(258);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(257);
					complement();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				personal_pronouns();
				setState(261);
				to_be_neg();
				setState(262);
				match(UNDEFINED_ARTICLE);
				setState(263);
				match(CONCRETE_NOUNS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				personal_pronouns();
				setState(266);
				to_be_neg();
				setState(267);
				adjetives();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				articles();
				setState(270);
				nouns_sp();
				setState(271);
				to_be_neg();
				setState(272);
				adjetives();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				match(POSSESIVE_ADJ);
				setState(275);
				nouns_sp();
				setState(276);
				to_be_neg();
				setState(277);
				adjetives();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				articles();
				setState(280);
				nouns_sp();
				setState(281);
				to_be_neg();
				setState(282);
				verbsg();
				setState(283);
				match(ADJETIVES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(285);
				match(POSSESIVE_ADJ);
				setState(286);
				nouns_sp();
				setState(287);
				to_be_neg();
				setState(288);
				verbsg();
				setState(289);
				match(ADJETIVES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Participle_sentence_negContext extends ParserRuleContext {
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public Aux_have_negContext aux_have_neg() {
			return getRuleContext(Aux_have_negContext.class,0);
		}
		public PastparticipleContext pastparticiple() {
			return getRuleContext(PastparticipleContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(TranslateParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public Participle_sentence_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participle_sentence_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterParticiple_sentence_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitParticiple_sentence_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitParticiple_sentence_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Participle_sentence_negContext participle_sentence_neg() throws RecognitionException {
		Participle_sentence_negContext _localctx = new Participle_sentence_negContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_participle_sentence_neg);
		int _la;
		try {
			setState(320);
			switch (_input.LA(1)) {
			case PERSONAL_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				personal_pronouns();
				setState(294);
				aux_have_neg();
				setState(295);
				pastparticiple();
				setState(296);
				verbsg();
				setState(298);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(297);
					complement();
					}
				}

				}
				break;
			case DEFINED_ARTICLE:
			case UNDEFINED_ARTICLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				articles();
				setState(301);
				nouns_sp();
				setState(302);
				aux_have_neg();
				setState(303);
				pastparticiple();
				setState(305);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(304);
					verbsg();
					}
				}

				setState(308);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(307);
					complement();
					}
				}

				}
				break;
			case POSSESIVE_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(POSSESIVE_ADJ);
				setState(311);
				nouns_sp();
				setState(312);
				aux_have_neg();
				setState(313);
				match(PAST_PARTICIPLE_VERBS_IRREGULAR);
				setState(315);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(314);
					verbsg();
					}
				}

				setState(318);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(317);
					complement();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_sentence_negContext extends ParserRuleContext {
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public Aux_negContext aux_neg() {
			return getRuleContext(Aux_negContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Aux_sentence_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_sentence_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux_sentence_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux_sentence_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux_sentence_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux_sentence_negContext aux_sentence_neg() throws RecognitionException {
		Aux_sentence_negContext _localctx = new Aux_sentence_negContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aux_sentence_neg);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case PERSONAL_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				personal_pronouns();
				setState(323);
				aux_neg();
				setState(324);
				verbs();
				}
				break;
			case DEFINED_ARTICLE:
			case UNDEFINED_ARTICLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				articles();
				setState(327);
				nouns_sp();
				setState(328);
				aux_neg();
				setState(329);
				verbs();
				}
				break;
			case POSSESIVE_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(POSSESIVE_ADJ);
				setState(332);
				nouns_sp();
				setState(333);
				aux_neg();
				setState(334);
				verbs();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_presente_pregContext extends ParserRuleContext {
		public AuxdoesContext auxdoes() {
			return getRuleContext(AuxdoesContext.class,0);
		}
		public TerminalNode DEMOSTRATIVE_ADJ() { return getToken(TranslateParser.DEMOSTRATIVE_ADJ, 0); }
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public Simple_presente_pregContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_presente_preg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterSimple_presente_preg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitSimple_presente_preg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitSimple_presente_preg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_presente_pregContext simple_presente_preg() throws RecognitionException {
		Simple_presente_pregContext _localctx = new Simple_presente_pregContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_presente_preg);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				auxdoes();
				setState(339);
				match(DEMOSTRATIVE_ADJ);
				setState(340);
				nouns_sp();
				setState(341);
				verbs();
				setState(343);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(342);
					complement();
					}
				}

				setState(345);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				auxdoes();
				setState(348);
				articles();
				setState(349);
				nouns_sp();
				setState(350);
				verbs();
				setState(352);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(351);
					complement();
					}
				}

				setState(354);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				auxdoes();
				setState(357);
				match(POSSESIVE_ADJ);
				setState(358);
				nouns_sp();
				setState(359);
				verbs();
				setState(361);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(360);
					complement();
					}
				}

				setState(363);
				punc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				auxdoes();
				setState(366);
				personal_pronouns();
				setState(367);
				verbs();
				setState(369);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(368);
					complement();
					}
				}

				setState(371);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Present_continous_pregContext extends ParserRuleContext {
		public To_beContext to_be() {
			return getRuleContext(To_beContext.class,0);
		}
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode UNDEFINED_ARTICLE() { return getToken(TranslateParser.UNDEFINED_ARTICLE, 0); }
		public TerminalNode CONCRETE_NOUNS() { return getToken(TranslateParser.CONCRETE_NOUNS, 0); }
		public AdjetivesContext adjetives() {
			return getRuleContext(AdjetivesContext.class,0);
		}
		public TerminalNode ADJETIVES() { return getToken(TranslateParser.ADJETIVES, 0); }
		public Present_continous_pregContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present_continous_preg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterPresent_continous_preg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitPresent_continous_preg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitPresent_continous_preg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Present_continous_pregContext present_continous_preg() throws RecognitionException {
		Present_continous_pregContext _localctx = new Present_continous_pregContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_present_continous_preg);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				to_be();
				setState(376);
				personal_pronouns();
				setState(377);
				verbsg();
				setState(379);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(378);
					complement();
					}
				}

				setState(381);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				to_be();
				setState(384);
				articles();
				setState(385);
				nouns_sp();
				setState(386);
				verbsg();
				setState(388);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(387);
					complement();
					}
				}

				setState(390);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				to_be();
				setState(393);
				match(POSSESIVE_ADJ);
				setState(394);
				nouns_sp();
				setState(395);
				verbsg();
				setState(397);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(396);
					complement();
					}
				}

				setState(399);
				punc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				to_be();
				setState(402);
				personal_pronouns();
				setState(403);
				match(UNDEFINED_ARTICLE);
				setState(404);
				match(CONCRETE_NOUNS);
				setState(405);
				punc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				to_be();
				setState(408);
				personal_pronouns();
				setState(409);
				adjetives();
				setState(410);
				punc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				to_be();
				setState(413);
				articles();
				setState(414);
				nouns_sp();
				setState(415);
				adjetives();
				setState(416);
				punc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				to_be();
				setState(419);
				match(POSSESIVE_ADJ);
				setState(420);
				nouns_sp();
				setState(421);
				adjetives();
				setState(422);
				punc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(424);
				to_be();
				setState(425);
				articles();
				setState(426);
				nouns_sp();
				setState(427);
				verbsg();
				setState(428);
				match(ADJETIVES);
				setState(429);
				punc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(431);
				to_be();
				setState(432);
				match(POSSESIVE_ADJ);
				setState(433);
				nouns_sp();
				setState(434);
				verbsg();
				setState(435);
				match(ADJETIVES);
				setState(436);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Participle_sentence_pregContext extends ParserRuleContext {
		public Aux_haveContext aux_have() {
			return getRuleContext(Aux_haveContext.class,0);
		}
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public PastparticipleContext pastparticiple() {
			return getRuleContext(PastparticipleContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(TranslateParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public Participle_sentence_pregContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participle_sentence_preg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterParticiple_sentence_preg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitParticiple_sentence_preg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitParticiple_sentence_preg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Participle_sentence_pregContext participle_sentence_preg() throws RecognitionException {
		Participle_sentence_pregContext _localctx = new Participle_sentence_pregContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_participle_sentence_preg);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				aux_have();
				setState(441);
				personal_pronouns();
				setState(442);
				pastparticiple();
				setState(443);
				verbsg();
				setState(445);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(444);
					complement();
					}
				}

				setState(447);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				aux_have();
				setState(450);
				articles();
				setState(451);
				nouns_sp();
				setState(452);
				pastparticiple();
				setState(454);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(453);
					verbsg();
					}
				}

				setState(457);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(456);
					complement();
					}
				}

				setState(459);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				aux_have();
				setState(462);
				match(POSSESIVE_ADJ);
				setState(463);
				nouns_sp();
				setState(464);
				match(PAST_PARTICIPLE_VERBS_IRREGULAR);
				setState(466);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(465);
					verbsg();
					}
				}

				setState(469);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(468);
					complement();
					}
				}

				setState(471);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_questionContext extends ParserRuleContext {
		public AuxContext aux() {
			return getRuleContext(AuxContext.class,0);
		}
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Aux_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux_questionContext aux_question() throws RecognitionException {
		Aux_questionContext _localctx = new Aux_questionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aux_question);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				aux();
				setState(476);
				personal_pronouns();
				setState(477);
				verbs();
				setState(478);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				aux();
				setState(481);
				articles();
				setState(482);
				nouns_sp();
				setState(483);
				verbs();
				setState(484);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				aux();
				setState(487);
				match(POSSESIVE_ADJ);
				setState(488);
				nouns_sp();
				setState(489);
				verbs();
				setState(490);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_presente_pregunta_negContext extends ParserRuleContext {
		public AuxdontContext auxdont() {
			return getRuleContext(AuxdontContext.class,0);
		}
		public TerminalNode DEMOSTRATIVE_ADJ() { return getToken(TranslateParser.DEMOSTRATIVE_ADJ, 0); }
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public Simple_presente_pregunta_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_presente_pregunta_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterSimple_presente_pregunta_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitSimple_presente_pregunta_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitSimple_presente_pregunta_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_presente_pregunta_negContext simple_presente_pregunta_neg() throws RecognitionException {
		Simple_presente_pregunta_negContext _localctx = new Simple_presente_pregunta_negContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_presente_pregunta_neg);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				auxdont();
				setState(495);
				match(DEMOSTRATIVE_ADJ);
				setState(496);
				nouns_sp();
				setState(497);
				verbs();
				setState(499);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(498);
					complement();
					}
				}

				setState(501);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				auxdont();
				setState(504);
				articles();
				setState(505);
				nouns_sp();
				setState(506);
				verbs();
				setState(508);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(507);
					complement();
					}
				}

				setState(510);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				auxdont();
				setState(513);
				match(POSSESIVE_ADJ);
				setState(514);
				nouns_sp();
				setState(515);
				verbs();
				setState(517);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(516);
					complement();
					}
				}

				setState(519);
				punc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				auxdont();
				setState(522);
				personal_pronouns();
				setState(523);
				verbs();
				setState(525);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(524);
					complement();
					}
				}

				setState(527);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Present_continous_preg_negContext extends ParserRuleContext {
		public To_be_negContext to_be_neg() {
			return getRuleContext(To_be_negContext.class,0);
		}
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode UNDEFINED_ARTICLE() { return getToken(TranslateParser.UNDEFINED_ARTICLE, 0); }
		public TerminalNode CONCRETE_NOUNS() { return getToken(TranslateParser.CONCRETE_NOUNS, 0); }
		public AdjetivesContext adjetives() {
			return getRuleContext(AdjetivesContext.class,0);
		}
		public TerminalNode ADJETIVES() { return getToken(TranslateParser.ADJETIVES, 0); }
		public Present_continous_preg_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present_continous_preg_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterPresent_continous_preg_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitPresent_continous_preg_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitPresent_continous_preg_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Present_continous_preg_negContext present_continous_preg_neg() throws RecognitionException {
		Present_continous_preg_negContext _localctx = new Present_continous_preg_negContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_present_continous_preg_neg);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				to_be_neg();
				setState(532);
				personal_pronouns();
				setState(533);
				verbsg();
				setState(535);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(534);
					complement();
					}
				}

				setState(537);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				to_be_neg();
				setState(540);
				articles();
				setState(541);
				nouns_sp();
				setState(542);
				verbsg();
				setState(544);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(543);
					complement();
					}
				}

				setState(546);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				to_be_neg();
				setState(549);
				match(POSSESIVE_ADJ);
				setState(550);
				nouns_sp();
				setState(551);
				verbsg();
				setState(553);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(552);
					complement();
					}
				}

				setState(555);
				punc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				to_be_neg();
				setState(558);
				personal_pronouns();
				setState(559);
				match(UNDEFINED_ARTICLE);
				setState(560);
				match(CONCRETE_NOUNS);
				setState(561);
				punc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				to_be_neg();
				setState(564);
				personal_pronouns();
				setState(565);
				adjetives();
				setState(566);
				punc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(568);
				to_be_neg();
				setState(569);
				articles();
				setState(570);
				nouns_sp();
				setState(571);
				adjetives();
				setState(572);
				punc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(574);
				to_be_neg();
				setState(575);
				match(POSSESIVE_ADJ);
				setState(576);
				nouns_sp();
				setState(577);
				adjetives();
				setState(578);
				punc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(580);
				to_be_neg();
				setState(581);
				articles();
				setState(582);
				nouns_sp();
				setState(583);
				verbsg();
				setState(584);
				match(ADJETIVES);
				setState(585);
				punc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(587);
				to_be_neg();
				setState(588);
				match(POSSESIVE_ADJ);
				setState(589);
				nouns_sp();
				setState(590);
				verbsg();
				setState(591);
				match(ADJETIVES);
				setState(592);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Participle_sentence_preg_negContext extends ParserRuleContext {
		public Aux_have_negContext aux_have_neg() {
			return getRuleContext(Aux_have_negContext.class,0);
		}
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public PastparticipleContext pastparticiple() {
			return getRuleContext(PastparticipleContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ComplementContext complement() {
			return getRuleContext(ComplementContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(TranslateParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public Participle_sentence_preg_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participle_sentence_preg_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterParticiple_sentence_preg_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitParticiple_sentence_preg_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitParticiple_sentence_preg_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Participle_sentence_preg_negContext participle_sentence_preg_neg() throws RecognitionException {
		Participle_sentence_preg_negContext _localctx = new Participle_sentence_preg_negContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_participle_sentence_preg_neg);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				aux_have_neg();
				setState(597);
				personal_pronouns();
				setState(598);
				pastparticiple();
				setState(599);
				verbsg();
				setState(601);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(600);
					complement();
					}
				}

				setState(603);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				aux_have_neg();
				setState(606);
				articles();
				setState(607);
				nouns_sp();
				setState(608);
				pastparticiple();
				setState(610);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(609);
					verbsg();
					}
				}

				setState(613);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(612);
					complement();
					}
				}

				setState(615);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				aux_have_neg();
				setState(618);
				match(POSSESIVE_ADJ);
				setState(619);
				nouns_sp();
				setState(620);
				match(PAST_PARTICIPLE_VERBS_IRREGULAR);
				setState(622);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(621);
					verbsg();
					}
				}

				setState(625);
				_la = _input.LA(1);
				if (_la==PREPOSITIONS) {
					{
					setState(624);
					complement();
					}
				}

				setState(627);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_question_negContext extends ParserRuleContext {
		public Aux_negContext aux_neg() {
			return getRuleContext(Aux_negContext.class,0);
		}
		public Personal_pronounsContext personal_pronouns() {
			return getRuleContext(Personal_pronounsContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode POSSESIVE_ADJ() { return getToken(TranslateParser.POSSESIVE_ADJ, 0); }
		public Aux_question_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_question_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux_question_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux_question_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux_question_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux_question_negContext aux_question_neg() throws RecognitionException {
		Aux_question_negContext _localctx = new Aux_question_negContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aux_question_neg);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				aux_neg();
				setState(632);
				personal_pronouns();
				setState(633);
				verbs();
				setState(634);
				punc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				aux_neg();
				setState(637);
				articles();
				setState(638);
				nouns_sp();
				setState(639);
				verbs();
				setState(640);
				punc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				aux_neg();
				setState(643);
				match(POSSESIVE_ADJ);
				setState(644);
				nouns_sp();
				setState(645);
				verbs();
				setState(646);
				punc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuncContext extends ParserRuleContext {
		public TerminalNode PUNCTUATION_SIGNS() { return getToken(TranslateParser.PUNCTUATION_SIGNS, 0); }
		public PuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterPunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitPunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitPunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuncContext punc() throws RecognitionException {
		PuncContext _localctx = new PuncContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_punc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(PUNCTUATION_SIGNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_negContext extends ParserRuleContext {
		public TerminalNode WOULDNT() { return getToken(TranslateParser.WOULDNT, 0); }
		public TerminalNode CANT() { return getToken(TranslateParser.CANT, 0); }
		public TerminalNode SHOULDNT() { return getToken(TranslateParser.SHOULDNT, 0); }
		public Aux_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux_negContext aux_neg() throws RecognitionException {
		Aux_negContext _localctx = new Aux_negContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aux_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WOULDNT) | (1L << CANT) | (1L << SHOULDNT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_have_negContext extends ParserRuleContext {
		public TerminalNode AUXHAVE() { return getToken(TranslateParser.AUXHAVE, 0); }
		public Aux_have_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_have_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux_have_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux_have_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux_have_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux_have_negContext aux_have_neg() throws RecognitionException {
		Aux_have_negContext _localctx = new Aux_have_negContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_aux_have_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(AUXHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxdontContext extends ParserRuleContext {
		public TerminalNode AUXDONT() { return getToken(TranslateParser.AUXDONT, 0); }
		public AuxdontContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxdont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAuxdont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAuxdont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAuxdont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxdontContext auxdont() throws RecognitionException {
		AuxdontContext _localctx = new AuxdontContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_auxdont);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(AUXDONT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxdoesContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TranslateParser.DO, 0); }
		public TerminalNode DOES() { return getToken(TranslateParser.DOES, 0); }
		public AuxdoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxdoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAuxdoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAuxdoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAuxdoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxdoesContext auxdoes() throws RecognitionException {
		AuxdoesContext _localctx = new AuxdoesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_auxdoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !(_la==DO || _la==DOES) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdjetivesContext extends ParserRuleContext {
		public TerminalNode CALIFICATIVES_CMN_ADJ() { return getToken(TranslateParser.CALIFICATIVES_CMN_ADJ, 0); }
		public TerminalNode CALIFICATIVES_COLOR_ADJ() { return getToken(TranslateParser.CALIFICATIVES_COLOR_ADJ, 0); }
		public TerminalNode CALIFICATIVES_CONDITION_ADJ() { return getToken(TranslateParser.CALIFICATIVES_CONDITION_ADJ, 0); }
		public TerminalNode CALIFICATIVES_PERSONALITY_POSITIVE_ADJ() { return getToken(TranslateParser.CALIFICATIVES_PERSONALITY_POSITIVE_ADJ, 0); }
		public TerminalNode CALIFICATIVES_PERSONALITY_NEGATIVE_ADJ() { return getToken(TranslateParser.CALIFICATIVES_PERSONALITY_NEGATIVE_ADJ, 0); }
		public TerminalNode CALIFICATIVES_SIZE_ADJ() { return getToken(TranslateParser.CALIFICATIVES_SIZE_ADJ, 0); }
		public TerminalNode CALIFICATIVES_SOUND_ADJ() { return getToken(TranslateParser.CALIFICATIVES_SOUND_ADJ, 0); }
		public TerminalNode CALIFICATIVES_TIME_ADJ() { return getToken(TranslateParser.CALIFICATIVES_TIME_ADJ, 0); }
		public TerminalNode CALIFICATIVES_TASTETOUCH_ADJ() { return getToken(TranslateParser.CALIFICATIVES_TASTETOUCH_ADJ, 0); }
		public TerminalNode CALIFICATIVES_TOUCH_ADJ() { return getToken(TranslateParser.CALIFICATIVES_TOUCH_ADJ, 0); }
		public TerminalNode CALIFICATIVES_QUANTITY_ADJ() { return getToken(TranslateParser.CALIFICATIVES_QUANTITY_ADJ, 0); }
		public AdjetivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjetives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAdjetives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAdjetives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAdjetives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjetivesContext adjetives() throws RecognitionException {
		AdjetivesContext _localctx = new AdjetivesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_adjetives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALIFICATIVES_CMN_ADJ) | (1L << CALIFICATIVES_COLOR_ADJ) | (1L << CALIFICATIVES_CONDITION_ADJ) | (1L << CALIFICATIVES_PERSONALITY_POSITIVE_ADJ) | (1L << CALIFICATIVES_PERSONALITY_NEGATIVE_ADJ) | (1L << CALIFICATIVES_SIZE_ADJ) | (1L << CALIFICATIVES_SOUND_ADJ) | (1L << CALIFICATIVES_TIME_ADJ) | (1L << CALIFICATIVES_TASTETOUCH_ADJ) | (1L << CALIFICATIVES_TOUCH_ADJ) | (1L << CALIFICATIVES_QUANTITY_ADJ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class To_be_negContext extends ParserRuleContext {
		public TerminalNode VERB_TO_BE_NEG() { return getToken(TranslateParser.VERB_TO_BE_NEG, 0); }
		public To_be_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_be_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterTo_be_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitTo_be_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitTo_be_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final To_be_negContext to_be_neg() throws RecognitionException {
		To_be_negContext _localctx = new To_be_negContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_to_be_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(VERB_TO_BE_NEG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArticlesContext extends ParserRuleContext {
		public TerminalNode DEFINED_ARTICLE() { return getToken(TranslateParser.DEFINED_ARTICLE, 0); }
		public TerminalNode UNDEFINED_ARTICLE() { return getToken(TranslateParser.UNDEFINED_ARTICLE, 0); }
		public ArticlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_articles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterArticles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitArticles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitArticles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticlesContext articles() throws RecognitionException {
		ArticlesContext _localctx = new ArticlesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_articles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_la = _input.LA(1);
			if ( !(_la==DEFINED_ARTICLE || _la==UNDEFINED_ARTICLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PastparticipleContext extends ParserRuleContext {
		public TerminalNode PAST_PARTICIPLE_REGULAR_VERBS() { return getToken(TranslateParser.PAST_PARTICIPLE_REGULAR_VERBS, 0); }
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(TranslateParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public PastparticipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pastparticiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterPastparticiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitPastparticiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitPastparticiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PastparticipleContext pastparticiple() throws RecognitionException {
		PastparticipleContext _localctx = new PastparticipleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pastparticiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !(_la==PAST_PARTICIPLE_VERBS_IRREGULAR || _la==PAST_PARTICIPLE_REGULAR_VERBS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nouns_spContext extends ParserRuleContext {
		public TerminalNode CONCRETE_NOUNS() { return getToken(TranslateParser.CONCRETE_NOUNS, 0); }
		public TerminalNode COMMON_NOUNS() { return getToken(TranslateParser.COMMON_NOUNS, 0); }
		public Nouns_spContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nouns_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterNouns_sp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitNouns_sp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitNouns_sp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nouns_spContext nouns_sp() throws RecognitionException {
		Nouns_spContext _localctx = new Nouns_spContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nouns_sp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( !(_la==CONCRETE_NOUNS || _la==COMMON_NOUNS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbsContext extends ParserRuleContext {
		public TerminalNode REGULAR_VERBS() { return getToken(TranslateParser.REGULAR_VERBS, 0); }
		public TerminalNode IRREGULAR_VERBS() { return getToken(TranslateParser.IRREGULAR_VERBS, 0); }
		public VerbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterVerbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitVerbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitVerbs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbsContext verbs() throws RecognitionException {
		VerbsContext _localctx = new VerbsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_verbs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if ( !(_la==REGULAR_VERBS || _la==IRREGULAR_VERBS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplementContext extends ParserRuleContext {
		public TerminalNode PREPOSITIONS() { return getToken(TranslateParser.PREPOSITIONS, 0); }
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode PLACES_NOUNS() { return getToken(TranslateParser.PLACES_NOUNS, 0); }
		public ComplementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterComplement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitComplement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitComplement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplementContext complement() throws RecognitionException {
		ComplementContext _localctx = new ComplementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_complement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(PREPOSITIONS);
			setState(673);
			articles();
			setState(674);
			match(PLACES_NOUNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_haveContext extends ParserRuleContext {
		public TerminalNode HAVE() { return getToken(TranslateParser.HAVE, 0); }
		public TerminalNode HAS() { return getToken(TranslateParser.HAS, 0); }
		public Aux_haveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_have; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux_have(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux_have(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux_have(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux_haveContext aux_have() throws RecognitionException {
		Aux_haveContext _localctx = new Aux_haveContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_aux_have);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !(_la==HAVE || _la==HAS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxContext extends ParserRuleContext {
		public TerminalNode WOULD() { return getToken(TranslateParser.WOULD, 0); }
		public TerminalNode CAN() { return getToken(TranslateParser.CAN, 0); }
		public TerminalNode SHOULD() { return getToken(TranslateParser.SHOULD, 0); }
		public AuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxContext aux() throws RecognitionException {
		AuxContext _localctx = new AuxContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WOULD) | (1L << CAN) | (1L << SHOULD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Personal_pronounsContext extends ParserRuleContext {
		public TerminalNode PERSONAL_PRONOUNS() { return getToken(TranslateParser.PERSONAL_PRONOUNS, 0); }
		public Personal_pronounsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personal_pronouns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterPersonal_pronouns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitPersonal_pronouns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitPersonal_pronouns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Personal_pronounsContext personal_pronouns() throws RecognitionException {
		Personal_pronounsContext _localctx = new Personal_pronounsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_personal_pronouns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(PERSONAL_PRONOUNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class To_beContext extends ParserRuleContext {
		public TerminalNode VERB_TO_BE() { return getToken(TranslateParser.VERB_TO_BE, 0); }
		public To_beContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_be; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterTo_be(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitTo_be(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitTo_be(this);
			else return visitor.visitChildren(this);
		}
	}

	public final To_beContext to_be() throws RecognitionException {
		To_beContext _localctx = new To_beContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_to_be);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(VERB_TO_BE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbsgContext extends ParserRuleContext {
		public TerminalNode GERUNDS() { return getToken(TranslateParser.GERUNDS, 0); }
		public VerbsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).enterVerbsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslateListener ) ((TranslateListener)listener).exitVerbsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslateVisitor ) return ((TranslateVisitor<? extends T>)visitor).visitVerbsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbsgContext verbsg() throws RecognitionException {
		VerbsgContext _localctx = new VerbsgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_verbsg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(GERUNDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u02b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2W\n\2\3\3\3\3\3\3\3\3\5\3]\n\3\3\3\3\3\3\3\3\3\5\3c\n"+
		"\3\3\3\3\3\3\3\3\3\5\3i\n\3\3\3\3\3\3\3\5\3n\n\3\5\3p\n\3\3\4\3\4\3\4"+
		"\3\4\5\4v\n\4\3\4\3\4\3\4\3\4\3\4\5\4}\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a5\n"+
		"\4\3\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\5\5\5\u00ae\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00b5\n\5\3\5\5\5\u00b8\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u00bf\n\5\3\5"+
		"\5\5\u00c2\n\5\5\5\u00c4\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00d4\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00db\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00e2\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e9\n\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00ef\n\7\5\7\u00f1\n\7\3\b\3\b\3\b\3\b\5\b\u00f7\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00fe\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0105\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0126\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u012d\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0134\n\t\3\t\5\t\u0137"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u013e\n\t\3\t\5\t\u0141\n\t\5\t\u0143\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0153\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u015a\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0163\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u016c\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0174\n\13\3\13\3\13\5\13\u0178"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u017e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0187"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0190\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01b9"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u01c0\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u01c9\n\r\3\r\5\r\u01cc\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d5\n\r"+
		"\3\r\5\r\u01d8\n\r\3\r\3\r\5\r\u01dc\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01ef\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u01f6\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u01ff\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0208\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0210\n\17\3\17\3\17\5\17\u0214"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u021a\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0223\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u022c\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0255"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u025c\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0265\n\21\3\21\5\21\u0268\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0271\n\21\3\21\5\21\u0274\n\21\3\21\3\21\5\21\u0278"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u028b\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\2$"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2"+
		"\13\3\2\13\r\3\2\3\4\4\2\27\33\35\"\3\2&\'\3\2-.\3\2\20\21\3\2+,\3\2\b"+
		"\t\3\2\5\7\u0309\2V\3\2\2\2\4o\3\2\2\2\6\u00a4\3\2\2\2\b\u00c3\3\2\2\2"+
		"\n\u00d3\3\2\2\2\f\u00f0\3\2\2\2\16\u0125\3\2\2\2\20\u0142\3\2\2\2\22"+
		"\u0152\3\2\2\2\24\u0177\3\2\2\2\26\u01b8\3\2\2\2\30\u01db\3\2\2\2\32\u01ee"+
		"\3\2\2\2\34\u0213\3\2\2\2\36\u0254\3\2\2\2 \u0277\3\2\2\2\"\u028a\3\2"+
		"\2\2$\u028c\3\2\2\2&\u028e\3\2\2\2(\u0290\3\2\2\2*\u0292\3\2\2\2,\u0294"+
		"\3\2\2\2.\u0296\3\2\2\2\60\u0298\3\2\2\2\62\u029a\3\2\2\2\64\u029c\3\2"+
		"\2\2\66\u029e\3\2\2\28\u02a0\3\2\2\2:\u02a2\3\2\2\2<\u02a6\3\2\2\2>\u02a8"+
		"\3\2\2\2@\u02aa\3\2\2\2B\u02ac\3\2\2\2D\u02ae\3\2\2\2FW\5\4\3\2GW\5\6"+
		"\4\2HW\5\n\6\2IW\5\b\5\2JW\5\f\7\2KW\5\16\b\2LW\5\20\t\2MW\5\22\n\2NW"+
		"\5\34\17\2OW\5\24\13\2PW\5\26\f\2QW\5\"\22\2RW\5 \21\2SW\5\36\20\2TW\5"+
		"\32\16\2UW\5\30\r\2VF\3\2\2\2VG\3\2\2\2VH\3\2\2\2VI\3\2\2\2VJ\3\2\2\2"+
		"VK\3\2\2\2VL\3\2\2\2VM\3\2\2\2VN\3\2\2\2VO\3\2\2\2VP\3\2\2\2VQ\3\2\2\2"+
		"VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\3\3\2\2\2XY\7\26\2\2YZ\5\66"+
		"\34\2Z\\\58\35\2[]\5:\36\2\\[\3\2\2\2\\]\3\2\2\2]p\3\2\2\2^_\5\62\32\2"+
		"_`\5\66\34\2`b\58\35\2ac\5:\36\2ba\3\2\2\2bc\3\2\2\2cp\3\2\2\2de\7\25"+
		"\2\2ef\5\66\34\2fh\58\35\2gi\5:\36\2hg\3\2\2\2hi\3\2\2\2ip\3\2\2\2jk\5"+
		"@!\2km\58\35\2ln\5:\36\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oX\3\2\2\2o^\3\2"+
		"\2\2od\3\2\2\2oj\3\2\2\2p\5\3\2\2\2qr\5@!\2rs\5B\"\2su\5D#\2tv\5:\36\2"+
		"ut\3\2\2\2uv\3\2\2\2v\u00a5\3\2\2\2wx\5\62\32\2xy\5\66\34\2yz\5B\"\2z"+
		"|\5D#\2{}\5:\36\2|{\3\2\2\2|}\3\2\2\2}\u00a5\3\2\2\2~\177\7\25\2\2\177"+
		"\u0080\5\66\34\2\u0080\u0081\5B\"\2\u0081\u0083\5D#\2\u0082\u0084\5:\36"+
		"\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u00a5\3\2\2\2\u0085\u0086"+
		"\5@!\2\u0086\u0087\5B\"\2\u0087\u0088\7\'\2\2\u0088\u0089\7\20\2\2\u0089"+
		"\u00a5\3\2\2\2\u008a\u008b\5@!\2\u008b\u008c\5B\"\2\u008c\u008d\5.\30"+
		"\2\u008d\u00a5\3\2\2\2\u008e\u008f\5\62\32\2\u008f\u0090\5\66\34\2\u0090"+
		"\u0091\5B\"\2\u0091\u0092\5.\30\2\u0092\u00a5\3\2\2\2\u0093\u0094\7\25"+
		"\2\2\u0094\u0095\5\66\34\2\u0095\u0096\5B\"\2\u0096\u0097\5.\30\2\u0097"+
		"\u00a5\3\2\2\2\u0098\u0099\5\62\32\2\u0099\u009a\5\66\34\2\u009a\u009b"+
		"\5B\"\2\u009b\u009c\5D#\2\u009c\u009d\7\24\2\2\u009d\u00a5\3\2\2\2\u009e"+
		"\u009f\7\25\2\2\u009f\u00a0\5\66\34\2\u00a0\u00a1\5B\"\2\u00a1\u00a2\5"+
		"D#\2\u00a2\u00a3\7\24\2\2\u00a3\u00a5\3\2\2\2\u00a4q\3\2\2\2\u00a4w\3"+
		"\2\2\2\u00a4~\3\2\2\2\u00a4\u0085\3\2\2\2\u00a4\u008a\3\2\2\2\u00a4\u008e"+
		"\3\2\2\2\u00a4\u0093\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5"+
		"\7\3\2\2\2\u00a6\u00a7\5@!\2\u00a7\u00a8\5<\37\2\u00a8\u00aa\5\64\33\2"+
		"\u00a9\u00ab\5D#\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00ae\5:\36\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00c4\3\2\2\2\u00af\u00b0\5\62\32\2\u00b0\u00b1\5\66\34\2\u00b1\u00b2"+
		"\5<\37\2\u00b2\u00b4\5\64\33\2\u00b3\u00b5\5D#\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\5:\36\2\u00b7\u00b6\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c4\3\2\2\2\u00b9\u00ba\7\25\2\2\u00ba"+
		"\u00bb\5\66\34\2\u00bb\u00bc\5<\37\2\u00bc\u00be\7-\2\2\u00bd\u00bf\5"+
		"D#\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00c2\5:\36\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00a6\3\2\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c4"+
		"\t\3\2\2\2\u00c5\u00c6\5@!\2\u00c6\u00c7\5> \2\u00c7\u00c8\58\35\2\u00c8"+
		"\u00d4\3\2\2\2\u00c9\u00ca\5\62\32\2\u00ca\u00cb\5\66\34\2\u00cb\u00cc"+
		"\5> \2\u00cc\u00cd\58\35\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf"+
		"\u00d0\5\66\34\2\u00d0\u00d1\5> \2\u00d1\u00d2\58\35\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00c5\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4"+
		"\13\3\2\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\5\66\34\2\u00d7\u00d8\5*"+
		"\26\2\u00d8\u00da\58\35\2\u00d9\u00db\5:\36\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\62\32\2\u00dd\u00de\5"+
		"\66\34\2\u00de\u00df\5*\26\2\u00df\u00e1\58\35\2\u00e0\u00e2\5:\36\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00f1\3\2\2\2\u00e3\u00e4\7\25"+
		"\2\2\u00e4\u00e5\5\66\34\2\u00e5\u00e6\5*\26\2\u00e6\u00e8\58\35\2\u00e7"+
		"\u00e9\5:\36\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f1\3\2"+
		"\2\2\u00ea\u00eb\5@!\2\u00eb\u00ec\5*\26\2\u00ec\u00ee\58\35\2\u00ed\u00ef"+
		"\5:\36\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00d5\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f1\r\3\2\2\2"+
		"\u00f2\u00f3\5@!\2\u00f3\u00f4\5\60\31\2\u00f4\u00f6\5D#\2\u00f5\u00f7"+
		"\5:\36\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0126\3\2\2\2\u00f8"+
		"\u00f9\5\62\32\2\u00f9\u00fa\5\66\34\2\u00fa\u00fb\5\60\31\2\u00fb\u00fd"+
		"\5D#\2\u00fc\u00fe\5:\36\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0126\3\2\2\2\u00ff\u0100\7\25\2\2\u0100\u0101\5\66\34\2\u0101\u0102"+
		"\5\60\31\2\u0102\u0104\5D#\2\u0103\u0105\5:\36\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0126\3\2\2\2\u0106\u0107\5@!\2\u0107\u0108\5\60"+
		"\31\2\u0108\u0109\7\'\2\2\u0109\u010a\7\20\2\2\u010a\u0126\3\2\2\2\u010b"+
		"\u010c\5@!\2\u010c\u010d\5\60\31\2\u010d\u010e\5.\30\2\u010e\u0126\3\2"+
		"\2\2\u010f\u0110\5\62\32\2\u0110\u0111\5\66\34\2\u0111\u0112\5\60\31\2"+
		"\u0112\u0113\5.\30\2\u0113\u0126\3\2\2\2\u0114\u0115\7\25\2\2\u0115\u0116"+
		"\5\66\34\2\u0116\u0117\5\60\31\2\u0117\u0118\5.\30\2\u0118\u0126\3\2\2"+
		"\2\u0119\u011a\5\62\32\2\u011a\u011b\5\66\34\2\u011b\u011c\5\60\31\2\u011c"+
		"\u011d\5D#\2\u011d\u011e\7\24\2\2\u011e\u0126\3\2\2\2\u011f\u0120\7\25"+
		"\2\2\u0120\u0121\5\66\34\2\u0121\u0122\5\60\31\2\u0122\u0123\5D#\2\u0123"+
		"\u0124\7\24\2\2\u0124\u0126\3\2\2\2\u0125\u00f2\3\2\2\2\u0125\u00f8\3"+
		"\2\2\2\u0125\u00ff\3\2\2\2\u0125\u0106\3\2\2\2\u0125\u010b\3\2\2\2\u0125"+
		"\u010f\3\2\2\2\u0125\u0114\3\2\2\2\u0125\u0119\3\2\2\2\u0125\u011f\3\2"+
		"\2\2\u0126\17\3\2\2\2\u0127\u0128\5@!\2\u0128\u0129\5(\25\2\u0129\u012a"+
		"\5\64\33\2\u012a\u012c\5D#\2\u012b\u012d\5:\36\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0143\3\2\2\2\u012e\u012f\5\62\32\2\u012f\u0130\5"+
		"\66\34\2\u0130\u0131\5(\25\2\u0131\u0133\5\64\33\2\u0132\u0134\5D#\2\u0133"+
		"\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\5:"+
		"\36\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0143\3\2\2\2\u0138"+
		"\u0139\7\25\2\2\u0139\u013a\5\66\34\2\u013a\u013b\5(\25\2\u013b\u013d"+
		"\7-\2\2\u013c\u013e\5D#\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u0141\5:\36\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0127\3\2\2\2\u0142\u012e\3\2\2\2\u0142"+
		"\u0138\3\2\2\2\u0143\21\3\2\2\2\u0144\u0145\5@!\2\u0145\u0146\5&\24\2"+
		"\u0146\u0147\58\35\2\u0147\u0153\3\2\2\2\u0148\u0149\5\62\32\2\u0149\u014a"+
		"\5\66\34\2\u014a\u014b\5&\24\2\u014b\u014c\58\35\2\u014c\u0153\3\2\2\2"+
		"\u014d\u014e\7\25\2\2\u014e\u014f\5\66\34\2\u014f\u0150\5&\24\2\u0150"+
		"\u0151\58\35\2\u0151\u0153\3\2\2\2\u0152\u0144\3\2\2\2\u0152\u0148\3\2"+
		"\2\2\u0152\u014d\3\2\2\2\u0153\23\3\2\2\2\u0154\u0155\5,\27\2\u0155\u0156"+
		"\7\26\2\2\u0156\u0157\5\66\34\2\u0157\u0159\58\35\2\u0158\u015a\5:\36"+
		"\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\5$\23\2\u015c\u0178\3\2\2\2\u015d\u015e\5,\27\2\u015e\u015f\5\62\32\2"+
		"\u015f\u0160\5\66\34\2\u0160\u0162\58\35\2\u0161\u0163\5:\36\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5$\23\2\u0165"+
		"\u0178\3\2\2\2\u0166\u0167\5,\27\2\u0167\u0168\7\25\2\2\u0168\u0169\5"+
		"\66\34\2\u0169\u016b\58\35\2\u016a\u016c\5:\36\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\5$\23\2\u016e\u0178\3\2"+
		"\2\2\u016f\u0170\5,\27\2\u0170\u0171\5@!\2\u0171\u0173\58\35\2\u0172\u0174"+
		"\5:\36\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\5$\23\2\u0176\u0178\3\2\2\2\u0177\u0154\3\2\2\2\u0177\u015d\3\2"+
		"\2\2\u0177\u0166\3\2\2\2\u0177\u016f\3\2\2\2\u0178\25\3\2\2\2\u0179\u017a"+
		"\5B\"\2\u017a\u017b\5@!\2\u017b\u017d\5D#\2\u017c\u017e\5:\36\2\u017d"+
		"\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5$"+
		"\23\2\u0180\u01b9\3\2\2\2\u0181\u0182\5B\"\2\u0182\u0183\5\62\32\2\u0183"+
		"\u0184\5\66\34\2\u0184\u0186\5D#\2\u0185\u0187\5:\36\2\u0186\u0185\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5$\23\2\u0189"+
		"\u01b9\3\2\2\2\u018a\u018b\5B\"\2\u018b\u018c\7\25\2\2\u018c\u018d\5\66"+
		"\34\2\u018d\u018f\5D#\2\u018e\u0190\5:\36\2\u018f\u018e\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5$\23\2\u0192\u01b9\3\2"+
		"\2\2\u0193\u0194\5B\"\2\u0194\u0195\5@!\2\u0195\u0196\7\'\2\2\u0196\u0197"+
		"\7\20\2\2\u0197\u0198\5$\23\2\u0198\u01b9\3\2\2\2\u0199\u019a\5B\"\2\u019a"+
		"\u019b\5@!\2\u019b\u019c\5.\30\2\u019c\u019d\5$\23\2\u019d\u01b9\3\2\2"+
		"\2\u019e\u019f\5B\"\2\u019f\u01a0\5\62\32\2\u01a0\u01a1\5\66\34\2\u01a1"+
		"\u01a2\5.\30\2\u01a2\u01a3\5$\23\2\u01a3\u01b9\3\2\2\2\u01a4\u01a5\5B"+
		"\"\2\u01a5\u01a6\7\25\2\2\u01a6\u01a7\5\66\34\2\u01a7\u01a8\5.\30\2\u01a8"+
		"\u01a9\5$\23\2\u01a9\u01b9\3\2\2\2\u01aa\u01ab\5B\"\2\u01ab\u01ac\5\62"+
		"\32\2\u01ac\u01ad\5\66\34\2\u01ad\u01ae\5D#\2\u01ae\u01af\7\24\2\2\u01af"+
		"\u01b0\5$\23\2\u01b0\u01b9\3\2\2\2\u01b1\u01b2\5B\"\2\u01b2\u01b3\7\25"+
		"\2\2\u01b3\u01b4\5\66\34\2\u01b4\u01b5\5D#\2\u01b5\u01b6\7\24\2\2\u01b6"+
		"\u01b7\5$\23\2\u01b7\u01b9\3\2\2\2\u01b8\u0179\3\2\2\2\u01b8\u0181\3\2"+
		"\2\2\u01b8\u018a\3\2\2\2\u01b8\u0193\3\2\2\2\u01b8\u0199\3\2\2\2\u01b8"+
		"\u019e\3\2\2\2\u01b8\u01a4\3\2\2\2\u01b8\u01aa\3\2\2\2\u01b8\u01b1\3\2"+
		"\2\2\u01b9\27\3\2\2\2\u01ba\u01bb\5<\37\2\u01bb\u01bc\5@!\2\u01bc\u01bd"+
		"\5\64\33\2\u01bd\u01bf\5D#\2\u01be\u01c0\5:\36\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5$\23\2\u01c2\u01dc\3\2"+
		"\2\2\u01c3\u01c4\5<\37\2\u01c4\u01c5\5\62\32\2\u01c5\u01c6\5\66\34\2\u01c6"+
		"\u01c8\5\64\33\2\u01c7\u01c9\5D#\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\5:\36\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\5$\23\2\u01ce\u01dc\3\2"+
		"\2\2\u01cf\u01d0\5<\37\2\u01d0\u01d1\7\25\2\2\u01d1\u01d2\5\66\34\2\u01d2"+
		"\u01d4\7-\2\2\u01d3\u01d5\5D#\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2"+
		"\2\u01d5\u01d7\3\2\2\2\u01d6\u01d8\5:\36\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\5$\23\2\u01da\u01dc\3\2\2\2\u01db"+
		"\u01ba\3\2\2\2\u01db\u01c3\3\2\2\2\u01db\u01cf\3\2\2\2\u01dc\31\3\2\2"+
		"\2\u01dd\u01de\5> \2\u01de\u01df\5@!\2\u01df\u01e0\58\35\2\u01e0\u01e1"+
		"\5$\23\2\u01e1\u01ef\3\2\2\2\u01e2\u01e3\5> \2\u01e3\u01e4\5\62\32\2\u01e4"+
		"\u01e5\5\66\34\2\u01e5\u01e6\58\35\2\u01e6\u01e7\5$\23\2\u01e7\u01ef\3"+
		"\2\2\2\u01e8\u01e9\5> \2\u01e9\u01ea\7\25\2\2\u01ea\u01eb\5\66\34\2\u01eb"+
		"\u01ec\58\35\2\u01ec\u01ed\5$\23\2\u01ed\u01ef\3\2\2\2\u01ee\u01dd\3\2"+
		"\2\2\u01ee\u01e2\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ef\33\3\2\2\2\u01f0\u01f1"+
		"\5*\26\2\u01f1\u01f2\7\26\2\2\u01f2\u01f3\5\66\34\2\u01f3\u01f5\58\35"+
		"\2\u01f4\u01f6\5:\36\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\5$\23\2\u01f8\u0214\3\2\2\2\u01f9\u01fa\5*\26\2\u01fa"+
		"\u01fb\5\62\32\2\u01fb\u01fc\5\66\34\2\u01fc\u01fe\58\35\2\u01fd\u01ff"+
		"\5:\36\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\5$\23\2\u0201\u0214\3\2\2\2\u0202\u0203\5*\26\2\u0203\u0204\7\25"+
		"\2\2\u0204\u0205\5\66\34\2\u0205\u0207\58\35\2\u0206\u0208\5:\36\2\u0207"+
		"\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\5$"+
		"\23\2\u020a\u0214\3\2\2\2\u020b\u020c\5*\26\2\u020c\u020d\5@!\2\u020d"+
		"\u020f\58\35\2\u020e\u0210\5:\36\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0212\5$\23\2\u0212\u0214\3\2\2\2\u0213"+
		"\u01f0\3\2\2\2\u0213\u01f9\3\2\2\2\u0213\u0202\3\2\2\2\u0213\u020b\3\2"+
		"\2\2\u0214\35\3\2\2\2\u0215\u0216\5\60\31\2\u0216\u0217\5@!\2\u0217\u0219"+
		"\5D#\2\u0218\u021a\5:\36\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021c\5$\23\2\u021c\u0255\3\2\2\2\u021d\u021e\5\60"+
		"\31\2\u021e\u021f\5\62\32\2\u021f\u0220\5\66\34\2\u0220\u0222\5D#\2\u0221"+
		"\u0223\5:\36\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0225\5$\23\2\u0225\u0255\3\2\2\2\u0226\u0227\5\60\31\2\u0227"+
		"\u0228\7\25\2\2\u0228\u0229\5\66\34\2\u0229\u022b\5D#\2\u022a\u022c\5"+
		":\36\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\5$\23\2\u022e\u0255\3\2\2\2\u022f\u0230\5\60\31\2\u0230\u0231\5"+
		"@!\2\u0231\u0232\7\'\2\2\u0232\u0233\7\20\2\2\u0233\u0234\5$\23\2\u0234"+
		"\u0255\3\2\2\2\u0235\u0236\5\60\31\2\u0236\u0237\5@!\2\u0237\u0238\5."+
		"\30\2\u0238\u0239\5$\23\2\u0239\u0255\3\2\2\2\u023a\u023b\5\60\31\2\u023b"+
		"\u023c\5\62\32\2\u023c\u023d\5\66\34\2\u023d\u023e\5.\30\2\u023e\u023f"+
		"\5$\23\2\u023f\u0255\3\2\2\2\u0240\u0241\5\60\31\2\u0241\u0242\7\25\2"+
		"\2\u0242\u0243\5\66\34\2\u0243\u0244\5.\30\2\u0244\u0245\5$\23\2\u0245"+
		"\u0255\3\2\2\2\u0246\u0247\5\60\31\2\u0247\u0248\5\62\32\2\u0248\u0249"+
		"\5\66\34\2\u0249\u024a\5D#\2\u024a\u024b\7\24\2\2\u024b\u024c\5$\23\2"+
		"\u024c\u0255\3\2\2\2\u024d\u024e\5\60\31\2\u024e\u024f\7\25\2\2\u024f"+
		"\u0250\5\66\34\2\u0250\u0251\5D#\2\u0251\u0252\7\24\2\2\u0252\u0253\5"+
		"$\23\2\u0253\u0255\3\2\2\2\u0254\u0215\3\2\2\2\u0254\u021d\3\2\2\2\u0254"+
		"\u0226\3\2\2\2\u0254\u022f\3\2\2\2\u0254\u0235\3\2\2\2\u0254\u023a\3\2"+
		"\2\2\u0254\u0240\3\2\2\2\u0254\u0246\3\2\2\2\u0254\u024d\3\2\2\2\u0255"+
		"\37\3\2\2\2\u0256\u0257\5(\25\2\u0257\u0258\5@!\2\u0258\u0259\5\64\33"+
		"\2\u0259\u025b\5D#\2\u025a\u025c\5:\36\2\u025b\u025a\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\5$\23\2\u025e\u0278\3\2\2\2\u025f"+
		"\u0260\5(\25\2\u0260\u0261\5\62\32\2\u0261\u0262\5\66\34\2\u0262\u0264"+
		"\5\64\33\2\u0263\u0265\5D#\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0268\5:\36\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026a\5$\23\2\u026a\u0278\3\2\2\2\u026b"+
		"\u026c\5(\25\2\u026c\u026d\7\25\2\2\u026d\u026e\5\66\34\2\u026e\u0270"+
		"\7-\2\2\u026f\u0271\5D#\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0273\3\2\2\2\u0272\u0274\5:\36\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5$\23\2\u0276\u0278\3\2\2\2\u0277"+
		"\u0256\3\2\2\2\u0277\u025f\3\2\2\2\u0277\u026b\3\2\2\2\u0278!\3\2\2\2"+
		"\u0279\u027a\5&\24\2\u027a\u027b\5@!\2\u027b\u027c\58\35\2\u027c\u027d"+
		"\5$\23\2\u027d\u028b\3\2\2\2\u027e\u027f\5&\24\2\u027f\u0280\5\62\32\2"+
		"\u0280\u0281\5\66\34\2\u0281\u0282\58\35\2\u0282\u0283\5$\23\2\u0283\u028b"+
		"\3\2\2\2\u0284\u0285\5&\24\2\u0285\u0286\7\25\2\2\u0286\u0287\5\66\34"+
		"\2\u0287\u0288\58\35\2\u0288\u0289\5$\23\2\u0289\u028b\3\2\2\2\u028a\u0279"+
		"\3\2\2\2\u028a\u027e\3\2\2\2\u028a\u0284\3\2\2\2\u028b#\3\2\2\2\u028c"+
		"\u028d\7H\2\2\u028d%\3\2\2\2\u028e\u028f\t\2\2\2\u028f\'\3\2\2\2\u0290"+
		"\u0291\7\16\2\2\u0291)\3\2\2\2\u0292\u0293\7\n\2\2\u0293+\3\2\2\2\u0294"+
		"\u0295\t\3\2\2\u0295-\3\2\2\2\u0296\u0297\t\4\2\2\u0297/\3\2\2\2\u0298"+
		"\u0299\79\2\2\u0299\61\3\2\2\2\u029a\u029b\t\5\2\2\u029b\63\3\2\2\2\u029c"+
		"\u029d\t\6\2\2\u029d\65\3\2\2\2\u029e\u029f\t\7\2\2\u029f\67\3\2\2\2\u02a0"+
		"\u02a1\t\b\2\2\u02a19\3\2\2\2\u02a2\u02a3\7\67\2\2\u02a3\u02a4\5\62\32"+
		"\2\u02a4\u02a5\7\22\2\2\u02a5;\3\2\2\2\u02a6\u02a7\t\t\2\2\u02a7=\3\2"+
		"\2\2\u02a8\u02a9\t\n\2\2\u02a9?\3\2\2\2\u02aa\u02ab\7(\2\2\u02abA\3\2"+
		"\2\2\u02ac\u02ad\78\2\2\u02adC\3\2\2\2\u02ae\u02af\7\66\2\2\u02afE\3\2"+
		"\2\2DV\\bhmou|\u0083\u00a4\u00aa\u00ad\u00b4\u00b7\u00be\u00c1\u00c3\u00d3"+
		"\u00da\u00e1\u00e8\u00ee\u00f0\u00f6\u00fd\u0104\u0125\u012c\u0133\u0136"+
		"\u013d\u0140\u0142\u0152\u0159\u0162\u016b\u0173\u0177\u017d\u0186\u018f"+
		"\u01b8\u01bf\u01c8\u01cb\u01d4\u01d7\u01db\u01ee\u01f5\u01fe\u0207\u020f"+
		"\u0213\u0219\u0222\u022b\u0254\u025b\u0264\u0267\u0270\u0273\u0277\u028a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}