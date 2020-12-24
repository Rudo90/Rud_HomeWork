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
    public Post getPostByTitle(String title) throws PostNotFoundException {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getTitle().contains(title)) {
                return postStorage[i];
            }
        }
        throw new PostNotFoundException("No post available!");
    }

    @Override
    public Post searchPostsByKeyword(String keyword) throws MyExceptionList_2 {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getTitle().contains(keyword) || postStorage[i].getText().contains(keyword)) {
                return postStorage[i];
            }
        }
        throw new MyExceptionList_2("Wrong keyword!");
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
    public Post printPostsByCategory(String category) throws MyExceptionsList_1 {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getCategory().contains(category)) {
                return postStorage[i];
            }
        }
        throw new MyExceptionsList_1("No post category is available!");
    }
}