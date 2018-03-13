#include <bits/stdc++.h>

using namespace std;

/*
 * Create a right-aligned staircase of height N.
 * e.g., 3 =    #
 *             ##
 *            ###
 */

void staircase(int n) {
    // Complete this function
    for(int i = n-1; i >= 0; i--){
        for(int j = 0; j < n; j++){
            if(j<i){ 
                cout << " ";
            } else {
                cout << "#";
            }
        }
        cout << "\n";
    }
}

int main() {
    int n;
    cin >> n;
    staircase(n);
    return 0;
}
