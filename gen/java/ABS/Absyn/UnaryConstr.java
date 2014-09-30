package ABS.Absyn; // Java Package generated by the BNF Converter.

public class UnaryConstr extends ConstrIdent {
  public final String typeident_;

  public UnaryConstr(String p1) { typeident_ = p1; }

  public <R,A> R accept(ABS.Absyn.ConstrIdent.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.UnaryConstr) {
      ABS.Absyn.UnaryConstr x = (ABS.Absyn.UnaryConstr)o;
      return this.typeident_.equals(x.typeident_);
    }
    return false;
  }

  public int hashCode() {
    return this.typeident_.hashCode();
  }


}