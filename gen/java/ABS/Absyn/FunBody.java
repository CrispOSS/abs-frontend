package ABS.Absyn; // Java Package generated by the BNF Converter.

public abstract class FunBody implements java.io.Serializable {
  public abstract <R,A> R accept(FunBody.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ABS.Absyn.Builtin p, A arg);
    public R visit(ABS.Absyn.PureBody p, A arg);

  }

}