#include <bits/stdc++.h>
using namespace std;
std::string& ltrim(std::string& str, const std::string& chars = "\t\n\v\f\r ")
{
    str.erase(0, str.find_first_not_of(chars));
    return str;
}
 
std::string& rtrim(std::string& str, const std::string& chars = "\t\n\v\f\r ")
{
    str.erase(str.find_last_not_of(chars) + 1);
    return str;
}
 
std::string& trim(std::string& str, const std::string& chars = "\t\n\v\f\r ")
{
    return ltrim(rtrim(str, chars), chars);
}
char toUpCase(char c) {
	if( c >= 'a' && c <= 'z')
		return c +('A' - 'a');
	return c;
}
char toLowerCase(char c) {
	if( c >= 'A' && c <= 'Z')
		return c + ('a' - 'A');
	return c;
}
string normalize(string s) {
	trim(s);
	for(int i = 0; i < s.size(); i++) {
		if(i == 0) s[i] = toUpCase(s[i]);
		else {
			if(s[i-1] == ' ') s[i] = toUpCase(s[i]);
			else s[i] = toLowerCase(s[i]);
		}
	}
	return s;
}

class Des {
public:
	string name;
	int cost;
	Des(string name, string cost) {
		this->name = name;
		stringstream a;
		a << cost;
		a >> this->cost;
	}
};

void backtrack(std::string x, std::string y, 
	std::vector<std::vector<std::string>> paths, 
	vector<string> &check,int &min, 
	std::vector<std::vector<std::string>> &path) {

}
std::string travelPath(std::string x, std::string y, std::vector<std::vector<std::string>> paths)
{
    int min = 2147483647;
    map<string, vector<Des>> data;
    for(int i = 0; i < paths.size(); i++) {
    	data[paths[i][0]].push_back(Des(normalize(paths[i][1]), paths[i][2]));
    }

    vector<int> check(data.size(), 0);
    vector<vector<string>> path;

    backtrack(x, y, check, min, path);

    soft(path);
    return path[0];
}
int main() {
	string x  = "Bac Giang";
	string y = "Ha Noi";
	vector<vector<string>> paths = {{"Bac Giang","Bac Ninh","9000"},
										{"Bac Giang","Ha Noi", "50000"},
										{"Bac Ninh","Ha Noi", "10000"}};
	cout << travelPath(x, y ,paths);

	Des aaa("a", "123");

}