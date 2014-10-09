

module AbsABS where

-- Haskell module generated by the BNF converter




newtype Ident = Ident String deriving (Eq,Ord,Show,Read)
newtype TypeIdent = TypeIdent String deriving (Eq,Ord,Show,Read)
data AnyIdent =
   AnyIden Ident
 | AnyTyIden TypeIdent
  deriving (Eq,Ord,Show,Read)

data Program =
   Prog [Module]
  deriving (Eq,Ord,Show,Read)

data Module =
   Modul QualType [Export] [Import] [Decl] MaybeBlock
  deriving (Eq,Ord,Show,Read)

data Export =
   AnyExport [AnyIdent]
 | AnyFromExport [AnyIdent] QualType
 | StarExport
 | StarFromExport QualType
  deriving (Eq,Ord,Show,Read)

data Import =
   AnyImport ImportType QualType AnyIdent
 | AnyFromImport ImportType [AnyIdent] QualType
 | StarFromImport ImportType QualType
  deriving (Eq,Ord,Show,Read)

data ImportType =
   ForeignImport
 | NormalImport
  deriving (Eq,Ord,Show,Read)

data Type =
   TUnderscore
 | TSimple QualType
 | TGen QualType [Type]
  deriving (Eq,Ord,Show,Read)

data QualType =
   QType [QualTypeSegment]
  deriving (Eq,Ord,Show,Read)

data QualTypeSegment =
   QTypeSegment TypeIdent
  deriving (Eq,Ord,Show,Read)

data Decl =
   TypeDecl TypeIdent Type
 | ExceptionDecl ConstrIdent
 | DataDecl TypeIdent [ConstrIdent]
 | DataParDecl TypeIdent [TypeIdent] [ConstrIdent]
 | FunDecl Type Ident [Param] FunBody
 | FunParDecl Type Ident [TypeIdent] [Param] FunBody
 | InterfDecl TypeIdent [MethSignat]
 | ExtendsDecl TypeIdent [QualType] [MethSignat]
 | ClassDecl TypeIdent [ClassBody] MaybeBlock [ClassBody]
 | ClassParamDecl TypeIdent [Param] [ClassBody] MaybeBlock [ClassBody]
 | ClassImplements TypeIdent [QualType] [ClassBody] MaybeBlock [ClassBody]
 | ClassParamImplements TypeIdent [Param] [QualType] [ClassBody] MaybeBlock [ClassBody]
  deriving (Eq,Ord,Show,Read)

data ConstrIdent =
   SinglConstrIdent TypeIdent
 | ParamConstrIdent TypeIdent [ConstrType]
  deriving (Eq,Ord,Show,Read)

data ConstrType =
   EmptyConstrType Type
 | RecordConstrType Type Ident
  deriving (Eq,Ord,Show,Read)

data FunBody =
   BuiltinFunBody
 | NormalFunBody PureExp
  deriving (Eq,Ord,Show,Read)

data MethSignat =
   MethSig Type Ident [Param]
  deriving (Eq,Ord,Show,Read)

data ClassBody =
   FieldClassBody Type Ident
 | FieldAssignClassBody Type Ident PureExp
 | MethClassBody Type Ident [Param] Block
  deriving (Eq,Ord,Show,Read)

data Block =
   Bloc [Stm]
  deriving (Eq,Ord,Show,Read)

data MaybeBlock =
   JustBlock Block
 | NoBlock
  deriving (Eq,Ord,Show,Read)

data Param =
   Par Type Ident
  deriving (Eq,Ord,Show,Read)

data Stm =
   SExp Exp
 | SBlock [Stm]
 | SWhile PureExp Stm
 | SReturn Exp
 | SAss Ident Exp
 | SFieldAss Ident Exp
 | SDec Type Ident
 | SDecAss Type Ident Exp
 | SIf PureExp Stm
 | SIfElse PureExp Stm Stm
 | SSuspend
 | SSkip
 | SAssert PureExp
 | SAwait Guard
 | SThrow PureExp
 | STryCatchFinally Stm [CatchBranch] MaybeFinally
  deriving (Eq,Ord,Show,Read)

data CatchBranch =
   CatchBranc Pattern Stm
  deriving (Eq,Ord,Show,Read)

data MaybeFinally =
   JustFinally Stm
 | NoFinally
  deriving (Eq,Ord,Show,Read)

data Guard =
   VarGuard Ident
 | FieldGuard Ident
 | ExpGuard PureExp
 | AndGuard Guard Guard
  deriving (Eq,Ord,Show,Read)

data Exp =
   ExpP PureExp
 | ExpE EffExp
  deriving (Eq,Ord,Show,Read)

data PureExp =
   EOr PureExp PureExp
 | EAnd PureExp PureExp
 | EEq PureExp PureExp
 | ENeq PureExp PureExp
 | ELt PureExp PureExp
 | ELe PureExp PureExp
 | EGt PureExp PureExp
 | EGe PureExp PureExp
 | EAdd PureExp PureExp
 | ESub PureExp PureExp
 | EMul PureExp PureExp
 | EDiv PureExp PureExp
 | EMod PureExp PureExp
 | ELogNeg PureExp
 | EIntNeg PureExp
 | EFunCall Ident [PureExp]
 | EQualFunCall QualType Ident [PureExp]
 | ENaryFunCall Ident [PureExp]
 | ENaryQualFunCall QualType Ident [PureExp]
 | EVar Ident
 | EThis Ident
 | EQualVar QualType Ident
 | ESinglConstr QualType
 | EParamConstr QualType [PureExp]
 | ELit Literal
 | Let Param PureExp PureExp
 | If PureExp PureExp PureExp
 | Case PureExp [CaseBranch]
  deriving (Eq,Ord,Show,Read)

data CaseBranch =
   CaseBranc Pattern PureExp
  deriving (Eq,Ord,Show,Read)

data Pattern =
   PIdent Ident
 | PLit Literal
 | PSinglConstr TypeIdent
 | PParamConstr TypeIdent [Pattern]
 | PUnderscore
  deriving (Eq,Ord,Show,Read)

data Literal =
   LNull
 | LThis
 | LThisDC
 | LStr String
 | LInt Integer
  deriving (Eq,Ord,Show,Read)

data EffExp =
   New Type [PureExp]
 | NewLocal Type [PureExp]
 | SyncMethCall PureExp Ident [PureExp]
 | ThisSyncMethCall Ident [PureExp]
 | AsyncMethCall PureExp Ident [PureExp]
 | ThisAsyncMethCall Ident [PureExp]
 | Get PureExp
 | Spawns PureExp Type [PureExp]
  deriving (Eq,Ord,Show,Read)

