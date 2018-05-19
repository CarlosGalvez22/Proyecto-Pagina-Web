grammar Translate;

body
:
	simple_presente //presente simple
	| present_continous //presente continuo
	| aux_sentence //oraciones con auxiliares
	| participle_sentence //oraciones con pasado participio
	| simple_presente_neg //presente simple negado
	| present_continous_neg //presente continuo negado
	| participle_sentence_neg //oraciones con pasado participio negado
	| aux_sentence_neg //oraciones con auxiliar negado
	| simple_presente_pregunta_neg //preguntas de presente simple negados
	| simple_presente_preg //preguntas con presente simple
	| present_continous_preg //preguntas con presente continuo
	| aux_question_neg //preguntas con auxiliar negado
	| participle_sentence_preg_neg //preguntas con pasado participio negado
	| present_continous_preg_neg //preguntas con presente continuo negado
	| aux_question //preguntas con auxiliares
	| participle_sentence_preg //pregunta con pasado participio
;
//Afirmativo
//simple present

simple_presente
:
	DEMOSTRATIVE_ADJ nouns_sp verbs
	(
		complement
	)?
	| articles nouns_sp verbs
	(
		complement
	)?
	| POSSESIVE_ADJ nouns_sp verbs
	(
		complement
	)?
	| personal_pronouns verbs
	(
		complement
	)?
;
//presente continuo

present_continous
:
	personal_pronouns to_be verbsg
	(
		complement
	)?
	| articles nouns_sp to_be verbsg
	(
		complement
	)?
	| POSSESIVE_ADJ nouns_sp to_be verbsg
	(
		complement
	)?
	| personal_pronouns to_be UNDEFINED_ARTICLE CONCRETE_NOUNS
	| personal_pronouns to_be adjetives
	| articles nouns_sp to_be adjetives
	| POSSESIVE_ADJ nouns_sp to_be adjetives
	| articles nouns_sp to_be verbsg ADJETIVES
	| POSSESIVE_ADJ nouns_sp to_be verbsg ADJETIVES
;

participle_sentence
:
	personal_pronouns aux_have pastparticiple (verbsg)?
	(
		complement
	)?
	| articles nouns_sp aux_have pastparticiple
	(
		verbsg
	)?
	(
		complement
	)?
	| POSSESIVE_ADJ nouns_sp aux_have PAST_PARTICIPLE_VERBS_IRREGULAR
	(
		verbsg
	)?
	(
		complement
	)?
;

aux_sentence
:
	personal_pronouns aux verbs
	| articles nouns_sp aux verbs
	| POSSESIVE_ADJ nouns_sp aux verbs
;
//Negativo

simple_presente_neg
:
	DEMOSTRATIVE_ADJ nouns_sp auxdont verbs
	(
		complement
	)? articles nouns_sp auxdont verbs
	(
		complement
	)?
	| POSSESIVE_ADJ nouns_sp auxdont verbs
	(
		complement
	)?
	| personal_pronouns auxdont verbs
	(
		complement
	)?
;

present_continous_neg
:
	personal_pronouns to_be_neg verbsg
	(
		complement
	)?
	| articles nouns_sp to_be_neg verbsg
	(
		complement
	)?
	| POSSESIVE_ADJ nouns_sp to_be_neg verbsg
	(
		complement
	)?
	| personal_pronouns to_be_neg UNDEFINED_ARTICLE CONCRETE_NOUNS
	| personal_pronouns to_be_neg adjetives
	| articles nouns_sp to_be_neg adjetives
	| POSSESIVE_ADJ nouns_sp to_be_neg adjetives
	| articles nouns_sp to_be_neg verbsg ADJETIVES
	| POSSESIVE_ADJ nouns_sp to_be_neg verbsg ADJETIVES
;

participle_sentence_neg
:
	personal_pronouns aux_have_neg pastparticiple verbsg
	(
		complement
	)?
	| articles nouns_sp aux_have_neg pastparticiple
	(
		verbsg
	)?
	(
		complement
	)?
	| POSSESIVE_ADJ nouns_sp aux_have_neg PAST_PARTICIPLE_VERBS_IRREGULAR
	(
		verbsg
	)?
	(
		complement
	)?
