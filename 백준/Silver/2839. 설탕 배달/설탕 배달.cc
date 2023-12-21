#include <iostream>

int main()
{
	using namespace std;
	int a, b = 0 , c =0;
	cin >> a;
	while (1)
	{
		if (a % 5 == 0)
		{
			c = a / 5;
			break;
		}
		else if(a < 3)
		{
			b = -1;
			break;
		}
		a = a -3;
		b++;
	}
	
	cout << c + b;
	
	//system("pause");
}