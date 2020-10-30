n = int(input())

arr = list(map(int, input().split()))

m = max(arr)

p = 0

for a in arr:
    p += a/m*100

print(p/n)