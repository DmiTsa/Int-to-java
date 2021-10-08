package d_programmingWithClasses.a_simpleClassesAndObjects.Task4n;

import java.time.LocalTime;

public class Main {
    //Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    //Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
    //номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    //Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
    //назначения должны быть упорядочены по времени отправления.

    // TODO добавьте возможность сортировки элементов массива по номерам поездов.
    // TODO Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    // TODO Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
    public static void main(String[] args) {

        Train[] allTrains = new Train[5];
        allTrains[0] = new Train("Полоцк", 4578, LocalTime.of(16, 30));
        allTrains[1] = new Train("Витебск", 4400, LocalTime.of(15, 0));
        allTrains[2] = new Train("Полоцк", 3078, LocalTime.of(16, 0));
        allTrains[3] = new Train("Минск", 5500, LocalTime.of(15, 0));
        allTrains[4] = new Train("Минск", 4008, LocalTime.of(14, 55));

    }

    public static void sortedByTrainNumber(Train[] a) {
        boolean sorted = false;
        Train temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].getTrainNumber() > a[i + 1].getTrainNumber()) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}

