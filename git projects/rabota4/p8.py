#-*- coding: utf-8 -*-
son = 'строка h с буквой h'	
a_plusb = son[:son.find('h')]
bbbb = son[son.find('h'): son.rfind('h')]
cirl = son[son.rfind('h') + 1:]
print(a_plusb + bbbb[::-1] + cirl)
