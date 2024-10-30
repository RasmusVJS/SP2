public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        return durationInMinutes * copies * calculateLiteraturePoints();
    }

    @Override
    public double calculateLiteraturePoints() {
        if (getLiteratureType().equals("LYRIK"))
            return 3;
        else if (getLiteratureType().equals("BI"))
            return 1.5;
        else if (getLiteratureType().equals("TE"))
            return 1.5;
        else if (getLiteratureType().equals("SKØN"))
            return 0.85;
        else
            return 0.5;
    }
}
