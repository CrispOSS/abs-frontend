package ABS.Absyn; // Java Package generated by the BNF Converter.

public class SAssert extends Stm {
  public final PureExp pureexp_;

  public SAssert(PureExp p1) { pureexp_ = p1; }

  public <R,A> R accept(ABS.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.SAssert) {
      ABS.Absyn.SAssert x = (ABS.Absyn.SAssert)o;
      return this.pureexp_.equals(x.pureexp_);
    }
    return false;
  }

  public int hashCode() {
    return this.pureexp_.hashCode();
  }


}
