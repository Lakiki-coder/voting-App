available_books = [
{"title" : "A man call god","author" : "Don Simon","status" : "available"},{"title" : "Life After Death","author" : "Usman Anifa","status" : "available"},{"title" : "wake up call","author" : "Osama bin ladin","status" : "available"}]




def view_all_available_books():

	print("=========================THIS ARE AVAILABLE BOOKS=========================")

	print("1. ",available_books[0]["title"])
	print("2. ",available_books[1]["title"])
	print("3. ",available_books[2]["title"])

	


def borrow_book():

	print("=========================THIS ARE AVAILABLE BOOKS=========================")

	print("1. ",available_books[0]["title"])
	print("2. ",available_books[1]["title"])
	print("3. ",available_books[2]["title"])

	book_to_borrow = int(input("Enter book number to borrow: "))
	if book_to_borrow == 1:
		print("You have borrowed 'A man call god'")
		available_books[0]["status"] = "borrowed"

	elif book_to_borrow == 2:
		print("You have borrowed 'Life After Death'")
		available_books[1]["status"] = "borrowed"


	elif book_to_borrow == 3:
		print("You have borrowed 'wake up call'")
		available_books[2]["status"] = "borrowed"


	else: 
		print("You have entered invalid input. PLS TRY AGAIN")

def return_book():

	print("=========================BOOKS CURRENTLY BORROWED=========================")

	borrowed_book = []
	for i,book in enumerate(available_books, 1):
		if book["status"] == "borrowed":
			print(f"{i}. {book['title']} is {book['status']}")
			
			borrowed_book.append(i)

	if not borrowed_book:
		print("No books are currently borrowed.")
	else:
		book_num = int(input("\nEnter book number to return: "))
	if book_num in borrowed_book:

		print(f"Thank you for returning '{available_books[book_num-1]['title']}'") 
	else:
		print("Invalid book number. Please select from the list above.")
     #   except ValueError:
      #      print("Please enter a valid number.")



def main():

	while True :
		print("=================Select an option from (1-4)=================")
		print("1. View all available books")
		print("2. Borrow a book")
		print("3. Return book")
		print("4. Exit")

		your_option = int(input("Enter a number from 1-4: "))

		if your_option == 1:
			view_all_available_books()
		
		elif your_option == 2:
			borrow_book()

		elif your_option == 3:
			return_book()

		elif your_option == 4:
			print("thank you for your patronage>>><<<")
			break

		else: 
			print("Invalid option. Try agin my dear friend")

main()
