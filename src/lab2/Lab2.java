package lab2;

public class Lab2 {
    public static void main(String[] args) {
        double x1 = -4, y1 = 10, x2 = 8, y2 = 1, x3 = 12, y3 = 23; //Створення та ініціалізація змінних

        double segment1 = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2); //Обчислення першої сторони
        double segment2 = Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2); //Обчислення другої сторони
        double segment3 = Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2); //Обчислення третьої сторони

        String triangleType = "";

        if (segment1 + segment2 > segment3 && segment1 + segment3 > segment2 && segment2 + segment3 > segment1 && // Перевірка умови існування трикутника
                segment1 != 0 && segment2 != 0 && segment3 != 0) {

            if (segment1 == segment2 && segment1 == segment3) { // Перевірка існування рівностороннього трикутника
                triangleType = "Рівносторонній трикутник";
            } else {
                if (segment1 == segment2 || segment1 == segment3 || segment2 == segment3) { // Перевірка існування рівнобедреного трикутника
                    triangleType = "Рівнобедрений трикутник";
                } else {
                    if (segment1 != segment2 && segment1 != segment3 && segment2 != segment3) { // Перевірка існування різностороннього трикутника
                        triangleType = "Різносторонній трикутник";
                    }
                }
            }

        }else{
            triangleType = "Неможливий трикутник"; // Виведення повідомлення про неможливість існування трикутника
        }

        System.out.println(triangleType);
    }
}
