package ABS;

import ABS.Absyn.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Type */
    public R visit(ABS.Absyn.TyUnit p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.TyInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.TyRat p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.TyFut p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.TyUnderscore p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.TypeVar p, A arg) {
      R r = leaf(arg);
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ArgType p, A arg) {
      R r = leaf(arg);
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      for (AnnType x : p.listanntype_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* AnnType */
    public R visit(ABS.Absyn.AnnType_ p, A arg) {
      R r = leaf(arg);
      for (Ann x : p.listann_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* QualType */
    public R visit(ABS.Absyn.QualType_ p, A arg) {
      R r = leaf(arg);
      for (QualTypeIdent x : p.listqualtypeident_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* QualTypeIdent */
    public R visit(ABS.Absyn.QualTypeIdent_ p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Program */
    public R visit(ABS.Absyn.Prog p, A arg) {
      R r = leaf(arg);
      r = combine(p.moduledecl_.accept(this, arg), r, arg);
      return r;
    }

/* ModuleDecl */
    public R visit(ABS.Absyn.ModuleDecl_ p, A arg) {
      R r = leaf(arg);
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      for (Export x : p.listexport_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      for (Import x : p.listimport_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      for (AnnDecl x : p.listanndecl_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.maybeblock_.accept(this, arg), r, arg);
      return r;
    }

/* Export */
    public R visit(ABS.Absyn.ExportAny p, A arg) {
      R r = leaf(arg);
      for (AnyIdent x : p.listanyident_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ExportAnyFrom p, A arg) {
      R r = leaf(arg);
      for (AnyIdent x : p.listanyident_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ExportStar p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.ExportStarFrom p, A arg) {
      R r = leaf(arg);
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      return r;
    }

/* ImportType */
    public R visit(ABS.Absyn.ImportHaskell p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.ImportABS p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Import */
    public R visit(ABS.Absyn.ImportAnyFrom p, A arg) {
      R r = leaf(arg);
      r = combine(p.importtype_.accept(this, arg), r, arg);
      for (AnyIdent x : p.listanyident_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ImportStarFrom p, A arg) {
      R r = leaf(arg);
      r = combine(p.importtype_.accept(this, arg), r, arg);
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      return r;
    }

/* AnyIdent */
    public R visit(ABS.Absyn.AnyIdentI p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.AnyIdentT p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* AnnDecl */
    public R visit(ABS.Absyn.AnnDecl_ p, A arg) {
      R r = leaf(arg);
      for (Ann x : p.listann_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.decl_.accept(this, arg), r, arg);
      return r;
    }

/* Decl */
    public R visit(ABS.Absyn.TypeDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.DataDecl p, A arg) {
      R r = leaf(arg);
      for (ConstrIdent x : p.listconstrident_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ParDataDecl p, A arg) {
      R r = leaf(arg);
      for (ConstrIdent x : p.listconstrident_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.Fun p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (Param x : p.listparam_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.funbody_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ParFun p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (Param x : p.listparam_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.funbody_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.InterfDecl p, A arg) {
      R r = leaf(arg);
      for (MethSig x : p.listmethsig_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ExtendsDecl p, A arg) {
      R r = leaf(arg);
      for (QualType x : p.listqualtype_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      for (MethSig x : p.listmethsig_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ClassDecl p, A arg) {
      R r = leaf(arg);
      for (BodyDecl x : p.listbodydecl_1) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.maybeblock_.accept(this, arg), r, arg);
      for (BodyDecl x : p.listbodydecl_2) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ClassParamDecl p, A arg) {
      R r = leaf(arg);
      for (Param x : p.listparam_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      for (BodyDecl x : p.listbodydecl_1) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.maybeblock_.accept(this, arg), r, arg);
      for (BodyDecl x : p.listbodydecl_2) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ClassImplements p, A arg) {
      R r = leaf(arg);
      for (QualType x : p.listqualtype_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      for (BodyDecl x : p.listbodydecl_1) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.maybeblock_.accept(this, arg), r, arg);
      for (BodyDecl x : p.listbodydecl_2) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ClassParamImplements p, A arg) {
      R r = leaf(arg);
      for (Param x : p.listparam_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      for (QualType x : p.listqualtype_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      for (BodyDecl x : p.listbodydecl_1) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.maybeblock_.accept(this, arg), r, arg);
      for (BodyDecl x : p.listbodydecl_2) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* ConstrIdent */
    public R visit(ABS.Absyn.UnaryConstr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.MultConstr p, A arg) {
      R r = leaf(arg);
      for (ConstrType x : p.listconstrtype_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* ConstrType */
    public R visit(ABS.Absyn.EmptyConstrType p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.RecordConstrType p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* MethSig */
    public R visit(ABS.Absyn.MethSig_ p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (Param x : p.listparam_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* BodyDecl */
    public R visit(ABS.Absyn.FieldDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.FieldDeclAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.MethDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (Param x : p.listparam_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      r = combine(p.block_.accept(this, arg), r, arg);
      return r;
    }

/* Block */
    public R visit(ABS.Absyn.Block_ p, A arg) {
      R r = leaf(arg);
      for (Stm x : p.liststm_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* MaybeBlock */
    public R visit(ABS.Absyn.JustBlock p, A arg) {
      R r = leaf(arg);
      r = combine(p.block_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.NoBlock p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* FunBody */
    public R visit(ABS.Absyn.Builtin p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.PureBody p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }

/* Param */
    public R visit(ABS.Absyn.Par p, A arg) {
      R r = leaf(arg);
      r = combine(p.anntype_.accept(this, arg), r, arg);
      return r;
    }

/* PureExp */
    public R visit(ABS.Absyn.Let p, A arg) {
      R r = leaf(arg);
      r = combine(p.param_.accept(this, arg), r, arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.If p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      r = combine(p.pureexp_3.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.Case p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      for (CaseBranch x : p.listcasebranch_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.EOr p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EAnd p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EEq p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ENeq p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ELt p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ELe p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EGt p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EGe p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EAdd p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ESub p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EMul p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EDiv p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EMod p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_1.accept(this, arg), r, arg);
      r = combine(p.pureexp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ELogNeg p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EIntNeg p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ECall p, A arg) {
      R r = leaf(arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ENaryCall p, A arg) {
      R r = leaf(arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ELit p, A arg) {
      R r = leaf(arg);
      r = combine(p.literal_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EVar p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.EThis p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.EUnaryConstr p, A arg) {
      R r = leaf(arg);
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.EMultConstr p, A arg) {
      R r = leaf(arg);
      r = combine(p.qualtype_.accept(this, arg), r, arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }

/* CaseBranch */
    public R visit(ABS.Absyn.CBranch p, A arg) {
      R r = leaf(arg);
      r = combine(p.pattern_.accept(this, arg), r, arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }

/* Pattern */
    public R visit(ABS.Absyn.PIdent p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.PLit p, A arg) {
      R r = leaf(arg);
      r = combine(p.literal_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.PUnaryConstr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.PMultConstr p, A arg) {
      R r = leaf(arg);
      for (Pattern x : p.listpattern_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.PUnderscore p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Stm */
    public R visit(ABS.Absyn.SExp p, A arg) {
      R r = leaf(arg);
      r = combine(p.effexp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SBlock p, A arg) {
      R r = leaf(arg);
      for (Stm x : p.liststm_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.SWhile p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      r = combine(p.stm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SReturn p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SFieldAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SDec p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SDecAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SIf p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      r = combine(p.stm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SIfElse p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      r = combine(p.stm_1.accept(this, arg), r, arg);
      r = combine(p.stm_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SAwait p, A arg) {
      R r = leaf(arg);
      r = combine(p.guard_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.SSuspend p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.SSkip p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.SAssert p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }

/* Guard */
    public R visit(ABS.Absyn.VarGuard p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.FieldGuard p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.ExpGuard p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.AndGuard p, A arg) {
      R r = leaf(arg);
      r = combine(p.guard_1.accept(this, arg), r, arg);
      r = combine(p.guard_2.accept(this, arg), r, arg);
      return r;
    }

/* Literal */
    public R visit(ABS.Absyn.LNull p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.LThis p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.LStr p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(ABS.Absyn.LInt p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* EffExp */
    public R visit(ABS.Absyn.New p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.NewLocal p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.SyncCall p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ThisSyncCall p, A arg) {
      R r = leaf(arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.AsyncCall p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.ThisAsyncCall p, A arg) {
      R r = leaf(arg);
      for (PureExp x : p.listpureexp_) {
        r = combine(x.accept(this,arg), r, arg);
      }
      return r;
    }
    public R visit(ABS.Absyn.Get p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }

/* Exp */
    public R visit(ABS.Absyn.ExpP p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(ABS.Absyn.ExpE p, A arg) {
      R r = leaf(arg);
      r = combine(p.effexp_.accept(this, arg), r, arg);
      return r;
    }

/* Ann */
    public R visit(ABS.Absyn.SimpleAnn p, A arg) {
      R r = leaf(arg);
      r = combine(p.pureexp_.accept(this, arg), r, arg);
      return r;
    }


}
