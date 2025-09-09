interface A{
    void max(int a,int b);

}

interface B{
    void max_1(int a,int b,int c);

}

interface C extends A{
    void square(int a);

}
class X implements B{
        public void max_1(int a,int b,int c){
                   if(a>b && a>c){
                               System.out.println("max number is  "+a);

                   }
                   else if(b>a && b>c){
                          System.out.println("max number is  "+b);
                   }
                   else{
                          System.out.println("max number is  "+c);
                   }

        }
}
class Y implements C{
    public void square(int a){
           System.out.println("square is  "+a*a);
    }
     public void max(int a,int b){
         if(a>b){
                               System.out.println("max number is  "+a);

                   }
                   else{
                          System.out.println("max number is  "+b);
                   }
     }
}

class program52 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        X x1 = new X();
        Y y1 = new Y();
       y1.max(12,25);
       y1.square(2);
       x1.max_1(12,25,200);
    }
}