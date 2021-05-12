a = list(map(int, input("number? ").split()))
maxValue = a[0]
for i in a:
    if i > maxValue:
        maxValue = i
print(maxValue)

b = input("암호화? ")
b1=''
b2=0
c=''
for i in range(len(b)):
    if b[i]==' ':
        c+=b[i]
    else:
         b1=b[i]
         b2=ord(b1)
         b2+=1
         b1=chr(b2)
         c+=b1
d=c.split()
print(d[::-1])


b = input("복호화? ")
b1=''
b2=0
c=''
for i in range(len(b)):
    if b[i]==' ':
        c+=b[i]
    else:
         b1=b[i]
         b2=ord(b1)
         b2-=1
         b1=chr(b2)
         c+=b1
d=c.split()
print(d[::-1])


book={}
n=0
while n<10:
    name=input('이름 : ')
    phone=input('전화번호 : ')
    book[name]=phone
    n=n+1

name=input('검색할 이름 : ')
if name in book:
    print('%s 의 전화번호는 %s 입니다.'%(name,book[name]))
else:
    print('존재하지않습니다.')
