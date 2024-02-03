import json
import random

def generate_and_save_random_array(filename, size):
    random_array = [random.randint(0, size) for _ in range(size)]
    data = {
        "arrays": {
            "50": random_array
        }
    }

    with open(filename, 'w') as json_file:
        json.dump(data, json_file, indent=2)

# Specify the size of the array
array_size = 50 

# Specify the filename for the JSON file
json_filename = "50_random.json"

# Generate and save the random array in the JSON file
generate_and_save_random_array(json_filename, array_size)

print(f"JSON file '{json_filename}' created with a random array of size {array_size}.")