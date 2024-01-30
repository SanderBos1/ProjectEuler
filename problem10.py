def is_prime(n):
    factors = []
    for i in range(1, int(n**0.5)+1):
        if n%i == 0:
            factors.append(i)
    if len(factors) == 1:
        return True
    else:
        return False


def sum_prime(n):
    sum = 0
    for i in range(2, n, 1):
        if is_prime(i):
            sum = sum + i
    return sum


print(sum_prime(2000000))