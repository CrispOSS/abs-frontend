package ABS;
import ABS.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Type */
    public R visit(ABS.Absyn.TyUnit p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TyInt p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TyRat p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TyFut p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TyUnderscore p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.TypeVar p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ArgType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* AnnType */
    public R visit(ABS.Absyn.AnnType_ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.AnnType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* QualType */
    public R visit(ABS.Absyn.QualType_ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.QualType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* QualTypeIdent */
    public R visit(ABS.Absyn.QualTypeIdent_ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.QualTypeIdent p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Program */
    public R visit(ABS.Absyn.Prog p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ModuleDecl */
    public R visit(ABS.Absyn.ModuleDecl_ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ModuleDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Export */
    public R visit(ABS.Absyn.ExportAny p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExportAnyFrom p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExportStar p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExportStarFrom p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Export p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ImportType */
    public R visit(ABS.Absyn.ImportHaskell p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ImportABS p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ImportType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Import */
    public R visit(ABS.Absyn.ImportAnyFrom p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ImportStarFrom p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Import p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* AnyIdent */
    public R visit(ABS.Absyn.AnyIdentI p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.AnyIdentT p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.AnyIdent p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* AnnDecl */
    public R visit(ABS.Absyn.AnnDecl_ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.AnnDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Decl */
    public R visit(ABS.Absyn.TypeDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.DataDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ParDataDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.Fun p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ParFun p, A arg) { return visitDefault(p, arg); }
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
    public R visit(ABS.Absyn.UnaryConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.MultConstr p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ConstrIdent p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ConstrType */
    public R visit(ABS.Absyn.EmptyConstrType p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.RecordConstrType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.ConstrType p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* MethSig */
    public R visit(ABS.Absyn.MethSig_ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.MethSig p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* BodyDecl */
    public R visit(ABS.Absyn.FieldDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.FieldDeclAss p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.MethDecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.BodyDecl p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Block */
    public R visit(ABS.Absyn.Block_ p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Block p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* MaybeBlock */
    public R visit(ABS.Absyn.JustBlock p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.NoBlock p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.MaybeBlock p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* FunBody */
    public R visit(ABS.Absyn.Builtin p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PureBody p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.FunBody p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Param */
    public R visit(ABS.Absyn.Par p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Param p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* PureExp */
    public R visit(ABS.Absyn.Let p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.If p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.Case p, A arg) { return visitDefault(p, arg); }

    public R visit(ABS.Absyn.EOr p, A arg) { return visitDefault(p, arg); }

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

    public R visit(ABS.Absyn.ECall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ENaryCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ELit p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EVar p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EThis p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EUnaryConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.EMultConstr p, A arg) { return visitDefault(p, arg); }



    public R visitDefault(ABS.Absyn.PureExp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* CaseBranch */
    public R visit(ABS.Absyn.CBranch p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.CaseBranch p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Pattern */
    public R visit(ABS.Absyn.PIdent p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PLit p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PUnaryConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PMultConstr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.PUnderscore p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Pattern p, A arg) {
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
    public R visit(ABS.Absyn.SAwait p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SSuspend p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SSkip p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SAssert p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Stm p, A arg) {
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
/* Literal */
    public R visit(ABS.Absyn.LNull p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.LThis p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.LStr p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.LInt p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Literal p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* EffExp */
    public R visit(ABS.Absyn.New p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.NewLocal p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.SyncCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ThisSyncCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.AsyncCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ThisAsyncCall p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.Get p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.EffExp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Exp */
    public R visit(ABS.Absyn.ExpP p, A arg) { return visitDefault(p, arg); }
    public R visit(ABS.Absyn.ExpE p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Exp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Ann */
    public R visit(ABS.Absyn.SimpleAnn p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(ABS.Absyn.Ann p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
