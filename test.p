program try_it;
const g= 0B1011;
type gar= 1..g;
     ar= array[gar] of integer;
     re= record
           x1,x2:integer { no comment
at all! }
         end;
     ss= set of char;
     day = (monday,tuesday,friday);
var x: ar; z,w: real; r: re; s: ss; t: enum; c: char;
procedure all(n:integer; var x: real);
   function _try_me(i,j:integer): real;
   const omega='W'; seira = -g*.314159E1;
   begin
   if (i+j > omega) then _try_me :=0.0
   else
      if (i > omega) then _try_me :=-1.0
      else _try_me := 1.0
   end;
