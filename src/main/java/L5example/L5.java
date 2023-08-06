package L5example;

public class L5 {
    public static void main(String[] args) {
        String filePath1="C:\\Users\\tl\\IdeaProjects\\firstAppEn1\\src\\main\\resources\\test.txt";

        String content1= FileUtils.readFileFromPath(filePath1);

        System.out.println("content of a file: "+content1);


        String content2= FileUtils.readFileFromPath("C:\\Users\\tl\\IdeaProjects\\firstAppEn1\\src\\main\\resources\\test.abs");

        System.out.println("content of a file: "+content2);
    }
}
