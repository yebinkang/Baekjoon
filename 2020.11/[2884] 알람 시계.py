h, m = map(int, input().split())

# 
if 45 <= m <= 59:
    m -= 45
else:
    m += 15
    h = (h + 23) % 24

print(h, m)