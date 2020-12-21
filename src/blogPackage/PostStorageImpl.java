package blogPackage;

public class PostStorageImpl implements PostStorage {

    private Post[] postStorage = new Post[10];
    private int size = 0;


    private void extend() {

        Post[] postTemp = new Post[postStorage.length + 10];
        System.arraycopy(postStorage, 0, postTemp, 0, postStorage.length);
        postStorage = postTemp;
    }

    public void add(Post post) {

        if (size == postStorage.length) {
            extend();
        }
        postStorage[size] = post;
        size++;
    }

    @Override
    public Post getPostByTitle(String title) {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getTitle().contains(title)) {
                return postStorage[i];
            }
        }
        return null;
    }

    @Override
    public void searchPostsByKeyword(String keyword) throws MyExceptionList_2 {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getTitle().contains(keyword) || postStorage[i].getText().contains(keyword)) {
                System.out.println(postStorage[i]);
            } else
            throw new MyExceptionList_2("wrong keyword!");
        }
    }

    @Override
    public void printAllPosts() {

        for (int i = 0; i < size; i++) {
            if (postStorage[i] != null) {
                System.out.println(postStorage[i]);
            }
        }
    }

    @Override
    public void printPostsByCategory(String category) throws MyExceptionsList_1 {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getCategory().equals(category)) {
                System.out.println(postStorage[i]);
            } else
         throw new MyExceptionsList_1("No post category was founded!");
        }
    }
}