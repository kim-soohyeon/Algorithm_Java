a=[]

for _ in range(9):
    a.append(int(input()))

print(max(a))

for i in range(9):
    if max(a)==a[i]:
        print(i+1)