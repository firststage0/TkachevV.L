#-*- coding: utf-8 -*-
print('4 (дни, часы, минуты)')
seconds = int(input())
min = seconds // 60
hours = min // 60
days = hours // 24
print('Ответ: ', days, ':', hours, ':', min)