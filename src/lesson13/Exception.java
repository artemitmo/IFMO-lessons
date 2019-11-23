package lesson13;

public class Exception extends Throwable { //
    public Exception(String s) {
    }

    public static void main(String[] args) throws CheckedException {
        //когда происходят исключения во время выполнения (runtime) неотслеживаемые или необрабатываемые
        //ошибки, возникающие во время компиляции
        int a = 9;
        int b = 0;
        /*System.out.println(a/b);
        ошибка во время выполнения*/
        int[] arr = new int[3];
        //arr[10] = 44; ArrayIndexOutOfBoundsException ошибка возникает после создание массива и обращение к несуществующему элементу

        String string = null; //Exception in thread "main" java.lang.NullPointerException
        //string.equals("str");

        //Integer.parseInt("string"); //строку переводит в инт (примитив)
        //ошибка времени выполнения, нельзя такую строку

       /* Object someData = "123";
        //Integer someInt = (Integer) someData; ClassCastException (ошибка кастования)

        //try  catch - блок кода, который может породить exception, мы заворачиваем в блок try
       try {
           Integer someInt = (Integer) someData;
           System.out.println("код после ClassCastException");
       } catch (ClassCastException e){ //отлавливаем в объект e, описание ошибки
           System.out.println("catch ClassCastException");
           e.printStackTrace(); //выводит на экран описание исключения
       }
        System.out.println("код после try catch");*/

       //объединение блоков
        /*try {

        }catch (ClassCastException| ArithmeticExceptionr){
            e.PrintStackTrace();
                   //можно указывать много различных исключений
        }*/
        //try{}
        //catch (RuntimeException e) )

       /* try {
            Integer someInt = (Integer)someData;
            string.equals("ioio");
        } catch (ClassCastException | ArithmeticException e) {
            System.out.println("ClassCastException");
        }
          catch (RuntimeException e){
              System.out.println("RuntimeException");
          }
        finally {
            //блок файнали используем для высвобождения ресурсов
            //выводится в любом случае, в случае с любым исключением
            //
        }*/

        Message message = null;
        try {
            message = new Message("Тема", "Текст");
        } catch (Exception e) {
            e.printStackTrace();
            try{throw new CheckedException("CheckedException");}
            catch (CheckedException e1){
                e1.printStackTrace();
                System.out.println("cause " + e1.getCause());
            }
        }
        System.out.println(message.getText());
        //CheckedException (Exception)
        //UncheckedException (RuntimeException) можно не обрабатывать

    }
}