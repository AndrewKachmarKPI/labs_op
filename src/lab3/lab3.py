def findFactorialOfNumber(number):
    fact = 1
    for i in range(1, number + 1):
        fact = fact * i
    return fact


a = int(input("Enter a:"))  # створення та ініціалізація змінних
x = float(input("Enter x:"))  # створення та ініціалізація змінних

if (x > 1 or x < -1):  # перевірка умови параметра x
    print("Invalid x parameter")
    exit(0)

totalSum = 0  # створення та ініціалізація змінних
k = 1  # створення та ініціалізація змінних
eps = pow(10, -5)  # створення та ініціалізація змінних

primarySum = (a - k + 1) * pow(x, k) / findFactorialOfNumber(k)  # обчислення початкового значення суми
print("Sum = %5.5f" % primarySum)  # виведення суми
totalSum += primarySum  # додавання початкової суми до загальної
k = k + 1

while abs(primarySum) >= eps:  # цикл поки проміжна сума більша за точність
    primarySum = (a - k + 1) * pow(x, k) / findFactorialOfNumber(k)  # обчислення проміжного значення суми
    print("Sum = %5.5f" % primarySum)  # виведення суми
    totalSum += primarySum  # додавання проміжної суми до загальної
    k = k + 1

totalSum += 1  # збільшення значеня загальної суми по умові задачі на 1
print("Total sum: %5.5f" % totalSum)  # виведення загальної суми
