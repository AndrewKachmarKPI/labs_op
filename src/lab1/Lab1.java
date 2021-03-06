package lab1;

public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a1:");
        double a1 = scanner.nextDouble();
        System.out.print("Enter a1:");
        double a2 = scanner.nextDouble();
        System.out.print("Enter a1:");
        double b1 = scanner.nextDouble();
        System.out.print("Enter a1:");
        double b2 = scanner.nextDouble();
        System.out.print("Enter a1:");
        double c1 = scanner.nextDouble();
        System.out.print("Enter a1:");
        double c2 = scanner.nextDouble();

        scanner.close();

        double x = 0, y = 0; // Створення змінних для виводу даних

        double[][] matrix1 = {{c1, b1}, //Створення матриць
                {c2, b2}};
        double[][] matrix2 = {{a1, b1}, //Створення матриць
                {a2, b2}};

        double[][] matrix3 = {{a1, c1}, //Створення матриць
                {a2, c2}};

        double detMatrix1 = (matrix1[0][0] * matrix1[1][1]) - (matrix1[1][0] * matrix1[0][1]); //Обчислення визначника першої матриці
        double detMatrix2 = (matrix2[0][0] * matrix2[1][1]) - (matrix2[1][0] * matrix2[0][1]); //Обчислення визначника другої матриці
        double detMatrix3 = (matrix3[0][0] * matrix3[1][1]) - (matrix3[1][0] * matrix3[0][1]); //Обчислення визначника третьої матриці

        if (detMatrix2 != 0) { //Перевірка ділення на 0
            x = (detMatrix1 / detMatrix2); //Обчислення значення x
            y = (detMatrix3 / detMatrix2); //Обчислення значення y
        } else {
            System.out.println("Ділення на 0 неможливе");
            x = 0;
            y = 0;
        }

        System.out.println("X = " + x); //Виведення значення x
        System.out.println("Y = " + y); //Виведення значення y

    }

}
