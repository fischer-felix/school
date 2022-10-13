public class holz implements verheizbar {

    private String art;
    private int brenndauer;
    private boolean hartholz;

    public holz (String art, int brenndauer, boolean hartholz) {
        this.art = art;
        this.brenndauer = brenndauer;
        this.hartholz = hartholz;
    }

    public void printstats() {
        System.out.println(art + "burns for" + brenndauer + "minutes");
    }

    public int verbrennen() {
        return brenndauer;
    }

}