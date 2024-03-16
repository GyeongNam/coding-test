#include <string>
#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	
	
	string s;
	int a[26] = { 0 };
	int x = 0, y = 0, n = 0;

	cin >> s;
	
	for (int i = 0; i < s.length(); i++)
	{
		if (s[i] < 97)
		{
			a[s[i] - 65]++;
		}
		else
		{
			a[s[i] - 97]++;
		}
	}
	
	for (int i = 0; i < 26; i++)
	{
		if (x < a[i])
		{
			x = a[i];
			y = i;
		}
	}

	for (int i = 0; i < 26; i++)
	{
		if (x == a[i])
		{
			n++;
			if (n >= 2)
			{
				cout << "?" << endl;
				return 0;
			}
		}
	}
	cout << (char)(y + 65) << endl;
	return 0;
	//system("pause");
}