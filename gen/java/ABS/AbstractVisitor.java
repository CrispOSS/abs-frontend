package ABS;
import ABS.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* AnyIdent */
    public R visit(ABS.Absyn.AnyIden p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.AnyTyIden p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.AnyIdent p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Program */
    public R visit(ABS.Absyn.Prog p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Module */
    public R visit(ABS.Absyn.Modul p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Module p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Export */
    public R visit(ABS.Absyn.AnyExport p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.AnyFromExport p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.StarExport p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.StarFromExport p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Export p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Import */
    public R visit(ABS.Absyn.AnyImport p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.AnyFromImport p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.StarFromImport p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Import p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ImportType */
    public R visit(ABS.Absyn.ForeignImport p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.NormalImport p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ImportType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Type */
    public R visit(ABS.Absyn.TUnderscore p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TSimple p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TGen p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* QType */
    public R visit(ABS.Absyn.QTyp p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.QType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* QTypeSegment */
    public R visit(ABS.Absyn.QTypeSegmen p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.QTypeSegment p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* TType */
    public R visit(ABS.Absyn.TTyp p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.TType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* TTypeSegment */
    public R visit(ABS.Absyn.TTypeSegmen p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.TTypeSegment p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Decl */
    public R visit(ABS.Absyn.TypeDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TypeParDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExceptionDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.DataDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.DataParDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.FunDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.FunParDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.InterfDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExtendsDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ClassDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ClassParamDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ClassImplements p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ClassParamImplements p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Decl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ConstrIdent */
    public R visit(ABS.Absyn.SinglConstrIdent p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ParamConstrIdent p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ConstrIdent p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ConstrType */
    public R visit(ABS.Absyn.EmptyConstrType p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.RecordConstrType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ConstrType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* FunBody */
    public R visit(ABS.Absyn.BuiltinFunBody p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.NormalFunBody p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.FunBody p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* MethSignat */
    public R visit(ABS.Absyn.MethSig p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.MethSignat p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ClassBody */
    public R visit(ABS.Absyn.FieldClassBody p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.FieldAssignClassBody p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.MethClassBody p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ClassBody p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Block */
    public R visit(ABS.Absyn.Bloc p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Block p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* MaybeBlock */
    public R visit(ABS.Absyn.JustBlock p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.NoBlock p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.MaybeBlock p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Param */
    public R visit(ABS.Absyn.Par p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Param p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Stm */
    public R visit(ABS.Absyn.SExp p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SBlock p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SWhile p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SReturn p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SAss p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SFieldAss p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SDec p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SDecAss p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SIf p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SIfElse p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SSuspend p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SSkip p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SAssert p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SAwait p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SThrow p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.STryCatchFinally p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SPrint p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Stm p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* CatchBranch */
    public R visit(ABS.Absyn.CatchBranc p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.CatchBranch p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* MaybeFinally */
    public R visit(ABS.Absyn.JustFinally p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.NoFinally p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.MaybeFinally p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Guard */
    public R visit(ABS.Absyn.VarGuard p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.FieldGuard p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExpGuard p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.AndGuard p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Guard p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Exp */
    public R visit(ABS.Absyn.ExpP p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExpE p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Exp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* PureExp */
    public R visit(ABS.Absyn.EOr p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.Let p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.If p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.Case p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EAnd p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.EEq p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ENeq p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.ELt p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ELe p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EGt p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EGe p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.EAdd p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ESub p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.EMul p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EDiv p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EMod p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.ELogNeg p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EIntNeg p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.EFunCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EQualFunCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ENaryFunCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ENaryQualFunCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EVar p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EThis p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EQualVar p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ESinglConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EParamConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ELit p, A arg) { return visitDefault(p, arg); }

    public R visitDefault(ABS.Absyn.PureExp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* CaseBranch */
    public R visit(ABS.Absyn.CaseBranc p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.CaseBranch p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Pattern */
    public R visit(ABS.Absyn.PIdent p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PLit p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PSinglConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PParamConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PUnderscore p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Pattern p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Literal */
    public R visit(ABS.Absyn.LNull p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.LThis p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.LThisDC p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.LStr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.LInt p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Literal p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* EffExp */
    public R visit(ABS.Absyn.New p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.NewLocal p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SyncMethCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ThisSyncMethCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.AsyncMethCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ThisAsyncMethCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.Get p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.Spawns p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.EffExp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Ann */
    public R visit(ABS.Absyn.SimpleAnn p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Ann p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* AnnDecl */
    public R visit(ABS.Absyn.AnnDec p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.AnnDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* AnnType */
    public R visit(ABS.Absyn.AnnTyp p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.AnnType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
