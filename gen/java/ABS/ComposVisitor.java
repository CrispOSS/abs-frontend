package ABS;
import ABS.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  ABS.Absyn.Type.Visitor<ABS.Absyn.Type,A>,
  ABS.Absyn.AnnType.Visitor<ABS.Absyn.AnnType,A>,
  ABS.Absyn.QualType.Visitor<ABS.Absyn.QualType,A>,
  ABS.Absyn.QualTypeIdent.Visitor<ABS.Absyn.QualTypeIdent,A>,
  ABS.Absyn.Program.Visitor<ABS.Absyn.Program,A>,
  ABS.Absyn.ModuleDecl.Visitor<ABS.Absyn.ModuleDecl,A>,
  ABS.Absyn.Export.Visitor<ABS.Absyn.Export,A>,
  ABS.Absyn.ImportType.Visitor<ABS.Absyn.ImportType,A>,
  ABS.Absyn.Import.Visitor<ABS.Absyn.Import,A>,
  ABS.Absyn.AnyIdent.Visitor<ABS.Absyn.AnyIdent,A>,
  ABS.Absyn.AnnDecl.Visitor<ABS.Absyn.AnnDecl,A>,
  ABS.Absyn.Decl.Visitor<ABS.Absyn.Decl,A>,
  ABS.Absyn.ConstrIdent.Visitor<ABS.Absyn.ConstrIdent,A>,
  ABS.Absyn.ConstrType.Visitor<ABS.Absyn.ConstrType,A>,
  ABS.Absyn.MethSig.Visitor<ABS.Absyn.MethSig,A>,
  ABS.Absyn.BodyDecl.Visitor<ABS.Absyn.BodyDecl,A>,
  ABS.Absyn.Block.Visitor<ABS.Absyn.Block,A>,
  ABS.Absyn.MaybeBlock.Visitor<ABS.Absyn.MaybeBlock,A>,
  ABS.Absyn.FunBody.Visitor<ABS.Absyn.FunBody,A>,
  ABS.Absyn.Param.Visitor<ABS.Absyn.Param,A>,
  ABS.Absyn.PureExp.Visitor<ABS.Absyn.PureExp,A>,
  ABS.Absyn.CaseBranch.Visitor<ABS.Absyn.CaseBranch,A>,
  ABS.Absyn.Pattern.Visitor<ABS.Absyn.Pattern,A>,
  ABS.Absyn.Stm.Visitor<ABS.Absyn.Stm,A>,
  ABS.Absyn.Guard.Visitor<ABS.Absyn.Guard,A>,
  ABS.Absyn.Literal.Visitor<ABS.Absyn.Literal,A>,
  ABS.Absyn.EffExp.Visitor<ABS.Absyn.EffExp,A>,
  ABS.Absyn.Exp.Visitor<ABS.Absyn.Exp,A>,
  ABS.Absyn.Ann.Visitor<ABS.Absyn.Ann,A>
{
/* Type */
    public Type visit(ABS.Absyn.TyUnit p, A arg)
    {

      return new ABS.Absyn.TyUnit();
    }
    public Type visit(ABS.Absyn.TyInt p, A arg)
    {

      return new ABS.Absyn.TyInt();
    }
    public Type visit(ABS.Absyn.TyRat p, A arg)
    {

      return new ABS.Absyn.TyRat();
    }
    public Type visit(ABS.Absyn.TyFut p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);

      return new ABS.Absyn.TyFut(type_);
    }
    public Type visit(ABS.Absyn.TyUnderscore p, A arg)
    {

      return new ABS.Absyn.TyUnderscore();
    }
    public Type visit(ABS.Absyn.TypeVar p, A arg)
    {
      QualType qualtype_ = p.qualtype_.accept(this, arg);

      return new ABS.Absyn.TypeVar(qualtype_);
    }
    public Type visit(ABS.Absyn.ArgType p, A arg)
    {
      QualType qualtype_ = p.qualtype_.accept(this, arg);
      ListAnnType listanntype_ = new ListAnnType();
      for (AnnType x : p.listanntype_) {
        listanntype_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ArgType(qualtype_, listanntype_);
    }

/* AnnType */
    public AnnType visit(ABS.Absyn.AnnType_ p, A arg)
    {
      ListAnn listann_ = new ListAnn();
      for (Ann x : p.listann_) {
        listann_.add(x.accept(this,arg));
      }
      Type type_ = p.type_.accept(this, arg);

      return new ABS.Absyn.AnnType_(listann_, type_);
    }

/* QualType */
    public QualType visit(ABS.Absyn.QualType_ p, A arg)
    {
      ListQualTypeIdent listqualtypeident_ = new ListQualTypeIdent();
      for (QualTypeIdent x : p.listqualtypeident_) {
        listqualtypeident_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.QualType_(listqualtypeident_);
    }

/* QualTypeIdent */
    public QualTypeIdent visit(ABS.Absyn.QualTypeIdent_ p, A arg)
    {
      String typeident_ = p.typeident_;

      return new ABS.Absyn.QualTypeIdent_(typeident_);
    }

/* Program */
    public Program visit(ABS.Absyn.Prog p, A arg)
    {
      ModuleDecl moduledecl_ = p.moduledecl_.accept(this, arg);

      return new ABS.Absyn.Prog(moduledecl_);
    }

/* ModuleDecl */
    public ModuleDecl visit(ABS.Absyn.ModuleDecl_ p, A arg)
    {
      QualType qualtype_ = p.qualtype_.accept(this, arg);
      ListExport listexport_ = new ListExport();
      for (Export x : p.listexport_) {
        listexport_.add(x.accept(this,arg));
      }
      ListImport listimport_ = new ListImport();
      for (Import x : p.listimport_) {
        listimport_.add(x.accept(this,arg));
      }
      ListAnnDecl listanndecl_ = new ListAnnDecl();
      for (AnnDecl x : p.listanndecl_) {
        listanndecl_.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);

      return new ABS.Absyn.ModuleDecl_(qualtype_, listexport_, listimport_, listanndecl_, maybeblock_);
    }

/* Export */
    public Export visit(ABS.Absyn.ExportAny p, A arg)
    {
      ListAnyIdent listanyident_ = new ListAnyIdent();
      for (AnyIdent x : p.listanyident_) {
        listanyident_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ExportAny(listanyident_);
    }
    public Export visit(ABS.Absyn.ExportAnyFrom p, A arg)
    {
      ListAnyIdent listanyident_ = new ListAnyIdent();
      for (AnyIdent x : p.listanyident_) {
        listanyident_.add(x.accept(this,arg));
      }
      QualType qualtype_ = p.qualtype_.accept(this, arg);

      return new ABS.Absyn.ExportAnyFrom(listanyident_, qualtype_);
    }
    public Export visit(ABS.Absyn.ExportStar p, A arg)
    {

      return new ABS.Absyn.ExportStar();
    }
    public Export visit(ABS.Absyn.ExportStarFrom p, A arg)
    {
      QualType qualtype_ = p.qualtype_.accept(this, arg);

      return new ABS.Absyn.ExportStarFrom(qualtype_);
    }

/* ImportType */
    public ImportType visit(ABS.Absyn.ImportHaskell p, A arg)
    {

      return new ABS.Absyn.ImportHaskell();
    }
    public ImportType visit(ABS.Absyn.ImportABS p, A arg)
    {

      return new ABS.Absyn.ImportABS();
    }

/* Import */
    public Import visit(ABS.Absyn.ImportAnyFrom p, A arg)
    {
      ImportType importtype_ = p.importtype_.accept(this, arg);
      ListAnyIdent listanyident_ = new ListAnyIdent();
      for (AnyIdent x : p.listanyident_) {
        listanyident_.add(x.accept(this,arg));
      }
      QualType qualtype_ = p.qualtype_.accept(this, arg);

      return new ABS.Absyn.ImportAnyFrom(importtype_, listanyident_, qualtype_);
    }
    public Import visit(ABS.Absyn.ImportStarFrom p, A arg)
    {
      ImportType importtype_ = p.importtype_.accept(this, arg);
      QualType qualtype_ = p.qualtype_.accept(this, arg);

      return new ABS.Absyn.ImportStarFrom(importtype_, qualtype_);
    }

/* AnyIdent */
    public AnyIdent visit(ABS.Absyn.AnyIdentI p, A arg)
    {
      String ident_ = p.ident_;

      return new ABS.Absyn.AnyIdentI(ident_);
    }
    public AnyIdent visit(ABS.Absyn.AnyIdentT p, A arg)
    {
      String typeident_ = p.typeident_;

      return new ABS.Absyn.AnyIdentT(typeident_);
    }

/* AnnDecl */
    public AnnDecl visit(ABS.Absyn.AnnDecl_ p, A arg)
    {
      ListAnn listann_ = new ListAnn();
      for (Ann x : p.listann_) {
        listann_.add(x.accept(this,arg));
      }
      Decl decl_ = p.decl_.accept(this, arg);

      return new ABS.Absyn.AnnDecl_(listann_, decl_);
    }

/* Decl */
    public Decl visit(ABS.Absyn.TypeDecl p, A arg)
    {
      String typeident_ = p.typeident_;
      Type type_ = p.type_.accept(this, arg);

      return new ABS.Absyn.TypeDecl(typeident_, type_);
    }
    public Decl visit(ABS.Absyn.DataDecl p, A arg)
    {
      String typeident_ = p.typeident_;
      ListConstrIdent listconstrident_ = new ListConstrIdent();
      for (ConstrIdent x : p.listconstrident_) {
        listconstrident_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.DataDecl(typeident_, listconstrident_);
    }
    public Decl visit(ABS.Absyn.ParDataDecl p, A arg)
    {
      String typeident_ = p.typeident_;
      ListTypeIdent listtypeident_ = p.listtypeident_;
      ListConstrIdent listconstrident_ = new ListConstrIdent();
      for (ConstrIdent x : p.listconstrident_) {
        listconstrident_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ParDataDecl(typeident_, listtypeident_, listconstrident_);
    }
    public Decl visit(ABS.Absyn.Fun p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      FunBody funbody_ = p.funbody_.accept(this, arg);

      return new ABS.Absyn.Fun(type_, ident_, listparam_, funbody_);
    }
    public Decl visit(ABS.Absyn.ParFun p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;
      ListTypeIdent listtypeident_ = p.listtypeident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      FunBody funbody_ = p.funbody_.accept(this, arg);

      return new ABS.Absyn.ParFun(type_, ident_, listtypeident_, listparam_, funbody_);
    }
    public Decl visit(ABS.Absyn.InterfDecl p, A arg)
    {
      String typeident_ = p.typeident_;
      ListMethSig listmethsig_ = new ListMethSig();
      for (MethSig x : p.listmethsig_) {
        listmethsig_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.InterfDecl(typeident_, listmethsig_);
    }
    public Decl visit(ABS.Absyn.ExtendsDecl p, A arg)
    {
      String typeident_ = p.typeident_;
      ListQualType listqualtype_ = new ListQualType();
      for (QualType x : p.listqualtype_) {
        listqualtype_.add(x.accept(this,arg));
      }
      ListMethSig listmethsig_ = new ListMethSig();
      for (MethSig x : p.listmethsig_) {
        listmethsig_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ExtendsDecl(typeident_, listqualtype_, listmethsig_);
    }
    public Decl visit(ABS.Absyn.ClassDecl p, A arg)
    {
      String typeident_ = p.typeident_;
      ListBodyDecl listbodydecl_1 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_1) {
        listbodydecl_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListBodyDecl listbodydecl_2 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_2) {
        listbodydecl_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassDecl(typeident_, listbodydecl_1, maybeblock_, listbodydecl_2);
    }
    public Decl visit(ABS.Absyn.ClassParamDecl p, A arg)
    {
      String typeident_ = p.typeident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      ListBodyDecl listbodydecl_1 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_1) {
        listbodydecl_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListBodyDecl listbodydecl_2 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_2) {
        listbodydecl_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassParamDecl(typeident_, listparam_, listbodydecl_1, maybeblock_, listbodydecl_2);
    }
    public Decl visit(ABS.Absyn.ClassImplements p, A arg)
    {
      String typeident_ = p.typeident_;
      ListQualType listqualtype_ = new ListQualType();
      for (QualType x : p.listqualtype_) {
        listqualtype_.add(x.accept(this,arg));
      }
      ListBodyDecl listbodydecl_1 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_1) {
        listbodydecl_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListBodyDecl listbodydecl_2 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_2) {
        listbodydecl_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassImplements(typeident_, listqualtype_, listbodydecl_1, maybeblock_, listbodydecl_2);
    }
    public Decl visit(ABS.Absyn.ClassParamImplements p, A arg)
    {
      String typeident_ = p.typeident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      ListQualType listqualtype_ = new ListQualType();
      for (QualType x : p.listqualtype_) {
        listqualtype_.add(x.accept(this,arg));
      }
      ListBodyDecl listbodydecl_1 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_1) {
        listbodydecl_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListBodyDecl listbodydecl_2 = new ListBodyDecl();
      for (BodyDecl x : p.listbodydecl_2) {
        listbodydecl_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassParamImplements(typeident_, listparam_, listqualtype_, listbodydecl_1, maybeblock_, listbodydecl_2);
    }

/* ConstrIdent */
    public ConstrIdent visit(ABS.Absyn.UnaryConstr p, A arg)
    {
      String typeident_ = p.typeident_;

      return new ABS.Absyn.UnaryConstr(typeident_);
    }
    public ConstrIdent visit(ABS.Absyn.MultConstr p, A arg)
    {
      String typeident_ = p.typeident_;
      ListConstrType listconstrtype_ = new ListConstrType();
      for (ConstrType x : p.listconstrtype_) {
        listconstrtype_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.MultConstr(typeident_, listconstrtype_);
    }

/* ConstrType */
    public ConstrType visit(ABS.Absyn.EmptyConstrType p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);

      return new ABS.Absyn.EmptyConstrType(type_);
    }
    public ConstrType visit(ABS.Absyn.RecordConstrType p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;

      return new ABS.Absyn.RecordConstrType(type_, ident_);
    }

/* MethSig */
    public MethSig visit(ABS.Absyn.MethSig_ p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.MethSig_(type_, ident_, listparam_);
    }

/* BodyDecl */
    public BodyDecl visit(ABS.Absyn.FieldDecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;

      return new ABS.Absyn.FieldDecl(type_, ident_);
    }
    public BodyDecl visit(ABS.Absyn.FieldDeclAss p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.FieldDeclAss(type_, ident_, pureexp_);
    }
    public BodyDecl visit(ABS.Absyn.MethDecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      Block block_ = p.block_.accept(this, arg);

      return new ABS.Absyn.MethDecl(type_, ident_, listparam_, block_);
    }

/* Block */
    public Block visit(ABS.Absyn.Block_ p, A arg)
    {
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_) {
        liststm_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.Block_(liststm_);
    }

/* MaybeBlock */
    public MaybeBlock visit(ABS.Absyn.JustBlock p, A arg)
    {
      Block block_ = p.block_.accept(this, arg);

      return new ABS.Absyn.JustBlock(block_);
    }
    public MaybeBlock visit(ABS.Absyn.NoBlock p, A arg)
    {

      return new ABS.Absyn.NoBlock();
    }

/* FunBody */
    public FunBody visit(ABS.Absyn.Builtin p, A arg)
    {

      return new ABS.Absyn.Builtin();
    }
    public FunBody visit(ABS.Absyn.PureBody p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.PureBody(pureexp_);
    }

/* Param */
    public Param visit(ABS.Absyn.Par p, A arg)
    {
      AnnType anntype_ = p.anntype_.accept(this, arg);
      String ident_ = p.ident_;

      return new ABS.Absyn.Par(anntype_, ident_);
    }

/* PureExp */
    public PureExp visit(ABS.Absyn.Let p, A arg)
    {
      Param param_ = p.param_.accept(this, arg);
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.Let(param_, pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.If p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);
      PureExp pureexp_3 = p.pureexp_3.accept(this, arg);

      return new ABS.Absyn.If(pureexp_1, pureexp_2, pureexp_3);
    }
    public PureExp visit(ABS.Absyn.Case p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      ListCaseBranch listcasebranch_ = new ListCaseBranch();
      for (CaseBranch x : p.listcasebranch_) {
        listcasebranch_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.Case(pureexp_, listcasebranch_);
    }
    public PureExp visit(ABS.Absyn.EOr p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EOr(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EAnd p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EAnd(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EEq p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EEq(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.ENeq p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.ENeq(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.ELt p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.ELt(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.ELe p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.ELe(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EGt p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EGt(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EGe p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EGe(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EAdd p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EAdd(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.ESub p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.ESub(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EMul p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EMul(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EDiv p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EDiv(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.EMod p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EMod(pureexp_1, pureexp_2);
    }
    public PureExp visit(ABS.Absyn.ELogNeg p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.ELogNeg(pureexp_);
    }
    public PureExp visit(ABS.Absyn.EIntNeg p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.EIntNeg(pureexp_);
    }
    public PureExp visit(ABS.Absyn.ECall p, A arg)
    {
      String ident_ = p.ident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ECall(ident_, listpureexp_);
    }
    public PureExp visit(ABS.Absyn.ENaryCall p, A arg)
    {
      String ident_ = p.ident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ENaryCall(ident_, listpureexp_);
    }
    public PureExp visit(ABS.Absyn.ELit p, A arg)
    {
      Literal literal_ = p.literal_.accept(this, arg);

      return new ABS.Absyn.ELit(literal_);
    }
    public PureExp visit(ABS.Absyn.EVar p, A arg)
    {
      String ident_ = p.ident_;

      return new ABS.Absyn.EVar(ident_);
    }
    public PureExp visit(ABS.Absyn.EThis p, A arg)
    {
      String ident_ = p.ident_;

      return new ABS.Absyn.EThis(ident_);
    }
    public PureExp visit(ABS.Absyn.EUnaryConstr p, A arg)
    {
      QualType qualtype_ = p.qualtype_.accept(this, arg);

      return new ABS.Absyn.EUnaryConstr(qualtype_);
    }
    public PureExp visit(ABS.Absyn.EMultConstr p, A arg)
    {
      QualType qualtype_ = p.qualtype_.accept(this, arg);
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.EMultConstr(qualtype_, listpureexp_);
    }

/* CaseBranch */
    public CaseBranch visit(ABS.Absyn.CBranch p, A arg)
    {
      Pattern pattern_ = p.pattern_.accept(this, arg);
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.CBranch(pattern_, pureexp_);
    }

/* Pattern */
    public Pattern visit(ABS.Absyn.PIdent p, A arg)
    {
      String ident_ = p.ident_;

      return new ABS.Absyn.PIdent(ident_);
    }
    public Pattern visit(ABS.Absyn.PLit p, A arg)
    {
      Literal literal_ = p.literal_.accept(this, arg);

      return new ABS.Absyn.PLit(literal_);
    }
    public Pattern visit(ABS.Absyn.PUnaryConstr p, A arg)
    {
      String typeident_ = p.typeident_;

      return new ABS.Absyn.PUnaryConstr(typeident_);
    }
    public Pattern visit(ABS.Absyn.PMultConstr p, A arg)
    {
      String typeident_ = p.typeident_;
      ListPattern listpattern_ = new ListPattern();
      for (Pattern x : p.listpattern_) {
        listpattern_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.PMultConstr(typeident_, listpattern_);
    }
    public Pattern visit(ABS.Absyn.PUnderscore p, A arg)
    {

      return new ABS.Absyn.PUnderscore();
    }

/* Stm */
    public Stm visit(ABS.Absyn.SExp p, A arg)
    {
      EffExp effexp_ = p.effexp_.accept(this, arg);

      return new ABS.Absyn.SExp(effexp_);
    }
    public Stm visit(ABS.Absyn.SBlock p, A arg)
    {
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_) {
        liststm_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.SBlock(liststm_);
    }
    public Stm visit(ABS.Absyn.SWhile p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      Stm stm_ = p.stm_.accept(this, arg);

      return new ABS.Absyn.SWhile(pureexp_, stm_);
    }
    public Stm visit(ABS.Absyn.SReturn p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SReturn(exp_);
    }
    public Stm visit(ABS.Absyn.SAss p, A arg)
    {
      String ident_ = p.ident_;
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SAss(ident_, exp_);
    }
    public Stm visit(ABS.Absyn.SFieldAss p, A arg)
    {
      String ident_ = p.ident_;
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SFieldAss(ident_, exp_);
    }
    public Stm visit(ABS.Absyn.SDec p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;

      return new ABS.Absyn.SDec(type_, ident_);
    }
    public Stm visit(ABS.Absyn.SDecAss p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String ident_ = p.ident_;
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SDecAss(type_, ident_, exp_);
    }
    public Stm visit(ABS.Absyn.SIf p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      Stm stm_ = p.stm_.accept(this, arg);

      return new ABS.Absyn.SIf(pureexp_, stm_);
    }
    public Stm visit(ABS.Absyn.SIfElse p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      Stm stm_1 = p.stm_1.accept(this, arg);
      Stm stm_2 = p.stm_2.accept(this, arg);

      return new ABS.Absyn.SIfElse(pureexp_, stm_1, stm_2);
    }
    public Stm visit(ABS.Absyn.SAwait p, A arg)
    {
      Guard guard_ = p.guard_.accept(this, arg);

      return new ABS.Absyn.SAwait(guard_);
    }
    public Stm visit(ABS.Absyn.SSuspend p, A arg)
    {

      return new ABS.Absyn.SSuspend();
    }
    public Stm visit(ABS.Absyn.SSkip p, A arg)
    {

      return new ABS.Absyn.SSkip();
    }
    public Stm visit(ABS.Absyn.SAssert p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.SAssert(pureexp_);
    }

/* Guard */
    public Guard visit(ABS.Absyn.VarGuard p, A arg)
    {
      String ident_ = p.ident_;

      return new ABS.Absyn.VarGuard(ident_);
    }
    public Guard visit(ABS.Absyn.FieldGuard p, A arg)
    {
      String ident_ = p.ident_;

      return new ABS.Absyn.FieldGuard(ident_);
    }
    public Guard visit(ABS.Absyn.ExpGuard p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.ExpGuard(pureexp_);
    }
    public Guard visit(ABS.Absyn.AndGuard p, A arg)
    {
      Guard guard_1 = p.guard_1.accept(this, arg);
      Guard guard_2 = p.guard_2.accept(this, arg);

      return new ABS.Absyn.AndGuard(guard_1, guard_2);
    }

/* Literal */
    public Literal visit(ABS.Absyn.LNull p, A arg)
    {

      return new ABS.Absyn.LNull();
    }
    public Literal visit(ABS.Absyn.LThis p, A arg)
    {

      return new ABS.Absyn.LThis();
    }
    public Literal visit(ABS.Absyn.LStr p, A arg)
    {
      String string_ = p.string_;

      return new ABS.Absyn.LStr(string_);
    }
    public Literal visit(ABS.Absyn.LInt p, A arg)
    {
      Integer integer_ = p.integer_;

      return new ABS.Absyn.LInt(integer_);
    }

/* EffExp */
    public EffExp visit(ABS.Absyn.New p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.New(type_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.NewLocal p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.NewLocal(type_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.SyncCall p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      String ident_ = p.ident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.SyncCall(pureexp_, ident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.ThisSyncCall p, A arg)
    {
      String ident_ = p.ident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ThisSyncCall(ident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.AsyncCall p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      String ident_ = p.ident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.AsyncCall(pureexp_, ident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.ThisAsyncCall p, A arg)
    {
      String ident_ = p.ident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ThisAsyncCall(ident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.Get p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.Get(pureexp_);
    }

/* Exp */
    public Exp visit(ABS.Absyn.ExpP p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.ExpP(pureexp_);
    }
    public Exp visit(ABS.Absyn.ExpE p, A arg)
    {
      EffExp effexp_ = p.effexp_.accept(this, arg);

      return new ABS.Absyn.ExpE(effexp_);
    }

/* Ann */
    public Ann visit(ABS.Absyn.SimpleAnn p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.SimpleAnn(pureexp_);
    }

}