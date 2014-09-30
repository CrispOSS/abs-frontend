package ABS.Absyn; // Java Package generated by the BNF Converter.

public class MethSig_ extends MethSig {
  public final Type type_;
  public final String ident_;
  public final ListParam listparam_;

  public MethSig_(Type p1, String p2, ListParam p3) { type_ = p1; ident_ = p2; listparam_ = p3; }

  public <R,A> R accept(ABS.Absyn.MethSig.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.MethSig_) {
      ABS.Absyn.MethSig_ x = (ABS.Absyn.MethSig_)o;
      return this.type_.equals(x.type_) && this.ident_.equals(x.ident_) && this.listparam_.equals(x.listparam_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.type_.hashCode())+this.ident_.hashCode())+this.listparam_.hashCode();
  }


}