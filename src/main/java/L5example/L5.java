package L5example;

public class L5 {
    public static void main(String[] args) {
        String filePath1="C:\\Users\\tl\\IdeaProjects\\firstAppEn1\\src\\main\\resources\\test.txt";

        String content1= FileUtils.readFromFile(filePath1);

        System.out.println("content of a file: "+content1);


        String content2= FileUtils.readFromFile("C:\\Users\\tl\\IdeaProjects\\firstAppEn1\\src\\main\\resources\\test.abs");

        System.out.println("content of a file: "+content2);

        FileUtils.writeToFile("src\\main\\resources\\writeFile.txt","Java Exceptions");

        FileUtils.writeToFile("src\\main\\resources\\writeFile_copy.txt","Java Exceptions");
    }
}
