-- This Happy file was machine-generated by the BNF converter
{
{-# OPTIONS_GHC -fno-warn-incomplete-patterns -fno-warn-overlapping-patterns #-}
module ParABS where
import AbsABS
import LexABS
import ErrM

}

%name pProgram Program

-- no lexer declaration
%monad { Err } { thenM } { returnM }
%tokentype { Token }

%token 
 '!' { PT _ (TS _ 1) }
 '!=' { PT _ (TS _ 2) }
 '%' { PT _ (TS _ 3) }
 '&' { PT _ (TS _ 4) }
 '&&' { PT _ (TS _ 5) }
 '(' { PT _ (TS _ 6) }
 ')' { PT _ (TS _ 7) }
 '*' { PT _ (TS _ 8) }
 '+' { PT _ (TS _ 9) }
 ',' { PT _ (TS _ 10) }
 '-' { PT _ (TS _ 11) }
 '.' { PT _ (TS _ 12) }
 '/' { PT _ (TS _ 13) }
 ';' { PT _ (TS _ 14) }
 '<' { PT _ (TS _ 15) }
 '<=' { PT _ (TS _ 16) }
 '=' { PT _ (TS _ 17) }
 '==' { PT _ (TS _ 18) }
 '=>' { PT _ (TS _ 19) }
 '>' { PT _ (TS _ 20) }
 '>=' { PT _ (TS _ 21) }
 '?' { PT _ (TS _ 22) }
 '[' { PT _ (TS _ 23) }
 ']' { PT _ (TS _ 24) }
 '_' { PT _ (TS _ 25) }
 'assert' { PT _ (TS _ 26) }
 'await' { PT _ (TS _ 27) }
 'builtin' { PT _ (TS _ 28) }
 'case' { PT _ (TS _ 29) }
 'catch' { PT _ (TS _ 30) }
 'class' { PT _ (TS _ 31) }
 'data' { PT _ (TS _ 32) }
 'def' { PT _ (TS _ 33) }
 'else' { PT _ (TS _ 34) }
 'exception' { PT _ (TS _ 35) }
 'export' { PT _ (TS _ 36) }
 'extends' { PT _ (TS _ 37) }
 'fimport' { PT _ (TS _ 38) }
 'finally' { PT _ (TS _ 39) }
 'from' { PT _ (TS _ 40) }
 'get' { PT _ (TS _ 41) }
 'if' { PT _ (TS _ 42) }
 'implements' { PT _ (TS _ 43) }
 'import' { PT _ (TS _ 44) }
 'in' { PT _ (TS _ 45) }
 'interface' { PT _ (TS _ 46) }
 'let' { PT _ (TS _ 47) }
 'local' { PT _ (TS _ 48) }
 'module' { PT _ (TS _ 49) }
 'new' { PT _ (TS _ 50) }
 'null' { PT _ (TS _ 51) }
 'return' { PT _ (TS _ 52) }
 'skip' { PT _ (TS _ 53) }
 'spawns' { PT _ (TS _ 54) }
 'suspend' { PT _ (TS _ 55) }
 'then' { PT _ (TS _ 56) }
 'this' { PT _ (TS _ 57) }
 'thisDC' { PT _ (TS _ 58) }
 'throw' { PT _ (TS _ 59) }
 'try' { PT _ (TS _ 60) }
 'type' { PT _ (TS _ 61) }
 'while' { PT _ (TS _ 62) }
 '{' { PT _ (TS _ 63) }
 '|' { PT _ (TS _ 64) }
 '||' { PT _ (TS _ 65) }
 '}' { PT _ (TS _ 66) }
 '~' { PT _ (TS _ 67) }

L_ident  { PT _ (TV $$) }
L_quoted { PT _ (TL $$) }
L_integ  { PT _ (TI $$) }
L_TypeIdent { PT _ (T_TypeIdent $$) }
L_err    { _ }


%%

Ident   :: { Ident }   : L_ident  { Ident $1 }
String  :: { String }  : L_quoted {  $1 }
Integer :: { Integer } : L_integ  { (read ( $1)) :: Integer }
TypeIdent    :: { TypeIdent} : L_TypeIdent { TypeIdent ($1)}

AnyIdent :: { AnyIdent }
AnyIdent : Ident { AnyIden $1 } 
  | TypeIdent { AnyTyIden $1 }


ListAnyIdent :: { [AnyIdent] }
ListAnyIdent : AnyIdent { (:[]) $1 } 
  | AnyIdent ',' ListAnyIdent { (:) $1 $3 }


Program :: { Program }
Program : ListModule { Prog (reverse $1) } 


ListModule :: { [Module] }
ListModule : {- empty -} { [] } 
  | ListModule Module { flip (:) $1 $2 }


Module :: { Module }
Module : 'module' QualType ';' ListExport ListImport ListDecl MaybeBlock { Modul $2 (reverse $4) (reverse $5) (reverse $6) $7 } 


Export :: { Export }
Export : 'export' ListAnyIdent { AnyExport $2 } 
  | 'export' ListAnyIdent 'from' QualType { AnyFromExport $2 $4 }
  | 'export' '*' { StarExport }
  | 'export' '*' 'from' QualType { StarFromExport $4 }


ListExport :: { [Export] }
ListExport : {- empty -} { [] } 
  | ListExport Export ';' { flip (:) $1 $2 }


Import :: { Import }
Import : ImportType QualType '.' AnyIdent { AnyImport $1 $2 $4 } 
  | ImportType ListAnyIdent 'from' QualType { AnyFromImport $1 $2 $4 }
  | ImportType '*' 'from' QualType { StarFromImport $1 $4 }


ListImport :: { [Import] }
ListImport : {- empty -} { [] } 
  | ListImport Import ';' { flip (:) $1 $2 }


ImportType :: { ImportType }
ImportType : 'fimport' { ForeignImport } 
  | 'import' { NormalImport }


Type :: { Type }
Type : '_' { TUnderscore } 
  | QualType { TSimple $1 }
  | QualType '<' ListType '>' { TGen $1 $3 }


ListType :: { [Type] }
ListType : Type { (:[]) $1 } 
  | Type ',' ListType { (:) $1 $3 }


ListQualType :: { [QualType] }
ListQualType : QualType { (:[]) $1 } 
  | QualType ',' ListQualType { (:) $1 $3 }


QualType :: { QualType }
QualType : ListQualTypeSegment { QType $1 } 


QualTypeSegment :: { QualTypeSegment }
QualTypeSegment : TypeIdent { QTypeSegment $1 } 


ListQualTypeSegment :: { [QualTypeSegment] }
ListQualTypeSegment : QualTypeSegment { (:[]) $1 } 
  | QualTypeSegment '.' ListQualTypeSegment { (:) $1 $3 }


ListDecl :: { [Decl] }
ListDecl : {- empty -} { [] } 
  | ListDecl Decl { flip (:) $1 $2 }


Decl :: { Decl }
Decl : 'type' TypeIdent '=' Type ';' { TypeDecl $2 $4 } 
  | 'exception' ConstrIdent ';' { ExceptionDecl $2 }
  | 'data' TypeIdent '=' ListConstrIdent ';' { DataDecl $2 $4 }
  | 'data' TypeIdent '<' ListTypeIdent '>' '=' ListConstrIdent ';' { DataParDecl $2 $4 $7 }
  | 'def' Type Ident '(' ListParam ')' '=' FunBody ';' { FunDecl $2 $3 $5 $8 }
  | 'def' Type Ident '<' ListTypeIdent '>' '(' ListParam ')' '=' FunBody ';' { FunParDecl $2 $3 $5 $8 $11 }
  | 'interface' TypeIdent '{' ListMethSignat '}' { InterfDecl $2 (reverse $4) }
  | 'interface' TypeIdent 'extends' ListQualType '{' ListMethSignat '}' { ExtendsDecl $2 $4 (reverse $6) }
  | 'class' TypeIdent '{' ListClassBody MaybeBlock ListClassBody '}' { ClassDecl $2 (reverse $4) $5 (reverse $6) }
  | 'class' TypeIdent '(' ListParam ')' '{' ListClassBody MaybeBlock ListClassBody '}' { ClassParamDecl $2 $4 (reverse $7) $8 (reverse $9) }
  | 'class' TypeIdent 'implements' ListQualType '{' ListClassBody MaybeBlock ListClassBody '}' { ClassImplements $2 $4 (reverse $6) $7 (reverse $8) }
  | 'class' TypeIdent '(' ListParam ')' 'implements' ListQualType '{' ListClassBody MaybeBlock ListClassBody '}' { ClassParamImplements $2 $4 $7 (reverse $9) $10 (reverse $11) }


ConstrIdent :: { ConstrIdent }
ConstrIdent : TypeIdent { SinglConstrIdent $1 } 
  | TypeIdent '(' ListConstrType ')' { ParamConstrIdent $1 $3 }


ConstrType :: { ConstrType }
ConstrType : Type { EmptyConstrType $1 } 
  | Type Ident { RecordConstrType $1 $2 }


ListConstrType :: { [ConstrType] }
ListConstrType : {- empty -} { [] } 
  | ConstrType { (:[]) $1 }
  | ConstrType ',' ListConstrType { (:) $1 $3 }


ListTypeIdent :: { [TypeIdent] }
ListTypeIdent : TypeIdent { (:[]) $1 } 
  | TypeIdent ',' ListTypeIdent { (:) $1 $3 }


ListConstrIdent :: { [ConstrIdent] }
ListConstrIdent : ConstrIdent { (:[]) $1 } 
  | ConstrIdent '|' ListConstrIdent { (:) $1 $3 }


FunBody :: { FunBody }
FunBody : 'builtin' { BuiltinFunBody } 
  | PureExp { NormalFunBody $1 }


MethSignat :: { MethSignat }
MethSignat : Type Ident '(' ListParam ')' { MethSig $1 $2 $4 } 


ListMethSignat :: { [MethSignat] }
ListMethSignat : {- empty -} { [] } 
  | ListMethSignat MethSignat ';' { flip (:) $1 $2 }


ClassBody :: { ClassBody }
ClassBody : Type Ident ';' { FieldClassBody $1 $2 } 
  | Type Ident '=' PureExp ';' { FieldAssignClassBody $1 $2 $4 }
  | Type Ident '(' ListParam ')' Block { MethClassBody $1 $2 $4 $6 }


ListClassBody :: { [ClassBody] }
ListClassBody : {- empty -} { [] } 
  | ListClassBody ClassBody { flip (:) $1 $2 }


Block :: { Block }
Block : '{' ListStm '}' { Bloc (reverse $2) } 


MaybeBlock :: { MaybeBlock }
MaybeBlock : Block { JustBlock $1 } 
  | {- empty -} { NoBlock }


ListParam :: { [Param] }
ListParam : {- empty -} { [] } 
  | Param { (:[]) $1 }
  | Param ',' ListParam { (:) $1 $3 }


Param :: { Param }
Param : Type Ident { Par $1 $2 } 


ListStm :: { [Stm] }
ListStm : {- empty -} { [] } 
  | ListStm Stm { flip (:) $1 $2 }


Stm :: { Stm }
Stm : Exp ';' { SExp $1 } 
  | '{' ListStm '}' { SBlock (reverse $2) }
  | 'while' '(' PureExp ')' Stm { SWhile $3 $5 }
  | 'return' Exp ';' { SReturn $2 }
  | Ident '=' Exp ';' { SAss $1 $3 }
  | 'this' '.' Ident '=' Exp ';' { SFieldAss $3 $5 }
  | Type Ident ';' { SDec $1 $2 }
  | Type Ident '=' Exp ';' { SDecAss $1 $2 $4 }
  | 'if' '(' PureExp ')' Stm { SIf $3 $5 }
  | 'if' '(' PureExp ')' Stm 'else' Stm { SIfElse $3 $5 $7 }
  | 'suspend' ';' { SSuspend }
  | 'skip' ';' { SSkip }
  | 'assert' PureExp ';' { SAssert $2 }
  | 'await' Guard ';' { SAwait $2 }
  | 'throw' PureExp ';' { SThrow $2 }
  | 'try' Stm 'catch' '{' ListCatchBranch '}' MaybeFinally { STryCatchFinally $2 (reverse $5) $7 }


CatchBranch :: { CatchBranch }
CatchBranch : Pattern '=>' Stm { CatchBranc $1 $3 } 


ListCatchBranch :: { [CatchBranch] }
ListCatchBranch : {- empty -} { [] } 
  | ListCatchBranch CatchBranch { flip (:) $1 $2 }


MaybeFinally :: { MaybeFinally }
MaybeFinally : 'finally' Stm { JustFinally $2 } 
  | {- empty -} { NoFinally }


Guard :: { Guard }
Guard : Ident '?' { VarGuard $1 } 
  | 'this' '.' Ident '?' { FieldGuard $3 }
  | PureExp { ExpGuard $1 }
  | Guard '&' Guard { AndGuard $1 $3 }


Exp :: { Exp }
Exp : PureExp { ExpP $1 } 
  | EffExp { ExpE $1 }


ListPureExp :: { [PureExp] }
ListPureExp : {- empty -} { [] } 
  | PureExp { (:[]) $1 }
  | PureExp ',' ListPureExp { (:) $1 $3 }


PureExp :: { PureExp }
PureExp : PureExp '||' PureExp1 { EOr $1 $3 } 
  | PureExp1 { $1 }
  | 'let' '(' Param ')' '=' PureExp 'in' PureExp { Let $3 $6 $8 }
  | 'if' PureExp 'then' PureExp 'else' PureExp { If $2 $4 $6 }
  | 'case' PureExp '{' ListCaseBranch '}' { Case $2 $4 }


PureExp1 :: { PureExp }
PureExp1 : PureExp1 '&&' PureExp2 { EAnd $1 $3 } 
  | PureExp2 { $1 }


PureExp2 :: { PureExp }
PureExp2 : PureExp2 '==' PureExp3 { EEq $1 $3 } 
  | PureExp2 '!=' PureExp3 { ENeq $1 $3 }
  | PureExp3 { $1 }


PureExp3 :: { PureExp }
PureExp3 : PureExp3 '<' PureExp4 { ELt $1 $3 } 
  | PureExp3 '<=' PureExp4 { ELe $1 $3 }
  | PureExp3 '>' PureExp4 { EGt $1 $3 }
  | PureExp3 '>=' PureExp4 { EGe $1 $3 }
  | PureExp4 { $1 }


PureExp4 :: { PureExp }
PureExp4 : PureExp4 '+' PureExp5 { EAdd $1 $3 } 
  | PureExp4 '-' PureExp5 { ESub $1 $3 }
  | PureExp5 { $1 }


PureExp5 :: { PureExp }
PureExp5 : PureExp5 '*' PureExp6 { EMul $1 $3 } 
  | PureExp5 '/' PureExp6 { EDiv $1 $3 }
  | PureExp5 '%' PureExp6 { EMod $1 $3 }
  | PureExp6 { $1 }


PureExp6 :: { PureExp }
PureExp6 : '~' PureExp6 { ELogNeg $2 } 
  | '-' PureExp6 { EIntNeg $2 }
  | PureExp7 { $1 }


PureExp7 :: { PureExp }
PureExp7 : Ident '(' ListPureExp ')' { EFunCall $1 $3 } 
  | QualType '.' Ident '(' ListPureExp ')' { EQualFunCall $1 $3 $5 }
  | Ident '[' ListPureExp ']' { ENaryFunCall $1 $3 }
  | QualType '.' Ident '[' ListPureExp ']' { ENaryQualFunCall $1 $3 $5 }
  | Ident { EVar $1 }
  | 'this' '.' Ident { EThis $3 }
  | QualType '.' Ident { EQualVar $1 $3 }
  | QualType { ESinglConstr $1 }
  | QualType '(' ListPureExp ')' { EParamConstr $1 $3 }
  | Literal { ELit $1 }
  | '(' PureExp ')' { $2 }


CaseBranch :: { CaseBranch }
CaseBranch : Pattern '=>' PureExp { CaseBranc $1 $3 } 


ListCaseBranch :: { [CaseBranch] }
ListCaseBranch : CaseBranch ';' { (:[]) $1 } 
  | CaseBranch ';' ListCaseBranch { (:) $1 $3 }


ListPattern :: { [Pattern] }
ListPattern : {- empty -} { [] } 
  | Pattern { (:[]) $1 }
  | Pattern ',' ListPattern { (:) $1 $3 }


Pattern :: { Pattern }
Pattern : Ident { PIdent $1 } 
  | Literal { PLit $1 }
  | TypeIdent { PSinglConstr $1 }
  | TypeIdent '(' ListPattern ')' { PParamConstr $1 $3 }
  | '_' { PUnderscore }


Literal :: { Literal }
Literal : 'null' { LNull } 
  | 'this' { LThis }
  | 'thisDC' { LThisDC }
  | String { LStr $1 }
  | Integer { LInt $1 }


EffExp :: { EffExp }
EffExp : 'new' Type '(' ListPureExp ')' { New $2 $4 } 
  | 'new' 'local' Type '(' ListPureExp ')' { NewLocal $3 $5 }
  | PureExp '.' Ident '(' ListPureExp ')' { SyncMethCall $1 $3 $5 }
  | 'this' '.' Ident '(' ListPureExp ')' { ThisSyncMethCall $3 $5 }
  | PureExp '!' Ident '(' ListPureExp ')' { AsyncMethCall $1 $3 $5 }
  | 'this' '!' Ident '(' ListPureExp ')' { ThisAsyncMethCall $3 $5 }
  | PureExp '.' 'get' { Get $1 }
  | PureExp 'spawns' Type '(' ListPureExp ')' { Spawns $1 $3 $5 }



{

returnM :: a -> Err a
returnM = return

thenM :: Err a -> (a -> Err b) -> Err b
thenM = (>>=)

happyError :: [Token] -> Err a
happyError ts =
  Bad $ "syntax error at " ++ tokenPos ts ++ 
  case ts of
    [] -> []
    [Err _] -> " due to lexer error"
    _ -> " before " ++ unwords (map (id . prToken) (take 4 ts))

myLexer = tokens
}

