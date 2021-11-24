#-*- coding: utf-8 -*-
n = int(input())
dva = 2
st = 1
while dva <= n:
	dva *= 2
	st +=1
print(st - 1, dva // 2)
