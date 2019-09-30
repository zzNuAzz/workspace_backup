#include <bits/stdc++.h>
using namespace std;


void bfs(std::vector<std::string> &skyMap, vector<vector<int>> &check, int i, int j) {
    cout << "c" << i << " " << j << endl;
    if(i - 1 >= 0) {
        if(check[i-1][j] == 0 && skyMap[i-1][j]== '1') {
        	check[i-1][j] = 1;
            bfs(skyMap, check, i - 1, j);
        }
    }
    if(i + 1 < skyMap.size()) {
        if(check[i+1][j] == 0 && skyMap[i+1][j]== '1') {
            check[i+1][j] = 1;
            bfs(skyMap, check, i + 1, j);
        }
    }
    if(j - 1 >= 0) {
        if(check[i][j-1] == 0 && skyMap[i][j-1]== '1') {
            check[i][j-1] = 1;
            bfs(skyMap, check, i, j - 1);
        }
    }
    if(j + 1 < skyMap[0].size() ) {
        if(check[i][j+1] == 0 && skyMap[i][j+1]== '1') {
            check[i][j+1] = 1;
            bfs(skyMap, check, i, j + 1);
        }
    }
}

int countClouds(std::vector<std::string> skyMap)
{
    
    int m = skyMap.size();
    if(m == 0) return 0;
    int n = skyMap[0].size();
    if(n == 0) return 0;

    vector<vector<int>> check(m, vector<int>(n, 0));
    int count = 0;
     for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(skyMap[i][j] == '0') check[i][j] == 1;
        }
    }
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(check[i][j] == 0 && skyMap[i][j] == '1') {
            	cout << i << " "  << j << endl;
                count++;
                check[i][j] = 1;
                bfs(skyMap, check, i, j);
            }
        }
    }
    return count;    
}

int main() {
	vector<string> a = {"01101", "01111", "00001", "10011"};
	cout << countClouds(a);


	return 0;
}