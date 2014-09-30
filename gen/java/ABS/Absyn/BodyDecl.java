package ABS.Absyn; // Java Package generated by the BNF Converter.

public abstract class BodyDecl implements java.io.Serializable {
  public abstract <R,A> R accept(BodyDecl.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ABS.Absyn.FieldDecl p, A arg);
    public R visit(ABS.Absyn.FieldDeclAss p, A arg);
    public R visit(ABS.Absyn.MethDecl p, A arg);

  }

}