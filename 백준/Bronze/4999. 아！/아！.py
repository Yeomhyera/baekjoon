import sys
input = sys.stdin.readline

n = input()
m = input()
print("go" if len(n)>=len(m) else "no")