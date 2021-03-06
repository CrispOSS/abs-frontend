package ABS.Absyn; // Java Package generated by the BNF Converter.

public class TSimple extends Type {
  public final QType qtype_;

  public TSimple(QType p1) { qtype_ = p1; }

  public <R,A> R accept(ABS.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.TSimple) {
      ABS.Absyn.TSimple x = (ABS.Absyn.TSimple)o;
      return this.qtype_.equals(x.qtype_);
    }
    return false;
  }

  public int hashCode() {
    return this.qtype_.hashCode();
  }


}