;

aux_sentence_neg
:
	personal_pronouns aux_neg verbs
	| articles nouns_sp aux_neg verbs
	| POSSESIVE_ADJ nouns_sp aux_neg verbs
;

simple_presente_preg
:
	auxdoes DEMOSTRATIVE_ADJ nouns_sp verbs
	(
		complement
	)? punc
	| auxdoes articles nouns_sp verbs
	(
		complement
	)? punc
	| auxdoes POSSESIVE_ADJ nouns_sp verbs
	(
		complement
	)? punc
	| auxdoes personal_pronouns verbs
	(
		complement
	)? punc
;

present_continous_preg
:
	to_be personal_pronouns verbsg
	(
		complement
	)? punc
	| to_be articles nouns_sp verbsg
	(
		complement
	)? punc
	| to_be POSSESIVE_ADJ nouns_sp verbsg
	(
		complement
	)? punc
	| to_be personal_pronouns UNDEFINED_ARTICLE CONCRETE_NOUNS punc
	| to_be personal_pronouns adjetives punc
	| to_be articles nouns_sp adjetives punc
	| to_be POSSESIVE_ADJ nouns_sp adjetives punc
	| to_be articles nouns_sp verbsg ADJETIVES punc
	| to_be POSSESIVE_ADJ nouns_sp verbsg ADJETIVES punc
;

participle_sentence_preg
:
	aux_have personal_pronouns pastparticiple verbsg
	(
		complement
	)? punc
	| aux_have articles nouns_sp pastparticiple
	(
		verbsg
	)?
	(
		complement
	)? punc
	| aux_have POSSESIVE_ADJ nouns_sp PAST_PARTICIPLE_VERBS_IRREGULAR
	(
		verbsg
	)?
	(
		complement
	)? punc
;

aux_question
:
	aux personal_pronouns verbs punc
	| aux articles nouns_sp verbs punc
	| aux POSSESIVE_ADJ nouns_sp verbs punc
;

simple_presente_pregunta_neg
:
	auxdont DEMOSTRATIVE_ADJ nouns_sp verbs
	(
		complement
	)? punc
	| auxdont articles nouns_sp verbs
	(
		complement
	)? punc
	| auxdont POSSESIVE_ADJ nouns_sp verbs
	(
		complement
	)? punc
	| auxdont personal_pronouns verbs
	(
		complement
	)? punc
;

present_continous_preg_neg
:
	to_be_neg personal_pronouns verbsg
	(
		complement
	)? punc
	| to_be_neg articles nouns_sp verbsg
	(
		complement
	)? punc
	| to_be_neg POSSESIVE_ADJ nouns_sp verbsg
	(
		complement
	)? punc
	| to_be_neg personal_pronouns UNDEFINED_ARTICLE CONCRETE_NOUNS punc
	| to_be_neg personal_pronouns adjetives punc
	| to_be_neg articles nouns_sp adjetives punc
	| to_be_neg POSSESIVE_ADJ nouns_sp adjetives punc
	| to_be_neg articles nouns_sp verbsg ADJETIVES punc
	| to_be_neg POSSESIVE_ADJ nouns_sp verbsg ADJETIVES punc
;

participle_sentence_preg_neg
:
	aux_have_neg personal_pronouns pastparticiple verbsg
	(
		complement
	)? punc
	| aux_have_neg articles nouns_sp pastparticiple
	(
		verbsg
	)?
	(
		complement
	)? punc
	| aux_have_neg POSSESIVE_ADJ nouns_sp PAST_PARTICIPLE_VERBS_IRREGULAR
	(
		verbsg
	)?
	(
		complement
	)? punc
;

aux_question_neg
:
	aux_neg personal_pronouns verbs punc
	| aux_neg articles nouns_sp verbs punc
	| aux_neg POSSESIVE_ADJ nouns_sp verbs punc
;

punc
:
	PUNCTUATION_SIGNS
;

