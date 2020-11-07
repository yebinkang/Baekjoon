n = int(input())

arr = []

for i in range(n):
    arr.append(list(map(int, input().split())))

for i in range(n):
    print("Case #" + str(i+1) + ": " + str(arr[i][0]) + " + " + str(arr[i][1]) + " = " + str(arr[i][0] + arr[i][1]))