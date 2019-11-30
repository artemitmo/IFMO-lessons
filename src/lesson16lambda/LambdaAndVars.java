package lesson16lambda;

public class LambdaAndVars {
    static int a = 12;
    static int b = 22;
    public static void main(String[] args) {
        int n = 10, m = 20;
        Message1 mes = new Message1();
        SomeInterface someInterface = () ->{ //принимать в качестве аргументов m, n мы не можем
            mes.setSm("15");
         //   a = 12;
          //  n = 100; нельзя изменить
         //   return a + b;
            return a + m;
        };
        System.out.println(someInterface.doSomething());
        System.out.println(mes.getSm());
    }
}

interface SomeInterface{
    int doSomething();
}

class Message1{
    private String sm = "Secret";

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }
}
