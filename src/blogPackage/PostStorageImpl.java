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
                System.out.println(postStorage[i]);
            } else throw new PostNotFoundException("No post available!");
        }
        return null;
    }

    @Override
    public void searchPostsByKeyword(String keyword) {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getTitle().equals(keyword) || postStorage[i].getText().equals(keyword)) {
                System.out.println(postStorage[i]);
            }
        }
    }

    public void keyWordIsWrong (String keyword) throws MyExceptionList_2 {
        for (int i = 0; i < size; i++) {
            if (!postStorage[i].getTitle().equals(keyword) && !postStorage[i].getText().equals(keyword)) {
                throw new MyExceptionList_2("Wrong keyword!");
            }
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
    public void printPostsByCategory(String category) {

        for (int i = 0; i < size; i++) {
            if (postStorage[i].getCategory().equals(category)) {
                System.out.println(postStorage[i]);
            }
        }
    }

    public void printCategoryNotExist (String category) throws MyExceptionsList_1 {

        for (int i = 0; i < size; i++) {
            if (!postStorage[i].getCategory().equals(category)) {
                throw new MyExceptionsList_1("No category is available!");
            }
        }
    }

}