package ABS.Absyn; // Java Package generated by the BNF Converter.

public class ESinglConstr extends PureExp {
  public final QType qtype_;

  public ESinglConstr(QType p1) { qtype_ = p1; }

  public <R,A> R accept(ABS.Absyn.PureExp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.ESinglConstr) {
      ABS.Absyn.ESinglConstr x = (ABS.Absyn.ESinglConstr)o;
      return this.qtype_.equals(x.qtype_);
    }
    return false;
  }

  public int hashCode() {
    return this.qtype_.hashCode();
  }


}
