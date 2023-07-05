package ru.netology.statistic;

public class FilmsRepository {
    private Films[] items = new Films[0];
    public void save(Films item) {
        Films[] tmp = new Films[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];

        }
        tmp[tmp.length - 1] = item;
    }
    public void removeBuyId(int id){

    }

    public Films[] getItems(){
        return items;
    }


}
