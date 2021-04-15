#ifndef SBTREEHASH_H
#define SBTREEHASH_H

#include <map> //  a self-balancing tree (red-black)
#include <unordered_map> // a hash table
#include <string>
#include <vector>

using std::string;
using std::sort;
using std::vector;
using std::unordered_map;
using std::pair;
using std::map;

struct ana_result {
    bool found = false;
    string s1;
    string s2;
};

//Do there exist two strings that are anagrams of each other ? (use std::sort and a custom Compare)
// See https://en.cppreference.com/w/cpp/algorithm/sort
// lambda functions are fine, even preferable here
ana_result anyAnagramsSorting(vector<string> ss){
    ana_result ar;
    vector<pair<string, string>> vec;
    for(string str : ss) {
        string temp = str;
        sort(temp.begin(), temp.end());
        vec.push_back(make_pair(temp, str));
    }
    sort(vec.begin(), vec.end());
    for(int i = 0; i < vec.size() - 1; i++) {
        if(vec.at(i).first == vec.at(i + 1).first) {
            ar.found = true;
            ar.s1 = vec.at(i).second;
            ar.s2 = vec.at(i + 1).second;
            return ar;
        }
    }
    /*
    vector<string> sorted = ss;
    for(int i = 0; i < sorted.size(); i++) {
        sort(sorted.at(i).begin(), sorted.at(i).end());
    }
    for(int i = 0; i < sorted.size() - 1; i++) {
        for(int j = i + 1; j < sorted.size(); j++) {
            if(compare(sorted.at(i), sorted.at(j))) {
                ar.found = true;
                ar.s1 = ss.at(i);
                ar.s2 = ss.at(j);
                return ar;
            }
        }
    }
    */
    return ar;
}

//Do there exist two strings that are anagrams of each other ? (use map, self-balancing tree)
ana_result anyAnagramsMap(vector<string> strings){
    ana_result res;
    map<string, int> m;
    vector<string> sorted = strings;
    for(int i = 0; i < sorted.size(); i++) {
        sort(sorted.at(i).begin(), sorted.at(i).end());
    }
    int index;
    for(int i = 0; i < sorted.size(); i++) {
        if(!m.insert({sorted.at(i), i}).second) {
            res.found = true;
            res.s1 = strings.at(i);
            res.s2 = strings.at(m[sorted.at(i)]);
            return res;
        }
    }
    return res;
}

//Do there exist two strings that are anagrams of each other ? (use unordered_map, hash table)
ana_result anyAnagramsHash(vector<string> strings){
    ana_result res;
    unordered_map<string, int> m;
    vector<string> sorted = strings;
    for(int i = 0; i < sorted.size(); i++) {
        sort(sorted.at(i).begin(), sorted.at(i).end());
    }
    int index;
    for(int i = 0; i < sorted.size(); i++) {
        if(!m.insert({sorted.at(i), i}).second) {
            res.found = true;
            res.s1 = strings.at(i);
            res.s2 = strings.at(m[sorted.at(i)]);
            return res;
        }
    }
    return res;
}

#endif //SBTREEHASH_H
