n = int(input())

# 공백 구분으로 입력값들을 구분, 정수로 리스트에 저장
arr = list(map(int, input().split()))

print(min(arr), max(arr))