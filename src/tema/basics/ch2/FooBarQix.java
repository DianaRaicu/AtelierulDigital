package tema.basics.ch2;

public class FooBarQix {
    static String compute(int n){

        String three = "Foo";
        String five = "Bar";
        String seven ="Qix";
        String out="none";

        if(n%3==0){
            out = three;

        }
        if(n%5==0){
            if(out.equals( "none")) {
                out = five;
            }else{
                out = out + five;
            }

        }
        if(n%7==0){
            if(out.equals( "none")) {
                out = seven;
            }else{
                out = out + seven;
            }

        }

        int m=0;

        while(n!=0){
            m=m*10+n%10;
            n=n/10;
        }

        n=m;

        while (n!=0){
            if(n%10==3){
                if(out.equals( "none")) {
                    out = three;
                }else{
                    out = out + three;
                }

            }
            if(n%10==5){
                if(out.equals( "none")) {
                    out = five;
                }else{
                    out = out + five;
                }

            }
            if(n%10==7){
                if(out.equals( "none")) {
                    out = seven;
                }else{
                    out = out + seven;
                }

            }
            n=n/10;
        }

        return out;
    }

    static String compute2(int n){
        int nr=0;
        String three = "Foo";
        String five = "Bar";
        String seven ="Qix";
        String out="none";

        if(n%3==0){
            out = three;
            nr++;
        }
        if(n%5==0){
            if(out.equals( "none")) {
                out = five;
            }else{
                out = out + five;
            }
            nr++;
        }
        if(n%7==0){
            if(out.equals( "none")) {
                out = seven;
            }else{
                out = out + seven;
            }
            nr++;
        }

        int m=0;

        while(n!=0){
            m=m*10+n%10;
            n=n/10;
        }

        n=m;

        while (n!=0){
            if(n%10==3){
                if(out.equals( "none")) {
                    out = three;
                }else{
                    out = out + three;
                }
                nr++;
            }
            if(n%10==5){
                if(out.equals( "none")) {
                    out = five;
                }else{
                    out = out + five;
                }
                nr++;
            }
            if(n%10==7){
                if(out.equals( "none")) {
                    out = seven;
                }else{
                    out = out + seven;
                }
                nr++;
            }
            if(n%10==0){

                out = out + "*";

            }

            n=n/10;
        }

        if(nr==0){
            out = Integer.toString(m);
            out = out.replace("0","*");
        }

        return out;
    }

    public static void main(String[] args) {
        String cuv;

        if(compute(53).equals( "none")){
            System.out.println("53");
        }else{
            System.out.println(compute(53));
        }

        if(compute2(1).equals( "none")){
            System.out.println("1");
        }else{
            System.out.println(compute2(1));
        }

        if(compute2(10101).equals( "none")){
            System.out.println("105");
        }else{
            System.out.println(compute2(10101));
        }

    }
}
