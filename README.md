# New frontend for ABS

## Installing dependencies

### BNFC

Description of BNF Converter (BNFC):

> The BNF Converter is a compiler construction tool generating a compiler front-end from a Labelled BNF grammar. 
> It is currently able to generate C, C++, C#, Haskell, Java, and OCaml, as well as XML representations.

To install:

1) Grab a recent binary for your platform from <http://bnfc.digitalgrammars.com/>
2) or if you have ghc and cabal, build&install bnfc with `cabal install BNFC`.

## Building the ABS frontend

The general rule is to build the frontend **specifically for the language** that you are using for your (backend) compiler.
To build the frontend, invoke bnfc for your compiler language:

~~~
cd src/
bnfc --language ABS.cf
~~~

### Building for Haskell

You need the `happy` parser and `alex` lexer. Install them with:

~~~
cabal install happy alex
~~~

Then run bnfc with:

~~~
cd src/
bnfc --haskell ABS.cf
~~~

Files generated:

- AbsABS.hs : holds the Abstract Syntax Tree (AST) datatype for the ABS language
- PrintABS.hs : module for pretty-printing ABS-AST code.
- LexABS.x : the lexer specification in Alex format.
- ParABS.y : the parser specification in Happy format.
- TestABS.hs: example program that parses and prints ABS source code from input.
- SkelABS.hs : helper file for TestABS.hs
- ErrM.hs : helper file used by other-generated files

To generate the actual haskell lexer and parser:

~~~
happy -gca ParABS.y
alex -g LexABS.x
~~~
  
These commands generate the Haskell
source-code for the lexer (LexABS.hs) and parser (ParABS.hs).

You can then use the all of these `.hs` sources for your Haskell-based backend compiler.

### Building for Java

TODO


### (Optional) Generate documentation for any BNFC-language

After you run bnfc (regardless of your backend language), 
you can generate HTML documentation  for the ABS grammar with:

~~~
txt2tags -t html DocABS.txt
~~~

or PDF documentation with:

~~~
txt2tags -t tex DocABS.txt
pdflatex DocABS.tex
~~~

