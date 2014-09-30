package ABS.Absyn; // Java Package generated by the BNF Converter.

public abstract class Export implements java.io.Serializable {
  public abstract <R,A> R accept(Export.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(ABS.Absyn.ExportAny p, A arg);
    public R visit(ABS.Absyn.ExportAnyFrom p, A arg);
    public R visit(ABS.Absyn.ExportStar p, A arg);
    public R visit(ABS.Absyn.ExportStarFrom p, A arg);

  }

}