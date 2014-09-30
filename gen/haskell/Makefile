all:
	happy -gca ParABS.y
	alex -g LexABS.x
	ghc --make TestABS.hs -o TestABS

clean:
	-rm -f *.log *.aux *.hi *.o *.dvi
	-rm -f DocABS.ps

distclean: clean
	-rm -f DocABS.* LexABS.* ParABS.* LayoutABS.* SkelABS.* PrintABS.* TestABS.* AbsABS.* TestABS ErrM.* SharedString.* ComposOpABS.* ABS.dtd XMLABS.* Makefile*
	

