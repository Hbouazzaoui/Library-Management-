public class Books {
    private int id;
    private String title;
    private String auteur;
    private String isbn;
    private boolean dispo;

    public Books() {
    }

    public Books(int id, String title, String auteur, String isbn, boolean dispo) {
        this.id = id;
        this.title = title;
        this.auteur = auteur;
        this.isbn = isbn;
        this.dispo = dispo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    @Override
    public String toString() {
        return "Books {" +
                "ID=" + id +
                ", Title='" + title + '\'' +
                ", Author='" + auteur + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Available=" + dispo +
                '}';
    }
}
