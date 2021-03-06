package ABS.Absyn; // Java Package generated by the BNF Converter.

public class AnyFromExport extends Export {
  public final ListAnyIdent listanyident_;
  public final QType qtype_;

  public AnyFromExport(ListAnyIdent p1, QType p2) { listanyident_ = p1; qtype_ = p2; }

  public <R,A> R accept(ABS.Absyn.Export.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.AnyFromExport) {
      ABS.Absyn.AnyFromExport x = (ABS.Absyn.AnyFromExport)o;
      return this.listanyident_.equals(x.listanyident_) && this.qtype_.equals(x.qtype_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listanyident_.hashCode())+this.qtype_.hashCode();
  }


}
