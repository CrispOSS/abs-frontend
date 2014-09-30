// This JLex file was machine-generated by the BNF converter
package ABS;
import java_cup.runtime.*;


public class Yylex implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 65536;
	private final int YY_EOF = 65537;

  String pstring = new String();
  public int line_num() { return (yyline+1); }
  public String buff() { return new String(yy_buffer,yy_buffer_index,10).trim(); }
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public Yylex (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public Yylex (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Yylex () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int STRING = 5;
	private final int ESCAPED = 6;
	private final int YYINITIAL = 0;
	private final int COMMENT = 1;
	private final int CHAREND = 4;
	private final int CHARESC = 3;
	private final int CHAR = 2;
	private final int yy_state_dtrans[] = {
		0,
		88,
		91,
		91,
		91,
		94,
		97
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NO_ANCHOR,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NO_ANCHOR,
		/* 72 */ YY_NO_ANCHOR,
		/* 73 */ YY_NO_ANCHOR,
		/* 74 */ YY_NO_ANCHOR,
		/* 75 */ YY_NO_ANCHOR,
		/* 76 */ YY_NO_ANCHOR,
		/* 77 */ YY_NO_ANCHOR,
		/* 78 */ YY_NO_ANCHOR,
		/* 79 */ YY_NO_ANCHOR,
		/* 80 */ YY_NO_ANCHOR,
		/* 81 */ YY_NO_ANCHOR,
		/* 82 */ YY_NO_ANCHOR,
		/* 83 */ YY_NO_ANCHOR,
		/* 84 */ YY_NOT_ACCEPT,
		/* 85 */ YY_NO_ANCHOR,
		/* 86 */ YY_NO_ANCHOR,
		/* 87 */ YY_NO_ANCHOR,
		/* 88 */ YY_NOT_ACCEPT,
		/* 89 */ YY_NO_ANCHOR,
		/* 90 */ YY_NO_ANCHOR,
		/* 91 */ YY_NOT_ACCEPT,
		/* 92 */ YY_NO_ANCHOR,
		/* 93 */ YY_NO_ANCHOR,
		/* 94 */ YY_NOT_ACCEPT,
		/* 95 */ YY_NO_ANCHOR,
		/* 96 */ YY_NO_ANCHOR,
		/* 97 */ YY_NOT_ACCEPT,
		/* 98 */ YY_NO_ANCHOR,
		/* 99 */ YY_NO_ANCHOR,
		/* 100 */ YY_NO_ANCHOR,
		/* 101 */ YY_NO_ANCHOR,
		/* 102 */ YY_NO_ANCHOR,
		/* 103 */ YY_NO_ANCHOR,
		/* 104 */ YY_NO_ANCHOR,
		/* 105 */ YY_NO_ANCHOR,
		/* 106 */ YY_NO_ANCHOR,
		/* 107 */ YY_NO_ANCHOR,
		/* 108 */ YY_NO_ANCHOR,
		/* 109 */ YY_NO_ANCHOR,
		/* 110 */ YY_NO_ANCHOR,
		/* 111 */ YY_NO_ANCHOR,
		/* 112 */ YY_NO_ANCHOR,
		/* 113 */ YY_NO_ANCHOR,
		/* 114 */ YY_NO_ANCHOR,
		/* 115 */ YY_NO_ANCHOR,
		/* 116 */ YY_NO_ANCHOR,
		/* 117 */ YY_NO_ANCHOR,
		/* 118 */ YY_NO_ANCHOR,
		/* 119 */ YY_NO_ANCHOR,
		/* 120 */ YY_NO_ANCHOR,
		/* 121 */ YY_NO_ANCHOR,
		/* 122 */ YY_NO_ANCHOR,
		/* 123 */ YY_NO_ANCHOR,
		/* 124 */ YY_NO_ANCHOR,
		/* 125 */ YY_NO_ANCHOR,
		/* 126 */ YY_NO_ANCHOR,
		/* 127 */ YY_NO_ANCHOR,
		/* 128 */ YY_NO_ANCHOR,
		/* 129 */ YY_NO_ANCHOR,
		/* 130 */ YY_NO_ANCHOR,
		/* 131 */ YY_NO_ANCHOR,
		/* 132 */ YY_NO_ANCHOR,
		/* 133 */ YY_NO_ANCHOR,
		/* 134 */ YY_NO_ANCHOR,
		/* 135 */ YY_NO_ANCHOR,
		/* 136 */ YY_NO_ANCHOR,
		/* 137 */ YY_NO_ANCHOR,
		/* 138 */ YY_NO_ANCHOR,
		/* 139 */ YY_NO_ANCHOR,
		/* 140 */ YY_NO_ANCHOR,
		/* 141 */ YY_NO_ANCHOR,
		/* 142 */ YY_NO_ANCHOR,
		/* 143 */ YY_NO_ANCHOR,
		/* 144 */ YY_NO_ANCHOR,
		/* 145 */ YY_NO_ANCHOR,
		/* 146 */ YY_NO_ANCHOR,
		/* 147 */ YY_NO_ANCHOR,
		/* 148 */ YY_NO_ANCHOR,
		/* 149 */ YY_NO_ANCHOR,
		/* 150 */ YY_NO_ANCHOR,
		/* 151 */ YY_NO_ANCHOR,
		/* 152 */ YY_NO_ANCHOR,
		/* 153 */ YY_NO_ANCHOR,
		/* 154 */ YY_NO_ANCHOR,
		/* 155 */ YY_NO_ANCHOR,
		/* 156 */ YY_NO_ANCHOR,
		/* 157 */ YY_NO_ANCHOR,
		/* 158 */ YY_NO_ANCHOR,
		/* 159 */ YY_NO_ANCHOR,
		/* 160 */ YY_NO_ANCHOR,
		/* 161 */ YY_NO_ANCHOR,
		/* 162 */ YY_NO_ANCHOR,
		/* 163 */ YY_NO_ANCHOR,
		/* 164 */ YY_NO_ANCHOR,
		/* 165 */ YY_NO_ANCHOR,
		/* 166 */ YY_NO_ANCHOR,
		/* 167 */ YY_NO_ANCHOR,
		/* 168 */ YY_NO_ANCHOR,
		/* 169 */ YY_NO_ANCHOR,
		/* 170 */ YY_NO_ANCHOR,
		/* 171 */ YY_NO_ANCHOR,
		/* 172 */ YY_NO_ANCHOR,
		/* 173 */ YY_NO_ANCHOR,
		/* 174 */ YY_NO_ANCHOR,
		/* 175 */ YY_NO_ANCHOR,
		/* 176 */ YY_NO_ANCHOR,
		/* 177 */ YY_NO_ANCHOR,
		/* 178 */ YY_NO_ANCHOR,
		/* 179 */ YY_NO_ANCHOR,
		/* 180 */ YY_NO_ANCHOR,
		/* 181 */ YY_NO_ANCHOR,
		/* 182 */ YY_NO_ANCHOR,
		/* 183 */ YY_NO_ANCHOR,
		/* 184 */ YY_NO_ANCHOR,
		/* 185 */ YY_NO_ANCHOR,
		/* 186 */ YY_NO_ANCHOR,
		/* 187 */ YY_NO_ANCHOR,
		/* 188 */ YY_NO_ANCHOR,
		/* 189 */ YY_NO_ANCHOR,
		/* 190 */ YY_NO_ANCHOR,
		/* 191 */ YY_NO_ANCHOR,
		/* 192 */ YY_NO_ANCHOR,
		/* 193 */ YY_NO_ANCHOR,
		/* 194 */ YY_NO_ANCHOR,
		/* 195 */ YY_NO_ANCHOR,
		/* 196 */ YY_NO_ANCHOR,
		/* 197 */ YY_NO_ANCHOR,
		/* 198 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,65538,
"52:9,59,51,52,59,50,52:18,59,16,57,52:2,20,15,56,9,10,7,17,4,18,5,19,55:10," +
"52,6,1,8,2,14,52,53:5,24,53:2,27,53:8,29,53:2,31,53:5,22,58,23,52,3,52,30,3" +
"7,39,40,34,41,46,48,32,54,47,38,45,28,44,43,54,35,33,26,25,54,36,42,49,54,1" +
"2,11,13,21,52:65,53:23,52,53:7,54:24,52,54:8,52:65280,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,199,
"0,1,2,3,1:5,4,1:2,5,1:3,6,7,1:2,8,1:4,9,10,1,11,1:9,12,10,1,13:2,10,13,10:7" +
",13,10:20,1:11,14,15,16,17,18,13,19,20,21,22,23,24,25,26,27,28,29,30,31,32," +
"33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57," +
"58,59,13,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81," +
"82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,1" +
"05,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123," +
"124,125,126")[0];

	private int yy_nxt[][] = unpackFromString(127,60,
"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,156,12" +
"4,125,127,176,129,86,157,158,189,177,196,128,159,130,160,26:3,190,132,26:3," +
"27:2,-1,131,26,28,-1,29,-1,27,-1:68,30,-1:59,31,-1:53,32,-1:5,33,-1:62,34,-" +
"1:63,35,-1:52,36,-1:58,37,-1:11,84,-1:43,131,-1:20,131,85,89,131,89,131,89," +
"131,89:18,-1:3,131,89,131:2,-1:6,26,-1:20,26:26,-1:3,26:4,-1:58,28,-1:7,26," +
"-1:20,26:2,197,26:23,-1:3,26:4,-1:6,131,-1:20,131,89:2,131,89,131,89,131,89" +
":18,-1:3,131,89,131:2,-1:4,84:50,40,84:8,-1:3,131,-1:20,131,89,41,131,89,13" +
"1,89,131,89:18,-1:3,131,89,131:2,-1:6,26,-1:20,26:4,38,26:12,39,26:3,179,26" +
":4,-1:3,26:4,-1:22,75,-1:40,1,73:6,87,73:42,-1,74,73:8,-1:3,26,-1:20,26:12," +
"43,26:13,-1:3,26:4,-1:3,1,-1:62,131,-1:20,131,89,42,131,89,131,89,131,89:18" +
",-1:3,131,89,131:2,-1:6,26,-1:20,26:2,45,26:23,-1:3,26:4,-1:3,1,76:49,-1:2," +
"76:5,77,78,76,-1:3,131,-1:20,131,89,44,131,89,131,89,131,89:18,-1:3,131,89," +
"131:2,-1:6,26,-1:20,26:17,46,26:8,-1:3,26:4,-1:3,1,79:25,80,79,81,79:21,-1:" +
"2,79:5,82,83,79,-1:3,131,-1:20,131,89,52,131,89,131,89,131,89:18,-1:3,131,8" +
"9,131:2,-1:6,26,-1:20,26:2,47,26:23,-1:3,26:4,-1:6,26,-1:20,26:9,48,26:16,-" +
"1:3,26:4,-1:6,26,-1:20,26:4,49,26:21,-1:3,26:4,-1:6,26,-1:20,26:10,50,26:15" +
",-1:3,26:4,-1:6,26,-1:20,26:14,51,26:11,-1:3,26:4,-1:6,26,-1:20,26:19,53,26" +
":6,-1:3,26:4,-1:6,26,-1:20,26:10,54,26:15,-1:3,26:4,-1:6,26,-1:20,26:10,55," +
"26:15,-1:3,26:4,-1:6,26,-1:20,26:6,56,26:19,-1:3,26:4,-1:6,26,-1:20,26:21,5" +
"7,26:4,-1:3,26:4,-1:6,26,-1:20,26:2,58,26:23,-1:3,26:4,-1:6,26,-1:20,26:10," +
"59,26:15,-1:3,26:4,-1:6,26,-1:20,26:14,60,26:11,-1:3,26:4,-1:6,26,-1:20,26:" +
"9,61,26:16,-1:3,26:4,-1:6,26,-1:20,26:2,62,26:23,-1:3,26:4,-1:6,26,-1:20,26" +
":2,63,26:23,-1:3,26:4,-1:6,26,-1:20,26:2,64,26:23,-1:3,26:4,-1:6,26,-1:20,2" +
"6:4,65,26:21,-1:3,26:4,-1:6,26,-1:20,26:10,66,26:15,-1:3,26:4,-1:6,26,-1:20" +
",26:16,67,26:9,-1:3,26:4,-1:6,26,-1:20,26:9,68,26:16,-1:3,26:4,-1:6,26,-1:2" +
"0,26:4,69,26:21,-1:3,26:4,-1:6,26,-1:20,26:2,70,26:23,-1:3,26:4,-1:6,26,-1:" +
"20,26:10,71,26:15,-1:3,26:4,-1:6,26,-1:20,26:9,72,26:16,-1:3,26:4,-1:6,131," +
"-1:20,131,89:2,131,92,131,89,131,89:18,-1:3,131,89,131:2,-1:6,26,-1:20,26,1" +
"35,26:8,90,26:15,-1:3,26:4,-1:6,131,-1:20,131,89:2,131,89,131,89,131,98,89:" +
"17,-1:3,131,89,131:2,-1:6,131,-1:20,131,89:2,131,89,131,95,131,89:18,-1:3,1" +
"31,89,131:2,-1:6,26,-1:20,26:10,93,26:9,163,26:5,-1:3,26:4,-1:6,131,-1:20,1" +
"31,89:2,131,126,131,89,131,89:18,-1:3,131,89,131:2,-1:6,26,-1:20,26:6,139,2" +
"6:3,96,26:15,-1:3,26:4,-1:6,26,-1:20,26:10,99,26:15,-1:3,26:4,-1:6,26,-1:20" +
",26:8,100,26,101,26:15,-1:3,26:4,-1:6,26,-1:20,26:19,102,26:6,-1:3,26:4,-1:" +
"6,26,-1:20,26:14,103,26:11,-1:3,26:4,-1:6,26,-1:20,26:8,104,26:17,-1:3,26:4" +
",-1:6,26,-1:20,26:9,105,26:16,-1:3,26:4,-1:6,26,-1:20,26:9,106,26:16,-1:3,2" +
"6:4,-1:6,26,-1:20,26:2,107,26:23,-1:3,26:4,-1:6,26,-1:20,26:20,108,26:5,-1:" +
"3,26:4,-1:6,26,-1:20,26:8,109,26:17,-1:3,26:4,-1:6,26,-1:20,26:14,110,26:11" +
",-1:3,26:4,-1:6,26,-1:20,26:6,111,26:19,-1:3,26:4,-1:6,26,-1:20,26:9,112,26" +
":16,-1:3,26:4,-1:6,26,-1:20,26:11,113,26:14,-1:3,26:4,-1:6,26,-1:20,26:11,1" +
"14,26:14,-1:3,26:4,-1:6,26,-1:20,26:11,115,26:14,-1:3,26:4,-1:6,26,-1:20,26" +
":11,116,26:14,-1:3,26:4,-1:6,26,-1:20,26:14,117,26:11,-1:3,26:4,-1:6,26,-1:" +
"20,26:4,118,26:21,-1:3,26:4,-1:6,26,-1:20,26:16,119,26:9,-1:3,26:4,-1:6,26," +
"-1:20,26:8,120,26:17,-1:3,26:4,-1:6,26,-1:20,26:11,121,26:14,-1:3,26:4,-1:6" +
",26,-1:20,26:15,122,26:10,-1:3,26:4,-1:6,26,-1:20,26:2,123,26:23,-1:3,26:4," +
"-1:6,26,-1:20,26:24,133,134,-1:3,26:4,-1:6,26,-1:20,26,191,26:21,136,26:2,-" +
"1:3,26:4,-1:6,26,-1:20,26:14,137,26:3,180,26:7,-1:3,26:4,-1:6,26,-1:20,26:6" +
",138,26:7,164,26:11,-1:3,26:4,-1:6,26,-1:20,26:8,193,26:2,140,26:14,-1:3,26" +
":4,-1:6,26,-1:20,26:6,141,26:19,-1:3,26:4,-1:6,26,-1:20,26:8,142,26:17,-1:3" +
",26:4,-1:6,26,-1:20,26:15,143,26:10,-1:3,26:4,-1:6,26,-1:20,26:6,144,26:19," +
"-1:3,26:4,-1:6,26,-1:20,26:10,145,26:15,-1:3,26:4,-1:6,26,-1:20,26:14,198,2" +
"6:5,146,26:5,-1:3,26:4,-1:6,26,-1:20,26:20,147,26:5,-1:3,26:4,-1:6,26,-1:20" +
",26,148,26:24,-1:3,26:4,-1:6,26,-1:20,26,149,26:24,-1:3,26:4,-1:6,26,-1:20," +
"26:10,150,26:15,-1:3,26:4,-1:6,26,-1:20,26:4,151,26:21,-1:3,26:4,-1:6,26,-1" +
":20,26:2,152,26:23,-1:3,26:4,-1:6,26,-1:20,26:20,153,26:5,-1:3,26:4,-1:6,26" +
",-1:20,26:6,154,26:19,-1:3,26:4,-1:6,26,-1:20,26:4,155,26:21,-1:3,26:4,-1:6" +
",26,-1:20,26:9,178,26:2,161,26:13,-1:3,26:4,-1:6,26,-1:20,26:24,162,26,-1:3" +
",26:4,-1:6,26,-1:20,26:9,165,26:16,-1:3,26:4,-1:6,26,-1:20,26:19,166,26:6,-" +
"1:3,26:4,-1:6,26,-1:20,26:2,184,26:16,167,26:6,-1:3,26:4,-1:6,26,-1:20,26:2" +
",168,26:23,-1:3,26:4,-1:6,26,-1:20,26:16,169,26:9,-1:3,26:4,-1:6,26,-1:20,2" +
"6:19,170,26:6,-1:3,26:4,-1:6,26,-1:20,26:10,171,26:15,-1:3,26:4,-1:6,26,-1:" +
"20,26:14,172,26:11,-1:3,26:4,-1:6,26,-1:20,26:19,173,26:6,-1:3,26:4,-1:6,26" +
",-1:20,26:17,174,26:8,-1:3,26:4,-1:6,26,-1:20,26:10,175,26:15,-1:3,26:4,-1:" +
"6,26,-1:20,26:10,181,26:15,-1:3,26:4,-1:6,26,-1:20,26:20,182,26:5,-1:3,26:4" +
",-1:6,26,-1:20,26:9,183,26:16,-1:3,26:4,-1:6,26,-1:20,26:8,185,26:17,-1:3,2" +
"6:4,-1:6,26,-1:20,26:21,186,26:4,-1:3,26:4,-1:6,26,-1:20,26:11,187,26:14,-1" +
":3,26:4,-1:6,26,-1:20,26:21,188,26:4,-1:3,26:4,-1:6,26,-1:20,26,192,26:24,-" +
"1:3,26:4,-1:6,26,-1:20,26:10,194,26:15,-1:3,26:4,-1:6,26,-1:20,26:10,195,26" +
":15,-1:3,26:4,-1:3");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {
				return null;
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						
					case -2:
						break;
					case 2:
						{ return new Symbol(sym._SYMB_0); }
					case -3:
						break;
					case 3:
						{ return new Symbol(sym._SYMB_1); }
					case -4:
						break;
					case 4:
						{ return new Symbol(sym._SYMB_2); }
					case -5:
						break;
					case 5:
						{ return new Symbol(sym._SYMB_3); }
					case -6:
						break;
					case 6:
						{ return new Symbol(sym._SYMB_4); }
					case -7:
						break;
					case 7:
						{ return new Symbol(sym._SYMB_5); }
					case -8:
						break;
					case 8:
						{ return new Symbol(sym._SYMB_6); }
					case -9:
						break;
					case 9:
						{ return new Symbol(sym._SYMB_7); }
					case -10:
						break;
					case 10:
						{ return new Symbol(sym._SYMB_8); }
					case -11:
						break;
					case 11:
						{ return new Symbol(sym._SYMB_9); }
					case -12:
						break;
					case 12:
						{ return new Symbol(sym._SYMB_10); }
					case -13:
						break;
					case 13:
						{ return new Symbol(sym._SYMB_11); }
					case -14:
						break;
					case 14:
						{ return new Symbol(sym._SYMB_12); }
					case -15:
						break;
					case 15:
						{ return new Symbol(sym._SYMB_14); }
					case -16:
						break;
					case 16:
						{ return new Symbol(sym._SYMB_15); }
					case -17:
						break;
					case 17:
						{ return new Symbol(sym._SYMB_29); }
					case -18:
						break;
					case 18:
						{ return new Symbol(sym._SYMB_22); }
					case -19:
						break;
					case 19:
						{ return new Symbol(sym._SYMB_23); }
					case -20:
						break;
					case 20:
						{ return new Symbol(sym._SYMB_24); }
					case -21:
						break;
					case 21:
						{ return new Symbol(sym._SYMB_25); }
					case -22:
						break;
					case 22:
						{ return new Symbol(sym._SYMB_26); }
					case -23:
						break;
					case 23:
						{ return new Symbol(sym._SYMB_27); }
					case -24:
						break;
					case 24:
						{ return new Symbol(sym._SYMB_28); }
					case -25:
						break;
					case 25:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -26:
						break;
					case 26:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -27:
						break;
					case 27:
						{ /* ignore white space. */ }
					case -28:
						break;
					case 28:
						{ return new Symbol(sym._INTEGER_, new Integer(yytext())); }
					case -29:
						break;
					case 29:
						{ yybegin(STRING); }
					case -30:
						break;
					case 30:
						{ return new Symbol(sym._SYMB_20); }
					case -31:
						break;
					case 31:
						{ return new Symbol(sym._SYMB_21); }
					case -32:
						break;
					case 32:
						{ return new Symbol(sym._SYMB_13); }
					case -33:
						break;
					case 33:
						{ return new Symbol(sym._SYMB_18); }
					case -34:
						break;
					case 34:
						{ return new Symbol(sym._SYMB_16); }
					case -35:
						break;
					case 35:
						{ return new Symbol(sym._SYMB_17); }
					case -36:
						break;
					case 36:
						{ return new Symbol(sym._SYMB_19); }
					case -37:
						break;
					case 37:
						{ yybegin(COMMENT); }
					case -38:
						break;
					case 38:
						{ return new Symbol(sym._SYMB_50); }
					case -39:
						break;
					case 39:
						{ return new Symbol(sym._SYMB_47); }
					case -40:
						break;
					case 40:
						{ /* BNFC single-line comment */ }
					case -41:
						break;
					case 41:
						{ return new Symbol(sym._SYMB_30); }
					case -42:
						break;
					case 42:
						{ return new Symbol(sym._SYMB_31); }
					case -43:
						break;
					case 43:
						{ return new Symbol(sym._SYMB_55); }
					case -44:
						break;
					case 44:
						{ return new Symbol(sym._SYMB_32); }
					case -45:
						break;
					case 45:
						{ return new Symbol(sym._SYMB_52); }
					case -46:
						break;
					case 46:
						{ return new Symbol(sym._SYMB_40); }
					case -47:
						break;
					case 47:
						{ return new Symbol(sym._SYMB_46); }
					case -48:
						break;
					case 48:
						{ return new Symbol(sym._SYMB_61); }
					case -49:
						break;
					case 49:
						{ return new Symbol(sym._SYMB_60); }
					case -50:
						break;
					case 50:
						{ return new Symbol(sym._SYMB_62); }
					case -51:
						break;
					case 51:
						{ return new Symbol(sym._SYMB_56); }
					case -52:
						break;
					case 52:
						{ return new Symbol(sym._SYMB_33); }
					case -53:
						break;
					case 53:
						{ return new Symbol(sym._SYMB_58); }
					case -54:
						break;
					case 54:
						{ return new Symbol(sym._SYMB_41); }
					case -55:
						break;
					case 55:
						{ return new Symbol(sym._SYMB_37); }
					case -56:
						break;
					case 56:
						{ return new Symbol(sym._SYMB_39); }
					case -57:
						break;
					case 57:
						{ return new Symbol(sym._SYMB_45); }
					case -58:
						break;
					case 58:
						{ return new Symbol(sym._SYMB_35); }
					case -59:
						break;
					case 59:
						{ return new Symbol(sym._SYMB_63); }
					case -60:
						break;
					case 60:
						{ return new Symbol(sym._SYMB_53); }
					case -61:
						break;
					case 61:
						{ return new Symbol(sym._SYMB_38); }
					case -62:
						break;
					case 62:
						{ return new Symbol(sym._SYMB_34); }
					case -63:
						break;
					case 63:
						{ return new Symbol(sym._SYMB_49); }
					case -64:
						break;
					case 64:
						{ return new Symbol(sym._SYMB_42); }
					case -65:
						break;
					case 65:
						{ return new Symbol(sym._SYMB_57); }
					case -66:
						break;
					case 66:
						{ return new Symbol(sym._SYMB_54); }
					case -67:
						break;
					case 67:
						{ return new Symbol(sym._SYMB_59); }
					case -68:
						break;
					case 68:
						{ return new Symbol(sym._SYMB_43); }
					case -69:
						break;
					case 69:
						{ return new Symbol(sym._SYMB_36); }
					case -70:
						break;
					case 70:
						{ return new Symbol(sym._SYMB_44); }
					case -71:
						break;
					case 71:
						{ return new Symbol(sym._SYMB_51); }
					case -72:
						break;
					case 72:
						{ return new Symbol(sym._SYMB_48); }
					case -73:
						break;
					case 73:
						{ }
					case -74:
						break;
					case 74:
						{ }
					case -75:
						break;
					case 75:
						{ yybegin(YYINITIAL); }
					case -76:
						break;
					case 76:
						{ pstring += yytext(); }
					case -77:
						break;
					case 77:
						{ String foo = pstring; pstring = new String(); yybegin(YYINITIAL); return new Symbol(sym._STRING_, foo.intern()); }
					case -78:
						break;
					case 78:
						{ yybegin(ESCAPED); }
					case -79:
						break;
					case 79:
						{ pstring += yytext(); yybegin(STRING); }
					case -80:
						break;
					case 80:
						{ pstring += "\t"; yybegin(STRING); }
					case -81:
						break;
					case 81:
						{ pstring +=  "\n"; yybegin(STRING); }
					case -82:
						break;
					case 82:
						{ pstring += "\""; yybegin(STRING); }
					case -83:
						break;
					case 83:
						{ pstring += "\\"; yybegin(STRING); }
					case -84:
						break;
					case 85:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -85:
						break;
					case 86:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -86:
						break;
					case 87:
						{ }
					case -87:
						break;
					case 89:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -88:
						break;
					case 90:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -89:
						break;
					case 92:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -90:
						break;
					case 93:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -91:
						break;
					case 95:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -92:
						break;
					case 96:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -93:
						break;
					case 98:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -94:
						break;
					case 99:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -95:
						break;
					case 100:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -96:
						break;
					case 101:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -97:
						break;
					case 102:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -98:
						break;
					case 103:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -99:
						break;
					case 104:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -100:
						break;
					case 105:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -101:
						break;
					case 106:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -102:
						break;
					case 107:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -103:
						break;
					case 108:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -104:
						break;
					case 109:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -105:
						break;
					case 110:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -106:
						break;
					case 111:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -107:
						break;
					case 112:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -108:
						break;
					case 113:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -109:
						break;
					case 114:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -110:
						break;
					case 115:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -111:
						break;
					case 116:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -112:
						break;
					case 117:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -113:
						break;
					case 118:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -114:
						break;
					case 119:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -115:
						break;
					case 120:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -116:
						break;
					case 121:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -117:
						break;
					case 122:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -118:
						break;
					case 123:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -119:
						break;
					case 124:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -120:
						break;
					case 125:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -121:
						break;
					case 126:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -122:
						break;
					case 127:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -123:
						break;
					case 128:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -124:
						break;
					case 129:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -125:
						break;
					case 130:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -126:
						break;
					case 131:
						{ return new Symbol(sym.TypeIdent, yytext().intern()); }
					case -127:
						break;
					case 132:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -128:
						break;
					case 133:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -129:
						break;
					case 134:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -130:
						break;
					case 135:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -131:
						break;
					case 136:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -132:
						break;
					case 137:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -133:
						break;
					case 138:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -134:
						break;
					case 139:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -135:
						break;
					case 140:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -136:
						break;
					case 141:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -137:
						break;
					case 142:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -138:
						break;
					case 143:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -139:
						break;
					case 144:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -140:
						break;
					case 145:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -141:
						break;
					case 146:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -142:
						break;
					case 147:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -143:
						break;
					case 148:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -144:
						break;
					case 149:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -145:
						break;
					case 150:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -146:
						break;
					case 151:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -147:
						break;
					case 152:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -148:
						break;
					case 153:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -149:
						break;
					case 154:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -150:
						break;
					case 155:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -151:
						break;
					case 156:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -152:
						break;
					case 157:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -153:
						break;
					case 158:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -154:
						break;
					case 159:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -155:
						break;
					case 160:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -156:
						break;
					case 161:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -157:
						break;
					case 162:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -158:
						break;
					case 163:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -159:
						break;
					case 164:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -160:
						break;
					case 165:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -161:
						break;
					case 166:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -162:
						break;
					case 167:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -163:
						break;
					case 168:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -164:
						break;
					case 169:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -165:
						break;
					case 170:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -166:
						break;
					case 171:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -167:
						break;
					case 172:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -168:
						break;
					case 173:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -169:
						break;
					case 174:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -170:
						break;
					case 175:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -171:
						break;
					case 176:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -172:
						break;
					case 177:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -173:
						break;
					case 178:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -174:
						break;
					case 179:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -175:
						break;
					case 180:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -176:
						break;
					case 181:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -177:
						break;
					case 182:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -178:
						break;
					case 183:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -179:
						break;
					case 184:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -180:
						break;
					case 185:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -181:
						break;
					case 186:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -182:
						break;
					case 187:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -183:
						break;
					case 188:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -184:
						break;
					case 189:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -185:
						break;
					case 190:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -186:
						break;
					case 191:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -187:
						break;
					case 192:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -188:
						break;
					case 193:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -189:
						break;
					case 194:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -190:
						break;
					case 195:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -191:
						break;
					case 196:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -192:
						break;
					case 197:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -193:
						break;
					case 198:
						{ return new Symbol(sym._IDENT_, yytext().intern()); }
					case -194:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}