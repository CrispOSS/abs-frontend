package ABS.Absyn; // Java Package generated by the BNF Converter.

public class ThisAsyncMethCall extends EffExp {
  public final String lident_;
  public final ListPureExp listpureexp_;

  public ThisAsyncMethCall(String p1, ListPureExp p2) { lident_ = p1; listpureexp_ = p2; }

  public <R,A> R accept(ABS.Absyn.EffExp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.ThisAsyncMethCall) {
      ABS.Absyn.ThisAsyncMethCall x = (ABS.Absyn.ThisAsyncMethCall)o;
      return this.lident_.equals(x.lident_) && this.listpureexp_.equals(x.listpureexp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.lident_.hashCode())+this.listpureexp_.hashCode();
  }


}
