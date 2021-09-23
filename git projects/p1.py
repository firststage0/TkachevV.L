#-*- coding: utf-8 -*-
print("Курс Основы программирования начался")

a = 16823 * 12302 % 3092
print(a)

age = int(input())
name = input()
if  ( 0 <= age < 75) and name != 'Иван':
	if 0 <= age < 16:
		print ('Сначала нужно окончить школу')
		b = 16 - age
		print(str(b) + ' лет(года) осталось учиться')
	else: 
		print('Поздравляю с поступлением в ВГУИТ')
else:
	print('Мы вам перезвоним(нет)')		


print('4 (дни, часы, минуты)')
seconds = int(input())
min = seconds // 60
hours = min // 60
days = hours // 24
print(days, ':', hours, ':', min)

print('5(ох уж эти степени(строка с n))')
n = int(input())
su = n + n^2 + n^3 + n^4 + n^5
print(su)

print('5(строка с n)')
n = int(input())
su = n + n ** 2 + n ** 3 + n ** 4 + n ** 5
print(su)

print('6( перемена местами х и у)')
print(x, y)
x = 20 
y = 10
b = y
y = x
x = b
print(x, y) 

print('6(четное или нечетное?)')

number = int(input())
if number % 2 == 0: 
	print('Число четное')
else:
	print('Число нечетное')	