package ABS.Absyn; // Java Package generated by the BNF Converter.

public class ENaryCall extends PureExp {
  public final String ident_;
  public final ListPureExp listpureexp_;

  public ENaryCall(String p1, ListPureExp p2) { ident_ = p1; listpureexp_ = p2; }

  public <R,A> R accept(ABS.Absyn.PureExp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.ENaryCall) {
      ABS.Absyn.ENaryCall x = (ABS.Absyn.ENaryCall)o;
      return this.ident_.equals(x.ident_) && this.listpureexp_.equals(x.listpureexp_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.listpureexp_.hashCode();
  }


}