aux_neg
:
	WOULDNT
	| CANT
	| SHOULDNT
;

aux_have_neg
:
	AUXHAVE
;

auxdont
:
	AUXDONT
;

auxdoes
:
	DO
	| DOES
;

adjetives
:
	CALIFICATIVES_CMN_ADJ
	| CALIFICATIVES_COLOR_ADJ
	| CALIFICATIVES_CONDITION_ADJ
	| CALIFICATIVES_PERSONALITY_POSITIVE_ADJ
	| CALIFICATIVES_PERSONALITY_NEGATIVE_ADJ
	| CALIFICATIVES_SIZE_ADJ
	| CALIFICATIVES_SOUND_ADJ
	| CALIFICATIVES_TIME_ADJ
	| CALIFICATIVES_TASTETOUCH_ADJ
	| CALIFICATIVES_TOUCH_ADJ
	| CALIFICATIVES_QUANTITY_ADJ
;

to_be_neg
:
	VERB_TO_BE_NEG
;

articles
:
	DEFINED_ARTICLE
	| UNDEFINED_ARTICLE
;

pastparticiple
:
	PAST_PARTICIPLE_REGULAR_VERBS
	| PAST_PARTICIPLE_VERBS_IRREGULAR
;

nouns_sp
:
	CONCRETE_NOUNS
	| COMMON_NOUNS
;

verbs
:
	REGULAR_VERBS
	| IRREGULAR_VERBS
;

complement
:
	PREPOSITIONS articles PLACES_NOUNS
;

aux_have
:
	HAVE
	| HAS
;

aux
:
	WOULD
	| CAN
	| SHOULD
;

personal_pronouns
:
	PERSONAL_PRONOUNS
;

to_be
:
	VERB_TO_BE
;

verbsg
:
	GERUNDS
;

DO
:
	'do'
;

DOES
:
	'does'
;

WOULD
:
	'would'
;

CAN
:
	'can'
;

SHOULD
:
	'should'
;

HAVE
:
	'have'
;

HAS
:
	'has'
;

AUXDONT
:
	'dont'
	| 'doesnt'
	| 'do not'
	| 'does not'
;

WOULDNT
:
	'wouldnt'
	| 'would not'
;

CANT
:
	'cant'
	| 'can not'
;

SHOULDNT
:
	'shouldnt'
	| 'should not'
;

AUXHAVE
:
	'havent'
	| 'hasnt'
	| 'have not'
	| 'has not'
;

ABSTRACT_NOUNS
:
	'beauty'
	| 'bravery'
	| 'brilliance'
	| 'brutality'
	| 'charity'
	| 'coldness'
	| 'compassion'
	| 'confidence'
	| 'contentment'
	| 'courage'
	| 'curiosity'
	| 'dedication'
	| 'determination'
	| 'ego'
	| 'elegance'
	| 'enthusiasm'
	| 'envy'
	| 'evil'
	| 'fear'
	| 'generosity'
	| 'goodness'
	| 'graciousness'
	| 'hatred'
	| 'honesty'
	| 'honor'
	| 'hope'
	| 'humility'
	| 'humor'
	| 'insanity'
	| 'integrity'
	| 'intelligence'
	| 'jealousy'
	| 'kindness'
	| 'loyalty'
	| 'maturity'
	| 'patience'
	| 'perseverance'
	| 'sanity'
	| 'self-control'
	| 'sensitivity'
	| 'sophistication'
	| 'stupidity'
	| 'sympathy'
	| 'talent'
	| 'tolerance'
	| 'trust'
	| 'warmth'
	| 'weakness'
	| 'wisdom'
	| 'wit'
;

CONCRETE_NOUNS
:
	'student'
	| 'fire fighter'
	| 'pencil'
	| 'computer'
	| 'road'
	| 'toddler'
	| 'yardstick'
	| 'egg'
	| 'sponge'
;

