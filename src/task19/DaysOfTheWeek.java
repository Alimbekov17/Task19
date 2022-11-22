package task19;


public enum DaysOfTheWeek {
    SUNDAY("Jekshembi kunu es alam"),
    MONDAY("Duishombu kunu Java okuim"),
    TUESDAY("Sheishembi kunu Anglis tili okuim"),
    WEDNESDAY("Sharshembi kunu Soft skills okuim"),
    THURSDAY("Beishembi kunu Java praktika kylam"),
    FRIDAY("Juma kunu Java okuim"),
    SATURDAY("Ishembi kunu futbol oinoim");

    private String toDo;

    DaysOfTheWeek(String toDo) {
        this.toDo = toDo;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + toDo;
    }
}
