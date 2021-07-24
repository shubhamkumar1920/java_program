public class ram
{
public static void main(String[] args)
{
class user{
int score;
public boolean haswon()
{
if(score>=200){
return true;
}else{
return false;
}
}
}
user bob=new user();
bob.score=200;
System.out.println(bob.haswon());
}
}
