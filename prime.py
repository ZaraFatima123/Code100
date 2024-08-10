n = int(input('Enter a number to check whether it is a prime number or not: '))

def prime_checker(number):
  for i in range(2,number):
    isPrime = True
    if(number % i==0):
      isPrime = False
  if isPrime:
     print("Prime number")
  else:
     print("It's not a prime number")  

prime_checker(number = n)