COMMON_NOUNS
:
	'boy'
	| 'girl'
	| 'train'
	| 'car'
	| 'motorcycle'
	| 'mouse'
	| 'dog'
	| 'cow'
	| 'horse'
	| 'goat'
	| 'frog'
	| 'toad'
	| 'chair'
	| 'giraffe'
	| 'pen'
	| 'phone'
	| 'ant'
	| 'bird'
	| 'bed'
	| 'screen'
	| 'desk'
	| 'notebook'
	| 'donkey'
	| 'tree'
	| 'mom'
	| 'dad'
	| 'uncle'
	| 'brother'
	| 'sister'
	| 'son'
	| 'aunt'
	| 'grandmother'
	| 'grandfather'
	| 'daughter'
	| 'nephew'
	| 'niece'
	| 'wife'
	| 'shirt'
	| 'pants'
	| 'shoe'
	| 'sock'
	| 'bottle'
	| 'nail'
	| 'hair'
	| 'eye'
	| 'ear'
	| 'nose'
	| 'mouth'
	| 'finger'
	| 'neck'
	| 'chin'
	| 'table'
	| 'wallet'
	| 'cap'
	| 'hat'
	| 'cat'
;

PLACES_NOUNS
:
	'house'
	| 'park'
	| 'city'
	| 'country'
	| 'airport'
	| 'amusement park'
	| 'cateen'
	| 'casino'
	| 'church'
	| 'cinema'
	| 'convent'
	| 'dairy'
	| 'disco'
	| 'drugstore'
	| 'fire station'
	| 'art gallery'
	| 'bus station'
	| 'cathedral'
	| 'beauty parlor'
	| 'bank'
	| 'court'
	| 'castle'
	| 'factory'
	| 'hospital'
	| 'hotel'
	| 'jail'
	| 'library'
	| 'market'
	| 'museum'
	| 'office'
	| 'pet shop'
	| 'school'
	| 'train station'
	| 'zoo'
	| 'university'
;

UNCOUNTABLE_NOUNS
:
	'tea'
	| 'sugar'
	| 'water'
	| 'air'
	| 'rice'
	| 'knowledge'
	| 'anger'
	| 'money'
	| 'research'
	| 'safety'
	| 'evidence'
;

ADJETIVES
:
	'me'
	| 'them'
	| 'us'
;

POSSESIVE_ADJ
:
	'my'
	| 'our'
	| 'your'
	| 'their'
	| 'his'
	| 'her'
	| 'its'
;

DEMOSTRATIVE_ADJ
:
	'these'
	| 'those'
	| 'that'
	| 'this'
;

CALIFICATIVES_CMN_ADJ
:
	'good'
	| 'new'
	| 'last'
	| 'own'
	| 'other'
	| 'different'
	| 'small'
	| 'next'
	| 'important'
	| 'public'
	| 'same'
	| 'able'
;

CALIFICATIVES_COLOR_ADJ
:
	'red'
	| 'orange'
	| 'yellow'
	| 'green'
	| 'blue'
	| 'purple'
	| 'gray'
	| 'black'
	| 'white'
	| 'pink'
	| 'skyblue'
;

CALIFICATIVES_CONDITION_ADJ
:
	'alive'
	| 'better'
	| 'careful'
	| 'clever'
	| 'dead'
	| 'easy'
	| 'famous'
	| 'gifted'
	| 'helpful'
	| 'inexpensive'
	| 'mushy'
	| 'odd'
	| 'powerful'
	| 'rich'
	| 'shy'
	| 'tender'
	| 'uninterested'
	| 'vast'
	| 'wrong'
;

CALIFICATIVES_PERSONALITY_POSITIVE_ADJ
:
	'agreeable'
	| 'brave'
	| 'calm'
	| 'delightful'
	| 'eager'
	| 'faithful'
	| 'gentle'
	| 'happy'
	| 'jolly'
	| 'kind'
	| 'lively'
	| 'nice'
	| 'obedient'
	| 'proud'
	| 'relieved'
	| 'silly'
	| 'thankful'
	| 'victorious'
	| 'witty'
	| 'zealous'
;

