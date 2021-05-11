// grammar name and file name must match
grammar Grammar;


prog: (mission|equation|suit_expr|value_expr|card_spec|card_expr|trick_expr|player_expr|token_expr|var_dec|suit_expr|value_expr|card_spec|card_expr|trick_expr|player_expr|token_expr|rules)+ EOF;


// data types and keywords
single_interval: IL SINGLE_DIGIT ':' SINGLE_DIGIT IR;  //type check for rocket card: cant have 4+ Card_Spec
multi_interval: IL (SINGLE_DIGIT|MULTI_DIGIT) ':' (SINGLE_DIGIT|MULTI_DIGIT) IR;
single_set:  SETL (SINGLE_DIGIT)+ SETR; //rocketcard //Card_Spec
multi_set: SETL (SINGLE_DIGIT|MULTI_DIGIT)+ SETR;
trick_set:  SETL (SINGLE_DIGIT|MULTI_DIGIT|FIRST|LAST)+ SETR;
suit_set: SETL (SUIT_VAL)+ SETR;
card_set: SETL (CARD_VAL)+ SETR;
player_set: SETL (PLAYER_ID|(CARD_VAL|CARD_DIR))+ SETR; //PlayerID should be less than #ofPlayers WHERE TO CHECK??
token_set: SETL (SINGLE_DIGIT|MULTI_DIGIT|O_T)+ SETR; //Less than 40 tokens--pretty easy to check
any: ANY (SINGLE_DIGIT|MULTI_DIGIT);

//TASKS
tasks : TASKS ':' (ZERO|SINGLE_DIGIT|MULTI_DIGIT);
//distress signal
d_t: DISTRESS_SIGNAL ':' (ON|OFF);
//distribution
distribution: DISTRIBUTION ':' (CDE|CDI|NORMAL);
//specify number of players in the beginning
players: PLAYERS ':' SINGLE_DIGIT;
//constraints distribution
constratints_distribution: CONSTRAINTS ':' (CDE|PD|CDWI);

//for wins rule
equation: LP equation RP            #Eq_Paranthesis
        |equation (PLUS|MINUS) equation #Eq_Add
        |equation MINUS equation    #Eq_Subtract
        |MAX_WINS                   #Eq_MaxWins
        |MIN_WINS                   #Eq_MinWins
        |VAR                        #Eq_var
        |SINGLE_DIGIT               #Eq_SingleDigit
        |MULTI_DIGIT                #Eq_MultiDigit
        ;

suit_expr: LP suit_expr RP              #Suit_expr_paranthesis
    | suit_expr OP_UNION suit_expr      #Suit_expr_union
    | suit_expr OP_INTERSECT suit_expr  #Suit_expr_intersect
    | OP_COMPLEMENT suit_expr           #Suit_expr_complement
    |VAR                                #Suit_expr_var
    |suit_set                           #Suit_expr_suit_set
    ;

value_expr: LP value_expr RP                #Value_expr_paranthesis
    | value_expr OP_UNION value_expr        #Value_expr_union
    | value_expr OP_INTERSECT value_expr    #Value_expr_intersect
    | OP_COMPLEMENT value_expr              #Value_expr_complement
    |VAR                                    #Value_expr_var
    |single_set                             #Value_expr_single_set
    |single_interval                        #Value_expr_single_interval
    ;
//alows to specify similar cards in a simple way
card_spec: CARDS SETL SUIT ':'  (suit_expr| ALL) VALUE ':' (value_expr|ALL) SETR;

card_expr: LP card_expr RP                      #Card_expr_paranthesis
         | card_expr OP_UNION card_expr         #Card_expr_union
         | card_expr OP_INTERSECT card_expr     #Card_expr_intersect
         | OP_COMPLEMENT card_expr              #Card_expr_complement
         |VAR                                   #Card_expr_var
         |card_set                              #Card_expr_card_set
         |card_spec                             #Card_expr_card_spec
         ;

trick_expr: LP trick_expr RP                #Trick_expr_paranthesis
    | trick_expr OP_UNION trick_expr        #Trick_expr_union
    | trick_expr OP_INTERSECT trick_expr    #Trick_expr_intersect
    | OP_COMPLEMENT trick_expr              #Trick_expr_complement
    |VAR                                    #Trick_expr_var
    |single_set                             #Trick_expr_single_set
    |multi_set                              #Trick_expr_multi_set
    |trick_set                              #Trick_expr_trick_set
    |single_interval                        #Trick_expr_single_interval
    |multi_interval                         #Trick_expr_multi_interval
    ;

player_expr: LP player_expr RP              #Player_expr_paranthesis
    | player_expr OP_UNION player_expr      #Player_expr_union
    | player_expr OP_INTERSECT player_expr  #Player_expr_intersect
    |VAR                                    #Player_expr_variable
    |player_set                             #Player_expr_player_set
    |card_expr                              #Player_expr_card_expr
    ;

 token_expr: LP token_expr RP               #Token_expr_paranthesis
     | token_expr OP_UNION token_expr       #Token_expr_union
     | token_expr OP_INTERSECT token_expr   #Token_expr_intersect
     |VAR                                   #Token_expr_variable
     |single_set                            #Token_expr_single_set
     |multi_set                             #Token_expr_multi_set
     |trick_set                             #Token_expr_trick_set
     |token_set                             #Token_expr_token_set
     |single_interval                       #Token_expr_single_interval
     |multi_interval                        #Token_expr_multi_interval
     ;


