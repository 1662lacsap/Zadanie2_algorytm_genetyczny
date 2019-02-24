grammar Jobs;
@header {
import java.util.LinkedList;
import java.util.HashSet;
}

@members {
int jobCount = 0;
int counter = 0;

int[][] times;
}

run: n = size{
 jobCount = $n.value;
 if(jobCount>1000 || jobCount<1){
       throw new NumberFormatException("Range 1<=n<=1000");
  }
   times = new int[jobCount+1][jobCount+1];
} ignore values+ ';' end
;

size returns [int value]:
PARAM EQUALS INT {$value = Integer.parseInt($INT.text);}';'
;

ignore:
PARAM ':' INT+ EQUALS
;


values:
INT forEachValues;

forEachValues:{
for(int i = 0; i < jobCount+1;i++){
times[counter][i] = getINT().value;
}
counter++;
};

getINT returns [int value]:
INT {$value = Integer.parseInt($INT.text);}
;

end:
'end;';

EQUALS :' :=';

PARAM : ('param ' 'a'..'z');


INT : '0'..'9'+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' ) -> channel(HIDDEN) ;