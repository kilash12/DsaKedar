def find_min(A):
    minimum = float('inf')
    for i in A:
        if minimum > i:
            minimum = i
    return minimum

def find_max(A):
    maximum = float('-inf')
    for i in A:
        if maximum < i:
            maximum = i
    return maximum

if __name__ == "__main__":
    A = [4, 43, 34, 6567, 34, 56]
    print("Minimum value:", find_min(A))
    print("Maximum value:", find_max(A))
