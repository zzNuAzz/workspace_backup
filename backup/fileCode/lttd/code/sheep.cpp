#include <bits/stdc++.h>
using namespace std;
#define maxdg 10

bool use[maxdg];
vector<int> coso;

long long sheep(int n) {
    stack<int> st;
    int base = coso.size();
    while (n != 0) {
        st.push(n % base);
        n /= base;
    }
    long long ans = 0;
    while (!st.empty()) {
        ans = ans * 10 + coso[st.top()];
        st.pop();
    }
    return ans;
}

int main() {
    freopen("testcase", "r", stdin);
    
    int n, l;
    cin >> n >> l;
    memset(use, 1, sizeof(use));

    for (int i = 0; i < l; i++) {
        int k;
        cin >> k;
        use[k] = 0;
    }
    for (int i = 0; i < maxdg; i++) {
        if (use[i]) coso.push_back(i);
    }
    cout << sheep(n);

    return 0;
}