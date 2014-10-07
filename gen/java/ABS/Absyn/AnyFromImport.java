package ABS.Absyn; // Java Package generated by the BNF Converter.

public class AnyFromImport extends Import {
  public final ImportType importtype_;
  public final ListAnyIdent listanyident_;
  public final Type type_;

  public AnyFromImport(ImportType p1, ListAnyIdent p2, Type p3) { importtype_ = p1; listanyident_ = p2; type_ = p3; }

  public <R,A> R accept(ABS.Absyn.Import.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ABS.Absyn.AnyFromImport) {
      ABS.Absyn.AnyFromImport x = (ABS.Absyn.AnyFromImport)o;
      return this.importtype_.equals(x.importtype_) && this.listanyident_.equals(x.listanyident_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.importtype_.hashCode())+this.listanyident_.hashCode())+this.type_.hashCode();
  }


}