while True:
  n = int(input('''Choose 1--> To check even or odd
  2--> Check prime or not.
  3-->Get square and cube.
  4--> Exit: '''))
  if n!=1 and n != 2 and n!= 3 and n!=4:
    print("Invalid input")

  if n== 1:
    def evenodd(a):
      if a%2 == 0:
        print("Even")
      else:
        print("Odd")
    a = int(input("Enter a number to check even or odd: "))
    evenodd(a)

  if n == 2:
    def isPrime(b):
      for val in range(2,b):
        if b%val ==0:
          print("No it is not a prime:")
          break
      else:
        print("It is a prime:")
    b = int(input("Enter a number to check prime or not.."))
    isPrime(b)

  if n == 3:
  

        while True:

          inp = int(input('''Enter 1-->square
          2-->cube
          3--> Exit '''))

          if inp == 1:
            numm = int(input("Enter a number for square: "))
            print("Square of that is :", numm*numm)
          if inp == 2: 
            num = int(input("Enter a number for cube: "))
            print("Cube of that is: ", num*num*num)
          if inp !=1 and inp !=2 and inp!=3:
            print("Invalid Input.")
          if inp == 3:
            break
  if n == 4:
    break