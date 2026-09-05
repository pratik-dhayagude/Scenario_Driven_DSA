def CheakDivisible(No):
	if No % 5==0:return True
	else:return False

def main():

	No = int(input("Enter the number..."))
	Ret = CheakDivisible(No)
	if Ret :print("Number is divisible by 5")
	else:print("Not divisible by 5")
	

if __name__ == "__main__":
	main()
