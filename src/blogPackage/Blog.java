package blogPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Blog implements Commands {

    static Scanner scanner = new Scanner(System.in);

    static PostStorage postStorage = new PostStorageImpl();

    static void printCommands () {

        System.out.println("Please input 0 to EXIT the program");
        System.out.println("Please input 1 to ADD a post");
        System.out.println("Please input 2 to SEARCH a post");
        System.out.println("Please input 3 to PRINT a post by CATEGORY");
        System.out.println("Please input 4 to PRINT ALL POSTS");

    }

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun){
            printCommands();
            String command = scanner.nextLine();

            switch (command){

                case EXIT:
                    isRun = false;
                    break;
                case ADD_POST:
                    add();
                    break;
                case SEARCH_POST:
                    searchPostsByKeyword();
                    break;
                case POSTS_BY_CATEGORY:
                    printPostsByCategory();
                    break;
                case ALL_POSTS:
                    printAllPosts();
                    break;
                default:
                    System.out.println("Wrong command! Please check the correct one");
                    printCommands();
                    break;
            }
        }
    }

    public static void add() {
        System.out.println("Please assign post category");
        String category = scanner.nextLine();
        System.out.println("Please set post title");
        String title = scanner.nextLine();
        System.out.println("Please input post text");
        String text = scanner.nextLine();
        DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String dateTime = LocalDateTime.now().format(mediumDate);
        Post post = new Post(title, text, category, dateTime);
        postStorage.add(post);
        System.out.println("Your post was created on " + dateTime + ", and was added successfully!");
    }

    public static void searchPostsByKeyword() {

        System.out.println("Please input keyword to search a post");
        try {
            String keyword = scanner.nextLine();
            postStorage.searchPostsByKeyword(keyword);
        } catch (MyExceptionList_2 e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printPostsByCategory() {

        System.out.println("Please input post category");
        try {
            String category = scanner.nextLine();
            postStorage.printPostsByCategory(category);
        } catch (MyExceptionsList_1 e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printAllPosts(){

        System.out.println("Here is the list of all posts");
        postStorage.printAllPosts();

    }
}