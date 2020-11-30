numbers = list(map(int, input().split())) # 배열의 0번째 수 입력
i = 0 # 최댓값의 인덱스

for j in range(1, 9):
    numbers.append(int(input()))
    if numbers[j] > numbers[i]:
        i = j

print(numbers[i])
print(i+1) # 1번째부터 세기 때문에 인덱스에서 +1해야한다.