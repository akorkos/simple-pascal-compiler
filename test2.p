program exFunction;
const 
   PI=3.14;
   random_number=12312;
var
   a, b, ret : integer;

{function definition }
function max(num1, num2: integer): integer;
var
   { local variable declaration }
   result: integer;

begin
   if (num1 > num2) then
      result := num1
   
   else
      result := num2;

   max := result;
end;

begin
   a := 100;
   b := 200;
   ret := max(a, b);
   
   write(  ret );
end.