package L5example;


public class main {

    public static void main(String[] args) throws MyException {

//        String content = Files.readString(Path.of("filePath"));
//
//        String content = null;
//        content = getContent();
//        System.out.println(content.length());
//    }
//
//    private static String getContent() {
//        return null;
//
//    }

        int number = 5;
        try {
            System.out.println(5 / getNumber());

        } catch (ArithmeticException e) {
            System.out.println("exception division by zero :(");
            throw new MyException();
        }

    }
//        }finally {
//            System.out.println("I will be printed out anyway!");
//        }


    private static int getNumber() {
        return 0;
    }
}

