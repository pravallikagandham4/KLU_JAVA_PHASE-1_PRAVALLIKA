import java.util.*;
class Main{

static int fun(int n)
{
    if(n>100)
    return (n-10);
    return fun(fun(n+11));
}
public static void main(){
    int ans = fun(98);
    System.out.print(ans);
}}