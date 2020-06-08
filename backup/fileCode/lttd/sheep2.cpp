#include <bits/stdc++.h> 
#include <vector>
using namespace std;

int n,l;

int main(){
	freopen("testcase", "r", stdin);
	
	cin>>n>>l;
	char loss[l];
	for(int i=0;i<l;i++){
		cin>>loss[i];
	}
	
	string tem[10-l];
	int pos=0;	
	for(int i='0';i<='9';i++){
		bool check=true;
		for(int j=0;j<l;j++){
			if(i==loss[j]){
				check=false;
				break;
			}
		}
		if(check){
			tem[pos]=i;
			pos++;
		}
	}
	queue<string> q;
	for(int i=0;i<10-l;i++){
		if(tem[i]!="0") {
			q.push(tem[i]);
		}
	}

	int count;
	if(tem[0]=="0"){
		count=10-l-1;
	}
	else{
		count=10-l;
	}
	string result;
	while(count<n){
		for(int i=0;i<10-l;i++){
			if(count>=n) break;
			result = q.front()+tem[i];
			q.push(result);
			count++;
		}	
		q.pop();
	}
	
	cout<<result;
	

}