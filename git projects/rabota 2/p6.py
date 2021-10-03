#-*- coding: utf-8 -*-

def ll(s1, st1, s2, st2):
	p = (s1 + st1) // 2
	f = (s2 + st2) // 2

	if p == f: 
		print('Да')
	else: 
		print('Нет')


print('Введите номер первой строки')
s1 = int(input())
print('Введите номер первого столбца')
st1 = int(input())
print('Введите номер второй строки')
s2 = int(input())
print('Введите номер второго столбца')
st2 = int(input())

ll(s1, st1, s2, st2)
