public class Books {
    String title ;
    String auteur ;
    String isbn;
    boolean dispo;

    public Books(String title, String auteur, String isbn, boolean dispo) {
        this.title = title;
        this.auteur = auteur;
        this.isbn = isbn;
        this.dispo = dispo;
    }

    public Books() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                ", dispo=" + dispo +
                '}';
    }
}