rules: WIN_TRICK SETL (ALL|trick_expr|trickAny = any) (ORDER)? (card_expr)? ',' (player_expr| playerAny = any)? SETR #WT_Rule
          | DONT_WIN_TRICK SETL (trick_expr)? (card_expr)?',' (player_expr|any)? SETR #DWT_Rule
          | WIN_CARDS SETL (cardAny = any)? card_expr (trick_expr)? ',' (player_expr|playerAny = any)? SETR #WC_Rule
          | DONT_WIN_CARDS SETL card_expr (trick_expr)? ',' (player_expr|any)? SETR #DWC_Rule
          | WINS_RULE SETL WINS (EQ|GT|GTE|LT|LTE) equation ',' (player_expr|any)? SETR#WR_rule
          | (NO_COM|LIM_COM) SETL (trick_expr)?  ',' (player_expr|any)? SETR  #COM_rule
          | (DRAW_LEFT|DRAW_RIGHT) SETL(trick_expr)?  SETR #DC_rule
          ;



//Order Tokens
nSwap: 'nSwap'':' (SINGLE_DIGIT)|(MULTI_DIGIT); //swap order tokens
nSwitch: 'nSwitch' ':' (SINGLE_DIGIT)|(MULTI_DIGIT);
tokens: TOKENS ':' token_expr (nSwap)? (nSwitch)?;


mission: MISSION ':' (tasks) (players) (tokens)? (d_t) (distribution) (constratints_distribution) (rules)*;



var_dec: VAR EQ (VAR|value_expr|suit_expr|card_expr|trick_expr|token_expr|player_expr|equation); //good (add temp rules??)





//Sets
SINGLE_DIGIT: [1-9];
MULTI_DIGIT: [1-9][0-9]+;
ZERO: '0';
RULE: 'Rule';
SUIT_VAL: 'P'|'Y'|'B'|'G'|'R';
CARD_VAL: 'P'[1-9]|'Y'[1-9]|'B'[1-9]|'G'[1-9]|'R'[1-4];
CARD_DIR: CARD_VAL'-'('left'|'right');
OP_UNION: '|';
OP_INTERSECT: '&';
OP_COMPLEMENT: '!';
PLUS: '+';
MINUS: '-';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
EQ: '=';
LP: '('; // set operations precedence
RP: ')'; // set operations precedence
SETL : '{';
SETR: '}';
IL: '[';
IR: ']';


//Cards
CARDS: ('C'|'c')('A'|'a')('R'|'r')('D'|'d')('S'|'s');
CARD: ('C'|'c')('A'|'a')('R'|'r')('D'|'d');
SUIT: ('S'|'s')('U'|'u')('I'|'i')('T'|'t');
VALUE: ('V'|'v')('A'|'a')('L'|'l')('U'|'u')('E'|'e');

//Keywords
FIRST: ('F'|'f')('I'|'i')('R'|'r')('S'|'s')('T'|'t');
LAST : ('L'|'l')('A'|'a')('S'|'s')('T'|'t');
ANY: ('A'|'a')('N'|'n')('Y'|'y') ; // any = any 1???
ALL: 'all';
MAX_WINS: 'maxWins';
MIN_WINS: 'minWins';
WINS_RULE: 'WR';
WINS: 'wins';
DUP:'dup';
ORDER: 'order';

//RULES

CDE: 'cde';
CDWI: 'cdwi';
CDI: 'cdi';
PD: 'pd'; // players decide together
CD: 'cd'; // command decides alone

//tricks
TRICK: ('T'|'t')('R'|'r')('I'|'i')('C'|'c')('K'|'k');
WIN_TRICK: 'WT';
DONT_WIN_TRICK: 'DWT';

//cards
WIN_CARDS: 'WC';
DONT_WIN_CARDS: 'DWC';

//communication
NO_COM: 'NC';
LIM_COM: 'LC';


//draw cards
DRAW_LEFT: 'DCL';
DRAW_RIGHT: 'DCR';

//rule


//PLAYERS
PLAYER_ID: 'Player1' | 'Player2' | 'Player3' | 'Player4' | 'Player5';  // should you add commander here as well???
PLAYERS: ('P'|'p')('L'|'l')('A'|'a')('Y'|'y')('E'|'e')('R'|'r')('S'|'s');
PLAYER: ('P'|'p')('L'|'l')('A'|'a')('Y'|'y')('E'|'e')('R'|'r');
LEFT: '-'('L'|'l')('E'|'e')('F'|'f')('T'|'t');
RIGHT: '-'('R'|'r')('I'|'i')('G'|'g')('H'|'h')('T'|'t');

//Before Rule Stuff
TASKS: ('T'|'t')('A'|'a')('s'|'S')('K'|'k')('S'|'s');
TOKENS: ('T'|'t')('O'|'o')('K'|'k')('E'|'e')('N'|'n')('S'|'s');
TOKEN: ('T'|'t')('O'|'o')('K'|'k')('E'|'e')('N'|'n');
O_T: ('x') (SINGLE_DIGIT|MULTI_DIGIT|('x'));
DISTRESS_SIGNAL: ('D'|'d')('S'|'s');
CONSTRAINTS: 'ruleDist';


ON: 'on';
OFF: 'off';
DISTRIBUTION: 'taskDist';
CDinput: 'cdInput'; // commandar decides with user input
NORMAL: 'n';

MISSION: ('M'|'m')('I'|'i')('S'|'s')('S'|'s')('I'|'i')('O'|'o')('N'|'n');
// have something for normal clockwise distribution


// Variables
VAR: '__'[a-z][a-zA-Z0-9_]* ; //start with lower, then upper/lower/num/underscore

//Misc
WHITE_SPACE: [ \t\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;


