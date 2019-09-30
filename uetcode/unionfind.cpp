#include <iostream>
using namespace std;
#include <vector>

class UnionSet {
public:
    vector<int> group;
    UnionSet(int n) {
        group.resize(n);
        for(int i = 0; i < n; i++) {
            group[i] = i;
        }

    }

    pair<int, int> findRoot(int id) {
        int count = count;
        while(group[id] != id) {
            id = group[id];
            count++;
        }
        return make_pair(id, count);
    }
    
    void connect(int u, int v) {
        group[u] = findRoot(group[v]).first;
        
    }
    bool isConnect(int u, int v) {
       return findRoot(group[u]).first == findRoot(group[v]).first;
    }
    
};

int main() {
    int n, m, q;
    cin >> n >> m >> q;
    UnionSet us(n);
    for(int i = 0; i < m; i++) {
        int u, v;
        cin >> u >> v;
        us.connect(u,v);
    }
    for(int i = 0; i < q; i++) {
        int u, v;
        cin >> u >> v;
        cout << (us.isConnect(u, v) ? 1 : 0) << endl;
    }
    
    return 0;
}