CALIFICATIVES_PERSONALITY_NEGATIVE_ADJ
:
	'angry'
	| 'bewildered'
	| 'clumsy'
	| 'defeated'
	| 'embarrassed'
	| 'fierce'
	| 'grumpy'
	| 'helpless'
	| 'itchy'
	| 'jealous'
	| 'lazy'
	| 'repulsive'
	| 'mysterious'
	| 'scary'
	| 'nervous'
	| 'thoughtless'
	| 'obnoxious'
	| 'uptight'
	| 'panicky'
;

CALIFICATIVES_SHAPE_ADJ
:
	'broad'
	| 'narrow'
	| 'chubby'
	| 'round'
	| 'shallow'
	| 'curved'
	| 'skinny'
	| 'deep'
	| 'square'
	| 'flat'
	| 'steep'
	| 'high'
	| 'straight'
	| 'hollow'
	| 'wide'
	| 'low'
;

CALIFICATIVES_SIZE_ADJ
:
	'big'
	| 'miniature'
	| 'colossal'
	| 'petite'
	| 'fat'
	| 'puny'
	| 'gigantic'
	| 'scrawny'
	| 'great'
	| 'immense'
	| 'tall'
	| 'large'
	| 'teeny'
	| 'teeny-tiny'
	| 'mammoth'
	| 'tiny'
	| 'massive'
;

CALIFICATIVES_SOUND_ADJ
:
	'cooing'
	| 'purring'
	| 'deafening'
	| 'quiet'
	| 'faint'
	| 'raspy'
	| 'hissing'
	| 'screeching'
	| 'loud'
	| 'thundering'
	| 'melodic'
	| 'voiceless'
	| 'noisy'
	| 'whispering'
;

CALIFICATIVES_TIME_ADJ
:
	'ancient'
	| 'old_fashioned'
	| 'brief'
	| 'quick'
	| 'early'
	| 'rapid'
	| 'short'
	| 'late'
	| 'slow'
	| 'long'
	| 'swift'
	| 'modern'
	| 'young'
	| 'old'
;

CALIFICATIVES_TASTETOUCH_ADJ
:
	'bitter'
	| 'rotten'
	| 'delicious'
	| 'salty'
	| 'fresh'
	| 'sticky'
	| 'greasy'
	| 'strong'
	| 'juicy'
	| 'sweet'
	| 'hot'
	| 'tart'
	| 'icy'
	| 'tasteless'
	| 'loose'
	| 'uneven'
	| 'melted'
	| 'weak'
	| 'nutritious'
	| 'wet'
	| 'prickly'
	| 'wooden'
	| 'rainy'
	| 'yummy'
;

CALIFICATIVES_TOUCH_ADJ
:
	'boiling'
	| 'damp'
	| 'breeze'
	| 'dirty'
	| 'bumpy'
	| 'dusty'
	| 'chilly'
	| 'filthy'
	| 'cold'
	| 'flaky'
	| 'cool'
	| 'fluffy'
	| 'creepy'
	| 'freezing'
	| 'crooked'
	| 'cuddly'
	| 'warm'
	| 'curly'
	| 'damaged'
;

CALIFICATIVES_QUANTITY_ADJ
:
	'abundant'
	| 'light'
	| 'empty'
	| 'many'
	| 'few'
	| 'numerous'
	| 'full'
	| 'sparse'
	| 'heavy'
	| 'substantial'
;

ORDINAL_NUMBERS
:
	'one'
	| 'two'
	| 'three'
	| 'four'
	| 'five'
	| 'six'
	| 'seven'
	| 'eight'
	| 'nine'
	| 'ten'
	| 'eleven'
	| 'twelve'
	| 'thirteen'
	| 'fourteen'
	| 'fifteen'
	| 'sixteen'
	| 'seventeen'
	| 'eighteen'
	| 'nineteen'
	| 'twenty'
	| 'twenty-one'
	| 'twenty-two'
	| 'twenty-three'
	| 'twenty-four'
	| 'twenty-five'
	| 'twenty-six'
	| 'twenty-seven'
	| 'twenty-eight'
	| 'twenty-nine'
	| 'thirty'
	| 'forty'
	| 'fifty'
	| 'sixty'
	| 'seventy'
	| 'eighty'
	| 'ninety'
	| 'one hundred'
	| 'two hundred'
	| 'three hundred'
	| 'four hundred'
	| 'five hundred'
	| 'six hundred'
	| 'seven hundred'
	| 'eight hundred'
	| 'nine hundred'
	| 'one thousand'
