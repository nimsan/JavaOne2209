package homework_5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class UserHomeApp {
    public static void main(String[] args) {
        UserHome userHome = new UserHome("Ivanov Ivan Ivanovich", "engeener", "ivaII@mail.ru", 89775220877l, -11, 55.450);
        UserHome userHome1 = new UserHome("Petrov Petr Petrovich", "driver", "ppp@mail.ru", 84953622354l, 55, 14.50);
        userHome.info();
        userHome1.info();

        System.out.println();

        UserHome[] persArray = new UserHome[5];
        persArray[0] = new UserHome("Иванков Петрушка Петрович", "Диванный экcперт", "ember@profi.com", 8997123151l, 15, 0);
        persArray[1] = new UserHome("Пупкин Владимир Владимирович", "Прораб", "abra@baba.com", 84955215211l, 55, 55.45);
        persArray[2] = new UserHome("Макконахи Метью Макдакович", "Костолом", "mamba@moop.com", 87778788542l, 38, 42.88);
        persArray[3] = new UserHome("Простоквашин Иркадий Дировин", "Воин", "sdase@asroy.com", 89889547775l, 25, 30.50);
        persArray[4] = new UserHome("Сидоров Иван Тимофеев", "Разносчик", "facys@gan.com", 88886664487l, 41, 80.00);
        for (int i = 0; i < persArray.length; i++) {

            System.out.println(i + ") " + (persArray[i]));


        }
    }
}
