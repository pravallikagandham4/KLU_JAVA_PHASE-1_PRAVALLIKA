import java.util.*;
public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int len = arr.length;
        System.out.println(len+"\n");
        int a = s.length();
        char b = s.charAt(0);
        String c = s.substring(1);
        String d = s.toLowerCase();
        String e = s.toUpperCase();
        System.out.println(s);
        String f = s.trim();
        System.out.println("Sandeep".equalsIgnoreCase(c));
        System.out.println("Sandeep".equals(s));
        System.out.println("Sandeep".contains(s));
        s.replace('a', 'c');
        char[] g = f.toCharArray();
        int len2 = g.length;
        int count = 0;
        for(char y:s.toCharArray()){
            count++;
        }
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+"\n"+f+" "+len2+"\n"+count);
        int c2 =1;
        String c3 = sc.nextLine();
        for(char y:c3.toCharArray()){
            if(y==' '){
                c2++;
            }
        }
        System.out.println(c2);
        String c4 = "";
        for(int i = count-1;i>=0;i--){
            c4=c4+s.charAt(i);
        }
        System.out.println(c4);
        int c5 =0;
        for(char y:c4.toCharArray()){
            if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'){
                c5++;
            }
            y = (char)(y-32);
            System.out.print(y);
        }
        System.out.println(c5);
        int c6=0;
        for(char x: s.toCharArray()){
            if(!((x>='A'&&x<='Z')||(x>='a'&&x<='z')||(x>='0'&&x<='9'))){
                c6++;
            }
            if(x>='A'&&x<='Z'){
                x=(char)(x+32);
            }else{
                x=(char)(x-32);
            }
            System.out.print(x);
        }
        System.out.println(c6);

    }
}
