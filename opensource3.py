import shutil
copyPath ="C:\Users\82104\Documents\SimpleR";
pastePath ="C:\Users\82104\Documents\SimpleR";
shutil.copy2(copyPath,pastePath)

def fileopen(data):
    with open(data,'r',encoding='UTF8') as file:
        text = file.read() 
        splitdata = text.split()
    return splitdata, len(splitdata)
def count_character(data):
    count = 0
    for i in data :
        count += len(i)
    return  count
data,count = fileopen("Count_text.txt")
print("공백 수 : ",count-1)
print("공백을 제외한 문자수 : ",count_character(data))
print("단어 수 : ",count)

class Calc:
    def sum(self,a,b):
        result=a+b
        print("%s+%s=%s입니다."%(a,b,result))
    def sub(self,a,b):
        result=a-b
        print("%s-%s=%s입니다."%(a,b,result))
    def multi(self,a,b):
        result=a*b
        print("%s*%s=%s입니다."%(a,b,result))
    def divi(self,a,b):
        result=a/b
        print("%s/%s=%s입니다."%(a,b,result))
