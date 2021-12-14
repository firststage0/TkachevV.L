#-*- coding: utf-8 -*-
sonik = 'Какая-то строка'
def venga(sonik):
	perv = sonik[:sonik.find(' ')]
	twos = sonik[sonik.find(' ') + 1:]
	print(twos + ' ' + perv)
venga(s)
