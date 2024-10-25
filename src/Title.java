public abstract class Title {
    private String title;
    private String literatureType;
    private int copies;
    private double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalties(){
        return calculatePoints() * rate;
    }

    public abstract double calculatePoints();

    public abstract double calculateLiteraturePoints();

    public String getLiteratureType() {
        return literatureType;
    }

    public int getCopies() {
        return copies;
    }
}
