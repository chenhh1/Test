package a;

public class Test {
    public static void main(String[] args) {
         one();
        //two();
    }

    private static void two() {
        String fizz = "fizz";
        String buzz = "buzz";
        for(int i=1;i <= 100;i++){
            String result = "";
            if(i % 3 == 0 || ("" + i).contains("3")){
                result = fizz;
            }
            if(i % 5 == 0 || ("" + i).contains("5")){
                result = result + buzz;
            }
            if(result.equals("")){
                result = "" + i;
            }
            System.out.println(i + ":" + result);
        }
    }

    public static void one(){
        String fizz = "Fizz";
        String buzz = "Buzz";
        for(int i = 1;i <= 100;i++){
            String result = "";
            if(i%3 == 0){
                result = fizz;
            }
            if(i%5 == 0){
                result = result + buzz;
            }
            if(result.equals("")){
                result = "" + i;
            }
            System.out.println("" + result);
        }
    }
}
