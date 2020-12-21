package blogPackage;

public interface PostStorage {

    void add (Post post);
    Post getPostByTitle (String title);
    void searchPostsByKeyword (String keyword) throws MyExceptionList_2;
    void printAllPosts ();
    void printPostsByCategory (String category) throws MyExceptionsList_1;


}
