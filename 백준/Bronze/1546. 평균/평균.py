n= int(input()) # 과목의 개수
su=list(map(int, input().split())) # 현재 성적

M=max(su) #최대값
for i in range(len(su)):
    su[i]=su[i]/M*100

print(sum(su)/len(su))