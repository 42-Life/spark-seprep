print("behold, the number of numbers for numbers 0-9")
output = ""
for val in range(10):
    for num_times in range(val):
        output += str(val)
    output += "\n"
print(output)