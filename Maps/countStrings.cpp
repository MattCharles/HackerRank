#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int numStrings;
    cin >> numStrings;
    int i = 0;
    int j = 0;
    std::string word;
    std::map<string, int> stringCount;
    while(i < numStrings){
        cin >> word;
        if(stringCount.count(word)>0){
            stringCount[word] = stringCount.find(word)->second + 1;
        } else {
            stringCount[word] = 1;
        }
        i++;
    }
    cin >> numStrings;
    //check in map for these
    while(j < numStrings){
        cin >> word;
        if(stringCount.count(word)>0){
            cout << stringCount.find(word)->second << "\n";
        } else {
            cout << "0\n";
        }
        j++;
    }
    return 0;
}

