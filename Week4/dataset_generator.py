import json

def generate_and_save_sorted_array(filename, size):
    sorted_array = list(range(size))
    data = {
        "arrays": {
            "100k": sorted_array
        }
    }

    with open(filename, 'w') as json_file:
        json.dump(data, json_file, indent=2)

# Specify the size of the array
array_size = 100000  # You can change this to the desired size

# Specify the filename for the JSON file
json_filename = "100k.json"

# Generate and save the sorted array in the JSON file
generate_and_save_sorted_array(json_filename, array_size)

print(f"JSON file '{json_filename}' created with a sorted array of size {array_size}.")