;

CARDINAL_NUMBERS
:
	'first'
	| 'second'
	| 'third'
	| 'fourth'
	| 'fifth'
	| 'sixth'
	| 'seventh'
	| 'eighth'
	| 'ninth'
	| 'tenth'
	| 'eleventh'
	| 'twelfth'
	| 'thirteenth'
	| 'fourteenth'
	| 'fifteenth'
	| 'sixteenth'
	| 'seventeenth'
	| 'eighteenth'
	| 'nineteenth'
	| 'twentieth'
	| 'twenty-first'
	| 'twenty-second'
	| 'twenty-third'
	| 'twenty-fourth'
	| 'twenty-fifth'
	| 'twenty-sixth'
	| 'twenty-seventh'
	| 'twenty-eighth'
	| 'twenty-ninth'
	| 'thirtieth'
	| 'fourtieth'
	| 'fiftieth'
	| 'sixtieth'
	| 'seventieth'
	| 'eightieth'
	| 'ninetieth'
	| 'one hundredth'
	| 'two hundredth'
;

UNDEFINED_ADJ
:
	'all'
	| 'any'
	| 'both'
	| 'each'
	| 'less'
	| 'little'
	| 'others'
	| 'several'
	| 'some'
;

DEFINED_ARTICLE
:
	'the'
;

UNDEFINED_ARTICLE
:
	'a'
	| 'an'
;

PERSONAL_PRONOUNS
:
	'i'
	| 'you'
	| 'we'
	| 'they'
	| 'he'
	| 'she'
	| 'it'
;

DEMOSTRATIVES_PRONOUNS
:
	'such'
	| 'none'
	| 'ones'
;

INTERROGATIVE_PRONOUNS
:
	'who'
	| 'whom'
	| 'what'
	| 'whose'
	| 'which'
	| 'how'
;

REGULAR_VERBS
:
	'accept'
	| 'add'
	| 'agree'
	| 'answer'
	| 'apologize'
	| 'appear'
	| 'ask'
	| 'believe'
	| 'belong'
	| 'call'
	| 'change'
	| 'close'
	| 'compare'
	| 'copy'
	| 'cry'
	| 'dance'
	| 'decide'
	| 'discover'
	| 'dry'
	| 'end'
	| 'enjoy'
	| 'explain'
	| 'finish'
	| 'guess'
	| 'happen'
	| 'help'
	| 'hurry'
	| 'imagine'
	| 'increase'
	| 'include'
	| 'invite'
	| 'jump'
	| 'kill'
	| 'kiss'
	| 'laugh'
	| 'lie'
	| 'listen'
	| 'live'
	| 'love'
	| 'move'
	| 'open'
	| 'play'
	| 'produce'
	| 'pull'
	| 'rain'
	| 'reach'
	| 'remember'
	| 'return'
	| 'save'
	| 'smile'
	| 'stop'
	| 'talk'
	| 'touch'
	| 'thank'
	| 'translate'
	| 'travel'
	| 'visit'
	| 'wait'
	| 'walk'
	| 'want'
	| 'wash'
	| 'work'
	| 'worry'
;

IRREGULAR_VERBS
:
	'eat'
	| 'be'
	| 'become'
	| 'bite'
	| 'break'
	| 'buy'
	| 'choose'
	| 'come'
	| 'cost'
	| 'cut'
	| 'fall'
	| 'feel'
	| 'find'
	| 'forget'
	| 'get'
	| 'give'
	| 'go'
	| 'hold'
	| 'know'
	| 'learn'
	| 'let'
	| 'lose'
	| 'make'
	| 'meet'
	| 'mistake'
	| 'pay'
	| 'put'
	| 'read'
	| 'say'
	| 'sell'
	| 'show'
	| 'sing'
	| 'sleep'
	| 'speak'
	| 'swim'
	| 'take'
	| 'teach'
	| 'tell'
	| 'think'
	| 'understand'
	| 'win'
