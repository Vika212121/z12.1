public class Manager {
    protected String[] films = new String[0];
    protected int limit;

    public Manager() {
        this.limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[films.length] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength = Math.min(films.length, limit);

        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
