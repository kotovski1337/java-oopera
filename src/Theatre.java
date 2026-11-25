import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // Три актёра, два режиссёра, автор музыки, хореограф
        Actor a1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor a2 = new Actor("Анна", "Сидорова", Gender.FEMALE, 168);
        Actor a3 = new Actor("Олег", "Кузнецов", Gender.MALE, 175);
        Director d1 = new Director("Мария", "Орлова", Gender.FEMALE, 12);
        Director d2 = new Director("Сергей", "Волков", Gender.MALE, 7);
        String composer = "Джузеппе Верди";
        String choreographer = "Мариус Петипа";

        // Три спектакля: обычный, опера, балет
        Show play = new Show("Ревизор", 150, d1, new ArrayList<>());
        Opera opera = new Opera("Травиата", 170, d2, new ArrayList<>(),
                composer, "Либретто оперы «Травиата»: история Виолетты и Альфреда...", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 140, d1, new ArrayList<>(),
                "Пётр Чайковский",
                "Либретто балета «Лебединое озеро»: история принца Зигфрида...",
                choreographer);

        // Распределение актёров (a1 и a3 играют в нескольких спектаклях)
        play.addActor(a1);
        play.addActor(a2);
        play.addActor(a1); // проверка работы с дублями
        opera.addActor(a2);
        opera.addActor(a3);
        ballet.addActor(a1);
        ballet.addActor(a3);

        // Список актёров каждого спектакля
        play.printActors();
        opera.printActors();
        ballet.printActors();

        // Замена на актёра из другого спектакля и повторный вывод
        opera.replaceActor(a1, "Кузнецов");
        opera.printActors();

        // Замена несуществующего актёра
        ballet.replaceActor(a2, "Иванов");

        // Либретто оперы и балета
        opera.printLibretto();
        ballet.printLibretto();

        // Информация о режиссёре
        play.printDirector();
    }
}