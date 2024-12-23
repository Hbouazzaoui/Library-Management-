public class Books {
    private String title;
    private String auteur;
    private String isbn; // ISBN is used as the unique identifier.
    private boolean dispo;

    // Default constructor
    public Books() {
        this.title = "";
        this.auteur = "";
        this.isbn = "";
        this.dispo = false;
    }

    // Parameterized constructor
    public Books(String title, String auteur, String isbn, boolean dispo) {
        this.title = title;
        this.auteur = auteur;
        this.isbn = isbn;
        this.dispo = dispo;
    }

    // Getters and Setters
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
                "ISBN='" + isbn + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + auteur + '\'' +
                ", Available=" + dispo +
                '}';
    }
}
