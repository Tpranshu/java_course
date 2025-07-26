public class program17 {

    static int sum(int...arr){
        int add = 0;
       for (int a : arr) {
         add = add + a;
       }
       return add;
    }

    // atleat one integer is required else they show an error --
    // static int sum(int x,int...arr){ 
    //     int add = x;
    //    for (int a : arr) {
    //      add = add + a;
    //    }
    //    return add;
    // }

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println(sum());
        System.out.println(sum(2));
        System.out.println(sum(2,4));
        System.out.println(sum(2,4,6,8));


        // System.out.println(sum());
        // System.out.println(sum(1));

    }
}
