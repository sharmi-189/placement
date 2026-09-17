class largest3num {
    public static void main(String[] args) {
        int a = 25,  b = 35,  c = 55;
        
        if( a >= b && a >= c)
           System.out.println(a);
        else if( b >= a && b >= c)
           System.out.println(b);
        else
           System.out.println(c);
    }
}