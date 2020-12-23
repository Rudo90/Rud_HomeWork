package blogPackage;

public interface PostStorage {

    void add (Post post);
    Post getPostByTitle (String title) throws PostNotFoundException;
    void searchPostsByKeyword (String keyword);
    void printAllPosts ();
    void printPostsByCategory (String category);
    void printCategoryNotExist (String category) throws MyExceptionsList_1;
    void keyWordIsWrong (String keyword) throws MyExceptionList_2;

}
