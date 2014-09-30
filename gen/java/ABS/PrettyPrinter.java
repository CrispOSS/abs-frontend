package ABS;
import ABS.Absyn.*;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       buf_.append("\n");
       indent();
       buf_.append(s);
       _n_ = _n_ + 2;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       _n_ = _n_ - 2;
       backup();
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(ABS.Absyn.Type foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Type foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListAnnType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListAnnType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.AnnType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.AnnType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.QualType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.QualType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListQualType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListQualType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.QualTypeIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.QualTypeIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListQualTypeIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListQualTypeIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Program foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Program foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ModuleDecl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ModuleDecl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Export foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Export foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListExport foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListExport foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ImportType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ImportType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Import foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Import foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListImport foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListImport foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.AnyIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.AnyIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListAnyIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListAnyIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.AnnDecl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.AnnDecl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Decl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Decl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ConstrIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ConstrIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ConstrType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ConstrType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListConstrType foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListConstrType foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListTypeIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListTypeIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListConstrIdent foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListConstrIdent foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.MethSig foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.MethSig foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListMethSig foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListMethSig foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.BodyDecl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.BodyDecl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListBodyDecl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListBodyDecl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Block foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Block foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.MaybeBlock foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.MaybeBlock foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.FunBody foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.FunBody foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListAnnDecl foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListAnnDecl foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListStm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListStm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Param foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Param foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListParam foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListParam foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.PureExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.PureExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.CaseBranch foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.CaseBranch foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListCaseBranch foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListCaseBranch foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Pattern foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Pattern foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListPattern foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListPattern foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Stm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Stm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Guard foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Guard foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Literal foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Literal foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.EffExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.EffExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListPureExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListPureExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Exp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Exp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.Ann foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.Ann foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(ABS.Absyn.ListAnn foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(ABS.Absyn.ListAnn foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(ABS.Absyn.Type foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.TyUnit)
    {
       ABS.Absyn.TyUnit _tyunit = (ABS.Absyn.TyUnit) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Unit");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.TyInt)
    {
       ABS.Absyn.TyInt _tyint = (ABS.Absyn.TyInt) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Int");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.TyRat)
    {
       ABS.Absyn.TyRat _tyrat = (ABS.Absyn.TyRat) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Rat");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.TyFut)
    {
       ABS.Absyn.TyFut _tyfut = (ABS.Absyn.TyFut) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("Fut");
       render("<");
       pp(_tyfut.type_, 0);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.TyUnderscore)
    {
       ABS.Absyn.TyUnderscore _tyunderscore = (ABS.Absyn.TyUnderscore) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("_");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.TypeVar)
    {
       ABS.Absyn.TypeVar _typevar = (ABS.Absyn.TypeVar) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_typevar.qualtype_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ArgType)
    {
       ABS.Absyn.ArgType _argtype = (ABS.Absyn.ArgType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_argtype.qualtype_, 0);
       render("<");
       pp(_argtype.listanntype_, 0);
       render(">");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListAnnType foo, int _i_)
  {
     for (java.util.Iterator<AnnType> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.AnnType foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.AnnType_)
    {
       ABS.Absyn.AnnType_ _anntype_ = (ABS.Absyn.AnnType_) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anntype_.listann_, 0);
       pp(_anntype_.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.QualType foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.QualType_)
    {
       ABS.Absyn.QualType_ _qualtype_ = (ABS.Absyn.QualType_) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_qualtype_.listqualtypeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListQualType foo, int _i_)
  {
     for (java.util.Iterator<QualType> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.QualTypeIdent foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.QualTypeIdent_)
    {
       ABS.Absyn.QualTypeIdent_ _qualtypeident_ = (ABS.Absyn.QualTypeIdent_) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_qualtypeident_.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListQualTypeIdent foo, int _i_)
  {
     for (java.util.Iterator<QualTypeIdent> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(".");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Program foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Prog)
    {
       ABS.Absyn.Prog _prog = (ABS.Absyn.Prog) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_prog.moduledecl_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ModuleDecl foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.ModuleDecl_)
    {
       ABS.Absyn.ModuleDecl_ _moduledecl_ = (ABS.Absyn.ModuleDecl_) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("module");
       pp(_moduledecl_.qualtype_, 0);
       render(";");
       pp(_moduledecl_.listexport_, 0);
       pp(_moduledecl_.listimport_, 0);
       pp(_moduledecl_.listanndecl_, 0);
       pp(_moduledecl_.maybeblock_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Export foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.ExportAny)
    {
       ABS.Absyn.ExportAny _exportany = (ABS.Absyn.ExportAny) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       pp(_exportany.listanyident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExportAnyFrom)
    {
       ABS.Absyn.ExportAnyFrom _exportanyfrom = (ABS.Absyn.ExportAnyFrom) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       pp(_exportanyfrom.listanyident_, 0);
       render("from");
       pp(_exportanyfrom.qualtype_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExportStar)
    {
       ABS.Absyn.ExportStar _exportstar = (ABS.Absyn.ExportStar) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       render("*");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExportStarFrom)
    {
       ABS.Absyn.ExportStarFrom _exportstarfrom = (ABS.Absyn.ExportStarFrom) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("export");
       render("*");
       render("from");
       pp(_exportstarfrom.qualtype_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListExport foo, int _i_)
  {
     for (java.util.Iterator<Export> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(ABS.Absyn.ImportType foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.ImportHaskell)
    {
       ABS.Absyn.ImportHaskell _importhaskell = (ABS.Absyn.ImportHaskell) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("fimport");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ImportABS)
    {
       ABS.Absyn.ImportABS _importabs = (ABS.Absyn.ImportABS) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("import");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Import foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.ImportAnyFrom)
    {
       ABS.Absyn.ImportAnyFrom _importanyfrom = (ABS.Absyn.ImportAnyFrom) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_importanyfrom.importtype_, 0);
       pp(_importanyfrom.listanyident_, 0);
       render("from");
       pp(_importanyfrom.qualtype_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ImportStarFrom)
    {
       ABS.Absyn.ImportStarFrom _importstarfrom = (ABS.Absyn.ImportStarFrom) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_importstarfrom.importtype_, 0);
       render("*");
       render("from");
       pp(_importstarfrom.qualtype_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListImport foo, int _i_)
  {
     for (java.util.Iterator<Import> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(ABS.Absyn.AnyIdent foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.AnyIdentI)
    {
       ABS.Absyn.AnyIdentI _anyidenti = (ABS.Absyn.AnyIdentI) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anyidenti.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AnyIdentT)
    {
       ABS.Absyn.AnyIdentT _anyidentt = (ABS.Absyn.AnyIdentT) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anyidentt.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListAnyIdent foo, int _i_)
  {
     for (java.util.Iterator<AnyIdent> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.AnnDecl foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.AnnDecl_)
    {
       ABS.Absyn.AnnDecl_ _anndecl_ = (ABS.Absyn.AnnDecl_) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_anndecl_.listann_, 0);
       pp(_anndecl_.decl_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Decl foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.TypeDecl)
    {
       ABS.Absyn.TypeDecl _typedecl = (ABS.Absyn.TypeDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("type");
       pp(_typedecl.typeident_, 0);
       render("=");
       pp(_typedecl.type_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.DataDecl)
    {
       ABS.Absyn.DataDecl _datadecl = (ABS.Absyn.DataDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("data");
       pp(_datadecl.typeident_, 0);
       render("=");
       pp(_datadecl.listconstrident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ParDataDecl)
    {
       ABS.Absyn.ParDataDecl _pardatadecl = (ABS.Absyn.ParDataDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("data");
       pp(_pardatadecl.typeident_, 0);
       render("<");
       pp(_pardatadecl.listtypeident_, 0);
       render(">");
       render("=");
       pp(_pardatadecl.listconstrident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.Fun)
    {
       ABS.Absyn.Fun _fun = (ABS.Absyn.Fun) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("def");
       pp(_fun.type_, 0);
       pp(_fun.ident_, 0);
       render("(");
       pp(_fun.listparam_, 0);
       render(")");
       render("=");
       pp(_fun.funbody_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ParFun)
    {
       ABS.Absyn.ParFun _parfun = (ABS.Absyn.ParFun) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("def");
       pp(_parfun.type_, 0);
       pp(_parfun.ident_, 0);
       render("<");
       pp(_parfun.listtypeident_, 0);
       render(">");
       render("(");
       pp(_parfun.listparam_, 0);
       render(")");
       render("=");
       pp(_parfun.funbody_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.InterfDecl)
    {
       ABS.Absyn.InterfDecl _interfdecl = (ABS.Absyn.InterfDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("interface");
       pp(_interfdecl.typeident_, 0);
       render("{");
       pp(_interfdecl.listmethsig_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExtendsDecl)
    {
       ABS.Absyn.ExtendsDecl _extendsdecl = (ABS.Absyn.ExtendsDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("interface");
       pp(_extendsdecl.typeident_, 0);
       render("extends");
       pp(_extendsdecl.listqualtype_, 0);
       render("{");
       pp(_extendsdecl.listmethsig_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassDecl)
    {
       ABS.Absyn.ClassDecl _classdecl = (ABS.Absyn.ClassDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classdecl.typeident_, 0);
       render("{");
       pp(_classdecl.listbodydecl_1, 0);
       pp(_classdecl.maybeblock_, 0);
       pp(_classdecl.listbodydecl_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassParamDecl)
    {
       ABS.Absyn.ClassParamDecl _classparamdecl = (ABS.Absyn.ClassParamDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classparamdecl.typeident_, 0);
       render("(");
       pp(_classparamdecl.listparam_, 0);
       render(")");
       render("{");
       pp(_classparamdecl.listbodydecl_1, 0);
       pp(_classparamdecl.maybeblock_, 0);
       pp(_classparamdecl.listbodydecl_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassImplements)
    {
       ABS.Absyn.ClassImplements _classimplements = (ABS.Absyn.ClassImplements) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classimplements.typeident_, 0);
       render("implements");
       pp(_classimplements.listqualtype_, 0);
       render("{");
       pp(_classimplements.listbodydecl_1, 0);
       pp(_classimplements.maybeblock_, 0);
       pp(_classimplements.listbodydecl_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ClassParamImplements)
    {
       ABS.Absyn.ClassParamImplements _classparamimplements = (ABS.Absyn.ClassParamImplements) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("class");
       pp(_classparamimplements.typeident_, 0);
       render("(");
       pp(_classparamimplements.listparam_, 0);
       render(")");
       render("implements");
       pp(_classparamimplements.listqualtype_, 0);
       render("{");
       pp(_classparamimplements.listbodydecl_1, 0);
       pp(_classparamimplements.maybeblock_, 0);
       pp(_classparamimplements.listbodydecl_2, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ConstrIdent foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.UnaryConstr)
    {
       ABS.Absyn.UnaryConstr _unaryconstr = (ABS.Absyn.UnaryConstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_unaryconstr.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.MultConstr)
    {
       ABS.Absyn.MultConstr _multconstr = (ABS.Absyn.MultConstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_multconstr.typeident_, 0);
       render("(");
       pp(_multconstr.listconstrtype_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ConstrType foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.EmptyConstrType)
    {
       ABS.Absyn.EmptyConstrType _emptyconstrtype = (ABS.Absyn.EmptyConstrType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_emptyconstrtype.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.RecordConstrType)
    {
       ABS.Absyn.RecordConstrType _recordconstrtype = (ABS.Absyn.RecordConstrType) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_recordconstrtype.type_, 0);
       pp(_recordconstrtype.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListConstrType foo, int _i_)
  {
     for (java.util.Iterator<ConstrType> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.ListTypeIdent foo, int _i_)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.ListConstrIdent foo, int _i_)
  {
     for (java.util.Iterator<ConstrIdent> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("|");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.MethSig foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.MethSig_)
    {
       ABS.Absyn.MethSig_ _methsig_ = (ABS.Absyn.MethSig_) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_methsig_.type_, 0);
       pp(_methsig_.ident_, 0);
       render("(");
       pp(_methsig_.listparam_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListMethSig foo, int _i_)
  {
     for (java.util.Iterator<MethSig> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(ABS.Absyn.BodyDecl foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.FieldDecl)
    {
       ABS.Absyn.FieldDecl _fielddecl = (ABS.Absyn.FieldDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_fielddecl.type_, 0);
       pp(_fielddecl.ident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.FieldDeclAss)
    {
       ABS.Absyn.FieldDeclAss _fielddeclass = (ABS.Absyn.FieldDeclAss) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_fielddeclass.type_, 0);
       pp(_fielddeclass.ident_, 0);
       render("=");
       pp(_fielddeclass.pureexp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.MethDecl)
    {
       ABS.Absyn.MethDecl _methdecl = (ABS.Absyn.MethDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_methdecl.type_, 0);
       pp(_methdecl.ident_, 0);
       render("(");
       pp(_methdecl.listparam_, 0);
       render(")");
       pp(_methdecl.block_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListBodyDecl foo, int _i_)
  {
     for (java.util.Iterator<BodyDecl> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Block foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Block_)
    {
       ABS.Absyn.Block_ _block_ = (ABS.Absyn.Block_) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_block_.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.MaybeBlock foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.JustBlock)
    {
       ABS.Absyn.JustBlock _justblock = (ABS.Absyn.JustBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_justblock.block_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.NoBlock)
    {
       ABS.Absyn.NoBlock _noblock = (ABS.Absyn.NoBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.FunBody foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Builtin)
    {
       ABS.Absyn.Builtin _builtin = (ABS.Absyn.Builtin) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("builtin");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.PureBody)
    {
       ABS.Absyn.PureBody _purebody = (ABS.Absyn.PureBody) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_purebody.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListAnnDecl foo, int _i_)
  {
     for (java.util.Iterator<AnnDecl> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.ListStm foo, int _i_)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Param foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Par)
    {
       ABS.Absyn.Par _par = (ABS.Absyn.Par) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_par.anntype_, 0);
       pp(_par.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListParam foo, int _i_)
  {
     for (java.util.Iterator<Param> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.PureExp foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.Let)
    {
       ABS.Absyn.Let _let = (ABS.Absyn.Let) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("let");
       render("(");
       pp(_let.param_, 0);
       render(")");
       render("=");
       pp(_let.pureexp_1, 0);
       render("in");
       pp(_let.pureexp_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.If)
    {
       ABS.Absyn.If _if = (ABS.Absyn.If) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       pp(_if.pureexp_1, 0);
       render("then");
       pp(_if.pureexp_2, 0);
       render("else");
       pp(_if.pureexp_3, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.Case)
    {
       ABS.Absyn.Case _case = (ABS.Absyn.Case) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("case");
       pp(_case.pureexp_, 0);
       render("{");
       pp(_case.listcasebranch_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EOr)
    {
       ABS.Absyn.EOr _eor = (ABS.Absyn.EOr) foo;
       if (_i_ > 1) render(_L_PAREN);
       pp(_eor.pureexp_1, 1);
       render("||");
       pp(_eor.pureexp_2, 2);
       if (_i_ > 1) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EAnd)
    {
       ABS.Absyn.EAnd _eand = (ABS.Absyn.EAnd) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_eand.pureexp_1, 2);
       render("&&");
       pp(_eand.pureexp_2, 3);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EEq)
    {
       ABS.Absyn.EEq _eeq = (ABS.Absyn.EEq) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_eeq.pureexp_1, 3);
       render("==");
       pp(_eeq.pureexp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ENeq)
    {
       ABS.Absyn.ENeq _eneq = (ABS.Absyn.ENeq) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_eneq.pureexp_1, 3);
       render("!=");
       pp(_eneq.pureexp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELt)
    {
       ABS.Absyn.ELt _elt = (ABS.Absyn.ELt) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_elt.pureexp_1, 4);
       render("<");
       pp(_elt.pureexp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELe)
    {
       ABS.Absyn.ELe _ele = (ABS.Absyn.ELe) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_ele.pureexp_1, 4);
       render("<=");
       pp(_ele.pureexp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EGt)
    {
       ABS.Absyn.EGt _egt = (ABS.Absyn.EGt) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_egt.pureexp_1, 4);
       render(">");
       pp(_egt.pureexp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EGe)
    {
       ABS.Absyn.EGe _ege = (ABS.Absyn.EGe) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_ege.pureexp_1, 4);
       render(">=");
       pp(_ege.pureexp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EAdd)
    {
       ABS.Absyn.EAdd _eadd = (ABS.Absyn.EAdd) foo;
       if (_i_ > 5) render(_L_PAREN);
       pp(_eadd.pureexp_1, 5);
       render("+");
       pp(_eadd.pureexp_2, 6);
       if (_i_ > 5) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ESub)
    {
       ABS.Absyn.ESub _esub = (ABS.Absyn.ESub) foo;
       if (_i_ > 5) render(_L_PAREN);
       pp(_esub.pureexp_1, 5);
       render("-");
       pp(_esub.pureexp_2, 6);
       if (_i_ > 5) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EMul)
    {
       ABS.Absyn.EMul _emul = (ABS.Absyn.EMul) foo;
       if (_i_ > 6) render(_L_PAREN);
       pp(_emul.pureexp_1, 6);
       render("*");
       pp(_emul.pureexp_2, 7);
       if (_i_ > 6) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EDiv)
    {
       ABS.Absyn.EDiv _ediv = (ABS.Absyn.EDiv) foo;
       if (_i_ > 6) render(_L_PAREN);
       pp(_ediv.pureexp_1, 6);
       render("/");
       pp(_ediv.pureexp_2, 7);
       if (_i_ > 6) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EMod)
    {
       ABS.Absyn.EMod _emod = (ABS.Absyn.EMod) foo;
       if (_i_ > 6) render(_L_PAREN);
       pp(_emod.pureexp_1, 6);
       render("%");
       pp(_emod.pureexp_2, 7);
       if (_i_ > 6) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELogNeg)
    {
       ABS.Absyn.ELogNeg _elogneg = (ABS.Absyn.ELogNeg) foo;
       if (_i_ > 7) render(_L_PAREN);
       render("~");
       pp(_elogneg.pureexp_, 6);
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EIntNeg)
    {
       ABS.Absyn.EIntNeg _eintneg = (ABS.Absyn.EIntNeg) foo;
       if (_i_ > 7) render(_L_PAREN);
       render("-");
       pp(_eintneg.pureexp_, 6);
       if (_i_ > 7) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ECall)
    {
       ABS.Absyn.ECall _ecall = (ABS.Absyn.ECall) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_ecall.ident_, 0);
       render("(");
       pp(_ecall.listpureexp_, 0);
       render(")");
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ENaryCall)
    {
       ABS.Absyn.ENaryCall _enarycall = (ABS.Absyn.ENaryCall) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_enarycall.ident_, 0);
       render("[");
       pp(_enarycall.listpureexp_, 0);
       render("]");
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ELit)
    {
       ABS.Absyn.ELit _elit = (ABS.Absyn.ELit) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_elit.literal_, 0);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EVar)
    {
       ABS.Absyn.EVar _evar = (ABS.Absyn.EVar) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_evar.ident_, 0);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EThis)
    {
       ABS.Absyn.EThis _ethis = (ABS.Absyn.EThis) foo;
       if (_i_ > 8) render(_L_PAREN);
       render("this");
       render(".");
       pp(_ethis.ident_, 0);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EUnaryConstr)
    {
       ABS.Absyn.EUnaryConstr _eunaryconstr = (ABS.Absyn.EUnaryConstr) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_eunaryconstr.qualtype_, 0);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.EMultConstr)
    {
       ABS.Absyn.EMultConstr _emultconstr = (ABS.Absyn.EMultConstr) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_emultconstr.qualtype_, 0);
       render("(");
       pp(_emultconstr.listpureexp_, 0);
       render(")");
       if (_i_ > 8) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.CaseBranch foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.CBranch)
    {
       ABS.Absyn.CBranch _cbranch = (ABS.Absyn.CBranch) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_cbranch.pattern_, 0);
       render("=>");
       pp(_cbranch.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListCaseBranch foo, int _i_)
  {
     for (java.util.Iterator<CaseBranch> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(";");
       } else {
         render(";");
       }
     }
  }

  private static void pp(ABS.Absyn.Pattern foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.PIdent)
    {
       ABS.Absyn.PIdent _pident = (ABS.Absyn.PIdent) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_pident.ident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.PLit)
    {
       ABS.Absyn.PLit _plit = (ABS.Absyn.PLit) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_plit.literal_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.PUnaryConstr)
    {
       ABS.Absyn.PUnaryConstr _punaryconstr = (ABS.Absyn.PUnaryConstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_punaryconstr.typeident_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.PMultConstr)
    {
       ABS.Absyn.PMultConstr _pmultconstr = (ABS.Absyn.PMultConstr) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_pmultconstr.typeident_, 0);
       render("(");
       pp(_pmultconstr.listpattern_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.PUnderscore)
    {
       ABS.Absyn.PUnderscore _punderscore = (ABS.Absyn.PUnderscore) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("_");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListPattern foo, int _i_)
  {
     for (java.util.Iterator<Pattern> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Stm foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.SExp)
    {
       ABS.Absyn.SExp _sexp = (ABS.Absyn.SExp) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sexp.effexp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SBlock)
    {
       ABS.Absyn.SBlock _sblock = (ABS.Absyn.SBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_sblock.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SWhile)
    {
       ABS.Absyn.SWhile _swhile = (ABS.Absyn.SWhile) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("while");
       render("(");
       pp(_swhile.pureexp_, 0);
       render(")");
       pp(_swhile.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SReturn)
    {
       ABS.Absyn.SReturn _sreturn = (ABS.Absyn.SReturn) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("return");
       pp(_sreturn.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SAss)
    {
       ABS.Absyn.SAss _sass = (ABS.Absyn.SAss) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sass.ident_, 0);
       render("=");
       pp(_sass.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SFieldAss)
    {
       ABS.Absyn.SFieldAss _sfieldass = (ABS.Absyn.SFieldAss) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render(".");
       pp(_sfieldass.ident_, 0);
       render("=");
       pp(_sfieldass.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SDec)
    {
       ABS.Absyn.SDec _sdec = (ABS.Absyn.SDec) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdec.type_, 0);
       pp(_sdec.ident_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SDecAss)
    {
       ABS.Absyn.SDecAss _sdecass = (ABS.Absyn.SDecAss) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdecass.type_, 0);
       pp(_sdecass.ident_, 0);
       render("=");
       pp(_sdecass.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SIf)
    {
       ABS.Absyn.SIf _sif = (ABS.Absyn.SIf) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       render("(");
       pp(_sif.pureexp_, 0);
       render(")");
       pp(_sif.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SIfElse)
    {
       ABS.Absyn.SIfElse _sifelse = (ABS.Absyn.SIfElse) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       render("(");
       pp(_sifelse.pureexp_, 0);
       render(")");
       pp(_sifelse.stm_1, 0);
       render("else");
       pp(_sifelse.stm_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SAwait)
    {
       ABS.Absyn.SAwait _sawait = (ABS.Absyn.SAwait) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("await");
       pp(_sawait.guard_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SSuspend)
    {
       ABS.Absyn.SSuspend _ssuspend = (ABS.Absyn.SSuspend) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("suspend");
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SSkip)
    {
       ABS.Absyn.SSkip _sskip = (ABS.Absyn.SSkip) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("skip");
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SAssert)
    {
       ABS.Absyn.SAssert _sassert = (ABS.Absyn.SAssert) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("assert");
       pp(_sassert.pureexp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Guard foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.VarGuard)
    {
       ABS.Absyn.VarGuard _varguard = (ABS.Absyn.VarGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_varguard.ident_, 0);
       render("?");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.FieldGuard)
    {
       ABS.Absyn.FieldGuard _fieldguard = (ABS.Absyn.FieldGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render(".");
       pp(_fieldguard.ident_, 0);
       render("?");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExpGuard)
    {
       ABS.Absyn.ExpGuard _expguard = (ABS.Absyn.ExpGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_expguard.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AndGuard)
    {
       ABS.Absyn.AndGuard _andguard = (ABS.Absyn.AndGuard) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_andguard.guard_1, 0);
       render("&");
       pp(_andguard.guard_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Literal foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.LNull)
    {
       ABS.Absyn.LNull _lnull = (ABS.Absyn.LNull) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("null");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LThis)
    {
       ABS.Absyn.LThis _lthis = (ABS.Absyn.LThis) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LStr)
    {
       ABS.Absyn.LStr _lstr = (ABS.Absyn.LStr) foo;
       if (_i_ > 0) render(_L_PAREN);
       printQuoted(_lstr.string_);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.LInt)
    {
       ABS.Absyn.LInt _lint = (ABS.Absyn.LInt) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_lint.integer_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.EffExp foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.New)
    {
       ABS.Absyn.New _new = (ABS.Absyn.New) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("new");
       pp(_new.type_, 0);
       render("(");
       pp(_new.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.NewLocal)
    {
       ABS.Absyn.NewLocal _newlocal = (ABS.Absyn.NewLocal) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("new");
       render("local");
       pp(_newlocal.type_, 0);
       render("(");
       pp(_newlocal.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.SyncCall)
    {
       ABS.Absyn.SyncCall _synccall = (ABS.Absyn.SyncCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_synccall.pureexp_, 0);
       render(".");
       pp(_synccall.ident_, 0);
       render("(");
       pp(_synccall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ThisSyncCall)
    {
       ABS.Absyn.ThisSyncCall _thissynccall = (ABS.Absyn.ThisSyncCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render(".");
       pp(_thissynccall.ident_, 0);
       render("(");
       pp(_thissynccall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.AsyncCall)
    {
       ABS.Absyn.AsyncCall _asynccall = (ABS.Absyn.AsyncCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_asynccall.pureexp_, 0);
       render("!");
       pp(_asynccall.ident_, 0);
       render("(");
       pp(_asynccall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ThisAsyncCall)
    {
       ABS.Absyn.ThisAsyncCall _thisasynccall = (ABS.Absyn.ThisAsyncCall) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("this");
       render("!");
       pp(_thisasynccall.ident_, 0);
       render("(");
       pp(_thisasynccall.listpureexp_, 0);
       render(")");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.Get)
    {
       ABS.Absyn.Get _get = (ABS.Absyn.Get) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_get.pureexp_, 0);
       render(".");
       render("get");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListPureExp foo, int _i_)
  {
     for (java.util.Iterator<PureExp> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }
  }

  private static void pp(ABS.Absyn.Exp foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.ExpP)
    {
       ABS.Absyn.ExpP _expp = (ABS.Absyn.ExpP) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_expp.pureexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof ABS.Absyn.ExpE)
    {
       ABS.Absyn.ExpE _expe = (ABS.Absyn.ExpE) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_expe.effexp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.Ann foo, int _i_)
  {
    if (foo instanceof ABS.Absyn.SimpleAnn)
    {
       ABS.Absyn.SimpleAnn _simpleann = (ABS.Absyn.SimpleAnn) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("[");
       pp(_simpleann.pureexp_, 0);
       render("]");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(ABS.Absyn.ListAnn foo, int _i_)
  {
     for (java.util.Iterator<Ann> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), 0);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }
  }


  private static void sh(ABS.Absyn.Type foo)
  {
    if (foo instanceof ABS.Absyn.TyUnit)
    {
       ABS.Absyn.TyUnit _tyunit = (ABS.Absyn.TyUnit) foo;
       render("TyUnit");
    }
    if (foo instanceof ABS.Absyn.TyInt)
    {
       ABS.Absyn.TyInt _tyint = (ABS.Absyn.TyInt) foo;
       render("TyInt");
    }
    if (foo instanceof ABS.Absyn.TyRat)
    {
       ABS.Absyn.TyRat _tyrat = (ABS.Absyn.TyRat) foo;
       render("TyRat");
    }
    if (foo instanceof ABS.Absyn.TyFut)
    {
       ABS.Absyn.TyFut _tyfut = (ABS.Absyn.TyFut) foo;
       render("(");
       render("TyFut");
       sh(_tyfut.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.TyUnderscore)
    {
       ABS.Absyn.TyUnderscore _tyunderscore = (ABS.Absyn.TyUnderscore) foo;
       render("TyUnderscore");
    }
    if (foo instanceof ABS.Absyn.TypeVar)
    {
       ABS.Absyn.TypeVar _typevar = (ABS.Absyn.TypeVar) foo;
       render("(");
       render("TypeVar");
       sh(_typevar.qualtype_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ArgType)
    {
       ABS.Absyn.ArgType _argtype = (ABS.Absyn.ArgType) foo;
       render("(");
       render("ArgType");
       sh(_argtype.qualtype_);
       render("[");
       sh(_argtype.listanntype_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListAnnType foo)
  {
     for (java.util.Iterator<AnnType> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.AnnType foo)
  {
    if (foo instanceof ABS.Absyn.AnnType_)
    {
       ABS.Absyn.AnnType_ _anntype_ = (ABS.Absyn.AnnType_) foo;
       render("(");
       render("AnnType_");
       render("[");
       sh(_anntype_.listann_);
       render("]");
       sh(_anntype_.type_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.QualType foo)
  {
    if (foo instanceof ABS.Absyn.QualType_)
    {
       ABS.Absyn.QualType_ _qualtype_ = (ABS.Absyn.QualType_) foo;
       render("(");
       render("QualType_");
       render("[");
       sh(_qualtype_.listqualtypeident_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListQualType foo)
  {
     for (java.util.Iterator<QualType> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.QualTypeIdent foo)
  {
    if (foo instanceof ABS.Absyn.QualTypeIdent_)
    {
       ABS.Absyn.QualTypeIdent_ _qualtypeident_ = (ABS.Absyn.QualTypeIdent_) foo;
       render("(");
       render("QualTypeIdent_");
       sh(_qualtypeident_.typeident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListQualTypeIdent foo)
  {
     for (java.util.Iterator<QualTypeIdent> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Program foo)
  {
    if (foo instanceof ABS.Absyn.Prog)
    {
       ABS.Absyn.Prog _prog = (ABS.Absyn.Prog) foo;
       render("(");
       render("Prog");
       sh(_prog.moduledecl_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ModuleDecl foo)
  {
    if (foo instanceof ABS.Absyn.ModuleDecl_)
    {
       ABS.Absyn.ModuleDecl_ _moduledecl_ = (ABS.Absyn.ModuleDecl_) foo;
       render("(");
       render("ModuleDecl_");
       sh(_moduledecl_.qualtype_);
       render("[");
       sh(_moduledecl_.listexport_);
       render("]");
       render("[");
       sh(_moduledecl_.listimport_);
       render("]");
       render("[");
       sh(_moduledecl_.listanndecl_);
       render("]");
       sh(_moduledecl_.maybeblock_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Export foo)
  {
    if (foo instanceof ABS.Absyn.ExportAny)
    {
       ABS.Absyn.ExportAny _exportany = (ABS.Absyn.ExportAny) foo;
       render("(");
       render("ExportAny");
       render("[");
       sh(_exportany.listanyident_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExportAnyFrom)
    {
       ABS.Absyn.ExportAnyFrom _exportanyfrom = (ABS.Absyn.ExportAnyFrom) foo;
       render("(");
       render("ExportAnyFrom");
       render("[");
       sh(_exportanyfrom.listanyident_);
       render("]");
       sh(_exportanyfrom.qualtype_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExportStar)
    {
       ABS.Absyn.ExportStar _exportstar = (ABS.Absyn.ExportStar) foo;
       render("ExportStar");
    }
    if (foo instanceof ABS.Absyn.ExportStarFrom)
    {
       ABS.Absyn.ExportStarFrom _exportstarfrom = (ABS.Absyn.ExportStarFrom) foo;
       render("(");
       render("ExportStarFrom");
       sh(_exportstarfrom.qualtype_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListExport foo)
  {
     for (java.util.Iterator<Export> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ImportType foo)
  {
    if (foo instanceof ABS.Absyn.ImportHaskell)
    {
       ABS.Absyn.ImportHaskell _importhaskell = (ABS.Absyn.ImportHaskell) foo;
       render("ImportHaskell");
    }
    if (foo instanceof ABS.Absyn.ImportABS)
    {
       ABS.Absyn.ImportABS _importabs = (ABS.Absyn.ImportABS) foo;
       render("ImportABS");
    }
  }

  private static void sh(ABS.Absyn.Import foo)
  {
    if (foo instanceof ABS.Absyn.ImportAnyFrom)
    {
       ABS.Absyn.ImportAnyFrom _importanyfrom = (ABS.Absyn.ImportAnyFrom) foo;
       render("(");
       render("ImportAnyFrom");
       sh(_importanyfrom.importtype_);
       render("[");
       sh(_importanyfrom.listanyident_);
       render("]");
       sh(_importanyfrom.qualtype_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ImportStarFrom)
    {
       ABS.Absyn.ImportStarFrom _importstarfrom = (ABS.Absyn.ImportStarFrom) foo;
       render("(");
       render("ImportStarFrom");
       sh(_importstarfrom.importtype_);
       sh(_importstarfrom.qualtype_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListImport foo)
  {
     for (java.util.Iterator<Import> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.AnyIdent foo)
  {
    if (foo instanceof ABS.Absyn.AnyIdentI)
    {
       ABS.Absyn.AnyIdentI _anyidenti = (ABS.Absyn.AnyIdentI) foo;
       render("(");
       render("AnyIdentI");
       sh(_anyidenti.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.AnyIdentT)
    {
       ABS.Absyn.AnyIdentT _anyidentt = (ABS.Absyn.AnyIdentT) foo;
       render("(");
       render("AnyIdentT");
       sh(_anyidentt.typeident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListAnyIdent foo)
  {
     for (java.util.Iterator<AnyIdent> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.AnnDecl foo)
  {
    if (foo instanceof ABS.Absyn.AnnDecl_)
    {
       ABS.Absyn.AnnDecl_ _anndecl_ = (ABS.Absyn.AnnDecl_) foo;
       render("(");
       render("AnnDecl_");
       render("[");
       sh(_anndecl_.listann_);
       render("]");
       sh(_anndecl_.decl_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Decl foo)
  {
    if (foo instanceof ABS.Absyn.TypeDecl)
    {
       ABS.Absyn.TypeDecl _typedecl = (ABS.Absyn.TypeDecl) foo;
       render("(");
       render("TypeDecl");
       sh(_typedecl.typeident_);
       sh(_typedecl.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.DataDecl)
    {
       ABS.Absyn.DataDecl _datadecl = (ABS.Absyn.DataDecl) foo;
       render("(");
       render("DataDecl");
       sh(_datadecl.typeident_);
       render("[");
       sh(_datadecl.listconstrident_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ParDataDecl)
    {
       ABS.Absyn.ParDataDecl _pardatadecl = (ABS.Absyn.ParDataDecl) foo;
       render("(");
       render("ParDataDecl");
       sh(_pardatadecl.typeident_);
       render("[");
       sh(_pardatadecl.listtypeident_);
       render("]");
       render("[");
       sh(_pardatadecl.listconstrident_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.Fun)
    {
       ABS.Absyn.Fun _fun = (ABS.Absyn.Fun) foo;
       render("(");
       render("Fun");
       sh(_fun.type_);
       sh(_fun.ident_);
       render("[");
       sh(_fun.listparam_);
       render("]");
       sh(_fun.funbody_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ParFun)
    {
       ABS.Absyn.ParFun _parfun = (ABS.Absyn.ParFun) foo;
       render("(");
       render("ParFun");
       sh(_parfun.type_);
       sh(_parfun.ident_);
       render("[");
       sh(_parfun.listtypeident_);
       render("]");
       render("[");
       sh(_parfun.listparam_);
       render("]");
       sh(_parfun.funbody_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.InterfDecl)
    {
       ABS.Absyn.InterfDecl _interfdecl = (ABS.Absyn.InterfDecl) foo;
       render("(");
       render("InterfDecl");
       sh(_interfdecl.typeident_);
       render("[");
       sh(_interfdecl.listmethsig_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExtendsDecl)
    {
       ABS.Absyn.ExtendsDecl _extendsdecl = (ABS.Absyn.ExtendsDecl) foo;
       render("(");
       render("ExtendsDecl");
       sh(_extendsdecl.typeident_);
       render("[");
       sh(_extendsdecl.listqualtype_);
       render("]");
       render("[");
       sh(_extendsdecl.listmethsig_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassDecl)
    {
       ABS.Absyn.ClassDecl _classdecl = (ABS.Absyn.ClassDecl) foo;
       render("(");
       render("ClassDecl");
       sh(_classdecl.typeident_);
       render("[");
       sh(_classdecl.listbodydecl_1);
       render("]");
       sh(_classdecl.maybeblock_);
       render("[");
       sh(_classdecl.listbodydecl_2);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassParamDecl)
    {
       ABS.Absyn.ClassParamDecl _classparamdecl = (ABS.Absyn.ClassParamDecl) foo;
       render("(");
       render("ClassParamDecl");
       sh(_classparamdecl.typeident_);
       render("[");
       sh(_classparamdecl.listparam_);
       render("]");
       render("[");
       sh(_classparamdecl.listbodydecl_1);
       render("]");
       sh(_classparamdecl.maybeblock_);
       render("[");
       sh(_classparamdecl.listbodydecl_2);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassImplements)
    {
       ABS.Absyn.ClassImplements _classimplements = (ABS.Absyn.ClassImplements) foo;
       render("(");
       render("ClassImplements");
       sh(_classimplements.typeident_);
       render("[");
       sh(_classimplements.listqualtype_);
       render("]");
       render("[");
       sh(_classimplements.listbodydecl_1);
       render("]");
       sh(_classimplements.maybeblock_);
       render("[");
       sh(_classimplements.listbodydecl_2);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ClassParamImplements)
    {
       ABS.Absyn.ClassParamImplements _classparamimplements = (ABS.Absyn.ClassParamImplements) foo;
       render("(");
       render("ClassParamImplements");
       sh(_classparamimplements.typeident_);
       render("[");
       sh(_classparamimplements.listparam_);
       render("]");
       render("[");
       sh(_classparamimplements.listqualtype_);
       render("]");
       render("[");
       sh(_classparamimplements.listbodydecl_1);
       render("]");
       sh(_classparamimplements.maybeblock_);
       render("[");
       sh(_classparamimplements.listbodydecl_2);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ConstrIdent foo)
  {
    if (foo instanceof ABS.Absyn.UnaryConstr)
    {
       ABS.Absyn.UnaryConstr _unaryconstr = (ABS.Absyn.UnaryConstr) foo;
       render("(");
       render("UnaryConstr");
       sh(_unaryconstr.typeident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.MultConstr)
    {
       ABS.Absyn.MultConstr _multconstr = (ABS.Absyn.MultConstr) foo;
       render("(");
       render("MultConstr");
       sh(_multconstr.typeident_);
       render("[");
       sh(_multconstr.listconstrtype_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ConstrType foo)
  {
    if (foo instanceof ABS.Absyn.EmptyConstrType)
    {
       ABS.Absyn.EmptyConstrType _emptyconstrtype = (ABS.Absyn.EmptyConstrType) foo;
       render("(");
       render("EmptyConstrType");
       sh(_emptyconstrtype.type_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.RecordConstrType)
    {
       ABS.Absyn.RecordConstrType _recordconstrtype = (ABS.Absyn.RecordConstrType) foo;
       render("(");
       render("RecordConstrType");
       sh(_recordconstrtype.type_);
       sh(_recordconstrtype.ident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListConstrType foo)
  {
     for (java.util.Iterator<ConstrType> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ListTypeIdent foo)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ListConstrIdent foo)
  {
     for (java.util.Iterator<ConstrIdent> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.MethSig foo)
  {
    if (foo instanceof ABS.Absyn.MethSig_)
    {
       ABS.Absyn.MethSig_ _methsig_ = (ABS.Absyn.MethSig_) foo;
       render("(");
       render("MethSig_");
       sh(_methsig_.type_);
       sh(_methsig_.ident_);
       render("[");
       sh(_methsig_.listparam_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListMethSig foo)
  {
     for (java.util.Iterator<MethSig> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.BodyDecl foo)
  {
    if (foo instanceof ABS.Absyn.FieldDecl)
    {
       ABS.Absyn.FieldDecl _fielddecl = (ABS.Absyn.FieldDecl) foo;
       render("(");
       render("FieldDecl");
       sh(_fielddecl.type_);
       sh(_fielddecl.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.FieldDeclAss)
    {
       ABS.Absyn.FieldDeclAss _fielddeclass = (ABS.Absyn.FieldDeclAss) foo;
       render("(");
       render("FieldDeclAss");
       sh(_fielddeclass.type_);
       sh(_fielddeclass.ident_);
       sh(_fielddeclass.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.MethDecl)
    {
       ABS.Absyn.MethDecl _methdecl = (ABS.Absyn.MethDecl) foo;
       render("(");
       render("MethDecl");
       sh(_methdecl.type_);
       sh(_methdecl.ident_);
       render("[");
       sh(_methdecl.listparam_);
       render("]");
       sh(_methdecl.block_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListBodyDecl foo)
  {
     for (java.util.Iterator<BodyDecl> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Block foo)
  {
    if (foo instanceof ABS.Absyn.Block_)
    {
       ABS.Absyn.Block_ _block_ = (ABS.Absyn.Block_) foo;
       render("(");
       render("Block_");
       render("[");
       sh(_block_.liststm_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.MaybeBlock foo)
  {
    if (foo instanceof ABS.Absyn.JustBlock)
    {
       ABS.Absyn.JustBlock _justblock = (ABS.Absyn.JustBlock) foo;
       render("(");
       render("JustBlock");
       sh(_justblock.block_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.NoBlock)
    {
       ABS.Absyn.NoBlock _noblock = (ABS.Absyn.NoBlock) foo;
       render("NoBlock");
    }
  }

  private static void sh(ABS.Absyn.FunBody foo)
  {
    if (foo instanceof ABS.Absyn.Builtin)
    {
       ABS.Absyn.Builtin _builtin = (ABS.Absyn.Builtin) foo;
       render("Builtin");
    }
    if (foo instanceof ABS.Absyn.PureBody)
    {
       ABS.Absyn.PureBody _purebody = (ABS.Absyn.PureBody) foo;
       render("(");
       render("PureBody");
       sh(_purebody.pureexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListAnnDecl foo)
  {
     for (java.util.Iterator<AnnDecl> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.ListStm foo)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Param foo)
  {
    if (foo instanceof ABS.Absyn.Par)
    {
       ABS.Absyn.Par _par = (ABS.Absyn.Par) foo;
       render("(");
       render("Par");
       sh(_par.anntype_);
       sh(_par.ident_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListParam foo)
  {
     for (java.util.Iterator<Param> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.PureExp foo)
  {
    if (foo instanceof ABS.Absyn.Let)
    {
       ABS.Absyn.Let _let = (ABS.Absyn.Let) foo;
       render("(");
       render("Let");
       sh(_let.param_);
       sh(_let.pureexp_1);
       sh(_let.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.If)
    {
       ABS.Absyn.If _if = (ABS.Absyn.If) foo;
       render("(");
       render("If");
       sh(_if.pureexp_1);
       sh(_if.pureexp_2);
       sh(_if.pureexp_3);
       render(")");
    }
    if (foo instanceof ABS.Absyn.Case)
    {
       ABS.Absyn.Case _case = (ABS.Absyn.Case) foo;
       render("(");
       render("Case");
       sh(_case.pureexp_);
       render("[");
       sh(_case.listcasebranch_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.EOr)
    {
       ABS.Absyn.EOr _eor = (ABS.Absyn.EOr) foo;
       render("(");
       render("EOr");
       sh(_eor.pureexp_1);
       sh(_eor.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EAnd)
    {
       ABS.Absyn.EAnd _eand = (ABS.Absyn.EAnd) foo;
       render("(");
       render("EAnd");
       sh(_eand.pureexp_1);
       sh(_eand.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EEq)
    {
       ABS.Absyn.EEq _eeq = (ABS.Absyn.EEq) foo;
       render("(");
       render("EEq");
       sh(_eeq.pureexp_1);
       sh(_eeq.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ENeq)
    {
       ABS.Absyn.ENeq _eneq = (ABS.Absyn.ENeq) foo;
       render("(");
       render("ENeq");
       sh(_eneq.pureexp_1);
       sh(_eneq.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELt)
    {
       ABS.Absyn.ELt _elt = (ABS.Absyn.ELt) foo;
       render("(");
       render("ELt");
       sh(_elt.pureexp_1);
       sh(_elt.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELe)
    {
       ABS.Absyn.ELe _ele = (ABS.Absyn.ELe) foo;
       render("(");
       render("ELe");
       sh(_ele.pureexp_1);
       sh(_ele.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EGt)
    {
       ABS.Absyn.EGt _egt = (ABS.Absyn.EGt) foo;
       render("(");
       render("EGt");
       sh(_egt.pureexp_1);
       sh(_egt.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EGe)
    {
       ABS.Absyn.EGe _ege = (ABS.Absyn.EGe) foo;
       render("(");
       render("EGe");
       sh(_ege.pureexp_1);
       sh(_ege.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EAdd)
    {
       ABS.Absyn.EAdd _eadd = (ABS.Absyn.EAdd) foo;
       render("(");
       render("EAdd");
       sh(_eadd.pureexp_1);
       sh(_eadd.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ESub)
    {
       ABS.Absyn.ESub _esub = (ABS.Absyn.ESub) foo;
       render("(");
       render("ESub");
       sh(_esub.pureexp_1);
       sh(_esub.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EMul)
    {
       ABS.Absyn.EMul _emul = (ABS.Absyn.EMul) foo;
       render("(");
       render("EMul");
       sh(_emul.pureexp_1);
       sh(_emul.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EDiv)
    {
       ABS.Absyn.EDiv _ediv = (ABS.Absyn.EDiv) foo;
       render("(");
       render("EDiv");
       sh(_ediv.pureexp_1);
       sh(_ediv.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EMod)
    {
       ABS.Absyn.EMod _emod = (ABS.Absyn.EMod) foo;
       render("(");
       render("EMod");
       sh(_emod.pureexp_1);
       sh(_emod.pureexp_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELogNeg)
    {
       ABS.Absyn.ELogNeg _elogneg = (ABS.Absyn.ELogNeg) foo;
       render("(");
       render("ELogNeg");
       sh(_elogneg.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EIntNeg)
    {
       ABS.Absyn.EIntNeg _eintneg = (ABS.Absyn.EIntNeg) foo;
       render("(");
       render("EIntNeg");
       sh(_eintneg.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ECall)
    {
       ABS.Absyn.ECall _ecall = (ABS.Absyn.ECall) foo;
       render("(");
       render("ECall");
       sh(_ecall.ident_);
       render("[");
       sh(_ecall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ENaryCall)
    {
       ABS.Absyn.ENaryCall _enarycall = (ABS.Absyn.ENaryCall) foo;
       render("(");
       render("ENaryCall");
       sh(_enarycall.ident_);
       render("[");
       sh(_enarycall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ELit)
    {
       ABS.Absyn.ELit _elit = (ABS.Absyn.ELit) foo;
       render("(");
       render("ELit");
       sh(_elit.literal_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EVar)
    {
       ABS.Absyn.EVar _evar = (ABS.Absyn.EVar) foo;
       render("(");
       render("EVar");
       sh(_evar.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EThis)
    {
       ABS.Absyn.EThis _ethis = (ABS.Absyn.EThis) foo;
       render("(");
       render("EThis");
       sh(_ethis.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EUnaryConstr)
    {
       ABS.Absyn.EUnaryConstr _eunaryconstr = (ABS.Absyn.EUnaryConstr) foo;
       render("(");
       render("EUnaryConstr");
       sh(_eunaryconstr.qualtype_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.EMultConstr)
    {
       ABS.Absyn.EMultConstr _emultconstr = (ABS.Absyn.EMultConstr) foo;
       render("(");
       render("EMultConstr");
       sh(_emultconstr.qualtype_);
       render("[");
       sh(_emultconstr.listpureexp_);
       render("]");
       render(")");
    }
  }

  private static void sh(ABS.Absyn.CaseBranch foo)
  {
    if (foo instanceof ABS.Absyn.CBranch)
    {
       ABS.Absyn.CBranch _cbranch = (ABS.Absyn.CBranch) foo;
       render("(");
       render("CBranch");
       sh(_cbranch.pattern_);
       sh(_cbranch.pureexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListCaseBranch foo)
  {
     for (java.util.Iterator<CaseBranch> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Pattern foo)
  {
    if (foo instanceof ABS.Absyn.PIdent)
    {
       ABS.Absyn.PIdent _pident = (ABS.Absyn.PIdent) foo;
       render("(");
       render("PIdent");
       sh(_pident.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.PLit)
    {
       ABS.Absyn.PLit _plit = (ABS.Absyn.PLit) foo;
       render("(");
       render("PLit");
       sh(_plit.literal_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.PUnaryConstr)
    {
       ABS.Absyn.PUnaryConstr _punaryconstr = (ABS.Absyn.PUnaryConstr) foo;
       render("(");
       render("PUnaryConstr");
       sh(_punaryconstr.typeident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.PMultConstr)
    {
       ABS.Absyn.PMultConstr _pmultconstr = (ABS.Absyn.PMultConstr) foo;
       render("(");
       render("PMultConstr");
       sh(_pmultconstr.typeident_);
       render("[");
       sh(_pmultconstr.listpattern_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.PUnderscore)
    {
       ABS.Absyn.PUnderscore _punderscore = (ABS.Absyn.PUnderscore) foo;
       render("PUnderscore");
    }
  }

  private static void sh(ABS.Absyn.ListPattern foo)
  {
     for (java.util.Iterator<Pattern> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Stm foo)
  {
    if (foo instanceof ABS.Absyn.SExp)
    {
       ABS.Absyn.SExp _sexp = (ABS.Absyn.SExp) foo;
       render("(");
       render("SExp");
       sh(_sexp.effexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SBlock)
    {
       ABS.Absyn.SBlock _sblock = (ABS.Absyn.SBlock) foo;
       render("(");
       render("SBlock");
       render("[");
       sh(_sblock.liststm_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.SWhile)
    {
       ABS.Absyn.SWhile _swhile = (ABS.Absyn.SWhile) foo;
       render("(");
       render("SWhile");
       sh(_swhile.pureexp_);
       sh(_swhile.stm_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SReturn)
    {
       ABS.Absyn.SReturn _sreturn = (ABS.Absyn.SReturn) foo;
       render("(");
       render("SReturn");
       sh(_sreturn.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SAss)
    {
       ABS.Absyn.SAss _sass = (ABS.Absyn.SAss) foo;
       render("(");
       render("SAss");
       sh(_sass.ident_);
       sh(_sass.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SFieldAss)
    {
       ABS.Absyn.SFieldAss _sfieldass = (ABS.Absyn.SFieldAss) foo;
       render("(");
       render("SFieldAss");
       sh(_sfieldass.ident_);
       sh(_sfieldass.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SDec)
    {
       ABS.Absyn.SDec _sdec = (ABS.Absyn.SDec) foo;
       render("(");
       render("SDec");
       sh(_sdec.type_);
       sh(_sdec.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SDecAss)
    {
       ABS.Absyn.SDecAss _sdecass = (ABS.Absyn.SDecAss) foo;
       render("(");
       render("SDecAss");
       sh(_sdecass.type_);
       sh(_sdecass.ident_);
       sh(_sdecass.exp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SIf)
    {
       ABS.Absyn.SIf _sif = (ABS.Absyn.SIf) foo;
       render("(");
       render("SIf");
       sh(_sif.pureexp_);
       sh(_sif.stm_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SIfElse)
    {
       ABS.Absyn.SIfElse _sifelse = (ABS.Absyn.SIfElse) foo;
       render("(");
       render("SIfElse");
       sh(_sifelse.pureexp_);
       sh(_sifelse.stm_1);
       sh(_sifelse.stm_2);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SAwait)
    {
       ABS.Absyn.SAwait _sawait = (ABS.Absyn.SAwait) foo;
       render("(");
       render("SAwait");
       sh(_sawait.guard_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.SSuspend)
    {
       ABS.Absyn.SSuspend _ssuspend = (ABS.Absyn.SSuspend) foo;
       render("SSuspend");
    }
    if (foo instanceof ABS.Absyn.SSkip)
    {
       ABS.Absyn.SSkip _sskip = (ABS.Absyn.SSkip) foo;
       render("SSkip");
    }
    if (foo instanceof ABS.Absyn.SAssert)
    {
       ABS.Absyn.SAssert _sassert = (ABS.Absyn.SAssert) foo;
       render("(");
       render("SAssert");
       sh(_sassert.pureexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Guard foo)
  {
    if (foo instanceof ABS.Absyn.VarGuard)
    {
       ABS.Absyn.VarGuard _varguard = (ABS.Absyn.VarGuard) foo;
       render("(");
       render("VarGuard");
       sh(_varguard.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.FieldGuard)
    {
       ABS.Absyn.FieldGuard _fieldguard = (ABS.Absyn.FieldGuard) foo;
       render("(");
       render("FieldGuard");
       sh(_fieldguard.ident_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExpGuard)
    {
       ABS.Absyn.ExpGuard _expguard = (ABS.Absyn.ExpGuard) foo;
       render("(");
       render("ExpGuard");
       sh(_expguard.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.AndGuard)
    {
       ABS.Absyn.AndGuard _andguard = (ABS.Absyn.AndGuard) foo;
       render("(");
       render("AndGuard");
       sh(_andguard.guard_1);
       sh(_andguard.guard_2);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Literal foo)
  {
    if (foo instanceof ABS.Absyn.LNull)
    {
       ABS.Absyn.LNull _lnull = (ABS.Absyn.LNull) foo;
       render("LNull");
    }
    if (foo instanceof ABS.Absyn.LThis)
    {
       ABS.Absyn.LThis _lthis = (ABS.Absyn.LThis) foo;
       render("LThis");
    }
    if (foo instanceof ABS.Absyn.LStr)
    {
       ABS.Absyn.LStr _lstr = (ABS.Absyn.LStr) foo;
       render("(");
       render("LStr");
       sh(_lstr.string_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.LInt)
    {
       ABS.Absyn.LInt _lint = (ABS.Absyn.LInt) foo;
       render("(");
       render("LInt");
       sh(_lint.integer_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.EffExp foo)
  {
    if (foo instanceof ABS.Absyn.New)
    {
       ABS.Absyn.New _new = (ABS.Absyn.New) foo;
       render("(");
       render("New");
       sh(_new.type_);
       render("[");
       sh(_new.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.NewLocal)
    {
       ABS.Absyn.NewLocal _newlocal = (ABS.Absyn.NewLocal) foo;
       render("(");
       render("NewLocal");
       sh(_newlocal.type_);
       render("[");
       sh(_newlocal.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.SyncCall)
    {
       ABS.Absyn.SyncCall _synccall = (ABS.Absyn.SyncCall) foo;
       render("(");
       render("SyncCall");
       sh(_synccall.pureexp_);
       sh(_synccall.ident_);
       render("[");
       sh(_synccall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ThisSyncCall)
    {
       ABS.Absyn.ThisSyncCall _thissynccall = (ABS.Absyn.ThisSyncCall) foo;
       render("(");
       render("ThisSyncCall");
       sh(_thissynccall.ident_);
       render("[");
       sh(_thissynccall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.AsyncCall)
    {
       ABS.Absyn.AsyncCall _asynccall = (ABS.Absyn.AsyncCall) foo;
       render("(");
       render("AsyncCall");
       sh(_asynccall.pureexp_);
       sh(_asynccall.ident_);
       render("[");
       sh(_asynccall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.ThisAsyncCall)
    {
       ABS.Absyn.ThisAsyncCall _thisasynccall = (ABS.Absyn.ThisAsyncCall) foo;
       render("(");
       render("ThisAsyncCall");
       sh(_thisasynccall.ident_);
       render("[");
       sh(_thisasynccall.listpureexp_);
       render("]");
       render(")");
    }
    if (foo instanceof ABS.Absyn.Get)
    {
       ABS.Absyn.Get _get = (ABS.Absyn.Get) foo;
       render("(");
       render("Get");
       sh(_get.pureexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListPureExp foo)
  {
     for (java.util.Iterator<PureExp> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(ABS.Absyn.Exp foo)
  {
    if (foo instanceof ABS.Absyn.ExpP)
    {
       ABS.Absyn.ExpP _expp = (ABS.Absyn.ExpP) foo;
       render("(");
       render("ExpP");
       sh(_expp.pureexp_);
       render(")");
    }
    if (foo instanceof ABS.Absyn.ExpE)
    {
       ABS.Absyn.ExpE _expe = (ABS.Absyn.ExpE) foo;
       render("(");
       render("ExpE");
       sh(_expe.effexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.Ann foo)
  {
    if (foo instanceof ABS.Absyn.SimpleAnn)
    {
       ABS.Absyn.SimpleAnn _simpleann = (ABS.Absyn.SimpleAnn) foo;
       render("(");
       render("SimpleAnn");
       sh(_simpleann.pureexp_);
       render(")");
    }
  }

  private static void sh(ABS.Absyn.ListAnn foo)
  {
     for (java.util.Iterator<Ann> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(d); buf_.append(" "); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(d.toString()); }
  private static void sh(Character c) { render(c.toString()); }
  private static void sh(String s) { printQuoted(s); }
  private static void printQuoted(String s) { render("\"" + s + "\""); }
  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(" ");
      n--;
    }
  }
  private static void backup()
  {
     if (buf_.charAt(buf_.length() - 1) == ' ') {
      buf_.setLength(buf_.length() - 1);
    }
  }
  private static void trim()
  {
     while (buf_.length() > 0 && buf_.charAt(0) == ' ')
        buf_.deleteCharAt(0); 
    while (buf_.length() > 0 && buf_.charAt(buf_.length()-1) == ' ')
        buf_.deleteCharAt(buf_.length()-1);
  }
  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}

