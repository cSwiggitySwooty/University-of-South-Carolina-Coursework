#ifndef ALGS_H
#define ALGS_H

#include <algorithm>
#include <queue>
using std::swap;



template<typename T>
void heapsort(std::vector<T>& V){
	std::priority_queue<int, std::vector<int>, std::greater<int>> queue;
	for(int i = 0; i < V.size(); i++) {
		queue.push(V[i]);
	}
	for(int i = 0; i < V.size(); i++) {
		V[i] = queue.top();
		queue.pop();
	}
}



bool are_anagrams(std::string a, std::string b){
	int a_letters[26] = {0};
	int b_letters[26] = {0};
	for(int i = 0; i < a.length(); i++) {
		a_letters[a.at(i) - 65]++;
	}
	for(int i = 0; i < b.length(); i++) {
		b_letters[b.at(i) - 65]++;
	}
	for(int i = 0; i < 26; i++) {
		if(a_letters[i] != b_letters[i]) {
			return false;
		}
	}
	return true;
}


#endif
