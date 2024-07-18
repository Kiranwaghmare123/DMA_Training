

# Home-work:

### Ex:1 : Understanding Data Types in Pandas
	Using the dataset dtypes provided below, which consists of a DataFrame where each row includes a data type and its corresponding type code in pandas:
	
	dtypes = pd.DataFrame(
	    {
	        'Type': ['int8', 'uint8', 'int16', 'uint16', 'int32', 'uint32', 'int64', 'uint64', 'float16', 'float32', 'float64', 'float128', 'complex64', 'complex128', 'bool', 'object', 'string_', 'unicode_'],
	        'Type Code': ['i1', 'u1', 'i2', 'u2', 'i4', 'u4', 'i8', 'u8', 'f2', 'f4 or f', 'f8 or d', 'f16 or g', 'c8', 'c16', '', 'O', 'S', 'U']
	    }
	)
	
	### Assignment:
	
	1. Write a Python script to display the DataFrame dtypes in a Jupyter Notebook.
	Add a column to the DataFrame that provides a brief description of each data type (e.g., 'int8' is an 8-bit integer).
	2. Sort the DataFrame based on the 'Type' column in ascending order and display the sorted DataFrame.
	3. Filter and display only the rows where the data type is a floating-point type.
	4. Save the final DataFrame as a CSV file named dtypes_processed.csv.

### Ex:2 : Solved today in class
    data1 = {
        'day': ['1/1/2017','1/2/2017','1/3/2017','1/4/2017','1/5/2017','1/6/2017'],
        'temperature': [32,35,28,24,32,31],
        'windspeed': [6,7,2,7,4,2],
        'event': ['Rain', 'Sunny', 'Snow','Snow','Rain', 'Sunny']
    }

### Ex 3: Dictionary
	Implement dictionary dataset to implement 
	    data2 = {
	        'day': ['1/1/2017','1/2/2017','1/3/2017'],
	        'temperature': [32,35,28],
	        'windspeed': [6,7,2],
	        'event': ['Rain', 'Sunny', 'Snow']
	    }
	
	 To analyze the data provided in the dictionary and determine the days with the maximum and minimum temperatures, you can frame the following questions:
	
	1. Which day had the maximum temperature?
	2. Which day had the minimum temperature?


### Ex 4: Tuples
	# Homework Assignment: Analyzing Weather Data
	Using the dataset data3 provided below, which consists of tuples where each tuple includes the date, temperature, wind speed, and weather event:
	    data3 = [
	        ('1/1/2017',32,6, 'Rain'),
	        ('1/2/2017',35,7,' Sunny'),
	        ('1/3/2017',28,2, 'Snow')
	    ]
	
	    Assignment:
	
	1. Write a Python script to determine which day recorded the maximum temperature.
	2. Write a Python script to determine which day recorded the minimum temperature.

 ### Ex 5: List : Homework Assignment: Analyzing Weather Data
	Using the dataset data4 provided below, which consists of dictionaries where each dictionary includes the day, temperature, wind speed, and weather event:
	    data4 = [
	        {'day': '1/1/2017', 'temperature': 32, 'windspeed': 6, 'event': 'Rain'},
	        {'day': '1/2/2017', 'temperature': 35, 'windspeed': 7, 'event': 'Sunny'},
	        {'day': '1/3/2017', 'temperature': 28, 'windspeed': 2, 'event': 'Snow'},
	        
	    ]
	    
	    Assignment:
	
	1. Write a Python script to determine which day recorded the maximum temperature.
	2. Write a Python script to determine which day recorded the minimum temperature.
	3. Ensure your script prints the date along with the temperature for both the maximum and minimum temperature days
