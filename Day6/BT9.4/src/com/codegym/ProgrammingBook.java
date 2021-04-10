package com.codegym;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {

    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return this.framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", language='" + this.language   + '\''+
                ", framework='" + this.framework + '\'';
    }
}