;

PAST_PARTICIPLE_VERBS_IRREGULAR
:
	'been'
	| 'bitten'
	| 'broken'
	| 'bought'
	| 'chosen'
	| 'done'
	| 'fallen'
	| 'felt'
	| 'found'
	| 'forgotten'
	| 'got'
	| 'gotten'
	| 'given'
	| 'gone'
	| 'had'
	| 'held'
	| 'known'
	| 'lost'
	| 'made'
	| 'met'
	| 'paid'
	| 'said'
	| 'sold'
	| 'shown'
	| 'showed'
	| 'sung'
	| 'slept'
	| 'swum'
	| 'taken'
	| 'taught'
	| 'told'
	| 'thought'
	| 'understood'
	| 'won'
;

PAST_PARTICIPLE_REGULAR_VERBS
:
	'accepted'
	| 'added'
	| 'agreed'
	| 'answered'
	| 'apologized'
	| 'appeared'
	| 'asked'
	| 'believed'
	| 'belonged'
	| 'called'
	| 'changed'
	| 'closed'
	| 'compared'
	| 'copied'
	| 'cried'
	| 'danced'
	| 'decided'
	| 'discovered'
	| 'dried'
	| 'ended'
	| 'enjoyed'
	| 'explained'
	| 'finished'
	| 'guessed'
	| 'happened'
	| 'helped'
	| 'hurried'
	| 'imagined'
	| 'increased'
	| 'included'
	| 'invited'
	| 'jumped'
	| 'killed'
	| 'kissed'
	| 'laughed'
	| 'lied'
	| 'listened'
	| 'lived'
	| 'loved'
	| 'moved'
	| 'opened'
	| 'played'
	| 'produced'
	| 'pulled'
	| 'rained'
	| 'reached'
	| 'remembered'
	| 'returned'
	| 'saved'
	| 'smiled'
	| 'stopped'
	| 'talked'
	| 'touched'
	| 'thanked'
	| 'translated'
	| 'traveled'
	| 'visited'
	| 'waited'
	| 'walked'
	| 'wanted'
	| 'washed'
	| 'worked'
	| 'worried'
;

ADVERBS_TIME
:
	'now'
	| 'yesterday'
	| 'the day before yesterday'
	| 'today'
	| 'tomorrow'
	| 'last night'
	| 'still'
	| 'neverless'
	| 'afterwards'
	| 'quickly'
	| 'never'
	| 'always'
	| 'yet'
	| 'already'
;

ADVERBS_PLACE
:
	'here'
	| 'there'
	| 'over there'
	| 'outside'
	| 'up'
	| 'upstairs'
	| 'back'
	| 'underneath'
	| 'where'
;

ADVERBS_QUANTITY
:
	'something'
	| 'anything'
	| 'nothing'
	| 'hardly'
	| 'enough'
	| 'how much'
	| 'too much'
	| 'more'
	| 'much'
	| 'a lot of'
	| 'every'
	| 'entire'
	| 'only'
	| 'half'
	| 'so much'
;

ADVERBS_MODE
:
	'in this way'
	| 'like this'
	| 'well'
	| 'bad'
	| 'almost'
	| 'slowly'
	| 'fast'
;

AFFIRMATIVE_ADVERBS
:
	'if'
	| 'of course'
	| 'exact'
	| 'right'
	| 'really'
	| 'certainly'
	| 'surely'
	| 'fair'
	| 'just'
;

NEGATIVE_ADVERBS
:
	'no'
	| 'either'
	| 'neither'
	| 'ever'
;

ADVERBS_DOUBT
:
	'perhaps'
	| 'maybe'
	| 'probably'
;

