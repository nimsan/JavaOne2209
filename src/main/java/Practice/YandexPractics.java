package Practice;

public class YandexPractics {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){// В тренировке должно выполниться 5 кругов
            System.out.println("Круг " + i);

            if (i%2 == 0){
                for (int j=1; j<=5; j++){// Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
                    // Если да, то присесть 5 раз
                    System.out.println("  Приседаем " + j);}}

            else {
                for (int x=1; x<=3; x++){// Иначе нужно отжаться 3 раза
                    System.out.println("  Отжимаемся " + x);}

            }
            for (int a=1; a<=7;a++){// Независимо от номера круга качаем пресс 7 раз
                System.out.println("  Качаем пресс " + a);}

            // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");


        } System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
