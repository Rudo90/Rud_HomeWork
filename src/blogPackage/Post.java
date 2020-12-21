package blogPackage;

public class Post {

    private String title;
    private String text;
    private String category;
    private String dateTime;


    public Post (String title, String text, String category, String dateTime){

        this.title = title;
        this.text = text;
        this.category = category;
        this.dateTime = dateTime;
    }


    public Post(){

    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }


    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", createdDate=" + dateTime +
                '}';
    }
}
