package ru.netology.services;

public class VacationService {
    public int calculateVacations(int income, int expenses, int threshold) {
        int money = 0; //количество денег
        int count = 0; // счётчик месяцев отдыха
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // отдыхаем
                money = (money - expenses)/3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else { // работаем
                money = money - expenses + income;
            }
        }
        return count;
    }
}