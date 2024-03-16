#include <cstdio>
//#include <stdio.h>
#include <string.h>
#include <iostream>
//#include <algorithm>
//#include <stack>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	char a[51];
	int x, y;
	bool z;

	cin >> x;
	
	while (x--)
	{
		z = false;
		y = 0;
		cin >> a;
		for(int i = 0; i<strlen(a); i++)
		{
			if (a[i] == '(')
			{
				y++;
			}
			else if (y)
			{
				y--;
			}
			else
			{
				z = true;
			}
		}
		if (z)
		{
			cout << "NO" << "\n";
		}
		else if (!y)
		{
			cout << "YES" << "\n";
		}
		else
		{
			cout << "NO" << "\n";
		}
	}
	//system("pause");
}