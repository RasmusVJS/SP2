public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        return pages * getCopies() * calculateLiteraturePoints();
    }

    @Override
    public double calculateLiteraturePoints() {
        if (getLiteratureType().equals("LYRIK"))
            return 6;
        else if (getLiteratureType().equals("BI"))
            return 3;
        else if (getLiteratureType().equals("TE"))
            return 3;
        else if (getLiteratureType().equals("SKØN"))
            return 1.7;
        else
            return 1;
    }
}
