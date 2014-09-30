package ABS;
import ABS.Absyn.*;
/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use. 
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class TypeVisitor<R,A> implements Type.Visitor<R,A>
  {
    public R visit(ABS.Absyn.TyUnit p, A arg)
    {
      /* Code For TyUnit Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.TyInt p, A arg)
    {
      /* Code For TyInt Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.TyRat p, A arg)
    {
      /* Code For TyRat Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.TyFut p, A arg)
    {
      /* Code For TyFut Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.TyUnderscore p, A arg)
    {
      /* Code For TyUnderscore Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.TypeVar p, A arg)
    {
      /* Code For TypeVar Goes Here */

      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ArgType p, A arg)
    {
      /* Code For ArgType Goes Here */

      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);
      for (AnnType x : p.listanntype_) {
      }

      return null;
    }

  }
  public class AnnTypeVisitor<R,A> implements AnnType.Visitor<R,A>
  {
    public R visit(ABS.Absyn.AnnType_ p, A arg)
    {
      /* Code For AnnType_ Goes Here */

      for (Ann x : p.listann_) {
      }
      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }

  }
  public class QualTypeVisitor<R,A> implements QualType.Visitor<R,A>
  {
    public R visit(ABS.Absyn.QualType_ p, A arg)
    {
      /* Code For QualType_ Goes Here */

      for (QualTypeIdent x : p.listqualtypeident_) {
      }

      return null;
    }

  }
  public class QualTypeIdentVisitor<R,A> implements QualTypeIdent.Visitor<R,A>
  {
    public R visit(ABS.Absyn.QualTypeIdent_ p, A arg)
    {
      /* Code For QualTypeIdent_ Goes Here */

      //p.typeident_;

      return null;
    }

  }
  public class ProgramVisitor<R,A> implements Program.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Prog p, A arg)
    {
      /* Code For Prog Goes Here */

      p.moduledecl_.accept(new ModuleDeclVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ModuleDeclVisitor<R,A> implements ModuleDecl.Visitor<R,A>
  {
    public R visit(ABS.Absyn.ModuleDecl_ p, A arg)
    {
      /* Code For ModuleDecl_ Goes Here */

      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);
      for (Export x : p.listexport_) {
      }
      for (Import x : p.listimport_) {
      }
      for (AnnDecl x : p.listanndecl_) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ExportVisitor<R,A> implements Export.Visitor<R,A>
  {
    public R visit(ABS.Absyn.ExportAny p, A arg)
    {
      /* Code For ExportAny Goes Here */

      for (AnyIdent x : p.listanyident_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ExportAnyFrom p, A arg)
    {
      /* Code For ExportAnyFrom Goes Here */

      for (AnyIdent x : p.listanyident_) {
      }
      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ExportStar p, A arg)
    {
      /* Code For ExportStar Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.ExportStarFrom p, A arg)
    {
      /* Code For ExportStarFrom Goes Here */

      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ImportTypeVisitor<R,A> implements ImportType.Visitor<R,A>
  {
    public R visit(ABS.Absyn.ImportHaskell p, A arg)
    {
      /* Code For ImportHaskell Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.ImportABS p, A arg)
    {
      /* Code For ImportABS Goes Here */


      return null;
    }

  }
  public class ImportVisitor<R,A> implements Import.Visitor<R,A>
  {
    public R visit(ABS.Absyn.ImportAnyFrom p, A arg)
    {
      /* Code For ImportAnyFrom Goes Here */

      p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
      for (AnyIdent x : p.listanyident_) {
      }
      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ImportStarFrom p, A arg)
    {
      /* Code For ImportStarFrom Goes Here */

      p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);

      return null;
    }

  }
  public class AnyIdentVisitor<R,A> implements AnyIdent.Visitor<R,A>
  {
    public R visit(ABS.Absyn.AnyIdentI p, A arg)
    {
      /* Code For AnyIdentI Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.AnyIdentT p, A arg)
    {
      /* Code For AnyIdentT Goes Here */

      //p.typeident_;

      return null;
    }

  }
  public class AnnDeclVisitor<R,A> implements AnnDecl.Visitor<R,A>
  {
    public R visit(ABS.Absyn.AnnDecl_ p, A arg)
    {
      /* Code For AnnDecl_ Goes Here */

      for (Ann x : p.listann_) {
      }
      p.decl_.accept(new DeclVisitor<R,A>(), arg);

      return null;
    }

  }
  public class DeclVisitor<R,A> implements Decl.Visitor<R,A>
  {
    public R visit(ABS.Absyn.TypeDecl p, A arg)
    {
      /* Code For TypeDecl Goes Here */

      //p.typeident_;
      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.DataDecl p, A arg)
    {
      /* Code For DataDecl Goes Here */

      //p.typeident_;
      for (ConstrIdent x : p.listconstrident_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ParDataDecl p, A arg)
    {
      /* Code For ParDataDecl Goes Here */

      //p.typeident_;
      for (String x : p.listtypeident_) {
      }
      for (ConstrIdent x : p.listconstrident_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.Fun p, A arg)
    {
      /* Code For Fun Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (Param x : p.listparam_) {
      }
      p.funbody_.accept(new FunBodyVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ParFun p, A arg)
    {
      /* Code For ParFun Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (String x : p.listtypeident_) {
      }
      for (Param x : p.listparam_) {
      }
      p.funbody_.accept(new FunBodyVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.InterfDecl p, A arg)
    {
      /* Code For InterfDecl Goes Here */

      //p.typeident_;
      for (MethSig x : p.listmethsig_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ExtendsDecl p, A arg)
    {
      /* Code For ExtendsDecl Goes Here */

      //p.typeident_;
      for (QualType x : p.listqualtype_) {
      }
      for (MethSig x : p.listmethsig_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassDecl p, A arg)
    {
      /* Code For ClassDecl Goes Here */

      //p.typeident_;
      for (BodyDecl x : p.listbodydecl_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (BodyDecl x : p.listbodydecl_2) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassParamDecl p, A arg)
    {
      /* Code For ClassParamDecl Goes Here */

      //p.typeident_;
      for (Param x : p.listparam_) {
      }
      for (BodyDecl x : p.listbodydecl_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (BodyDecl x : p.listbodydecl_2) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassImplements p, A arg)
    {
      /* Code For ClassImplements Goes Here */

      //p.typeident_;
      for (QualType x : p.listqualtype_) {
      }
      for (BodyDecl x : p.listbodydecl_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (BodyDecl x : p.listbodydecl_2) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassParamImplements p, A arg)
    {
      /* Code For ClassParamImplements Goes Here */

      //p.typeident_;
      for (Param x : p.listparam_) {
      }
      for (QualType x : p.listqualtype_) {
      }
      for (BodyDecl x : p.listbodydecl_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (BodyDecl x : p.listbodydecl_2) {
      }

      return null;
    }

  }
  public class ConstrIdentVisitor<R,A> implements ConstrIdent.Visitor<R,A>
  {
    public R visit(ABS.Absyn.UnaryConstr p, A arg)
    {
      /* Code For UnaryConstr Goes Here */

      //p.typeident_;

      return null;
    }
    public R visit(ABS.Absyn.MultConstr p, A arg)
    {
      /* Code For MultConstr Goes Here */

      //p.typeident_;
      for (ConstrType x : p.listconstrtype_) {
      }

      return null;
    }

  }
  public class ConstrTypeVisitor<R,A> implements ConstrType.Visitor<R,A>
  {
    public R visit(ABS.Absyn.EmptyConstrType p, A arg)
    {
      /* Code For EmptyConstrType Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.RecordConstrType p, A arg)
    {
      /* Code For RecordConstrType Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;

      return null;
    }

  }
  public class MethSigVisitor<R,A> implements MethSig.Visitor<R,A>
  {
    public R visit(ABS.Absyn.MethSig_ p, A arg)
    {
      /* Code For MethSig_ Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (Param x : p.listparam_) {
      }

      return null;
    }

  }
  public class BodyDeclVisitor<R,A> implements BodyDecl.Visitor<R,A>
  {
    public R visit(ABS.Absyn.FieldDecl p, A arg)
    {
      /* Code For FieldDecl Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.FieldDeclAss p, A arg)
    {
      /* Code For FieldDeclAss Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.MethDecl p, A arg)
    {
      /* Code For MethDecl Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (Param x : p.listparam_) {
      }
      p.block_.accept(new BlockVisitor<R,A>(), arg);

      return null;
    }

  }
  public class BlockVisitor<R,A> implements Block.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Block_ p, A arg)
    {
      /* Code For Block_ Goes Here */

      for (Stm x : p.liststm_) {
      }

      return null;
    }

  }
  public class MaybeBlockVisitor<R,A> implements MaybeBlock.Visitor<R,A>
  {
    public R visit(ABS.Absyn.JustBlock p, A arg)
    {
      /* Code For JustBlock Goes Here */

      p.block_.accept(new BlockVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.NoBlock p, A arg)
    {
      /* Code For NoBlock Goes Here */


      return null;
    }

  }
  public class FunBodyVisitor<R,A> implements FunBody.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Builtin p, A arg)
    {
      /* Code For Builtin Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.PureBody p, A arg)
    {
      /* Code For PureBody Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ParamVisitor<R,A> implements Param.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Par p, A arg)
    {
      /* Code For Par Goes Here */

      p.anntype_.accept(new AnnTypeVisitor<R,A>(), arg);
      //p.ident_;

      return null;
    }

  }
  public class PureExpVisitor<R,A> implements PureExp.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Let p, A arg)
    {
      /* Code For Let Goes Here */

      p.param_.accept(new ParamVisitor<R,A>(), arg);
      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.If p, A arg)
    {
      /* Code For If Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_3.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.Case p, A arg)
    {
      /* Code For Case Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      for (CaseBranch x : p.listcasebranch_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.EOr p, A arg)
    {
      /* Code For EOr Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EAnd p, A arg)
    {
      /* Code For EAnd Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EEq p, A arg)
    {
      /* Code For EEq Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ENeq p, A arg)
    {
      /* Code For ENeq Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ELt p, A arg)
    {
      /* Code For ELt Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ELe p, A arg)
    {
      /* Code For ELe Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EGt p, A arg)
    {
      /* Code For EGt Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EGe p, A arg)
    {
      /* Code For EGe Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EAdd p, A arg)
    {
      /* Code For EAdd Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ESub p, A arg)
    {
      /* Code For ESub Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EMul p, A arg)
    {
      /* Code For EMul Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EDiv p, A arg)
    {
      /* Code For EDiv Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EMod p, A arg)
    {
      /* Code For EMod Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ELogNeg p, A arg)
    {
      /* Code For ELogNeg Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EIntNeg p, A arg)
    {
      /* Code For EIntNeg Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ECall p, A arg)
    {
      /* Code For ECall Goes Here */

      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ENaryCall p, A arg)
    {
      /* Code For ENaryCall Goes Here */

      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ELit p, A arg)
    {
      /* Code For ELit Goes Here */

      p.literal_.accept(new LiteralVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EVar p, A arg)
    {
      /* Code For EVar Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.EThis p, A arg)
    {
      /* Code For EThis Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.EUnaryConstr p, A arg)
    {
      /* Code For EUnaryConstr Goes Here */

      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EMultConstr p, A arg)
    {
      /* Code For EMultConstr Goes Here */

      p.qualtype_.accept(new QualTypeVisitor<R,A>(), arg);
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }

  }
  public class CaseBranchVisitor<R,A> implements CaseBranch.Visitor<R,A>
  {
    public R visit(ABS.Absyn.CBranch p, A arg)
    {
      /* Code For CBranch Goes Here */

      p.pattern_.accept(new PatternVisitor<R,A>(), arg);
      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }

  }
  public class PatternVisitor<R,A> implements Pattern.Visitor<R,A>
  {
    public R visit(ABS.Absyn.PIdent p, A arg)
    {
      /* Code For PIdent Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.PLit p, A arg)
    {
      /* Code For PLit Goes Here */

      p.literal_.accept(new LiteralVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.PUnaryConstr p, A arg)
    {
      /* Code For PUnaryConstr Goes Here */

      //p.typeident_;

      return null;
    }
    public R visit(ABS.Absyn.PMultConstr p, A arg)
    {
      /* Code For PMultConstr Goes Here */

      //p.typeident_;
      for (Pattern x : p.listpattern_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.PUnderscore p, A arg)
    {
      /* Code For PUnderscore Goes Here */


      return null;
    }

  }
  public class StmVisitor<R,A> implements Stm.Visitor<R,A>
  {
    public R visit(ABS.Absyn.SExp p, A arg)
    {
      /* Code For SExp Goes Here */

      p.effexp_.accept(new EffExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SBlock p, A arg)
    {
      /* Code For SBlock Goes Here */

      for (Stm x : p.liststm_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.SWhile p, A arg)
    {
      /* Code For SWhile Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      p.stm_.accept(new StmVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SReturn p, A arg)
    {
      /* Code For SReturn Goes Here */

      p.exp_.accept(new ExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SAss p, A arg)
    {
      /* Code For SAss Goes Here */

      //p.ident_;
      p.exp_.accept(new ExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SFieldAss p, A arg)
    {
      /* Code For SFieldAss Goes Here */

      //p.ident_;
      p.exp_.accept(new ExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SDec p, A arg)
    {
      /* Code For SDec Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.SDecAss p, A arg)
    {
      /* Code For SDecAss Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      p.exp_.accept(new ExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SIf p, A arg)
    {
      /* Code For SIf Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      p.stm_.accept(new StmVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SIfElse p, A arg)
    {
      /* Code For SIfElse Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      p.stm_1.accept(new StmVisitor<R,A>(), arg);
      p.stm_2.accept(new StmVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SAwait p, A arg)
    {
      /* Code For SAwait Goes Here */

      p.guard_.accept(new GuardVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SSuspend p, A arg)
    {
      /* Code For SSuspend Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.SSkip p, A arg)
    {
      /* Code For SSkip Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.SAssert p, A arg)
    {
      /* Code For SAssert Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }

  }
  public class GuardVisitor<R,A> implements Guard.Visitor<R,A>
  {
    public R visit(ABS.Absyn.VarGuard p, A arg)
    {
      /* Code For VarGuard Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.FieldGuard p, A arg)
    {
      /* Code For FieldGuard Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.ExpGuard p, A arg)
    {
      /* Code For ExpGuard Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.AndGuard p, A arg)
    {
      /* Code For AndGuard Goes Here */

      p.guard_1.accept(new GuardVisitor<R,A>(), arg);
      p.guard_2.accept(new GuardVisitor<R,A>(), arg);

      return null;
    }

  }
  public class LiteralVisitor<R,A> implements Literal.Visitor<R,A>
  {
    public R visit(ABS.Absyn.LNull p, A arg)
    {
      /* Code For LNull Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.LThis p, A arg)
    {
      /* Code For LThis Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.LStr p, A arg)
    {
      /* Code For LStr Goes Here */

      //p.string_;

      return null;
    }
    public R visit(ABS.Absyn.LInt p, A arg)
    {
      /* Code For LInt Goes Here */

      //p.integer_;

      return null;
    }

  }
  public class EffExpVisitor<R,A> implements EffExp.Visitor<R,A>
  {
    public R visit(ABS.Absyn.New p, A arg)
    {
      /* Code For New Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.NewLocal p, A arg)
    {
      /* Code For NewLocal Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.SyncCall p, A arg)
    {
      /* Code For SyncCall Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ThisSyncCall p, A arg)
    {
      /* Code For ThisSyncCall Goes Here */

      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.AsyncCall p, A arg)
    {
      /* Code For AsyncCall Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ThisAsyncCall p, A arg)
    {
      /* Code For ThisAsyncCall Goes Here */

      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.Get p, A arg)
    {
      /* Code For Get Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ExpVisitor<R,A> implements Exp.Visitor<R,A>
  {
    public R visit(ABS.Absyn.ExpP p, A arg)
    {
      /* Code For ExpP Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.ExpE p, A arg)
    {
      /* Code For ExpE Goes Here */

      p.effexp_.accept(new EffExpVisitor<R,A>(), arg);

      return null;
    }

  }
  public class AnnVisitor<R,A> implements Ann.Visitor<R,A>
  {
    public R visit(ABS.Absyn.SimpleAnn p, A arg)
    {
      /* Code For SimpleAnn Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }

  }
}