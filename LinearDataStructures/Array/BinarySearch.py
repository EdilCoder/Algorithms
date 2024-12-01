def binary_search(arr, target):
    left = 0
    right = len(arr) -1
    step = 0 

    while(left<=right):
        step += 1
        mid = left + (right - left)//2

        if arr[mid] == target:
            print(f"step: {step}")
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
        
    return -1

arr = [1, 3, 5, 7, 9, 11, 13, 15]
target = 15

result = binary_search(arr, target)

if result != -1:
    print(f"Binary Search Array index Result: [{result}]")
else:
    print("Target not found in the array.")
    