print("Enter a1")
a1 = float(input()) #Створення та ініціалізація a1
print("Enter a2")
a2 = float(input()) #Створення та ініціалізація a2
print("Enter b1")
b1 = float(input()) #Створення та ініціалізація b1
print("Enter b2")
b2 = float(input()) #Створення та ініціалізація b2
print("Enter c1")
c1 = float(input()) #Створення та ініціалізація c1
print("Enter c2")
c2 = float(input()) #Створення та ініціалізація c2

matrix1 = [[c1,b1], [c2,b2]] #Створення першої матриці
matrix2 = [[a1,b1], [a2,b2]] #Створення першої матриці
matrix3 = [[a1,c1], [a2,c2]] #Створення першої матриці

detMatrix1 = (matrix1[0][0] * matrix1[1][1]) - (matrix1[1][0] * matrix1[0][1]) #Обчислення визначника першої матриці
detMatrix2 = (matrix2[0][0] * matrix2[1][1]) - (matrix2[1][0] * matrix2[0][1]) #Обчислення визначника другої матриці
detMatrix3 = (matrix3[0][0] * matrix3[1][1]) - (matrix3[1][0] * matrix3[0][1]) #Обчислення визначника третьої матриці

if detMatrix2!=0: #Перевірка ділення на 0
 x = detMatrix1 / detMatrix2 #Обчислення значення x
 y = detMatrix3 / detMatrix2 #Обчислення значення y
else:
    print("Ділення на 0 неможливе")
    x = 0
    y = 0

print("X = ",x) #Виведення значення x
print("Y = ",y) #Виведення значення y