def is_palindrome(text):
    # Remove spaces and convert to lowercase for uniform comparison
    clean_text = text.replace(" ", "").lower()
    return clean_text == clean_text[::-1]

# Test the function
text = Madam
if is_palindrome(text):
    print(f'"{text}" is a palindrome!')
else:
    print(f'"{text}" is not a palindrome.')

print("End of the program")