print("Enter x1")
x1 = float(input()) #Створення та ініціалізація x1
print("Enter y1")
y1 = float(input()) #Створення та ініціалізація y1

print("Enter x2")
x2 = float(input()) #Створення та ініціалізація x2
print("Enter y2")
y2 = float(input()) #Створення та ініціалізація y2

print("Enter x3")
x3 = float(input()) #Створення та ініціалізація x3
print("Enter y3")
y3 = float(input()) #Створення та ініціалізація y3

segment1 = pow((x2 - x1), 2) + pow((y2 - y1), 2) #Обчислення першої сторони
segment2 = pow((x3 - x2), 2) + pow((y3 - y2), 2) #Обчислення другої сторони
segment3 = pow((x3 - x1), 2) + pow((y3 - y1), 2) #Обчислення третьої сторони

segment1, segment2, segment3 = sorted([segment1, segment2, segment3]) #Сортування сторін трикутника

if segment1 + segment2 <= segment3: #Перевірка умови існування трикутника
    triangleType = "Неможливий трикутник"
elif segment1 == segment2 == segment3: #Перевірка існування рівностороннього трикутника
    triangleType = "Рівносторонній трикутник"
elif segment1 == segment2 or segment1 == segment3 or segment2 == segment3: #Перевірка існування рівнобедреного трикутника
    triangleType = "Рівнобедрений трикутник"
elif segment1 != segment2 != segment3: #Перевірка існування різностороннього трикутника
    triangleType = "Різносторонній трикутник"

print(triangleType)