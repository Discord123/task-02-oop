package entity.appliance;

public class Newspaper extends Appliance {

    private String title;
    private String periodicity;
    private String paidOrFree;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getPaidOrFree() {
        return paidOrFree;
    }

    public void setPaidOrFree(String paidOrFree) {
        this.paidOrFree = paidOrFree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Newspaper newspaper = (Newspaper) o;

        if (title != null ? !title.equals(newspaper.title) : newspaper.title != null) return false;
        if (periodicity != null ? !periodicity.equals(newspaper.periodicity) : newspaper.periodicity != null)
            return false;
        return paidOrFree != null ? paidOrFree.equals(newspaper.paidOrFree) : newspaper.paidOrFree == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (periodicity != null ? periodicity.hashCode() : 0);
        result = 31 * result + (paidOrFree != null ? paidOrFree.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "title='" + title + '\'' +
                ", periodicity='" + periodicity + '\'' +
                ", paidOrFree='" + paidOrFree + '\'' +
                '}';
    }
}
