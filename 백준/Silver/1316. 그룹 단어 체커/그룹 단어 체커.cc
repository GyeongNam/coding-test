#include <string>
#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	
	int a, b;
	string s;

	cin >> a;
	b = a;
	for (int i = 0; i < a; i++)
	{
		cin >> s;
		int n[101] = { 0 };
		for (int j = 1; j < s.length(); j++)
		{
			if (s.at(j - 1) != s.at(j))
			{
				if (n[s.at(j) - 97] == 1)
				{
					b--; 
					break;
				}
				n[s.at(j - 1) - 97] = 1;
			}
		}
	}
	cout << b;
	//system("pause");
}