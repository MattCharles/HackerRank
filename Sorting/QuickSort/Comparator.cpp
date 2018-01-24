#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

struct Player {
    string name;
    int score;
};

vector<Player> comparator(vector<Player> players) {
    if(players.size()<2){
        return players;
    } else {
        //quick sort
        int pivot = players.size()/2;
        int pivotScore = players.at(pivot).score;
        string pivotName = players.at(pivot).name;
        vector<Player> lesser;
        vector<Player> greater;
        for(int i=0; i<players.size(); i++){
            if(i==pivot){
                continue;
            }
            if(players.at(i).score > pivotScore){
                greater.push_back(players.at(i));
            } else if(players.at(i).score < pivotScore){
                lesser.push_back(players.at(i));
            } else if(players.at(i).name.compare(pivotName)<0){
                greater.push_back(players.at(i));
            } else {
                lesser.push_back(players.at(i));
            }
        }
        lesser = comparator(lesser);
        greater = comparator(greater);
        greater.insert(greater.end(), players.at(pivot));
        greater.insert(greater.end(), lesser.begin(), lesser.end());
        return greater;
    }
}

int main() {
    int n;
    cin >> n;
    vector<Player> players;
    string name;
    int score;
    for(int i = 0; i < n; i++){
        cin >> name >> score;
        Player p1;
        p1.name = name, p1.score = score;
        players.push_back(p1);
    }
    
    vector<Player> answer = comparator(players);
    for(int i = 0; i < answer.size(); i++){
        cout << answer[i].name << " " << answer[i].score << endl;
    }
    return 0;
}
