def Division(No1,No2):
	return No1/No2

def main():
	print("enter first numberr:")
	No1 = int(input())
	
	print("Enter second number:")
	No2 = int(input())
	
	Ret = Division(No1,No2)
	print("The Division will be :",Ret)
	
	
if __name__ == "__main__":
	main()
