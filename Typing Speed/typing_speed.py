import time

def timer(sentence):
    starting_point = time.time()
    user_input = input("Your time starts now: ")
    stoping_point = time.time()
    
    total_time_taking = stoping_point - starting_point
    return user_input, total_time_taking

def check_if_input_is_correct(original_sentence, user_input):
    given_sentence = original_sentence.split()
    user_sentence = user_input.split()
    
    correct_words = 0
    for digit in range(min(len(given_sentence), len(user_sentence))):
        if given_sentence[digit] == user_sentence[digit]: 
            correct_words += 1
    
    return correct_words, len(given_sentence)

def check_for_accuracy(correct_words, total_words):
    accuracy = (correct_words / total_words) * 100
    print(f"Accuracy: {accuracy:.1f}%")

def the_main():
    sentence = "what if the world is an illusion"
    print(f"Type this sentence: {sentence}")
    
    user_input, total_time = timer(sentence)
    
    correct_words, total_words = check_if_input_is_correct(sentence, user_input)
    

    time_in_minute = total_time / 60
    word_per_minute = total_words / time_in_minute  # Use word count, not character count
    
    print(f"Time taken: {total_time:.2f} seconds")
    print(f"Words per minute: {word_per_minute:.1f} WPM")
    check_for_accuracy(correct_words, total_words)

the_main()