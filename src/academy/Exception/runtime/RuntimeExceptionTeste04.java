package academy.Exception.runtime;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");

        }
    }
}
