import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля «" + title + "»: " + director);
    }

    public void printActors() {
        System.out.println("Актёры спектакля «" + title + "»:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Предупреждение: актёр " + newActor
                    + " уже участвует в спектакле «" + title + "»");
            return;
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Предупреждение: актёр с фамилией " + surname
                + " не найден в спектакле «" + title + "»");
    }
}