GERUNDS
:
	'playing'
	| 'eating'
	| 'accepting'
	| 'adding'
	| 'agreeing'
	| 'answering'
	| 'apologizing'
	| 'appearing'
	| 'asking'
	| 'believing'
	| 'belonging'
	| 'calling'
	| 'changing'
	| 'closing'
	| 'comparing'
	| 'copying'
	| 'crying'
	| 'dancing'
	| 'deciding'
	| 'discovering'
	| 'drying'
	| 'ending'
	| 'enjoying'
	| 'explaining'
	| 'finishing'
	| 'guessing'
	| 'happening'
	| 'helping'
	| 'hurrying'
	| 'imagining'
	| 'increasing'
	| 'including'
	| 'inviting'
	| 'jumping'
	| 'killing'
	| 'kissing'
	| 'laughing'
	| 'lying'
	| 'listening'
	| 'living'
	| 'loving'
	| 'moving'
	| 'opening'
	| 'producing'
	| 'pulling'
	| 'raining'
	| 'reaching'
	| 'remembering'
	| 'returning'
	| 'saving'
	| 'smiling'
	| 'stoping'
	| 'talking'
	| 'touching'
	| 'thanking'
	| 'translating'
	| 'traveling'
	| 'visiting'
	| 'waiting'
	| 'walking'
	| 'wanting'
	| 'washing'
	| 'working'
	| 'worrying'
;

PREPOSITIONS
:
	'in'
	| 'after'
	| 'at'
	| 'behind'
	| 'beneath'
	| 'between'
	| 'by'
	| 'except'
	| 'from'
	| 'into'
	| 'near'
	| 'off'
	| 'over'
	| 'trought'
	| 'under'
	| 'upon'
	| 'above'
	| 'before'
	| 'among'
	| 'below'
	| 'beside'
	| 'down'
	| 'like'
	| 'of'
	| 'on'
	| 'to'
	| 'with'
;

VERB_TO_BE
:
	'is'
	| 'am'
	| 'are'
;

VERB_TO_BE_NEG
:
	'isnt'
	| 'arent'
	| 'is not'
	| 'are not'
	| 'am not'
;

CONJUNCTIONS
:
	'or'
	| 'but'
	| 'so'
;

CONJUNCTIONS_COPU
:
	'and'
	| 'also'
	| 'too'
	| 'as well as'
	| 'not only'
;

CONJUNTIONS_ADVER
:
	'nevertheless'
	| 'however'
	| 'whereas'
;

CONJUNTIONS_DIST
:
	'although'
	| 'once'
	| 'since'
	| 'then'
	| 'though'
	| 'till'
	| 'when'
;

CONJUNTIONS_EXPLI
:
	'but also'
	| 'both and'
;

CONJUNCTIONS_SUB
:
	'as'
	| 'while'
	| 'until'
;

COORDINATING_CONJUNCTIONS
:
	'for'
	| 'nor'
;

CONJUNCTIONS_CON
:
	'whether'
	| 'unless'
	| 'provided'
	| 'providing'
	| 'as long as'
	| 'in case'
;

CONJUNCTIONS_CAS
:
	'because'
	| 'because of'
	| 'due to'
	| 'owing to'
;

CONJUNCTIONS_CONSE
:
	'even though'
	| 'even if'
	| 'not even if'
	| 'despite'
	| 'in spite of'
	| 'regardless'
;

CONJUNCTIONS_COMP
:
	'than'
	| 'a lost'
	| 'a little'
;

CONJUNCTIONS_FIN
:
	'therefore'
	| 'hence'
	| 'thus'
	| 'consequently'
;

INTERJECTION
:
	'wow'
	| 'yuck'
	| 'ouch'
	| 'uh-huh'
	| 'oops'
	| 'hey'
	| 'yeah'
	| 'eh'
;

CONTRACTION
:
	'i´m'
	| 'you´re'
	| 'he´s'
	| 'she´s'
	| 'it´s'
	| 'we´re'
	| 'they´re'
;

PUNCTUATION_SIGNS
:
	'.'
	| ','
	| '!'
	| '?'
	| ':'
	| ';'
	| '...'
	| '-'
	| '_'
	| '('
	| ')'
	| '{'
	| '}'
	| '['
	| ']'
	| '<'
	| '>'
	| '"'
	| '`'
;

WS
:
	[ \t\r\n]+ -> skip
;
