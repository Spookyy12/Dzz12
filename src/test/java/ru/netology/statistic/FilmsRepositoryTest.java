package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsRepositoryTest {
    Films film1 =new Films(1,"Бладшот","Боевик");
    Films film2 =new Films(1,"Вперед","Мультфильм");
    Films film3 =new Films(1,"Отель Белград","Комедия");
    Films film4 =new Films(1,"Джентельмены","Боевик");
    Films film5 =new Films(1,"Человек Неведимка","Ужасы");
    Films film6 =new Films(1,"Троли.Мировой тур","Мультфильм");
    Films film7 =new Films(1,"Номер один","Комедия");



    @Test
    public void test(){
        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        Films[] ex = {film1,film2,film3,film4,film5,film6,film7};
        Films[] ac = repo.getItems();
        Assertions.assertArrayEquals(ex,ac);
    }
}
