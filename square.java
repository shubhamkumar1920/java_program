public class square
{
public static void main(String [] args)
{
class Number
{
int Number;
public boolean issquare(){
double squareroot=Math.sqrt(Number);
if(squareroot==Math.floor(squareroot))
{
return true;
}else{
return false;
}
}
public boolean istriangular(){
int x=1;
int triangularNumber=1;
while(triangularNumber<Number)
{
x++;

triangularNumber = triangularNumber+x;
}
if(triangularNumber == Number)
{
return true;
}else{
return false;
}
}
}
Number myNumber=new Number();
myNumber.Number=49;
System.out.println(myNumber.issquare());
}
}