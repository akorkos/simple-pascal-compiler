program ifelseChecking;
const 
   PI = 3.14;
   number = PI;
var
   { local variable definition }
   a : integer;

begin
   a := 100;
   { check the boolean condition }
   if( a < 20 ) then
      { if condition is true then print the following }
      write("a is less than 20" )
   
   else
      { if condition is false then print the following } 
      begin
      write("a is not less than 20" );
      write("value of a is : ", a);
      end
end.