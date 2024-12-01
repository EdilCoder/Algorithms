def bubble_sort(arr):

    unsorted_until_index = len(arr) - 1
    sorted = False

    while not sorted:
        sorted = True
        
        for i in range(unsorted_until_index):

            if(arr[i]>arr[i+1]):
                temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
                sorted = False
        unsorted_until_index -= 1

arr = [4,3,2,1]
bubble_sort(arr)

for i in arr:
    print(i, end= " ")