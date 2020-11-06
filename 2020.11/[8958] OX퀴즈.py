n = int(input())

scores = [0 for i in range(n)] # test case들의 총점을 담는 배열

for i in range(n):
    score = 0 # case 당 총점
    count = 1 # 연속으로 맞춘 문제의 개수
    a = input()

    for j in a:
        if j == 'O':
            score += count
            count += 1
        else:
            count = 1

    scores[i] = score

for s in scores:
    print(s)
