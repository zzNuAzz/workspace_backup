#include <iostream>
using namespace std;
#include <unordered_map>
#include <string>
class Student {
public:
    int id;
    string name;
    Student(int id, string name) {
        this->id = id;
        this->name = name;
    }
};

int main() {
    int n;
    cin >> n;
    unordered_map<int, string> students;
    while(n-- > 0) {
        int choice, id;
        cin >> choice >> id;
        switch (choice) {
            case 1: {
                string s;
                cin >> s;
                students.insert(pair<int,string>(id, s));
                break;
            }
            case 2: {
                        auto it = students.find(id);
                        students.erase(it);
                break;
            }
             case 3: {
                    auto it = students.find(id);
                    if(it != students.end()) {
                        cout << (it->second) << endl;
                    } else cout << "n/a" << endl;
                    break;
            }
        }
    }
    return 0;
}