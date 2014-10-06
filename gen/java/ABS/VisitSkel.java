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
  public class AnyIdentVisitor<R,A> implements AnyIdent.Visitor<R,A>
  {
    public R visit(ABS.Absyn.AnyIden p, A arg)
    {
      /* Code For AnyIden Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.AnyTyIden p, A arg)
    {
      /* Code For AnyTyIden Goes Here */

      //p.typeident_;

      return null;
    }

  }
  public class ProgramVisitor<R,A> implements Program.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Prog p, A arg)
    {
      /* Code For Prog Goes Here */

      for (Module x : p.listmodule_) {
      }

      return null;
    }

  }
  public class ModuleVisitor<R,A> implements Module.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Modul p, A arg)
    {
      /* Code For Modul Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      for (Export x : p.listexport_) {
      }
      for (Import x : p.listimport_) {
      }
      for (Decl x : p.listdecl_) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ExportVisitor<R,A> implements Export.Visitor<R,A>
  {
    public R visit(ABS.Absyn.AnyExport p, A arg)
    {
      /* Code For AnyExport Goes Here */

      for (AnyIdent x : p.listanyident_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.AnyFromExport p, A arg)
    {
      /* Code For AnyFromExport Goes Here */

      for (AnyIdent x : p.listanyident_) {
      }
      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.StarExport p, A arg)
    {
      /* Code For StarExport Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.StarFromExport p, A arg)
    {
      /* Code For StarFromExport Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ImportVisitor<R,A> implements Import.Visitor<R,A>
  {
    public R visit(ABS.Absyn.AnyImport p, A arg)
    {
      /* Code For AnyImport Goes Here */

      p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      p.anyident_.accept(new AnyIdentVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.AnyFromImport p, A arg)
    {
      /* Code For AnyFromImport Goes Here */

      p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
      for (AnyIdent x : p.listanyident_) {
      }
      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.StarFromImport p, A arg)
    {
      /* Code For StarFromImport Goes Here */

      p.importtype_.accept(new ImportTypeVisitor<R,A>(), arg);
      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }

  }
  public class ImportTypeVisitor<R,A> implements ImportType.Visitor<R,A>
  {
    public R visit(ABS.Absyn.ForeignImport p, A arg)
    {
      /* Code For ForeignImport Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.NormalImport p, A arg)
    {
      /* Code For NormalImport Goes Here */


      return null;
    }

  }
  public class TypeVisitor<R,A> implements Type.Visitor<R,A>
  {
    public R visit(ABS.Absyn.UnderscoreType p, A arg)
    {
      /* Code For UnderscoreType Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.SimpleType p, A arg)
    {
      /* Code For SimpleType Goes Here */

      for (QualTypeIdent x : p.listqualtypeident_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ParType p, A arg)
    {
      /* Code For ParType Goes Here */

      for (QualTypeIdent x : p.listqualtypeident_) {
      }
      for (Type x : p.listtype_) {
      }

      return null;
    }

  }
  public class QualTypeIdentVisitor<R,A> implements QualTypeIdent.Visitor<R,A>
  {
    public R visit(ABS.Absyn.QualTypeIden p, A arg)
    {
      /* Code For QualTypeIden Goes Here */

      //p.typeident_;

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
    public R visit(ABS.Absyn.DataParDecl p, A arg)
    {
      /* Code For DataParDecl Goes Here */

      //p.typeident_;
      for (String x : p.listtypeident_) {
      }
      for (ConstrIdent x : p.listconstrident_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.FunDecl p, A arg)
    {
      /* Code For FunDecl Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (Param x : p.listparam_) {
      }
      p.funbody_.accept(new FunBodyVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.FunParDecl p, A arg)
    {
      /* Code For FunParDecl Goes Here */

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
      for (MethSignat x : p.listmethsignat_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ExtendsDecl p, A arg)
    {
      /* Code For ExtendsDecl Goes Here */

      //p.typeident_;
      for (Type x : p.listtype_) {
      }
      for (MethSignat x : p.listmethsignat_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassDecl p, A arg)
    {
      /* Code For ClassDecl Goes Here */

      //p.typeident_;
      for (ClassBody x : p.listclassbody_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (ClassBody x : p.listclassbody_2) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassParamDecl p, A arg)
    {
      /* Code For ClassParamDecl Goes Here */

      //p.typeident_;
      for (Param x : p.listparam_) {
      }
      for (ClassBody x : p.listclassbody_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (ClassBody x : p.listclassbody_2) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassImplements p, A arg)
    {
      /* Code For ClassImplements Goes Here */

      //p.typeident_;
      for (Type x : p.listtype_) {
      }
      for (ClassBody x : p.listclassbody_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (ClassBody x : p.listclassbody_2) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ClassParamImplements p, A arg)
    {
      /* Code For ClassParamImplements Goes Here */

      //p.typeident_;
      for (Param x : p.listparam_) {
      }
      for (Type x : p.listtype_) {
      }
      for (ClassBody x : p.listclassbody_1) {
      }
      p.maybeblock_.accept(new MaybeBlockVisitor<R,A>(), arg);
      for (ClassBody x : p.listclassbody_2) {
      }

      return null;
    }

  }
  public class ConstrIdentVisitor<R,A> implements ConstrIdent.Visitor<R,A>
  {
    public R visit(ABS.Absyn.SinglConstrIdent p, A arg)
    {
      /* Code For SinglConstrIdent Goes Here */

      //p.typeident_;

      return null;
    }
    public R visit(ABS.Absyn.ParamConstrIdent p, A arg)
    {
      /* Code For ParamConstrIdent Goes Here */

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
  public class FunBodyVisitor<R,A> implements FunBody.Visitor<R,A>
  {
    public R visit(ABS.Absyn.BuiltinFunBody p, A arg)
    {
      /* Code For BuiltinFunBody Goes Here */


      return null;
    }
    public R visit(ABS.Absyn.NormalFunBody p, A arg)
    {
      /* Code For NormalFunBody Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }

  }
  public class MethSignatVisitor<R,A> implements MethSignat.Visitor<R,A>
  {
    public R visit(ABS.Absyn.MethSig p, A arg)
    {
      /* Code For MethSig Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (Param x : p.listparam_) {
      }

      return null;
    }

  }
  public class ClassBodyVisitor<R,A> implements ClassBody.Visitor<R,A>
  {
    public R visit(ABS.Absyn.FieldClassBody p, A arg)
    {
      /* Code For FieldClassBody Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.FieldAssignClassBody p, A arg)
    {
      /* Code For FieldAssignClassBody Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.MethClassBody p, A arg)
    {
      /* Code For MethClassBody Goes Here */

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
    public R visit(ABS.Absyn.Bloc p, A arg)
    {
      /* Code For Bloc Goes Here */

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
  public class ParamVisitor<R,A> implements Param.Visitor<R,A>
  {
    public R visit(ABS.Absyn.Par p, A arg)
    {
      /* Code For Par Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;

      return null;
    }

  }
  public class StmVisitor<R,A> implements Stm.Visitor<R,A>
  {
    public R visit(ABS.Absyn.SExp p, A arg)
    {
      /* Code For SExp Goes Here */

      p.exp_.accept(new ExpVisitor<R,A>(), arg);

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
    public R visit(ABS.Absyn.SAwait p, A arg)
    {
      /* Code For SAwait Goes Here */

      p.guard_.accept(new GuardVisitor<R,A>(), arg);

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
  public class PureExpVisitor<R,A> implements PureExp.Visitor<R,A>
  {
    public R visit(ABS.Absyn.EOr p, A arg)
    {
      /* Code For EOr Goes Here */

      p.pureexp_1.accept(new PureExpVisitor<R,A>(), arg);
      p.pureexp_2.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }
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
    public R visit(ABS.Absyn.EFunCall p, A arg)
    {
      /* Code For EFunCall Goes Here */

      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.EQualFunCall p, A arg)
    {
      /* Code For EQualFunCall Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ENaryFunCall p, A arg)
    {
      /* Code For ENaryFunCall Goes Here */

      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ENaryQualFunCall p, A arg)
    {
      /* Code For ENaryQualFunCall Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

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
    public R visit(ABS.Absyn.EQualVar p, A arg)
    {
      /* Code For EQualVar Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.ESinglConstr p, A arg)
    {
      /* Code For ESinglConstr Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.EParamConstr p, A arg)
    {
      /* Code For EParamConstr Goes Here */

      p.type_.accept(new TypeVisitor<R,A>(), arg);
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

  }
  public class CaseBranchVisitor<R,A> implements CaseBranch.Visitor<R,A>
  {
    public R visit(ABS.Absyn.CaseBranc p, A arg)
    {
      /* Code For CaseBranc Goes Here */

      p.pattern_.accept(new PatternVisitor<R,A>(), arg);
      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);

      return null;
    }

  }
  public class PatternVisitor<R,A> implements Pattern.Visitor<R,A>
  {
    public R visit(ABS.Absyn.IdentPat p, A arg)
    {
      /* Code For IdentPat Goes Here */

      //p.ident_;

      return null;
    }
    public R visit(ABS.Absyn.LitPat p, A arg)
    {
      /* Code For LitPat Goes Here */

      p.literal_.accept(new LiteralVisitor<R,A>(), arg);

      return null;
    }
    public R visit(ABS.Absyn.SinglConstrPat p, A arg)
    {
      /* Code For SinglConstrPat Goes Here */

      //p.typeident_;

      return null;
    }
    public R visit(ABS.Absyn.ParamConstrPat p, A arg)
    {
      /* Code For ParamConstrPat Goes Here */

      //p.typeident_;
      for (Pattern x : p.listpattern_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.UnderscorePat p, A arg)
    {
      /* Code For UnderscorePat Goes Here */


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
    public R visit(ABS.Absyn.LThisDC p, A arg)
    {
      /* Code For LThisDC Goes Here */


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
    public R visit(ABS.Absyn.SyncMethCall p, A arg)
    {
      /* Code For SyncMethCall Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ThisSyncMethCall p, A arg)
    {
      /* Code For ThisSyncMethCall Goes Here */

      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.AsyncMethCall p, A arg)
    {
      /* Code For AsyncMethCall Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      //p.ident_;
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }
    public R visit(ABS.Absyn.ThisAsyncMethCall p, A arg)
    {
      /* Code For ThisAsyncMethCall Goes Here */

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
    public R visit(ABS.Absyn.Spawns p, A arg)
    {
      /* Code For Spawns Goes Here */

      p.pureexp_.accept(new PureExpVisitor<R,A>(), arg);
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      for (PureExp x : p.listpureexp_) {
      }

      return null;
    }

  }
}