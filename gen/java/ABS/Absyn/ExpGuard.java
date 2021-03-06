package ABS.Absyn; // Java Package generated by the BNF Converter.

public class ExpGuard extends Guard {
  public final PureExp pureexp_;

  public ExpGuard(PureExp p1) { pureexp_ = p1; }

  public <R,A> R accept(ABS.Absyn.Guard.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.ExpGuard) {
      ABS.Absyn.ExpGuard x = (ABS.Absyn.ExpGuard)o;
      return this.pureexp_.equals(x.pureexp_);
    }
    return false;
  }

  public int hashCode() {
    return this.pureexp_.hashCode();
  }


}
