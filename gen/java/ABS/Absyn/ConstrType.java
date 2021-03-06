package ABS.Absyn; // Java Package generated by the BNF Converter.

public abstract class ConstrType implements java.io.Serializable {
  public abstract <R,A> R accept(ConstrType.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ABS.Absyn.EmptyConstrType p, A arg);
    public R visit(ABS.Absyn.RecordConstrType p, A arg);

  }

}
