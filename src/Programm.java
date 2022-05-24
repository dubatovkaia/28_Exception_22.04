public class Programm {
    public static void main(String[] args) {
        try {
            test(null);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.details);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Integer test(Integer i) throws MyException, NullPointerException {
        if (i == null) {
            throw new NullPointerException(" Аргумент не может быть равен null! ");
        } else if (i < 10) {
            throw new MyException("Аргумент не может быть меньше 10", "Значение = " + i);
        }
        return i / 2;
    }
}
