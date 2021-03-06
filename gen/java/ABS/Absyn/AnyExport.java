package ABS.Absyn; // Java Package generated by the BNF Converter.

public class AnyExport extends Export {
  public final ListAnyIdent listanyident_;

  public AnyExport(ListAnyIdent p1) { listanyident_ = p1; }

  public <R,A> R accept(ABS.Absyn.Export.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.AnyExport) {
      ABS.Absyn.AnyExport x = (ABS.Absyn.AnyExport)o;
      return this.listanyident_.equals(x.listanyident_);
    }
    return false;
  }

  public int hashCode() {
    return this.listanyident_.hashCode();
  }


}
