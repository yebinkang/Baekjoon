a, b = map(int, input().split())

arr = []

while a != 0 and b != 0:
    arr.append(a + b)
    a, b = map(int, input().split())

for a in arr:
    print(a)