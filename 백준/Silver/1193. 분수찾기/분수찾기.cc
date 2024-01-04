#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);

	int a, i, j = 1;
	cin >> a;
	for (i = 1; a > i; i++)
	{
		if (a == 1) 
		{
			cout << i;
			return 0;
		}
		a -= i;
	}
	if ((i % 2) == 0) 
	{
		a--;
		while (a != 0) 
		{
			i--; 
			j++; 
			a--;
		}
		cout << j << "/" << i;
	}
	else 
	{
		a = i - a;
		while (a != 0) 
		{
			i--; 
			j++; 
			a--;
		}
		cout << j << "/" << i;
	}
	//system("pause");
}