package ABS;

import ABS.Absyn.*;

/** BNFC-Generated All Visitor */
public interface AllVisitor<R,A> extends
  ABS.Absyn.AnyIdent.Visitor<R,A>,
  ABS.Absyn.Program.Visitor<R,A>,
  ABS.Absyn.Module.Visitor<R,A>,
  ABS.Absyn.Export.Visitor<R,A>,
  ABS.Absyn.Import.Visitor<R,A>,
  ABS.Absyn.ImportType.Visitor<R,A>,
  ABS.Absyn.Type.Visitor<R,A>,
  ABS.Absyn.QType.Visitor<R,A>,
  ABS.Absyn.QTypeSegment.Visitor<R,A>,
  ABS.Absyn.TType.Visitor<R,A>,
  ABS.Absyn.TTypeSegment.Visitor<R,A>,
  ABS.Absyn.Decl.Visitor<R,A>,
  ABS.Absyn.ConstrIdent.Visitor<R,A>,
  ABS.Absyn.ConstrType.Visitor<R,A>,
  ABS.Absyn.FunBody.Visitor<R,A>,
  ABS.Absyn.MethSignat.Visitor<R,A>,
  ABS.Absyn.ClassBody.Visitor<R,A>,
  ABS.Absyn.Block.Visitor<R,A>,
  ABS.Absyn.MaybeBlock.Visitor<R,A>,
  ABS.Absyn.Param.Visitor<R,A>,
  ABS.Absyn.Stm.Visitor<R,A>,
  ABS.Absyn.CatchBranch.Visitor<R,A>,
  ABS.Absyn.MaybeFinally.Visitor<R,A>,
  ABS.Absyn.Guard.Visitor<R,A>,
  ABS.Absyn.Exp.Visitor<R,A>,
  ABS.Absyn.PureExp.Visitor<R,A>,
  ABS.Absyn.CaseBranch.Visitor<R,A>,
  ABS.Absyn.Pattern.Visitor<R,A>,
  ABS.Absyn.Literal.Visitor<R,A>,
  ABS.Absyn.EffExp.Visitor<R,A>,
  ABS.Absyn.Ann.Visitor<R,A>,
  ABS.Absyn.AnnDecl.Visitor<R,A>,
  ABS.Absyn.AnnType.Visitor<R,A>
{}
