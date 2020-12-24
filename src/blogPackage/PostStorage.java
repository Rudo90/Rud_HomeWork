package blogPackage;

public interface PostStorage {

    void add (Post post);
    Post getPostByTitle (String title) throws PostNotFoundException;
    Post searchPostsByKeyword (String keyword) throws MyExceptionList_2;
    void printAllPosts ();
    Post printPostsByCategory (String category) throws MyExceptionsList_1;
}
