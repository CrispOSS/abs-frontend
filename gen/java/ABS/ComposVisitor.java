package ABS;
import ABS.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  ABS.Absyn.AnyIdent.Visitor<ABS.Absyn.AnyIdent,A>,
  ABS.Absyn.Program.Visitor<ABS.Absyn.Program,A>,
  ABS.Absyn.Module.Visitor<ABS.Absyn.Module,A>,
  ABS.Absyn.Export.Visitor<ABS.Absyn.Export,A>,
  ABS.Absyn.Import.Visitor<ABS.Absyn.Import,A>,
  ABS.Absyn.ImportType.Visitor<ABS.Absyn.ImportType,A>,
  ABS.Absyn.Type.Visitor<ABS.Absyn.Type,A>,
  ABS.Absyn.QType.Visitor<ABS.Absyn.QType,A>,
  ABS.Absyn.QTypeSegment.Visitor<ABS.Absyn.QTypeSegment,A>,
  ABS.Absyn.TType.Visitor<ABS.Absyn.TType,A>,
  ABS.Absyn.TTypeSegment.Visitor<ABS.Absyn.TTypeSegment,A>,
  ABS.Absyn.Decl.Visitor<ABS.Absyn.Decl,A>,
  ABS.Absyn.ConstrIdent.Visitor<ABS.Absyn.ConstrIdent,A>,
  ABS.Absyn.ConstrType.Visitor<ABS.Absyn.ConstrType,A>,
  ABS.Absyn.FunBody.Visitor<ABS.Absyn.FunBody,A>,
  ABS.Absyn.MethSignat.Visitor<ABS.Absyn.MethSignat,A>,
  ABS.Absyn.ClassBody.Visitor<ABS.Absyn.ClassBody,A>,
  ABS.Absyn.Block.Visitor<ABS.Absyn.Block,A>,
  ABS.Absyn.MaybeBlock.Visitor<ABS.Absyn.MaybeBlock,A>,
  ABS.Absyn.Param.Visitor<ABS.Absyn.Param,A>,
  ABS.Absyn.Stm.Visitor<ABS.Absyn.Stm,A>,
  ABS.Absyn.CatchBranch.Visitor<ABS.Absyn.CatchBranch,A>,
  ABS.Absyn.MaybeFinally.Visitor<ABS.Absyn.MaybeFinally,A>,
  ABS.Absyn.Guard.Visitor<ABS.Absyn.Guard,A>,
  ABS.Absyn.Exp.Visitor<ABS.Absyn.Exp,A>,
  ABS.Absyn.PureExp.Visitor<ABS.Absyn.PureExp,A>,
  ABS.Absyn.CaseBranch.Visitor<ABS.Absyn.CaseBranch,A>,
  ABS.Absyn.Pattern.Visitor<ABS.Absyn.Pattern,A>,
  ABS.Absyn.Literal.Visitor<ABS.Absyn.Literal,A>,
  ABS.Absyn.EffExp.Visitor<ABS.Absyn.EffExp,A>,
  ABS.Absyn.Ann.Visitor<ABS.Absyn.Ann,A>,
  ABS.Absyn.AnnDecl.Visitor<ABS.Absyn.AnnDecl,A>,
  ABS.Absyn.AnnType.Visitor<ABS.Absyn.AnnType,A>
{
/* AnyIdent */
    public AnyIdent visit(ABS.Absyn.AnyIden p, A arg)
    {
      String lident_ = p.lident_;

      return new ABS.Absyn.AnyIden(lident_);
    }
    public AnyIdent visit(ABS.Absyn.AnyTyIden p, A arg)
    {
      String uident_ = p.uident_;

      return new ABS.Absyn.AnyTyIden(uident_);
    }

/* Program */
    public Program visit(ABS.Absyn.Prog p, A arg)
    {
      ListModule listmodule_ = new ListModule();
      for (Module x : p.listmodule_) {
        listmodule_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.Prog(listmodule_);
    }

/* Module */
    public Module visit(ABS.Absyn.Modul p, A arg)
    {
      QType qtype_ = p.qtype_.accept(this, arg);
      ListExport listexport_ = new ListExport();
      for (Export x : p.listexport_) {
        listexport_.add(x.accept(this,arg));
      }
      ListImport listimport_ = new ListImport();
      for (Import x : p.listimport_) {
        listimport_.add(x.accept(this,arg));
      }
      ListDecl listdecl_ = new ListDecl();
      for (Decl x : p.listdecl_) {
        listdecl_.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);

      return new ABS.Absyn.Modul(qtype_, listexport_, listimport_, listdecl_, maybeblock_);
    }

/* Export */
    public Export visit(ABS.Absyn.AnyExport p, A arg)
    {
      ListAnyIdent listanyident_ = new ListAnyIdent();
      for (AnyIdent x : p.listanyident_) {
        listanyident_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.AnyExport(listanyident_);
    }
    public Export visit(ABS.Absyn.AnyFromExport p, A arg)
    {
      ListAnyIdent listanyident_ = new ListAnyIdent();
      for (AnyIdent x : p.listanyident_) {
        listanyident_.add(x.accept(this,arg));
      }
      QType qtype_ = p.qtype_.accept(this, arg);

      return new ABS.Absyn.AnyFromExport(listanyident_, qtype_);
    }
    public Export visit(ABS.Absyn.StarExport p, A arg)
    {

      return new ABS.Absyn.StarExport();
    }
    public Export visit(ABS.Absyn.StarFromExport p, A arg)
    {
      QType qtype_ = p.qtype_.accept(this, arg);

      return new ABS.Absyn.StarFromExport(qtype_);
    }

/* Import */
    public Import visit(ABS.Absyn.AnyImport p, A arg)
    {
      ImportType importtype_ = p.importtype_.accept(this, arg);
      TType ttype_ = p.ttype_.accept(this, arg);
      AnyIdent anyident_ = p.anyident_.accept(this, arg);

      return new ABS.Absyn.AnyImport(importtype_, ttype_, anyident_);
    }
    public Import visit(ABS.Absyn.AnyFromImport p, A arg)
    {
      ImportType importtype_ = p.importtype_.accept(this, arg);
      ListAnyIdent listanyident_ = new ListAnyIdent();
      for (AnyIdent x : p.listanyident_) {
        listanyident_.add(x.accept(this,arg));
      }
      QType qtype_ = p.qtype_.accept(this, arg);

      return new ABS.Absyn.AnyFromImport(importtype_, listanyident_, qtype_);
    }
    public Import visit(ABS.Absyn.StarFromImport p, A arg)
    {
      ImportType importtype_ = p.importtype_.accept(this, arg);
      QType qtype_ = p.qtype_.accept(this, arg);

      return new ABS.Absyn.StarFromImport(importtype_, qtype_);
    }

/* ImportType */
    public ImportType visit(ABS.Absyn.ForeignImport p, A arg)
    {

      return new ABS.Absyn.ForeignImport();
    }
    public ImportType visit(ABS.Absyn.NormalImport p, A arg)
    {

      return new ABS.Absyn.NormalImport();
    }

/* Type */
    public Type visit(ABS.Absyn.TUnderscore p, A arg)
    {

      return new ABS.Absyn.TUnderscore();
    }
    public Type visit(ABS.Absyn.TSimple p, A arg)
    {
      QType qtype_ = p.qtype_.accept(this, arg);

      return new ABS.Absyn.TSimple(qtype_);
    }
    public Type visit(ABS.Absyn.TGen p, A arg)
    {
      QType qtype_ = p.qtype_.accept(this, arg);
      ListType listtype_ = new ListType();
      for (Type x : p.listtype_) {
        listtype_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.TGen(qtype_, listtype_);
    }

/* QType */
    public QType visit(ABS.Absyn.QTyp p, A arg)
    {
      ListQTypeSegment listqtypesegment_ = new ListQTypeSegment();
      for (QTypeSegment x : p.listqtypesegment_) {
        listqtypesegment_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.QTyp(listqtypesegment_);
    }

/* QTypeSegment */
    public QTypeSegment visit(ABS.Absyn.QTypeSegmen p, A arg)
    {
      String uident_ = p.uident_;

      return new ABS.Absyn.QTypeSegmen(uident_);
    }

/* TType */
    public TType visit(ABS.Absyn.TTyp p, A arg)
    {
      ListTTypeSegment listttypesegment_ = new ListTTypeSegment();
      for (TTypeSegment x : p.listttypesegment_) {
        listttypesegment_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.TTyp(listttypesegment_);
    }

/* TTypeSegment */
    public TTypeSegment visit(ABS.Absyn.TTypeSegmen p, A arg)
    {
      String uident_ = p.uident_;

      return new ABS.Absyn.TTypeSegmen(uident_);
    }

/* Decl */
    public Decl visit(ABS.Absyn.TypeDecl p, A arg)
    {
      String uident_ = p.uident_;
      Type type_ = p.type_.accept(this, arg);

      return new ABS.Absyn.TypeDecl(uident_, type_);
    }
    public Decl visit(ABS.Absyn.TypeParDecl p, A arg)
    {
      String uident_ = p.uident_;
      ListUIdent listuident_ = p.listuident_;
      Type type_ = p.type_.accept(this, arg);

      return new ABS.Absyn.TypeParDecl(uident_, listuident_, type_);
    }
    public Decl visit(ABS.Absyn.ExceptionDecl p, A arg)
    {
      ConstrIdent constrident_ = p.constrident_.accept(this, arg);

      return new ABS.Absyn.ExceptionDecl(constrident_);
    }
    public Decl visit(ABS.Absyn.DataDecl p, A arg)
    {
      String uident_ = p.uident_;
      ListConstrIdent listconstrident_ = new ListConstrIdent();
      for (ConstrIdent x : p.listconstrident_) {
        listconstrident_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.DataDecl(uident_, listconstrident_);
    }
    public Decl visit(ABS.Absyn.DataParDecl p, A arg)
    {
      String uident_ = p.uident_;
      ListUIdent listuident_ = p.listuident_;
      ListConstrIdent listconstrident_ = new ListConstrIdent();
      for (ConstrIdent x : p.listconstrident_) {
        listconstrident_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.DataParDecl(uident_, listuident_, listconstrident_);
    }
    public Decl visit(ABS.Absyn.FunDecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      FunBody funbody_ = p.funbody_.accept(this, arg);

      return new ABS.Absyn.FunDecl(type_, lident_, listparam_, funbody_);
    }
    public Decl visit(ABS.Absyn.FunParDecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;
      ListUIdent listuident_ = p.listuident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      FunBody funbody_ = p.funbody_.accept(this, arg);

      return new ABS.Absyn.FunParDecl(type_, lident_, listuident_, listparam_, funbody_);
    }
    public Decl visit(ABS.Absyn.InterfDecl p, A arg)
    {
      String uident_ = p.uident_;
      ListMethSignat listmethsignat_ = new ListMethSignat();
      for (MethSignat x : p.listmethsignat_) {
        listmethsignat_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.InterfDecl(uident_, listmethsignat_);
    }
    public Decl visit(ABS.Absyn.ExtendsDecl p, A arg)
    {
      String uident_ = p.uident_;
      ListQType listqtype_ = new ListQType();
      for (QType x : p.listqtype_) {
        listqtype_.add(x.accept(this,arg));
      }
      ListMethSignat listmethsignat_ = new ListMethSignat();
      for (MethSignat x : p.listmethsignat_) {
        listmethsignat_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ExtendsDecl(uident_, listqtype_, listmethsignat_);
    }
    public Decl visit(ABS.Absyn.ClassDecl p, A arg)
    {
      String uident_ = p.uident_;
      ListClassBody listclassbody_1 = new ListClassBody();
      for (ClassBody x : p.listclassbody_1) {
        listclassbody_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListClassBody listclassbody_2 = new ListClassBody();
      for (ClassBody x : p.listclassbody_2) {
        listclassbody_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassDecl(uident_, listclassbody_1, maybeblock_, listclassbody_2);
    }
    public Decl visit(ABS.Absyn.ClassParamDecl p, A arg)
    {
      String uident_ = p.uident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      ListClassBody listclassbody_1 = new ListClassBody();
      for (ClassBody x : p.listclassbody_1) {
        listclassbody_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListClassBody listclassbody_2 = new ListClassBody();
      for (ClassBody x : p.listclassbody_2) {
        listclassbody_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassParamDecl(uident_, listparam_, listclassbody_1, maybeblock_, listclassbody_2);
    }
    public Decl visit(ABS.Absyn.ClassImplements p, A arg)
    {
      String uident_ = p.uident_;
      ListQType listqtype_ = new ListQType();
      for (QType x : p.listqtype_) {
        listqtype_.add(x.accept(this,arg));
      }
      ListClassBody listclassbody_1 = new ListClassBody();
      for (ClassBody x : p.listclassbody_1) {
        listclassbody_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListClassBody listclassbody_2 = new ListClassBody();
      for (ClassBody x : p.listclassbody_2) {
        listclassbody_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassImplements(uident_, listqtype_, listclassbody_1, maybeblock_, listclassbody_2);
    }
    public Decl visit(ABS.Absyn.ClassParamImplements p, A arg)
    {
      String uident_ = p.uident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      ListQType listqtype_ = new ListQType();
      for (QType x : p.listqtype_) {
        listqtype_.add(x.accept(this,arg));
      }
      ListClassBody listclassbody_1 = new ListClassBody();
      for (ClassBody x : p.listclassbody_1) {
        listclassbody_1.add(x.accept(this,arg));
      }
      MaybeBlock maybeblock_ = p.maybeblock_.accept(this, arg);
      ListClassBody listclassbody_2 = new ListClassBody();
      for (ClassBody x : p.listclassbody_2) {
        listclassbody_2.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ClassParamImplements(uident_, listparam_, listqtype_, listclassbody_1, maybeblock_, listclassbody_2);
    }

/* ConstrIdent */
    public ConstrIdent visit(ABS.Absyn.SinglConstrIdent p, A arg)
    {
      String uident_ = p.uident_;

      return new ABS.Absyn.SinglConstrIdent(uident_);
    }
    public ConstrIdent visit(ABS.Absyn.ParamConstrIdent p, A arg)
    {
      String uident_ = p.uident_;
      ListConstrType listconstrtype_ = new ListConstrType();
      for (ConstrType x : p.listconstrtype_) {
        listconstrtype_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ParamConstrIdent(uident_, listconstrtype_);
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
      String lident_ = p.lident_;

      return new ABS.Absyn.RecordConstrType(type_, lident_);
    }

/* FunBody */
    public FunBody visit(ABS.Absyn.BuiltinFunBody p, A arg)
    {

      return new ABS.Absyn.BuiltinFunBody();
    }
    public FunBody visit(ABS.Absyn.NormalFunBody p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.NormalFunBody(pureexp_);
    }

/* MethSignat */
    public MethSignat visit(ABS.Absyn.MethSig p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.MethSig(type_, lident_, listparam_);
    }

/* ClassBody */
    public ClassBody visit(ABS.Absyn.FieldClassBody p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;

      return new ABS.Absyn.FieldClassBody(type_, lident_);
    }
    public ClassBody visit(ABS.Absyn.FieldAssignClassBody p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.FieldAssignClassBody(type_, lident_, pureexp_);
    }
    public ClassBody visit(ABS.Absyn.MethClassBody p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;
      ListParam listparam_ = new ListParam();
      for (Param x : p.listparam_) {
        listparam_.add(x.accept(this,arg));
      }
      Block block_ = p.block_.accept(this, arg);

      return new ABS.Absyn.MethClassBody(type_, lident_, listparam_, block_);
    }

/* Block */
    public Block visit(ABS.Absyn.Bloc p, A arg)
    {
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_) {
        liststm_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.Bloc(liststm_);
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

/* Param */
    public Param visit(ABS.Absyn.Par p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;

      return new ABS.Absyn.Par(type_, lident_);
    }

/* Stm */
    public Stm visit(ABS.Absyn.SExp p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SExp(exp_);
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
      String lident_ = p.lident_;
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SAss(lident_, exp_);
    }
    public Stm visit(ABS.Absyn.SFieldAss p, A arg)
    {
      String lident_ = p.lident_;
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SFieldAss(lident_, exp_);
    }
    public Stm visit(ABS.Absyn.SDec p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;

      return new ABS.Absyn.SDec(type_, lident_);
    }
    public Stm visit(ABS.Absyn.SDecAss p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String lident_ = p.lident_;
      Exp exp_ = p.exp_.accept(this, arg);

      return new ABS.Absyn.SDecAss(type_, lident_, exp_);
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
    public Stm visit(ABS.Absyn.SAwait p, A arg)
    {
      Guard guard_ = p.guard_.accept(this, arg);

      return new ABS.Absyn.SAwait(guard_);
    }
    public Stm visit(ABS.Absyn.SThrow p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.SThrow(pureexp_);
    }
    public Stm visit(ABS.Absyn.STryCatchFinally p, A arg)
    {
      Stm stm_ = p.stm_.accept(this, arg);
      ListCatchBranch listcatchbranch_ = new ListCatchBranch();
      for (CatchBranch x : p.listcatchbranch_) {
        listcatchbranch_.add(x.accept(this,arg));
      }
      MaybeFinally maybefinally_ = p.maybefinally_.accept(this, arg);

      return new ABS.Absyn.STryCatchFinally(stm_, listcatchbranch_, maybefinally_);
    }
    public Stm visit(ABS.Absyn.SPrint p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.SPrint(pureexp_);
    }

/* CatchBranch */
    public CatchBranch visit(ABS.Absyn.CatchBranc p, A arg)
    {
      Pattern pattern_ = p.pattern_.accept(this, arg);
      Stm stm_ = p.stm_.accept(this, arg);

      return new ABS.Absyn.CatchBranc(pattern_, stm_);
    }

/* MaybeFinally */
    public MaybeFinally visit(ABS.Absyn.JustFinally p, A arg)
    {
      Stm stm_ = p.stm_.accept(this, arg);

      return new ABS.Absyn.JustFinally(stm_);
    }
    public MaybeFinally visit(ABS.Absyn.NoFinally p, A arg)
    {

      return new ABS.Absyn.NoFinally();
    }

/* Guard */
    public Guard visit(ABS.Absyn.VarGuard p, A arg)
    {
      String lident_ = p.lident_;

      return new ABS.Absyn.VarGuard(lident_);
    }
    public Guard visit(ABS.Absyn.FieldGuard p, A arg)
    {
      String lident_ = p.lident_;

      return new ABS.Absyn.FieldGuard(lident_);
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

/* PureExp */
    public PureExp visit(ABS.Absyn.EOr p, A arg)
    {
      PureExp pureexp_1 = p.pureexp_1.accept(this, arg);
      PureExp pureexp_2 = p.pureexp_2.accept(this, arg);

      return new ABS.Absyn.EOr(pureexp_1, pureexp_2);
    }
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
    public PureExp visit(ABS.Absyn.EFunCall p, A arg)
    {
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.EFunCall(lident_, listpureexp_);
    }
    public PureExp visit(ABS.Absyn.EQualFunCall p, A arg)
    {
      TType ttype_ = p.ttype_.accept(this, arg);
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.EQualFunCall(ttype_, lident_, listpureexp_);
    }
    public PureExp visit(ABS.Absyn.ENaryFunCall p, A arg)
    {
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ENaryFunCall(lident_, listpureexp_);
    }
    public PureExp visit(ABS.Absyn.ENaryQualFunCall p, A arg)
    {
      TType ttype_ = p.ttype_.accept(this, arg);
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ENaryQualFunCall(ttype_, lident_, listpureexp_);
    }
    public PureExp visit(ABS.Absyn.EVar p, A arg)
    {
      String lident_ = p.lident_;

      return new ABS.Absyn.EVar(lident_);
    }
    public PureExp visit(ABS.Absyn.EThis p, A arg)
    {
      String lident_ = p.lident_;

      return new ABS.Absyn.EThis(lident_);
    }
    public PureExp visit(ABS.Absyn.EQualVar p, A arg)
    {
      TType ttype_ = p.ttype_.accept(this, arg);
      String lident_ = p.lident_;

      return new ABS.Absyn.EQualVar(ttype_, lident_);
    }
    public PureExp visit(ABS.Absyn.ESinglConstr p, A arg)
    {
      QType qtype_ = p.qtype_.accept(this, arg);

      return new ABS.Absyn.ESinglConstr(qtype_);
    }
    public PureExp visit(ABS.Absyn.EParamConstr p, A arg)
    {
      QType qtype_ = p.qtype_.accept(this, arg);
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.EParamConstr(qtype_, listpureexp_);
    }
    public PureExp visit(ABS.Absyn.ELit p, A arg)
    {
      Literal literal_ = p.literal_.accept(this, arg);

      return new ABS.Absyn.ELit(literal_);
    }

/* CaseBranch */
    public CaseBranch visit(ABS.Absyn.CaseBranc p, A arg)
    {
      Pattern pattern_ = p.pattern_.accept(this, arg);
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.CaseBranc(pattern_, pureexp_);
    }

/* Pattern */
    public Pattern visit(ABS.Absyn.PIdent p, A arg)
    {
      String lident_ = p.lident_;

      return new ABS.Absyn.PIdent(lident_);
    }
    public Pattern visit(ABS.Absyn.PLit p, A arg)
    {
      Literal literal_ = p.literal_.accept(this, arg);

      return new ABS.Absyn.PLit(literal_);
    }
    public Pattern visit(ABS.Absyn.PSinglConstr p, A arg)
    {
      String uident_ = p.uident_;

      return new ABS.Absyn.PSinglConstr(uident_);
    }
    public Pattern visit(ABS.Absyn.PParamConstr p, A arg)
    {
      String uident_ = p.uident_;
      ListPattern listpattern_ = new ListPattern();
      for (Pattern x : p.listpattern_) {
        listpattern_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.PParamConstr(uident_, listpattern_);
    }
    public Pattern visit(ABS.Absyn.PUnderscore p, A arg)
    {

      return new ABS.Absyn.PUnderscore();
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
    public Literal visit(ABS.Absyn.LThisDC p, A arg)
    {

      return new ABS.Absyn.LThisDC();
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
    public EffExp visit(ABS.Absyn.SyncMethCall p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.SyncMethCall(pureexp_, lident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.ThisSyncMethCall p, A arg)
    {
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ThisSyncMethCall(lident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.AsyncMethCall p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.AsyncMethCall(pureexp_, lident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.ThisAsyncMethCall p, A arg)
    {
      String lident_ = p.lident_;
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.ThisAsyncMethCall(lident_, listpureexp_);
    }
    public EffExp visit(ABS.Absyn.Get p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.Get(pureexp_);
    }
    public EffExp visit(ABS.Absyn.Spawns p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);
      Type type_ = p.type_.accept(this, arg);
      ListPureExp listpureexp_ = new ListPureExp();
      for (PureExp x : p.listpureexp_) {
        listpureexp_.add(x.accept(this,arg));
      }

      return new ABS.Absyn.Spawns(pureexp_, type_, listpureexp_);
    }

/* Ann */
    public Ann visit(ABS.Absyn.SimpleAnn p, A arg)
    {
      PureExp pureexp_ = p.pureexp_.accept(this, arg);

      return new ABS.Absyn.SimpleAnn(pureexp_);
    }

/* AnnDecl */
    public AnnDecl visit(ABS.Absyn.AnnDec p, A arg)
    {
      ListAnn listann_ = new ListAnn();
      for (Ann x : p.listann_) {
        listann_.add(x.accept(this,arg));
      }
      Decl decl_ = p.decl_.accept(this, arg);

      return new ABS.Absyn.AnnDec(listann_, decl_);
    }

/* AnnType */
    public AnnType visit(ABS.Absyn.AnnTyp p, A arg)
    {
      ListAnn listann_ = new ListAnn();
      for (Ann x : p.listann_) {
        listann_.add(x.accept(this,arg));
      }
      Type type_ = p.type_.accept(this, arg);

      return new ABS.Absyn.AnnTyp(listann_, type_);
    }

}