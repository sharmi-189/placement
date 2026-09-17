class smallest3num{
    public void main(String args[]){
        int a = 30, b = 20, c = 10;

        if(a<=b && a<=c)
           System.out.println(a);
        else if(b<=a && b<=c)
           System.out.println(b);
        else
           System.out.println(c);
    }
}