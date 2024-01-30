import numpy as np
def check(a, b, c):
    return a**2 + b**2 == c**2

def calculate():
    for a in range(1, 332):
        for b in range(a+1, int(np.ceil((1000-a)/2.-1))):
            c = 1000 - a - b
            prot = check(a, b, c)
            if prot:
             return a*b*c, a, b, c
            
print(calculate())